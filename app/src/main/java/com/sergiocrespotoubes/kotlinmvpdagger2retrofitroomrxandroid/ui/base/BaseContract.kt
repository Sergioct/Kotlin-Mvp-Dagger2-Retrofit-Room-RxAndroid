package com.sergiocrespotoubes.kotlinmvpdagger2retrofitroomrxandroid.ui.base

interface BaseContract {

    interface View {
        fun close()
    }

    interface Presenter {
        /**
         * Drops the reference to the view when destroyed
         */
        fun dropView()
    }

    interface Model

}