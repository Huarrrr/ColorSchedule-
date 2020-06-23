package top.huar.schedule.ui.widget

import android.appwidget.AppWidgetManager
import android.appwidget.AppWidgetProvider
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.Log
import android.widget.RemoteViews

/**
 * 今天课程小部件
 *
 */
class TodayWidgetProvider : AppWidgetProvider() {
    override fun onUpdate(context: Context?, appWidgetManager: AppWidgetManager?, appWidgetIds: IntArray?) {
        Log.d(TAG, "onUpdate")
        appWidgetIds?.forEach {
            val remoteViews = RemoteViews(context?.packageName, top.huar.schedule.R.layout.widget_layout_today)
            val intent = Intent(context, TodayRemoteViewsService::class.java)
            intent.putExtra(AppWidgetManager.EXTRA_APPWIDGET_ID, it)
            intent.data = Uri.parse(intent.toUri(Intent.URI_INTENT_SCHEME))
            remoteViews.setRemoteAdapter(top.huar.schedule.R.id.lv, intent)
            remoteViews.setEmptyView(top.huar.schedule.R.id.lv, top.huar.schedule.R.id.empty_view)
            appWidgetManager?.updateAppWidget(it, remoteViews)
        }
        super.onUpdate(context, appWidgetManager, appWidgetIds)
    }

    override fun onDisabled(context: Context?) {
        Log.d(TAG, "onDisabled")
        super.onDisabled(context)
    }

    companion object {
        private const val TAG = "TodayWidgetProvider"
    }
}