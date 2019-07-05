package com.masum.kotlin.ui

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.masum.kotlin.R
import com.masum.kotlin.datamodel.ResponseModel
import kotlinx.android.synthetic.main.item_layout.view.*

class DataAdapter(private val context: Context, private val dataList: List<ResponseModel>) :
    RecyclerView.Adapter<DataAdapter.CustomViewHolder>() {


    inner class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.tv_name
        val tvEmail: TextView = itemView.tv_email
    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): CustomViewHolder {

        var inflater = LayoutInflater.from(context)
        val itemView = inflater.inflate(R.layout.item_layout, null)
        return CustomViewHolder(itemView)
    }

    override fun getItemCount(): Int {

        return dataList.size
    }


    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {

        holder.tvName.setText(dataList[position].name)
        holder.tvName.setText(dataList[position].email)
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getItemViewType(position: Int): Int {
        return position
    }
}