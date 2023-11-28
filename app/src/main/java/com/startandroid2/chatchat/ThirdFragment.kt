    package com.startandroid2.chatchat

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.fragment.app.Fragment

class ThirdFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_third, container, false)
        val editText = view.findViewById<EditText>(R.id.editText)
        val submitButton = view.findViewById<Button>(R.id.submitButton)

        submitButton.setOnClickListener {
            val textToPass = editText.text.toString()
            if (textToPass.isNotBlank()) {
                val intent = Intent(requireContext(), TargetActivity::class.java)
                intent.putExtra("key", textToPass)
                startActivity(intent)
            } else {
                // Handle the case where the text is blank
                Toast.makeText(requireContext(), "Please enter text", Toast.LENGTH_SHORT).show()
            }
        }

        return view
    }
}
