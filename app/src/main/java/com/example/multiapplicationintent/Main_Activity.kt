package com.example.multiapplicationintent

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    var b: Button? = null
    var b1: Button? = null
    var b2: Button? = null
    var b3: Button? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        b = findViewById(R.id.button)
        b1 = findViewById(R.id.button1)
        b2 = findViewById(R.id.button2)
        b3 = findViewById(R.id.button3)
        b.setOnClickListener(View.OnClickListener {
            val i = packageManager.getLaunchIntentForPackage("com.example.listview")
            startActivity(i)
        })
        b1.setOnClickListener(View.OnClickListener {
            val i1 = packageManager.getLaunchIntentForPackage("com.example.switchapplication")
            startActivity(i1)
        })
        b2.setOnClickListener(View.OnClickListener {
            val i2 = packageManager.getLaunchIntentForPackage("com.example.seekbar")
            startActivity(i2)
        })
        b3.setOnClickListener(View.OnClickListener {
            val i3 = packageManager.getLaunchIntentForPackage("com.example.radiobutton")
            startActivity(i3)
        })
    }
}