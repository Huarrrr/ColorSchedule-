package top.huar.schedule.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import top.huar.schedule.R
import top.huar.schedule.common.ConstantPool
import top.huar.schedule.entity.EventEntity
import top.huar.schedule.entity.Score
import top.huar.schedule.ui.fragment.checkscore.CheckScoreLoginFragment
import top.huar.schedule.ui.fragment.checkscore.CheckScoreShowFragment
import top.huar.schedule.util.EventReceiver
import java.util.*

/**
 * 查成绩
 *
 */
class CheckScoreFragment : Fragment(), EventReceiver {
    private lateinit var mFragmentManager: FragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        EventBus.getDefault().register(this)
    }

    override fun onDestroy() {
        Log.d(TAG, "on Destroy")
        EventBus.getDefault().unregister(this)
        super.onDestroy()
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_check_score, container, false)
        mFragmentManager = childFragmentManager
        mFragmentManager.beginTransaction()
                .replace(R.id.frame_container, CheckScoreLoginFragment())
                .commit()
        return view
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onMessageEvent(eventEntity: EventEntity) {
        when (eventEntity.id) {
            ConstantPool.Int.SCORE_LOGIN_SUCCESS -> {
                val checkScoreShowFragment = CheckScoreShowFragment()
                val bundle = Bundle()

                val scoreList = eventEntity.data as ArrayList<Score>
                bundle.putParcelableArrayList("scoreList", scoreList)
                checkScoreShowFragment.arguments = bundle
                mFragmentManager.beginTransaction()
                        .replace(R.id.frame_container, checkScoreShowFragment)
                        .addToBackStack("checkScoreShowFragment")
                        .commit()
            }
            ConstantPool.Int.RETURN_LOGIN_FRAGMENT -> {
                mFragmentManager.beginTransaction()
                        .replace(R.id.frame_container, CheckScoreLoginFragment())
                        .commit()
            }
            else -> {
            }
        }
    }

    override fun eventTrigger(): Boolean {
        val backStackEntryCount = mFragmentManager.backStackEntryCount
        if (backStackEntryCount == 1) {
            mFragmentManager.popBackStackImmediate()
            return true
        }
        return false
    }

    companion object {
        private const val TAG = "CheckScoreFragment"
    }
}
