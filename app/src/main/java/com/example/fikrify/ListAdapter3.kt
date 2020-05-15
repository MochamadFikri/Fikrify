package com.example.fikrify

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class ListAdapter3(private val list:List<Gambar>) : RecyclerView.Adapter<GambarViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GambarViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        return GambarViewHolder(inflater,parent)
    }

    override fun onBindViewHolder(holder: GambarViewHolder, position: Int) {
        val gambar: Gambar = list[position]
        holder.bind(gambar)
    }
    override fun getItemCount(): Int = list.size
}