package com.example.fikrify

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class ListAdapter2(private val list:List<Teman>) : RecyclerView.Adapter<TemanViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TemanViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return TemanViewHolder(inflater,parent)
    }

    override fun onBindViewHolder(holder: TemanViewHolder, position: Int) {
        val teman: Teman = list[position]
        holder.bind(teman)
    }
    override fun getItemCount(): Int = list.size
}