package com.masum.kotlin.ui

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.util.Log
import com.masum.kotlin.R
import com.masum.kotlin.common.BaseActivity
import com.masum.kotlin.databinding.ActivityMainBinding
import com.masum.kotlin.datamodel.ResponseModel
import com.masum.kotlin.listener.ServerRequestFailedListener
import com.masum.kotlin.viewmodel.ViewModel
import kotlinx.android.synthetic.main.activity_main.*


open class MainActivity : BaseActivity(), ServerRequestFailedListener {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: ViewModel
    private lateinit var adapter: DataAdapter
    override fun getLayoutResource(): Int {
        return R.layout.activity_main
    }

    override fun initComponent() {
        binding = getBinding as ActivityMainBinding
        viewModel = ViewModelProviders.of(this).get(ViewModel::class.java)
        viewModel.repository.setListener(this)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }

    override fun functionality() {
    }

    override fun listener() {
        btnView.setOnClickListener {
            viewModel.getData!!.observe(this, Observer { responseModel ->
                Log.e("data", responseModel.toString())
                adapter = DataAdapter(this, responseModel as List<ResponseModel>)
                recyclerView.adapter = adapter

            })

            viewModel.repository.setListener(this)
        }
    }


    override fun onFailed(massage: String) {
        showAllertDialuge(massage)
    }

}


