@file:Suppress("ClassName")

package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_rand_display.*
import kotlinx.android.synthetic.main.activity_words_enter.*
import java.io.InputStream

class wordsDisplayActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_words_display)
        forBurger()
        forBrownies()
        forPancakes()
        forPasta()
    }
    private fun forBurger(){
        val example1="burger"
        val example2="meat"
        val example3="fried"
        val keyWord1: String = word1.text.toString()
        val keyWord2: String = word2.text.toString()
        val keyWord3: String = word3.text.toString()

        if (keyWord1 == example1 || keyWord1 == example2 || keyWord1==example3)
        {
            readJsonBurger()
        }
        if (keyWord2 == example1 || keyWord2 == example2 || keyWord2 == example3)
        {
            readJsonBurger()
        }
        if (keyWord3 == example1 || keyWord3 == example2 || keyWord3 == example3)
        {
            readJsonBurger()
        }
        else {
            Toast.makeText(this, "None of the ingredients matched our recipes", Toast.LENGTH_SHORT).show()
        }

    }
    private fun forBrownies(){
        val example1="brownies"
        val example2="chocolate"
        val example3="cake"
        val keyWord1: String = word1.text.toString()
        val keyWord2: String = word2.text.toString()
        val keyWord3: String = word3.text.toString()

        if (keyWord1 == example1 || keyWord1 == example2 || keyWord1==example3)
        {
            readJsonBrownies()
        }
        if (keyWord2 == example1 || keyWord2 == example2 || keyWord2 == example3)
        {
            readJsonBrownies()
        }
        if (keyWord3 == example1 || keyWord3 == example2 || keyWord3 == example3)
        {
            readJsonBrownies()
        }
        else {
            Toast.makeText(this, "None of the ingredients matched our recipes", Toast.LENGTH_SHORT).show()
        }

    }
    private fun forPancakes(){
        val example1="pancake"
        val example2="sugar"
        val example3="breakfast"
        val keyWord1: String = word1.text.toString()
        val keyWord2: String = word2.text.toString()
        val keyWord3: String = word3.text.toString()

        if (keyWord1 == example1 || keyWord1 == example2 || keyWord1==example3)
        {
            readJsonPancakes()
        }
        if (keyWord2 == example1 || keyWord2 == example2 || keyWord2 == example3)
        {
            readJsonPancakes()
        }
        if (keyWord3 == example1 || keyWord3 == example2 || keyWord3 == example3)
        {
            readJsonPancakes()
        }
        else {
            Toast.makeText(this, "None of the ingredients matched our recipes", Toast.LENGTH_SHORT).show()
        }

    }
    private fun forPasta(){
        val example1="pasta"
        val example2="garlic"
        val example3="oil"
        val keyWord1: String = word1.text.toString()
        val keyWord2: String = word2.text.toString()
        val keyWord3: String = word3.text.toString()

        if (keyWord1 == example1 || keyWord1 == example2 || keyWord1==example3)
        {
            readJsonPasta()
        }
        if (keyWord2 == example1 || keyWord2 == example2 || keyWord2 == example3)
        {
            readJsonPasta()
        }
        if (keyWord3 == example1 || keyWord3 == example2 || keyWord3 == example3)
        {
            readJsonPasta()
        }
        else {
            Toast.makeText(this, "None of the ingredients matched our recipes", Toast.LENGTH_SHORT).show()
        }

    }


    private fun readJsonBrownies() {
        var json : String?= null
        val inputStream: InputStream = assets.open("Brownies")
        json = inputStream.bufferedReader().use { it.readText() }
        json_text.text=json
    }
    private fun readJsonBurger() {
        var json : String?= null
        val inputStream: InputStream = assets.open("Burger")
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
        val inputStream: InputStream = assets.open("Pasta")
        json = inputStream.bufferedReader().use { it.readText() }
        json_text.text=json
    }

}