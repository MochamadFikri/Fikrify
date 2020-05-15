package com.example.fikrify

import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter


// NIM   : 10117198
// Nama  : Mochamad Fikri Fadila AKbar
// Kelas : IF-5

// Tanggal Pengerjaan
// 10 Mei 2020 : Pembuatan Bottom Navigation, Fragment Home dan Fragment Profile
// 12 - 14 Mei 2020 : Penambahan Recyclerview di Fragment Daily dan Fragment Gallery
// 15 - 16 Mei 2020 : Penambahan Konten Fragment Music dan Fragment Profile

class PagerAdapter(fm: FragmentManager): FragmentPagerAdapter(fm,FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT){
    // sebuah list yang menampung objek Fragment
    private val pages = listOf(
        Fragment_w1(),
        Fragment_w2(),
        Fragment_w3()
    )

    // menentukan fragment yang akan dibuka pada posisi tertentu
    override fun getItem(position: Int): Fragment {
        return pages[position]
    }

    override fun getCount(): Int {
        return pages.size
    }
}