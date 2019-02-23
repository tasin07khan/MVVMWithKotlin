package com.kotlin.mvvm.viewmodel

import android.databinding.BaseObservable
import android.databinding.Bindable
import com.android.databinding.library.baseAdapters.BR
import com.kotlin.mvvm.modle.Customer

class LoginViewModel : BaseObservable() {
    private val customer: Customer


    private val successMessage = "Hurrah!!! Login was successful"
    private val errorMessage = "Ah!! It seems the Email or Password not is valid"

    @Bindable
    var toastMessage: String? = null

    init {
        customer = Customer("", "")
    }

    fun onEmailTextChanged(s: CharSequence) {
        customer.email_addrs = (s.toString())
    }

    fun onPasswordTextChanged(s: CharSequence) {
        customer.password = (s.toString())
    }

    fun onLoginClicked() {
        if (customer.validateCredentials) {
            toastMessage = (successMessage)
            notifyPropertyChanged(BR.toastMessage)
        } else{
            toastMessage = (errorMessage)
            notifyPropertyChanged(BR.toastMessage)
        }
    }
}

