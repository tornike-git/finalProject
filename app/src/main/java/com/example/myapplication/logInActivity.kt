package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.util.Log.d
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_log_in.*
import kotlinx.android.synthetic.main.activity_sign_up.*


class logInActivity : AppCompatActivity() {

//    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        init()
    }

    private fun init(){
//        auth = Firebase.auth
        loginButton2.setOnClickListener {
            val intent = Intent(this, ChoiceActivity::class.java)
                startActivity(intent)
        }
    }

//    private fun login(){
//        val email: String = emailEditText.text.toString()
//        val password: String = passwordEditText.text.toString()
//
//        auth.signInWithEmailAndPassword(email, password)
//                .addOnCompleteListener(this) { task ->
//                    if (task.isSuccessful) {val intent = Intent(this, ChoiceActivity::class.java)
//                        startActivity(intent)
//                        // Sign in success, update UI with the signed-in user's information
//                        d("login", "signInWithEmail:success")
//                        val user = auth.currentUser
//                    } else {
//                        // If sign in fails, display a message to the user.
//                        d("login", "signInWithEmail:failure", task.exception)
//                        Toast.makeText(baseContext, "Authentication failed.",
//                                Toast.LENGTH_SHORT).show()
                    }