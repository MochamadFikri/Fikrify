package com.example.fikrify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash_Screen : AppCompatActivity() {

    lateinit var handler:Handler

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.act_splash_screen)

        handler = Handler()
        handler.postDelayed({
            val intent = Intent(this@Splash_Screen,Walkthrough::class.java)
            startActivity(intent)
            finish()
        },3000)
    }

}
