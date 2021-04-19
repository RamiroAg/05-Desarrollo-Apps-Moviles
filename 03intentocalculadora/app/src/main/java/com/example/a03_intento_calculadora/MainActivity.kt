package com.example.a03_intento_calculadora

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {
    private var numero: String? = null
    private var operador1 = 0
    private var operador2 = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn1 = findViewById<View>(R.id.btn1) as Button
        val btn2 = findViewById<View>(R.id.btn2) as Button
        val btnAdd = findViewById<View>(R.id.btnAdd) as Button
        val btnEq = findViewById<View>(R.id.btnEqual) as Button

        // conecto eventos
        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btnAdd.setOnClickListener(this)
        btnEq.setOnClickListener(this)
        numero = ""
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onClick(view: View) {
        val txt = findViewById<View>(R.id.textView) as TextView
        when (view.id) {
            R.id.btn1 -> {
                numero += "1"
            }
            R.id.btn2 -> {
                numero += getString(R.string.texto_boton_dos)
            }
            R.id.btnAdd -> {
                operador1 = numero!!.toInt()
                numero = ""
            }
            R.id.btnEqual -> {
                operador2 = numero!!.toInt()
                numero = (operador1 + operador2).toString()
            }
        }
        txt.text = numero
    }
}
