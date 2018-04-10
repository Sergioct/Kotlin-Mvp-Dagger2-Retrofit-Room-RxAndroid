package com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.components

import android.app.Activity

interface FirebaseInterface {
    fun signIn()
}

const val RC_SIGN_IN : Int = 414346346

class Firebase(private val activity : Activity) : FirebaseInterface {

    override fun signIn() {
        //val signInIntent = mGoogleSignInClient.getSignInIntent()
        //activity.startActivityForResult(signInIntent, RC_SIGN_IN)
    }

}