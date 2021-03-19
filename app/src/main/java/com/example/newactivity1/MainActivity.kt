package com.example.newactivity1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
var count=0
open class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text1=findViewById<TextView>(R.id.textView2)
        text1.text=count.toString()
        val inc=findViewById<Button>(R.id.button)
        val new=findViewById<Button>(R.id.button2)
        inc.setOnClickListener {
            count++;
            text1.text=count.toString()
        }
        new.setOnClickListener {
            val intent= Intent(this,NewActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onRestart() {
        super.onRestart()
        val text1=findViewById<TextView>(R.id.textView2)
        text1.text=count.toString()
    }
}