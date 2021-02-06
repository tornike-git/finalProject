package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.d
import kotlinx.android.synthetic.main.activity_rand_display.*
import java.io.InputStream

class RandActivityDisplay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rand_display)
        displayRec()
    }
    private fun displayRec(){
        val number:Int = (0..3).random()
        d("randomNumber", "Random Number")
        when (number) {
            0 -> {
                readJsonBrownies()
            }
            1 -> {
                readJsonBurger()
            }
            2 -> {
                readJsonPancakes()
            }
            else -> {
                readJsonPasta()
            }
        }
    }
    private fun readJsonBrownies() {
        var json : String?= null
        val inputStream:InputStream = assets.open("Brownies")
        json = inputStream.bufferedReader().use { it.readText() }
        json_text.text=json
    }
    private fun readJsonBurger() {
        var json : String?= null
        val inputStream:InputStream = assets.open("Burger")
        json = inputStream.bufferedReader().use { it.readText() }
        json_text.text=json
    }
    private fun readJsonPancakes() {
        var json : String?= null
        val inputStream: InputStream = assets.open("Pancakes")
        json = inputStream.bufferedReader().use { it.readText() }
        json_text.text=json
    }
    private fun readJsonPasta() {
        var json : String?= null
        val inputStream:InputStream = assets.open("Pasta")
        json = inputStream.bufferedReader().use { it.readText() }
        json_text.text=json
    }
    }

