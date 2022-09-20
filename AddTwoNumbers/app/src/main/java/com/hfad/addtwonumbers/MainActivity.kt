package com.hfad.addtwonumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Double.parseDouble

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val firstNumber = findViewById<EditText>(R.id.firstNumber)
        val secondNumber  = findViewById<EditText>(R.id.secondNumber)
        val addedNumber = findViewById<TextView>(R.id.addedNumber)

        buttonAdd.setOnClickListener {
            var num1: Double = parseDouble(firstNumber.text.toString())
            var num2: Double = parseDouble(secondNumber.text.toString())
            var sum = (num1 + num2).toString()
            addedNumber.text = sum
            firstNumber.text.clear()
            secondNumber.text.clear()
        }


    }
}
