package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val btnCool = findViewById<Button>(R.id.btnCool)
        val btnHot = findViewById<Button>(R.id.btnHot)
        val layout = findViewById<LinearLayout>(R.id.main)

        btnCool.setOnClickListener {
            layout.setBackgroundColor(ContextCompat.getColor(this,R.color.cyan))
        }

        btnHot.setOnClickListener {
            layout.setBackgroundColor(ContextCompat.getColor(this,R.color.gold))
        }
    }
}