package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import com.example.myapplication.R
import com.example.myapplication.RandActivityDisplay
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_rand.*

class RandActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rand)
        init()
    }


    private fun init() {
        randRecActivator.setOnClickListener {
            val intent = Intent(this, RandActivityDisplay::class.java)
            startActivity(intent)
        }
    }
}
