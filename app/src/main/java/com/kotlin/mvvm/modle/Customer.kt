package com.kotlin.mvvm.modle


import android.text.TextUtils
import android.util.Patterns

class Customer(var email_addrs: String, var password: String) {

    val validateCredentials: Boolean
        get() = !TextUtils.isEmpty(email_addrs) && Patterns.EMAIL_ADDRESS.matcher(email_addrs).matches() && password.length > 5
}

