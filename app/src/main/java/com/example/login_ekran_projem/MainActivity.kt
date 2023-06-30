package com.example.login_ekran_projem

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.button

class MainActivity : AppCompatActivity() {
    private lateinit var editTextTextEmailAddress:TextView
    private lateinit var buttonum: Button
    private lateinit var yardim:TextView
    private lateinit var buttonum2: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        /*setContentView(R.layout.activity_main)
        buttonum2.setOnClickListener {
            yardim.text="buyrun"
        }*/


        yardim= findViewById(R.id.yardim)
        buttonum2=findViewById(R.id.buttonum2)
        buttonum2.setOnClickListener {
            yardim.text="buyrun"

        }
        button.setOnClickListener {

        }

        editTextTextEmailAddress= findViewById(R.id.editTextTextEmailAddress)
        buttonum=findViewById(R.id.buttonum)
        buttonum.setOnClickListener {
            editTextTextEmailAddress.text="merhaba bu benim bağlantılı metnim"

        }




    }
}