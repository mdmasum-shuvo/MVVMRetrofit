package com.masum.kotlin.repository

import android.app.Application
import android.arch.lifecycle.MutableLiveData
import com.masum.kotlin.datamodel.ResponseModel
import com.masum.kotlin.listener.ServerRequestFailedListener
import com.masum.kotlin.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DataRepository(private val application: Application) {

    var responseData = MutableLiveData<List<ResponseModel>>()

    private lateinit var mListener: ServerRequestFailedListener

    fun responseData(): MutableLiveData<List<ResponseModel>>? {

        RetrofitClient().instance.getResponse().enqueue(object : Callback<List<ResponseModel>> {

            override fun onResponse(call: Call<List<ResponseModel>>, response: Response<List<ResponseModel>>) {
                responseData!!.value = response.body() as List<ResponseModel>

            }

            override fun onFailure(call: Call<List<ResponseModel>>, t: Throwable) {
                mListener.onFailed("" + t.message)
            }
        })

        return responseData
    }


    fun setListener(mListener: ServerRequestFailedListener) {
        this.mListener = mListener
    }
}