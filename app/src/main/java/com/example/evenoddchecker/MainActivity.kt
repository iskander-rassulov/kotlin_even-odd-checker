package com.example.evenoddchecker

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editTextNumber = findViewById<EditText>(R.id.editTextNumber)
        val checkButton = findViewById<Button>(R.id.checkButton)
        val resultText = findViewById<TextView>(R.id.resultText)

        checkButton.setOnClickListener {
            val num = editTextNumber.text.toString().toIntOrNull()
            if (num != null) {
                if (num % 2 == 0) {
                    resultText.text = "Number is even"
                } else {
                    resultText.text = "Number is odd"
                }
            } else {
                resultText.text = "Input correct number please!"
            }
        }
    }
}
