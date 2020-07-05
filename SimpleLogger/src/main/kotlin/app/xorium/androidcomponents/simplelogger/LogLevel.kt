package app.xorium.androidcomponents.simplelogger


sealed class LogLevel(val value: Int) {
    object Verbose : LogLevel(1)
    object Debug : LogLevel(2)
    object Warning : LogLevel(3)
    object Error : LogLevel(4)
    object None : LogLevel(5)
}