package com.example.androidapptutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var helloText = findViewById<TextView>(R.id.hello_world)

        helloText.text = "HELLO WORLD"
    }

    fun buttonClick(view: View) {

    }
}