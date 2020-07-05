package app.xorium.androidcomponents.simplelogger


val Any.tag: String
    get() = this.javaClass.simpleName

fun Any.logV(msg: String) {
    SimpleLogger.logVerbose(tag, msg)
}

fun Any.logV(tag: String, msg: String) {
    SimpleLogger.logVerbose(tag, msg)
}

fun Any.logD(msg: String) {
    SimpleLogger.logDebug(tag, msg)
}

fun Any.logD(tag: String, msg: String) {
    SimpleLogger.logDebug(tag, msg)
}

fun Any.logW(msg: String) {
    SimpleLogger.logWarn(tag, msg)
}

fun Any.logW(tag: String, msg: String) {
    SimpleLogger.logWarn(tag, msg)
}

fun Any.logE(tag: String = this.tag, msg: String, error: Throwable? = null) {
    SimpleLogger.logError(tag, msg, error)
}

fun Any.logE(tag: String = this.tag, error: Throwable) {
    SimpleLogger.logError(tag, null, error)
}

fun Any.logE(error: Throwable) {
    SimpleLogger.logError(tag, null, error)
}