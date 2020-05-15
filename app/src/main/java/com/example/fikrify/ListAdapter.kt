package com.example.fikrify

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class ListAdapter(private val list:List<Hobi>) : RecyclerView.Adapter<HobiViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HobiViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return HobiViewHolder(inflater,parent)
    }

    override fun onBindViewHolder(holder: HobiViewHolder, position: Int) {
        val hobi: Hobi = list[position]
        holder.bind(hobi)
    }
    override fun getItemCount(): Int = list.size
}