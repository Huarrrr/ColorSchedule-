package top.huar.schedule.common

import android.content.Intent
import android.os.Bundle
import android.text.TextUtils
import androidx.annotation.Nullable
import androidx.appcompat.app.AppCompatActivity
import com.heytap.wearable.oms.*
import com.heytap.wearable.oms.MessageClient.OnMessageReceivedListener
import com.heytap.wearable.oms.MessageClient.SendMessageResult
import com.heytap.wearable.oms.NodeClient.OnNodeChangedListener
import top.huar.schedule.entity.EventEntity
import top.huar.schedule.service.CommonService
import top.huar.schedule.service.RemindService
import top.huar.schedule.service.TodayWidgetService

/**
 * Base App Activity
 *
 */
abstract class BaseActivity : AppCompatActivity() {
    companion object{
        private val STRING_NULL = "NULL"
    }

    /** 节点管理器  */
    private var nodeClient: NodeClient? = null

    /** 信息管理器  */
    private var messageClient: MessageClient? = null

    /** 点前连接的节点  */
    private var node: Node? = null

    /** 节点监听器  */
    private var onNodeChangedListener: OnNodeChangedListener? = null

    /** 信息监听器  */
    private var onMessageReceivedListener: OnMessageReceivedListener? = null

    override fun onCreate(@Nullable savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        startService(Intent(this, CommonService::class.java))
        startService(Intent(this, RemindService::class.java))
        startService(Intent(this, TodayWidgetService::class.java))

        initWearable()
    }

    private fun initWearable() {
        nodeClient = Wearable.getNodeClient(applicationContext)
        messageClient = Wearable.getMessageClient(applicationContext)

        //设置节点监听器
        onNodeChangedListener = object : OnNodeChangedListener {
            override fun onPeerConnected(node: Node) {
                this@BaseActivity.node = node
            }

            override fun onPeerDisconnected(node: Node) {
                this@BaseActivity.node = null
            }
        }
        nodeClient!!.addListener(onNodeChangedListener)

        //设置信息监听器
        onMessageReceivedListener = OnMessageReceivedListener { messageEvent: MessageEvent ->
            val data = messageEvent.data
        }
        messageClient!!.addListener(onMessageReceivedListener)

        if (node != null) {
            val path: String = "pathTextView.getText().toString()"
            val dataString: String = "dataTextView.getText().toString()"
            val data = if (TextUtils.isEmpty(dataString)) null else dataString.toByteArray()

            //发送信息，并将结果显示到UI上
            messageClient!!.sendMessage(node!!.id, path, data).setResultCallback { result: SendMessageResult ->
//                this.codeTextView.setText(result.status.statusCode.toString())
//                this.messageTextView.setText(result.status.statusMessage.toString())
//                this.sendButton.setEnabled(true)
//                this.sendButton.setText("SEND")
            }
        }
    }

    /**
     * 消息事件
     *
     * @param eventEntity what
     */
    abstract fun onMessageEvent(eventEntity: EventEntity)
}
