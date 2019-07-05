package com.masum.kotlin.ui

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.masum.kotlin.R
import com.masum.kotlin.common.BaseActivity
import com.masum.kotlin.datamodel.ResponseModel
import com.masum.kotlin.listener.ServerRequestFailedListener
import com.masum.kotlin.network.RetrofitClient
import com.masum.kotlin.viewmodel.ViewModel
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*


class MainActivity : BaseActivity(), ServerRequestFailedListener {
    override fun getLaoyutId(): Int {
       return R.layout.activity_main
    }

    override fun functionality() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun listener() {
        btnView.setOnClickListener {
            val viewModel = ViewModelProviders.of(this).get(ViewModel::class.java)
            viewModel.getData!!.observe(this, Observer { responseModel ->
                Log.e("data", responseModel.toString())
            })

            viewModel.repository.setListener(this)
        }    }



    override fun onFailed(massage: String) {
      toasmsg(massage)
    }

    /*
        fun btnView(view: View) {


            //val apiService = retrofit.apiService

            RetrofitClient().instance.getResponse().enqueue(object : Callback<List<ResponseModel>> {
                override fun onFailure(call: Call<List<ResponseModel>>, t: Throwable) {
                    Log.e("", "")
                }

                override fun onResponse(call: Call<List<ResponseModel>>, response: Response<List<ResponseModel>>) {
                    Log.e("", "")
                }

            })


        }*/
    fun toasmsg(msg: String) {
        Toast.makeText(this, msg, Toast.LENGTH_LONG).show()
    }


}


