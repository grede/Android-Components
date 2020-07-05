package app.xorium.androidcomponents.simplelogger


interface Logger {
    fun logVerbose(tag: String, msg: String)
    fun logDebug(tag: String, msg: String)
    fun logWarn(tag: String, msg: String)
    fun logError(tag: String, msg: String, error: Throwable? = null)
}