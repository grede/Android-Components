package app.xorium.androidcomponents.viewextensions

import android.view.View
import androidx.annotation.IdRes

fun <T : View> View.lazyViewById(@IdRes id: Int): Lazy<T> {
    return lazy(LazyThreadSafetyMode.NONE) { findViewById<T>(id) }
}

fun View.visibleOrGone(condition: Boolean) {
    visibility = if (condition) {
        View.VISIBLE
    } else {
        View.GONE
    }
}

fun View.gone() {
    visibility = View.GONE
}

fun View.visible() {
    visibility = View.VISIBLE
}