package com.example.coronaapp

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.coronaapp.Model.CountryModelClass
import java.util.ArrayList

class MyAdapter (private val arrayList: ArrayList<CountryModelClass>): RecyclerView.Adapter<MyHolder>() {
    private lateinit var context: Context
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        context = parent.context
        return MyHolder(LayoutInflater.from(context).inflate(R.layout.country, parent, false))
    }
    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        val data = arrayList[position]
        holder.bind(data)
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }
}