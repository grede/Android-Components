package app.xorium.androidcomponents.viewstate

data class ViewState(
    val showLoading: Boolean = false,
    val showContent: Boolean = false,
    val showError: Boolean = false,
    val errorMsg: ErrorMessage? = null
)