package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.RandActivity
import kotlinx.android.synthetic.main.activity_choice.*

class ChoiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_choice)
        init()
    }


    private fun init() {
        randombutton.setOnClickListener {
            val intent = Intent(this, RandActivity::class.java)
            startActivity(intent)
        }
        wordsbutton.setOnClickListener {
            val intent = Intent(this, WordsEnterActivity::class.java)
            startActivity(intent)

        }
    }
}