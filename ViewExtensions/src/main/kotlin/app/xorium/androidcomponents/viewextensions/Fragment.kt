package app.xorium.androidcomponents.viewextensions

import android.view.View
import androidx.annotation.IdRes
import androidx.fragment.app.Fragment

fun <T : View> Fragment.lazyViewById(@IdRes id: Int): Lazy<T> {
    return lazy(LazyThreadSafetyMode.NONE) {
        requireView().findViewById<T>(id)
    }
}

