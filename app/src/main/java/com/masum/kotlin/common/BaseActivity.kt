package com.masum.kotlin.common

import android.databinding.DataBindingUtil
import android.databinding.ViewDataBinding
import android.os.Build
import android.os.Bundle

import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import android.widget.Toast

abstract class BaseActivity : AppCompatActivity() {

    private lateinit var binding: ViewDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, getLayoutResource())
        initComponent()
        functionality()
        listener()
    }


    internal abstract fun getLayoutResource(): Int
    internal abstract fun initComponent()
    internal abstract fun functionality()
    internal abstract fun listener()

    val getBinding: ViewDataBinding
        get() = binding

    fun showAllertDialuge(msg: String) {
        val builder: AlertDialog.Builder
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            builder = AlertDialog.Builder(this, android.R.style.Theme_Material_Light_Dialog_Alert)
        } else {
            builder = AlertDialog.Builder(this)
        }
        builder.setTitle("")
            .setMessage(msg)
            .setPositiveButton("ok") { dialog, which -> dialog.dismiss() }
            .setIcon(android.R.drawable.ic_dialog_alert)
            .show()

    }

    fun toasmsg(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }

}