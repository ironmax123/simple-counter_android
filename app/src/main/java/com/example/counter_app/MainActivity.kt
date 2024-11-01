package com.example.counter_app

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        
        val button1 = findViewById<Button>(R.id.button1)
        val button2 = findViewById<Button>(R.id.button2)
        val resetButton = findViewById<Button>(R.id.button3)
        val tv = findViewById<TextView>(R.id.tv)
        var num = 0;
        button1.setOnClickListener {
            num -= 1
            if (num <= 0) {
                num = 0;
            }
            tv.text = num.toString()
        }

        button2.setOnClickListener {
            num += 1
            tv.text = num.toString()
        }

        resetButton.setOnClickListener {
            num=0
            tv.text =num.toString()
        }

    }
}
