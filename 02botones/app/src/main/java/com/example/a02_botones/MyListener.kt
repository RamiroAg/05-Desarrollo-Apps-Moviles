package com.example.a02_botones

import android.util.Log
import android.view.View
import android.widget.TextView


class MyListener     // escribo un constr que reciba el textview
    (private val t: TextView) : View.OnClickListener {      //Aparentemente los constructores se arman como si fueran parámetros de la clase
    var c = 0

    override fun onClick(view: View) {
        Log.d("MyListener", "Se hizo click! - c: ".plus(c))
        t.text = "Hiciste click, mira como programo android"
        c++
        t.text = "contador:$c"
    }
}