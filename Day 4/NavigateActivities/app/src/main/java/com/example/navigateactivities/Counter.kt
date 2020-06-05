package com.example.navigateactivities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.counter.*

class Counter : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.counter)

        var increment=0;

        button_increment.setOnClickListener {
            increment++

            increment_textview.text = increment.toString()
        }
    }
}