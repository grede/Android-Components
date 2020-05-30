package app.xorium.androidcomponents.viewstate

import androidx.annotation.StringRes

data class ErrorMessage(val errorMsg: String? = null, @StringRes val errorMsgResId: Int? = null) {
    init {
        if (errorMsg == null && errorMsgResId == null) {
            throw IllegalArgumentException("Either errorMsg or errorMsgResId must be specified")
        }

        if (errorMsg != null && errorMsgResId != null) {
            throw IllegalArgumentException("Both errorMsg and errorMsgResId can't be specified at the same time")
        }
    }
}