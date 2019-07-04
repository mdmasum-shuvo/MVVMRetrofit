package com.masum.kotlin.ui

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import com.masum.kotlin.R
import com.masum.kotlin.datamodel.ResponseModel
import com.masum.kotlin.network.RetrofitClient
import com.masum.kotlin.viewmodel.ViewModel
import kotlinx.android.synthetic.main.activity_main.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.*


class MainActivity : AppCompatActivity() {
    //val viewModel :ViewModel(this)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val viewModel=ViewModelProviders.of(this).get(ViewModel::class.java)


    }


    fun btnView(view: View) {


        //val apiService = retrofit.apiService

  /*      RetrofitClient().instance.getResponse().enqueue(object : Callback<List<ResponseModel>> {
            override fun onFailure(call: Call<List<ResponseModel>>, t: Throwable) {
                Log.e("", "")
            }

            override fun onResponse(call: Call<List<ResponseModel>>, response: Response<List<ResponseModel>>) {
                Log.e("", "")
            }

        })*/


    }


}


