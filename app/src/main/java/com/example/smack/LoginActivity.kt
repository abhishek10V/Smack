package com.example.smack

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun loginLoginBtnClicked(view: View){

    }
    fun loginSignupBtnClicked(view: View){
     val SignupIntent = Intent(this,SignupActivity::class.java)
        startActivity(SignupIntent)
    }
}