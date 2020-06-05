package com.example.navigateactivities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.navigateactivities.Counter
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.counter.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Counter.setOnClickListener{
            val intent= Intent(this,com.example.navigateactivities.Counter::class.java)
            startActivity(intent)
        }

        GridLayoutCards.setOnClickListener{
            val intent= Intent(this,com.example.navigateactivities.GridLayoutCards::class.java)
            startActivity(intent)
        }


    }
}