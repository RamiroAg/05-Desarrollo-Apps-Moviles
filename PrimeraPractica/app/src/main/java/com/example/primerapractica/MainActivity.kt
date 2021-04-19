package com.example.primerapractica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() { //para poder incluir fragments tenemos que heredar si o si de AppCompatActivity
    override fun onCreate(savedInstanceState: Bundle?) {    //el bundle tiene que ver con los manejos que el SO hace por atrás. SI cambia el contexto(se rota el celu) el activity se va a regenerar. en el bundle se pueden guardar cosas, persistir información
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}