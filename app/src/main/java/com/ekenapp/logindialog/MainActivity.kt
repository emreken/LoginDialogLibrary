package com.ekenapp.logindialog

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ekenapp.logindialoglibrary.LoginDialogCreator


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val toast = LoginDialogCreator()
        toast.showToastMessage(this, "First library used", true)

        toast.createAlertDialog(this)
    }
}