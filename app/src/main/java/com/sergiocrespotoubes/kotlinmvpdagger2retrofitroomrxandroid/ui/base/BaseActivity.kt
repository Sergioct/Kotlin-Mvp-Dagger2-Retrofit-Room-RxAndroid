package com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.ui.base

import android.content.Intent
import android.os.Bundle
import android.support.v7.widget.Toolbar
import com.github.salomonbrys.kodein.Kodein
import com.github.salomonbrys.kodein.android.KodeinAppCompatActivity
import com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.KotlinApplication

abstract class BaseActivity : KodeinAppCompatActivity() {

    abstract val layoutId: Int
    abstract val presenter: BaseContract.Presenter
    abstract val toolbarView: Toolbar
    abstract val activityModules: Kodein.Module

    override fun onCreate(savedInstanceState: Bundle?) {
        KotlinApplication.instance.addModule(activityModules)
        super.onCreate(savedInstanceState)

        setContentView(layoutId)
        setSupportActionBar(toolbarView)
        preparePresenter(intent)
    }

    open fun preparePresenter(intent: Intent?) {}

}