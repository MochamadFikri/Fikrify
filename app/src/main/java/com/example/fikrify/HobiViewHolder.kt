package com.example.fikrify

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

// NIM   : 10117198
// Nama  : Mochamad Fikri Fadila AKbar
// Kelas : IF-5

// Tanggal Pengerjaan
// 10 Mei 2020 : Pembuatan Bottom Navigation, Fragment Home dan Fragment Profile
// 12 - 14 Mei 2020 : Penambahan Recyclerview di Fragment Daily dan Fragment Gallery
// 15 - 16 Mei 2020 : Penambahan Konten Fragment Music dan Fragment Profile

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