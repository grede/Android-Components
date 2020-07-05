package app.xorium.androidcomponents.simplelogger

import android.util.Log


class LogcatLogger : Logger {
    override fun logVerbose(tag: String, msg: String) {
        Log.v(tag, msg)
    }

    override fun logDebug(tag: String, msg: String) {
        Log.d(tag, msg)
    }

    override fun logWarn(tag: String, msg: String) {
        Log.w(tag, msg)
    }

    override fun logError(tag: String, msg: String?, error: Throwable?) {
        Log.e(tag, msg, error)
    }
}