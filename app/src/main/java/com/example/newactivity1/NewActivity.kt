package com.example.newactivity1

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class NewActivity: MainActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.newactivity)
        val text2=findViewById<TextView>(R.id.textView)
        text2.text=count.toString()
        val old=findViewById<Button>(R.id.button3)
        val dec=findViewById<Button>(R.id.button4)
        dec.setOnClickListener {
            count--;
            text2.text=count.toString()
        }
        old.setOnClickListener {
            finish()
        }
    }
}