package com.example.fikrify

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


// NIM   : 10117198
// Nama  : Mochamad Fikri Fadila AKbar
// Kelas : IF-5

// Tanggal Pengerjaan
// 10 Mei 2020 : Pembuatan Bottom Navigation, Fragment Home dan Fragment Profile
// 12 - 14 Mei 2020 : Penambahan Recyclerview di Fragment Daily dan Fragment Gallery
// 15 - 16 Mei 2020 : Penambahan Konten Fragment Music dan Fragment Profile

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