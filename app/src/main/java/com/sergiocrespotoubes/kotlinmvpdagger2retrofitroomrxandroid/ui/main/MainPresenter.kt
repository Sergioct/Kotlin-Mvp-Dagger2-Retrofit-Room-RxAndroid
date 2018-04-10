package com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.ui.main

import com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.ui.base.BaseContract
import com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.utils.weak

class MainPresenter(view: MainContract.View) : MainContract.Presenter  {

    private val view: BaseContract.View? by weak(view)

    override fun dropView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}