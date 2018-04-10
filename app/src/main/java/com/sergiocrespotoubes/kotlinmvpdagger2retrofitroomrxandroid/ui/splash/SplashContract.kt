package com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.ui.splash

import com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.ui.base.BaseContract

/**
 * Created by Sergio Crespo Toubes on 08/04/2018.
 *     SergioCrespoToubes@gmail.com
 *     www.SergioCrespoToubes.com
 */
interface SplashContract {

    interface View : BaseContract.View {

        fun loadLogin()

        fun loadMain()

    }

    interface Presenter : BaseContract.Presenter {


    }

    interface Model : BaseContract.Model

}