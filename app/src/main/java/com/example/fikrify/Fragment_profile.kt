package com.example.fikrify

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_profile.*

// NIM   : 10117198
// Nama  : Mochamad Fikri Fadila AKbar
// Kelas : IF-5

// Tanggal Pengerjaan
// 10 Mei 2020 : Pembuatan Bottom Navigation, Fragment Home dan Fragment Profile
// 12 - 14 Mei 2020 : Penambahan Recyclerview di Fragment Daily dan Fragment Gallery
// 15 - 16 Mei 2020 : Penambahan Konten Fragment Music dan Fragment Profile

class Fragment_profile : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    companion object {
        fun newInstance(): Fragment_profile{
            val fragment = Fragment_profile()
            val args = Bundle()
            fragment.arguments = args
            return fragment
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        btn_fb.setOnClickListener(){
                val fb = "https://www.facebook.com/mochamad.fikri.79"
                val i = Intent(Intent.ACTION_VIEW)
                i.data = Uri.parse(fb)
                startActivity(i)
        }
        btn_ig.setOnClickListener(){
            val ig = "https://www.instagram.com/mochamadfghd"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(ig)
            startActivity(i)
        }
        btn_find.setOnClickListener(){
            val find = "https://maps.app.goo.gl/TgxFqbz7bXrL3igD7"
            val i = Intent(Intent.ACTION_VIEW)
            i.data = Uri.parse(find)
            startActivity(i)
        }
        btn_about.setOnClickListener(){
            val intent = Intent(getActivity(),Home::class.java)
            startActivity(intent)
        }
    }
}