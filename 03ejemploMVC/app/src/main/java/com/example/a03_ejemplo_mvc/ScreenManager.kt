package com.example.a03_ejemplo_mvc

import android.app.Activity
import android.view.View
import android.widget.Button
import android.widget.TextView



class ScreenManager(a: Activity) {
    private val t: TextView = a.findViewById<View>(R.id.txt) as TextView
    private val b: Button = a.findViewById<View>(R.id.button) as Button

    fun showNumber(number: Int) {
        t.text = number.toString()
    }

    fun setButtonListener(listener: View.OnClickListener?) {
        b.setOnClickListener(listener)
    }

}
