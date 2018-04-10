package com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.ui.login

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.util.Log
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.provider
import com.jakewharton.rxbinding2.view.RxView
import com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.R
import com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.components.Firebase
import com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.components.RC_SIGN_IN
import com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.ui.base.BaseActivity
import com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.toast


class LoginActivity : BaseActivity(), LoginContract.View {

    override val presenter: LoginPresenter by injector.instance()
    val firebase: Firebase by injector.instance()

    override val layoutId: Int = R.layout.activity_login
    override val toolbarView: Toolbar
        get() = toolbar

    override val activityModules = Kodein.Module(allowSilentOverride = true) {
        bind<LoginPresenter>() with provider {
            LoginPresenter(this@LoginActivity)
        }

        bind<Firebase>() with provider {
            Firebase(this@LoginActivity)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        RxView.clicks(button_sign_in).subscribe({presenter.onGoogleSignInClick()})
    }

    override fun close() = finish()

    override fun loadMain() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun googleSignIn() {
        firebase.signIn()
    }

}