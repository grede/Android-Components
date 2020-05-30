package app.xorium.androidcomponents.viewstate

data class ViewStateWithData<T>(
    val showLoading: Boolean = false,
    val showContent: Boolean = false,
    val showError: Boolean = false,
    val errorMsg: ErrorMessage? = null,
    val data: T? = null
)