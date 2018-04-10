package com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.ui.splash

import com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.utils.weak
import java.util.*
import kotlin.concurrent.timerTask

class SplashPresenter(view: SplashContract.View) : SplashContract.Presenter {

    private val view: SplashContract.View? by weak(view)

    private lateinit var name: String

    init {
        initTimer()
    }

    private fun initTimer() {
        val timer = Timer()
        timer.schedule(timerTask { nextScreen()
            view?.close()
        }, 3000)
    }

    private fun nextScreen() {
        view?.loadLogin()
    }

    override fun dropView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}