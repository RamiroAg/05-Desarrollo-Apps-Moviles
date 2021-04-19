package com.example.a03_ejemplo_mvc

import android.view.View


class Controller(model: Model, screenMgr: ScreenManager) : View.OnClickListener {
    private val model: Model = model
    private val screenManager: ScreenManager = screenMgr

    override fun onClick(view: View) {
        model.add()
        screenManager.showNumber(model.counter)
    }

    init {
        this.screenManager.setButtonListener(this)
        this.screenManager.showNumber(model.counter)
    }
}
