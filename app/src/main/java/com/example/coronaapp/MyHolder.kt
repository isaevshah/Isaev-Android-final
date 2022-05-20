package com.example.coronaapp

import android.system.Os.bind
import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.coronaapp.Model.CountryModelClass

class MyHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    val binding = CountryModelClass.bind(itemView)
    fun bind(data: CountryModelClass) = with(binding){
        cFullName.text = "${data.country}"
        cSlug.text = "${data.slug}"
        cCode.text = "${data.code}"
    }
}