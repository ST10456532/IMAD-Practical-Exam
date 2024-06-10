package com.example.therealimadpracticalexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // declaring the Exit App Button and Go to Main Screen Button
        val btnExitApp = findViewById<Button>(R.id.btnExitApp)
        val btnMainScreen = findViewById<Button>(R.id.btnMainScreen)

        btnMainScreen?.setOnClickListener{
            val intent = Intent(this,MainScreen::class.java)
            startActivity(intent)
        }


    }
}