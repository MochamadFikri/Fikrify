package com.example.fikrify

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class GambarViewHolder(inflater: LayoutInflater, parent: ViewGroup):
    RecyclerView.ViewHolder(inflater.inflate(R.layout.list_item3,parent,false)){

    private var mGambar: ImageView? = null

    init{
        mGambar = itemView.findViewById(R.id.img_gallery)
    }

    fun bind(gambar: Gambar){

        mGambar?.setImageResource(gambar.url)
    }
}