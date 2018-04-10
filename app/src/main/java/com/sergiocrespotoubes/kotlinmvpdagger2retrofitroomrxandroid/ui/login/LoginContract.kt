package com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.ui.login

import com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.ui.base.BaseContract

/**
 * Created by Sergio Crespo Toubes on 08/04/2018.
 *     SergioCrespoToubes@gmail.com
 *     www.SergioCrespoToubes.com
 */
interface LoginContract {

    interface View : BaseContract.View {

        fun loadMain()
        fun googleSignIn()

    }

    interface Presenter : BaseContract.Presenter{
        fun onGoogleSignInClick()
    }

    interface Model : BaseContract.Model

}