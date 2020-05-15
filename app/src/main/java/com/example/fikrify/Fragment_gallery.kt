package com.example.fikrify

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.TextView
import androidx.recyclerview.widget.*
import kotlinx.android.synthetic.main.fragment_daily.*
import kotlinx.android.synthetic.main.fragment_gallery.*


// NIM   : 10117198
// Nama  : Mochamad Fikri Fadila AKbar
// Kelas : IF-5

// Tanggal Pengerjaan
// 10 Mei 2020 : Pembuatan Bottom Navigation, Fragment Home dan Fragment Profile
// 12 - 14 Mei 2020 : Penambahan Recyclerview di Fragment Daily dan Fragment Gallery
// 15 - 16 Mei 2020 : Penambahan Konten Fragment Music dan Fragment Profile

class Fragment_gallery : Fragment() {

    private val gambar_saya = listOf(
        Gambar(R.drawable.g1),
        Gambar(R.drawable.g2),
        Gambar(R.drawable.g3),
        Gambar(R.drawable.g4),
        Gambar(R.drawable.g5),
        Gambar(R.drawable.g1),
        Gambar(R.drawable.g2),
        Gambar(R.drawable.g3),
        Gambar(R.drawable.g4),
        Gambar(R.drawable.g5),
        Gambar(R.drawable.g1),
        Gambar(R.drawable.g2),
        Gambar(R.drawable.g3),
        Gambar(R.drawable.g4),
        Gambar(R.drawable.g5),
        Gambar(R.drawable.g1),
        Gambar(R.drawable.g2),
        Gambar(R.drawable.g3),
        Gambar(R.drawable.g4),
        Gambar(R.drawable.g5)
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_gallery, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recycle3.apply{

            layoutManager = GridLayoutManager(activity,3)

            adapter = ListAdapter3(gambar_saya)
        }
    }
    companion object {
        fun newInstance(): Fragment_gallery = Fragment_gallery()
    }

}

