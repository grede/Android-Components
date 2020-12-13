package app.xorium.androidcomponents.consumable

import java.util.concurrent.atomic.AtomicReference

class Consumable<T>(data: T) {

    private val dateRef: AtomicReference<T> = AtomicReference(data)

    fun consume(): T? {
        return dateRef.getAndSet(null)
    }
}