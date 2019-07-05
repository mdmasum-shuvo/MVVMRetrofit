package com.masum.kotlin.common

import android.os.Build
import android.os.Bundle
import android.os.PersistableBundle
import android.support.annotation.RequiresApi
import android.support.v7.app.AppCompatActivity

abstract  class BaseActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(getLaoyutId())
        functionality()
        listener()
    }


    abstract fun getLaoyutId() :Int
    abstract fun functionality()
    abstract fun listener()
}