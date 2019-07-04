package com.masum.kotlin.repository

import android.app.Application
import android.arch.lifecycle.MutableLiveData
import com.masum.kotlin.datamodel.ResponseModel
import com.masum.kotlin.network.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class DataRepository(private val application: Application) {


    val responseData: MutableLiveData<List<ResponseModel>>
        get() {

            //application.

            RetrofitClient().instance.getResponse().enqueue(object : Callback<List<ResponseModel>> {

                override fun onResponse(call: Call<List<ResponseModel>>, response: Response<List<ResponseModel>>) {

                    responseData.value = response.body()
                    responseData.value = response.body()
                }

                override fun onFailure(call: Call<List<ResponseModel>>, t: Throwable) {
                    TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
                }
            })

            return responseData
        }


}