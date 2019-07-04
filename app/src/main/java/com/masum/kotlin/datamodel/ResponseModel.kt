package com.masum.kotlin.datamodel

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ResponseModel {

    @SerializedName("id")
    @Expose
    var id: Int? = null
    @SerializedName("name")
    @Expose
    var name: String? = null
    @SerializedName("email")
    @Expose
    var email: String? = null
    @SerializedName("gender")
    @Expose
    var gender: String? = null
    @SerializedName("phone")
    @Expose
    var phone: String? = null
    @SerializedName("state")
    @Expose
    var state: Any? = null
    @SerializedName("country")
    @Expose
    var country: String? = null
    @SerializedName("created_at")
    @Expose
    var createdAt: Any? = null
    @SerializedName("updated_at")
    @Expose
    var updatedAt: Any? = null

}