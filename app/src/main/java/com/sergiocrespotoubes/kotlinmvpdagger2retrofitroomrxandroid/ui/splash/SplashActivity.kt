package com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.ui.splash

import android.content.Intent
import android.support.v7.widget.Toolbar
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.provider
import com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.R
import com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.ui.base.BaseActivity
import com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.ui.login.LoginActivity
import com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.ui.main.MainActivity
import kotlinx.android.synthetic.main.activity_splash.*

class SplashActivity : BaseActivity(), SplashContract.View {


    override val presenter: SplashPresenter by injector.instance()
    override val layoutId: Int = R.layout.activity_splash
    override val toolbarView: Toolbar
        get() = toolbar

    override val activityModules = Kodein.Module(allowSilentOverride = true) {
        bind<SplashPresenter>() with provider {
            SplashPresenter(this@SplashActivity)
        }
    }

    override fun loadLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

    override fun loadMain() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun close() = finish()

}