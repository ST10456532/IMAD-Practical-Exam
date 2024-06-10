package com.example.therealimadpracticalexam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class DetailedViewScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view_screen)
        // screen showing detailed information for each days temperature

        val days = intent.getStringArrayExtra("days")
        val min = intent.getIntegerArrayListExtra("min")
        val max = intent.getIntegerArrayListExtra("max")
        val conditions = intent.getStringArrayExtra("conditions")

    }
}