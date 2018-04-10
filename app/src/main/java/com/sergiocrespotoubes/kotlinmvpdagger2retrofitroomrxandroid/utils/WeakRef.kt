package com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.utils

import java.lang.ref.WeakReference
import kotlin.reflect.KProperty

fun <T> weak(value: T) = WeakRef(value)

class WeakRef<out T>(value: T) {
    private val weakReference: WeakReference<T> = WeakReference(value)
    operator fun getValue(thisRef: Any, property: KProperty<*>): T? = weakReference.get()
}