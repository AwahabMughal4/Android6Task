package com.startandroid2.chatchat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Load the default fragment (FirstFragment)
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, FirstFragment())
            .commit()

        // Set up buttons to switch between fragments
        findViewById<Button>(R.id.btnFirstFragment).setOnClickListener {
            replaceFragment(FirstFragment())
        }



        findViewById<Button>(R.id.btnThirdFragment).setOnClickListener {
            replaceFragment(ThirdFragment())
        }
    }

    private fun replaceFragment(fragment: androidx.fragment.app.Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fragmentContainer, fragment)
            .addToBackStack(null)
            .commit()
    }
}
