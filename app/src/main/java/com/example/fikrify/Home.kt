package com.example.fikrify

import android.graphics.Typeface
import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.act_home.*

// NIM   : 10117198
// Nama  : Mochamad Fikri Fadila AKbar
// Kelas : IF-5

// Tanggal Pengerjaan
// 10 Mei 2020 : Pembuatan Bottom Navigation, Fragment Home dan Fragment Profile
// 12 - 14 Mei 2020 : Penambahan Recyclerview di Fragment Daily dan Fragment Gallery
// 15 - 16 Mei 2020 : Penambahan Konten Fragment Music dan Fragment Profile

class Home : AppCompatActivity() {

    private var content: FrameLayout? = null

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId){
            R.id.nav_home -> {
                val fragment = Fragment_home.newInstance()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_daily -> {
                val fragment = Fragment_daily.newInstance()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_gallery -> {
                val fragment = Fragment_gallery.newInstance()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_music -> {
                val fragment = Fragment_music.newInstance()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
            R.id.nav_profile -> {
                val fragment = Fragment_profile.newInstance()
                addFragment(fragment)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    private fun addFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .setCustomAnimations(R.anim.design_bottom_sheet_slide_in, R.anim.design_bottom_sheet_slide_out)
            .replace(R.id.content, fragment, fragment.javaClass.getSimpleName())
            .commit()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_home)


        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        val fragment = Fragment_home.newInstance()
        addFragment(fragment)
    }
}