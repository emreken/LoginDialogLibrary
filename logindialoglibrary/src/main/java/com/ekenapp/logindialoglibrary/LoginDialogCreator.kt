package com.ekenapp.logindialoglibrary

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast


class LoginDialogCreator {
    /**
     *
     * @param context : context
     * @param message : string message
     * @param isLongDuration : false for short, true for long
     */
    fun showToastMessage(context: Context?, message: String?, isLongDuration: Boolean) {
        if (isLongDuration) {
            Toast.makeText(context, message, Toast.LENGTH_LONG).show()
        } else {
            Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
        }
    }

    fun createAlertDialog(context: Context) {
        val alertDialogBuilder: AlertDialog.Builder = AlertDialog.Builder(context)
        alertDialogBuilder.setTitle("Login")
        val mInflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = mInflater.inflate(R.layout.dialog, null)
        alertDialogBuilder.setView(view)
        alertDialogBuilder.setMessage("First Library Dialog")
        alertDialogBuilder.setPositiveButton("Login",
            DialogInterface.OnClickListener { dialog, which -> dialog.cancel() })
        val alert: AlertDialog = alertDialogBuilder.create()
        alert.show()
    }
}