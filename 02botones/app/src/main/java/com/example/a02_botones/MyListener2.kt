package com.example.a02_botones

import android.app.Activity
import android.view.View
import android.widget.TextView


class MyListener2(private val a: Activity) : View.OnClickListener {
    override fun onClick(view: View) {
        val t = a.findViewById<TextView>(R.id.txt)
        t.text = "mensaje!"
    }
}