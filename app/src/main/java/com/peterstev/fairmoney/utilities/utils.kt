package com.peterstev.fairmoney.utilities

import androidx.lifecycle.LiveData
import androidx.lifecycle.Observer
import timber.log.Timber

fun main() {
    println("1949-09-09T06:22:16.422Z".formatDate())
}

fun String.capitalizeFirstCharacter(): String {
    if (this.isEmpty() || this.first().isUpperCase()) return this
    val firstChar = this.first()
    return this.replaceFirst(firstChar, firstChar.toUpperCase(), true)
}

fun String.formatDate(): String {
    val condition = if ("T" in this) "T" else "t"
    if (this.isEmpty() || !this.contains(condition, true)) return this
    return this.split(condition)[0]
}

fun <T> LiveData<T>.observeOnce(observer: (T) -> Unit) {
    observeForever(object : Observer<T> {
        override fun onChanged(value: T) {
            val resource = value as Resource<*>
            if (resource.data != null) {
                observer(value)
                removeObserver(this)
            }
        }
    })
}

fun logInfo(message: String){
    println(message)
    Timber.i(message)
}