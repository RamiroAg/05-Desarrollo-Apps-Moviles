package com.example.a02_botones

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val txt: TextView
        txt = findViewById<View>(R.id.txt) as TextView
        txt.text = "hola desde codigo kotlin"

        // asigno evento a boton
        val btn = findViewById<View>(R.id.button) as Button

        val listener = MyListener(txt)
        //MyListener2 listener2 = new MyListener2(this);
        //View.OnClickListener listenerComoInterfaz;
        //listenerComoInterfaz = listener;


        // conecto boton con my obj
        //MyListener2 listener2 = new MyListener2(this);
        //View.OnClickListener listenerComoInterfaz;
        //listenerComoInterfaz = listener;


        // conecto boton con my obj
        btn.setOnClickListener(listener)
    }
}