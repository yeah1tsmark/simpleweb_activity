package com.example.simplweb_acivity_mark

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var kcbbutton:Button
    lateinit var equitybutton:Button
    lateinit var dtbbutton:Button
    lateinit var absabutton:Button
    lateinit var coopbutton:Button
    lateinit var familybutton:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kcbbutton = findViewById(R.id.btnkcb)
        equitybutton = findViewById(R.id.btnequity)
        dtbbutton = findViewById(R.id.btndtb)
        absabutton = findViewById(R.id.btnabsa)
        coopbutton = findViewById(R.id.btncoop)
        familybutton = findViewById(R.id.btnfamily)


        kcbbutton.setOnClickListener {
           // Toast.makeText(this, "hurray", Toast.LENGTH_SHORT).show()
            val gotowebsite = Intent(this, Webview_activity::class.java)
            startActivity(gotowebsite)
        }

        equitybutton.setOnClickListener {
            val gotowebsite = Intent(this, Webview_activity::class.java)
            startActivity(gotowebsite)
        }

        dtbbutton.setOnClickListener {
            val gotowebsite = Intent(this, Webview_activity::class.java)
            startActivity(gotowebsite)
        }

        absabutton.setOnClickListener {
            val gotowebsite = Intent(this, Webview_activity::class.java)
            startActivity(gotowebsite)
        }

        coopbutton.setOnClickListener {
            val gotowebsite = Intent(this, Webview_activity::class.java)
            startActivity(gotowebsite)
        }

        familybutton.setOnClickListener {
            val gotowebsite = Intent(this, Webview_activity::class.java)
            startActivity(gotowebsite)
        }





    }
}