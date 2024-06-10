package com.example.therealimadpracticalexam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.text.util.LocalePreferences.FirstDayOfWeek.Days

class MainScreen : AppCompatActivity() {
    // Declaring arrays with The Days of the Week , minimum and maximum temperatures and the weather condition
    val days = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    val min = arrayOf(12,15,8,0,9,10,10,)
    val max = arrayOf(25,29,18,15,20,18,16)
    val conditions = arrayOf("sunny","sunny","sunny","cold","raining","raining","cold")


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val txtShowResults = findViewById<TextView>(R.id.txtShowResults)
        btnCalculate?.setOnClickListener{
            val min = arrayOf(12,15,8,0,9,10,10,)
            val max = arrayOf(25,29,18,15,20,18,16)

        }

        var sumofAverages = 0.0

        // calculating the average temperature for the week
        for (i in min.indices) {
            val average = (min[i] + max[i]) / 2.0
            sumofAverages += average

            val totalAverage = sumofAverages / min.size

            txtShowResults.text = "Total Average : $totalAverage"
        }
        val intent = Intent(this,DetailedViewScreen::class.java)
        intent.putStringArrayListExtra("days", ArrayList(days.asList()))
        intent.putIntegerArrayListExtra("min", ArrayList(min.asList()))
        intent.putIntegerArrayListExtra("max", ArrayList(max.asList()))
        intent.putStringArrayListExtra("conditions",ArrayList(conditions.asList()))

        startActivity(intent)





    }
}