package com.example.a03_ejemplo_mvc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val model = Model()
        val screenManager = ScreenManager(this)
        val controller = Controller(model, screenManager)
    }
}
