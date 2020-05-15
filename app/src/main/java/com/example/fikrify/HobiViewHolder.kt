package com.example.fikrify

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class HobiViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item,parent,false)){

    private var mNama: TextView? = null
    private var mDeskripsi: TextView? = null

    init{
        mNama = itemView.findViewById(R.id.list_title)
        mDeskripsi = itemView.findViewById(R.id.list_deskripsi)
    }

    fun bind(hobi: Hobi){
        mNama?.text = hobi.nama
        mDeskripsi?.text = hobi.deskripsi
    }
}