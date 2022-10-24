package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.superPrzycisk).setOnClickListener {
            findViewById<Button>(R.id.superPrzycisk).text = "Dziala"
        }
        findViewById<Button>(R.id.piesPrzycisk).setOnClickListener {
            findViewById<Button>(R.id.piesPrzycisk).text = "kot"
        }
    }
}