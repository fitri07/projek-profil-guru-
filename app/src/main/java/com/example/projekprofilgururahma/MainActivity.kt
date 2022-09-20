package com.example.projekprofilgururahma

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnrequestguru = findViewById<Button>(R.id.buttonrequestguru)


        btnrequestguru.setOnClickListener {
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)

            val btnrequestpaksaiful = findViewById<Button>(R.id.buttonrequestpaksaiful)


            btnrequestpaksaiful.setOnClickListener {
                val intent = Intent(this, MainActivity3::class.java)
                startActivity(intent)
            }
        }
    }
}

