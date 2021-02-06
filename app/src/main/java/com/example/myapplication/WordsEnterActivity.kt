package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_words_enter.*

class WordsEnterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_words_enter)
        init()
    }

    private fun init() {
        displayB.setOnClickListener {
            if (word1.text.isNotEmpty() || word2.text.isNotEmpty() || word3.text.isNotEmpty()) {
                val intent = Intent(this, wordsDisplayActivity::class.java)
                startActivity(intent)
            }
            else{
                Toast.makeText(this, "try again", Toast.LENGTH_SHORT).show()
            }
        }
    }
}