package com.masum.kotlin.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//singleTone class for retrofit
class RetrofitClient {

   /* private lateinit var retrofitClient: Retrofit

    var apiService: ApiService? = null

    @Volatile
    private var restclient: RetrofitClient? = null*/

    companion object {
        private const val BASE_URL = "http://maxproit.solutions/datasync/api/"
    }

/*    init {
        if (!::retrofitClient.isInitialized) {
            retrofitClient = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        }

        apiService = retrofitClient.create(ApiService::class.java)
    }*/


    val instance: ApiService by lazy {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()


        retrofit.create(ApiService::class.java)
    }


}