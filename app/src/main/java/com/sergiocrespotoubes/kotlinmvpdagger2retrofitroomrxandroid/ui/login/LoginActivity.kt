package com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.ui.login

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.Toolbar
import android.util.Log
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.bind
import com.github.salomonbrys.kodein.instance
import com.github.salomonbrys.kodein.provider
import com.google.android.gms.auth.api.signin.GoogleSignIn
import com.google.android.gms.auth.api.signin.GoogleSignInAccount
import com.google.android.gms.common.api.ApiException
import com.google.android.gms.tasks.Task
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
        RxView.clicks(button_google_sign_in).subscribe({presenter.onGoogleSignInClick()})
    }

    override fun close() = finish()

    override fun loadMain() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun googleSignIn() {
        firebase.signIn()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        if (requestCode === RC_SIGN_IN) {
            // The Task returned from this call is always completed, no need to attach
            // a listener.
            val task = GoogleSignIn.getSignedInAccountFromIntent(data)
            handleSignInResult(task)
        }
    }

    private fun handleSignInResult(completedTask: Task<GoogleSignInAccount>) {
        try {
            val account = completedTask.getResult(ApiException::class.java)

            // Signed in successfully, show authenticated UI.
            //updateUI(account)
            Log.w("TEST", "signInResult: Success")
            toast("SUCCESS")
        } catch (e: ApiException) {
            // The ApiException status code indicates the detailed failure reason.
            // Please refer to the GoogleSignInStatusCodes class reference for more information.
            Log.w("TEST", "signInResult:failed code=" + e.statusCode)
            //updateUI(null)
            toast("ERROR")
        }

    }
}