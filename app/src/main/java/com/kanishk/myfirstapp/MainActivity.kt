package com.kanishk.myfirstapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Assigning mybutton to a variable named btnClickMe
        val btnClickMe = findViewById<Button>(R.id.mybutton)
        val textView1 = findViewById<TextView>(R.id.textView2)

        // COuter for times the button is clicked
        var timesClicked = 0

        // Setting a click listener to mybutton
        btnClickMe.setOnClickListener{
            // increasing count with each click
            timesClicked = timesClicked + 1
            // Changing text inside the textview to timesClicked
            textView1.text = timesClicked.toString()
        }
    }
}