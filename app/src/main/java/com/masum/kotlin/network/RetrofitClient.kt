package com.masum.kotlin.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//singleTone class for retrofit
class RetrofitClient {

    companion object {
        private const val BASE_URL = "http://maxproit.solutions/datasync/api/"
    }


    val instance: ApiService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        retrofit.create(ApiService::class.java)
    }


}