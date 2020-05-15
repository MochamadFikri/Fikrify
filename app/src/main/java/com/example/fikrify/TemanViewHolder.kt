package com.example.fikrify

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class TemanViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item2,parent,false)){

    private var mNama: TextView? = null
    private var mKota: TextView? = null

    init{
        mNama = itemView.findViewById(R.id.list_nama)
        mKota = itemView.findViewById(R.id.list_kota)
    }

    fun bind(teman: Teman){
        mNama?.text = teman.nama
        mKota?.text = teman.kota
    }
}