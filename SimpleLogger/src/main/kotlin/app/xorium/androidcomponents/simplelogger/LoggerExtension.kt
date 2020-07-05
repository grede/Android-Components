package app.xorium.androidcomponents.simplelogger


val Any.tag: String
    get() = this.javaClass.simpleName

fun Any.logV(tag: String = this.tag, msg: String) {
    SimpleLogger.logVerbose(tag, msg)
}

fun Any.logD(tag: String = this.tag, msg: String) {
    SimpleLogger.logDebug(tag, msg)
}

fun Any.logW(tag: String = this.tag, msg: String) {
    SimpleLogger.logWarn(tag, msg)
}

fun Any.logE(tag: String = this.tag, msg: String, error: Throwable? = null) {
    SimpleLogger.logError(tag, msg, error)
}

fun Any.logE(tag: String = this.tag, error: Throwable? = null) {
    SimpleLogger.logError(tag, null, error)
}