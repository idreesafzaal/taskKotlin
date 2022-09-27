package com.commscope.codingchallengekt.utils

import android.app.AlertDialog
import android.content.Context
import android.widget.Toast

fun showDialog(context: Context, message: String)
{
    AlertDialog.Builder(context).apply {
        setTitle(message)
        setPositiveButton("OK", null)
    }.show()
}

fun showToast(context: Context,message: String)
{
    Toast.makeText(context,message,Toast.LENGTH_LONG).show();
}

