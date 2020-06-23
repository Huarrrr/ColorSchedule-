package top.huar.schedule

import android.content.Intent
import androidx.test.InstrumentationRegistry
import androidx.test.runner.AndroidJUnit4

import org.junit.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import top.huar.schedule.service.CourseInfoService

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see [Testing documentation](http://d.android.com/tools/testing)
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {
    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getTargetContext()
        appContext.startService(Intent(appContext, CourseInfoService::class.java))

        assertEquals("top.itning.yunshuclassschedule", appContext.packageName)
    }
}
