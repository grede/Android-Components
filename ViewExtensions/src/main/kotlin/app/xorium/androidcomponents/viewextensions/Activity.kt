package app.xorium.androidcomponents.viewextensions

import android.app.Activity
import android.view.View
import androidx.annotation.IdRes

fun <T : View> Activity.lazyViewById(@IdRes viewId: Int): Lazy<T> {
    return lazy(LazyThreadSafetyMode.NONE) { findViewById<T>(viewId) }
}