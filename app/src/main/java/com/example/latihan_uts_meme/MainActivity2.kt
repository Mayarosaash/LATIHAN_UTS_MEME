package com.example.latihan_uts_meme

import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    companion object {
        const val EXTRA_NAMA = "EXTRA_NAMA"
        const val EXTRA_MENU = "EXTRA_MENU"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val nama: TextView = findViewById(R.id.inama)
        val menu: TextView = findViewById(R.id.isimenu)
        val isinama = intent.getStringExtra(EXTRA_NAMA)
        val isimenu = intent.getStringExtra(EXTRA_MENU)
        nama.text = "$isinama"
        menu.text = "$isimenu"
    }
}