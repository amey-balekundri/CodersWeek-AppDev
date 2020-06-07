package com.example.login

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.login.Counter
import com.example.login.GridLayoutCards
import com.firebase.ui.auth.AuthUI
import kotlinx.android.synthetic.main.counter.*
import kotlinx.android.synthetic.main.navigateui.*

class Navigateui : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.navigateui)

        Counter.setOnClickListener{
            val intent= Intent(this,com.example.login.Counter::class.java)
            startActivity(intent)
        }

        GridLayoutCards.setOnClickListener{
            val intent= Intent(this, com.example.login.GridLayoutCards::class.java)
            startActivity(intent)

        }

        btn_sign_out.setOnClickListener{
            AuthUI.getInstance().signOut(this@Navigateui)
                .addOnCompleteListener {
                    val intent=Intent(this,MainActivity::class.java)
                    startActivity(intent)

                }
                .addOnFailureListener{
                        e-> Toast.makeText(this@Navigateui,e.message, Toast.LENGTH_SHORT).show()
                }
        }
        }
    }
