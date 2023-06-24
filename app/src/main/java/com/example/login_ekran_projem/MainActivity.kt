package com.example.login_ekran_projem

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.login_ekran_projem.R.id.benimTextView2

class MainActivity : AppCompatActivity() {
    private lateinit var editTextTextEmailAddress:TextView
    private lateinit var buttonum: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        editTextTextEmailAddress= findViewById(R.id.editTextTextEmailAddress)
        buttonum=findViewById(R.id.buttonum)
        buttonum.setOnClickListener {
            editTextTextEmailAddress.text="merhaba bu benim bağlantılı metnim"
        }


    }
}