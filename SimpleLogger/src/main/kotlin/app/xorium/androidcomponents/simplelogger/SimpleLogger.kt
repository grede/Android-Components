package app.xorium.androidcomponents.simplelogger

import java.util.concurrent.atomic.AtomicReference


object SimpleLogger: Logger {
    private val loggerRef: AtomicReference<LoggerImpl> = AtomicReference()

    fun init(logLevel: LogLevel = LogLevel.Debug, loggers: Set<Logger> = setOf(LogcatLogger())) {
        if (!loggerRef.compareAndSet(null, LoggerImpl(level = logLevel, loggers = loggers))) {
            throw IllegalStateException("SimpleLogger has already been initialized")
        }
    }

    private fun getLogger(): LoggerImpl {
        return loggerRef.get() ?: throw IllegalStateException("Simple logger must be initialized first")
    }

    override fun logVerbose(tag: String, msg: String) {
        getLogger().logVerbose(tag, msg)
    }

    override fun logDebug(tag: String, msg: String) {
        getLogger().logDebug(tag, msg)
    }

    override fun logWarn(tag: String, msg: String) {
        getLogger().logWarn(tag, msg)
    }

    override fun logError(tag: String, msg: String?, error: Throwable?) {
        getLogger().logError(tag, msg, error)
    }
}

private class LoggerImpl(
    private val level: LogLevel = LogLevel.Debug,
    private val loggers: Set<Logger>
) : Logger {

    override fun logVerbose(tag: String, msg: String) {
        if (level.value <= LogLevel.Verbose.value) {
            loggers.forEach { it.logVerbose(tag, msg) }
        }
    }

    override fun logDebug(tag: String, msg: String) {
        if (level.value <= LogLevel.Debug.value) {
            loggers.forEach { it.logDebug(tag, msg) }
        }
    }

    override fun logWarn(tag: String, msg: String) {
        if (level.value <= LogLevel.Warning.value) {
            loggers.forEach { it.logWarn(tag, msg) }
        }
    }

    override fun logError(tag: String, msg: String?, error: Throwable?) {
        if (level.value <= LogLevel.Error.value) {
            loggers.forEach { it.logError(tag, msg, error) }
        }
    }
}