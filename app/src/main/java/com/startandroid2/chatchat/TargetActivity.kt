package com.startandroid2.chatchat

import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TargetActivity : AppCompatActivity() {

    lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)

        // Initialize the 'name' variable before using it

            val receivedText = intent?.getStringExtra("key")
            if (receivedText != null) {
                val textView = findViewById<TextView>(R.id.textView)
                textView.text = "Received Text: $receivedText"
            } else {
                // Handle the case where the received text is null
                Toast.makeText(this, "No text received", Toast.LENGTH_SHORT).show()

        }
    }
}
