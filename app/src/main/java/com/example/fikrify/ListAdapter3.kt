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