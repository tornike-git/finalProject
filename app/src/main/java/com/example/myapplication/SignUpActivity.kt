package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.view.View
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_sign_up.*

class SignUpActivity : AppCompatActivity() {

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        init()
    }
    private fun init(){
        auth = Firebase.auth
        EnterSignUp.setOnClickListener{
            signUp()
        }
    }

    private fun signUp(){
        val email: String = emailEditText.text.toString()
        val password: String = passwordEditText.text.toString()
        val repeatPassword: String = repeatPasswordEditText.text.toString()

        if (email.isNotEmpty() && password.isNotEmpty() && repeatPassword.isNotEmpty()){
            if (password == repeatPassword) {
                progressBar.visibility = View.VISIBLE
                auth.createUserWithEmailAndPassword(email, password)
                    .addOnCompleteListener(this) { task ->
                        progressBar.visibility = View.GONE
                        if (task.isSuccessful) {
                            // Sign in success, update UI with the signed-in user's information
                            d("signUp", "createUserWithEmail:success")
                            val user = auth.currentUser
                            val intent = Intent(this, ChoiceActivity::class.java)
                            startActivity(intent)
                        } else {
                            // If sign in fails, display a message to the user.
                            d("signUp", "createUserWithEmail:failure", task.exception)
                            Toast.makeText(baseContext, "Authentication failed.",
                                Toast.LENGTH_SHORT).show()
                        }
                    }
            }else{
                Toast.makeText(this, "fill correct password", Toast.LENGTH_LONG).show()
            }

        }else{
            Toast.makeText(this, "fill all fields", Toast.LENGTH_LONG).show()
        }
    }

}