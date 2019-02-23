package com.kotlin.mvvm

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kotlin.mvvm.viewmodel.LoginViewModel
import android.widget.Toast
import android.databinding.BindingAdapter
import android.databinding.DataBindingUtil
import android.view.View
import android.widget.Button
import com.kotlin.mvvm.databinding.ActivityMainBinding

@BindingAdapter("toastMessage")
fun runMe(view: View, message: String?) {
    if (message != null)
        Toast.makeText(view.getContext(), message, Toast.LENGTH_SHORT).show()
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var activityMainBinding = DataBindingUtil.setContentView<ActivityMainBinding>(this@MainActivity, R.layout.activity_main)
        activityMainBinding.setViewModel(LoginViewModel())
        activityMainBinding.executePendingBindings()

    }


}
