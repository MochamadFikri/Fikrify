package com.example.fikrify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import kotlinx.android.synthetic.main.act_walkthrough.*

class Walkthrough : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_walkthrough)

        viewpager.adapter = PagerAdapter(supportFragmentManager)

    }
}
