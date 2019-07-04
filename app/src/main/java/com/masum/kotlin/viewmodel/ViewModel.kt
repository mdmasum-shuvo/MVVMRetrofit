package com.masum.kotlin.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import com.masum.kotlin.datamodel.ResponseModel
import com.masum.kotlin.repository.DataRepository

class ViewModel(application: Application) : AndroidViewModel(application) {

    private var repository: DataRepository

    init {
        repository = DataRepository(application)
    }

    val getData: MutableLiveData<List<ResponseModel>>
        get() = repository.responseData

}