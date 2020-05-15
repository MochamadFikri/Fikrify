package com.example.fikrify

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_music.*
import kotlinx.android.synthetic.main.fragment_w3.*

// NIM   : 10117198
// Nama  : Mochamad Fikri Fadila AKbar
// Kelas : IF-5

// Tanggal Pengerjaan
// 10 Mei 2020 : Pembuatan Bottom Navigation, Fragment Home dan Fragment Profile
// 12 - 14 Mei 2020 : Penambahan Recyclerview di Fragment Daily dan Fragment Gallery
// 15 - 16 Mei 2020 : Penambahan Konten Fragment Music dan Fragment Profile

class Fragment_music : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_music, container, false)
    }

    companion object {
        fun newInstance(): Fragment_music{
            val fragment = Fragment_music()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }
}