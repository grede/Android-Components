package app.xorium.androidcomponents.viewextensions

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.IdRes
import androidx.annotation.LayoutRes

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

fun ViewGroup.inflate(@LayoutRes layout: Int, attachToRoot: Boolean = false): View = LayoutInflater.from(context).inflate(layout, this, attachToRoot)