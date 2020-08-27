package com.example.mightyveggie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.SeekBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnOpenActivity : Button = findViewById(R.id.btn_open_new_activity)
        btnOpenActivity.setOnClickListener {
            val intent = Intent(this, Activity2 :: class.java)
            startActivity(intent)
        }

    }
}