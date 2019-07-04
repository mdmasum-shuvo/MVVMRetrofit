package com.masum.kotlin.network

import com.masum.kotlin.datamodel.ResponseModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

interface ApiService {


    @GET("profile")
    fun getResponse(): Call<List<ResponseModel>>
}