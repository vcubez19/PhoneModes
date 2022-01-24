package com.example.phonemodes

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        title = "Landscape or portrait"
        val button1 = findViewById<Button>(R.id.idButton)


        button1.setOnClickListener {
            if ( button1.resources.configuration.orientation == Configuration.ORIENTATION_PORTRAIT ) {
                Toast.makeText(this@MainActivity, "This is portrait mode", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this@MainActivity, "This is landscape mode", Toast.LENGTH_SHORT).show()
            }
        }


    }
}

