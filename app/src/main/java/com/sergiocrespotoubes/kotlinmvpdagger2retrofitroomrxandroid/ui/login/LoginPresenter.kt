package com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.ui.login

import com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.utils.weak

class LoginPresenter(view: LoginContract.View) : LoginContract.Presenter {

    private val view: LoginContract.View? by weak(view)

    override fun onGoogleSignInClick() {
        view?.googleSignIn()

    }

    override fun dropView() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}