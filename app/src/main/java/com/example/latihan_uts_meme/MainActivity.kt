package com.example.latihan_uts_meme

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var editnama: EditText
    lateinit var btnorder: Button
    lateinit var spinner: Spinner
    lateinit var menu : String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets

        }
        editnama = findViewById(R.id.isiannama)
        btnorder = findViewById(R.id.btn1)
        spinner = findViewById(R.id.spinMenu)
        btnorder.setOnClickListener {
            menu = spinner.selectedItem.toString()

            val moveIntent = Intent(this@MainActivity, MainActivity2::class.java)
            moveIntent.putExtra(MainActivity2.EXTRA_NAMA, editnama.text.toString())
            moveIntent.putExtra(MainActivity2.EXTRA_MENU, menu)
            startActivity(moveIntent)

        }

    }
}