package com.example.smack

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_signup.*
import java.util.Random

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
    }
    var userAvatar = "profileDefault"
    var avatarColor = "[0.5,0.5,0.5,1]"

    fun CreateUserBtnClicked(view: View){

    }

    fun profileImageClicked(view: View){
       val random = Random()
        val color = random.nextInt(2)
        val avatar = random.nextInt(28)

        if(color==0){
            userAvatar = "light$avatar"
        }
        else{
            userAvatar = "dark$avatar"
        }
        val resourceId = resources.getIdentifier(userAvatar,"drawable",packageName)
        profileImageView.setImageResource(resourceId)
    }
    fun generateBackgroundBtnClicked(view: View){
        val random = Random()
        val r = random.nextInt(255)
        val g = random.nextInt(255)
        val b = random.nextInt(255)

        profileImageView.setBackgroundColor(Color.rgb(r,g,b))
        val savedR = r.toDouble()/255
        val savedG = g.toDouble()/255
        val savedB = b.toDouble()/255
        avatarColor = "[$savedR,$savedG,$savedB,1]"
        println(avatarColor)
    }
}