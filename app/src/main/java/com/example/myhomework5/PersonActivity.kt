package com.example.myhomework5

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class PersonActivity : AppCompatActivity() {

    private lateinit var UserInfotextView: TextView
    private lateinit var PasswordChangeButton: Button
    private lateinit var LogOutButton: Button

    private lateinit var auth: FirebaseAuth



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person)

        auth = FirebaseAuth.getInstance()

        UserInfotextView = findViewById(R.id.UserInfotextView)

        PasswordChangeButton = findViewById(R.id.PasswordChangeButton)

        LogOutButton = findViewById(R.id.LogOutButton)

        UserInfotextView.text = auth.currentUser?.uid

        LogOutButton.setOnClickListener{
            auth.signOut()
            startActivity(Intent(this, MainActivity::class.java))
            finish()

        }
        PasswordChangeButton.setOnClickListener{
            startActivity(Intent(this, ChangePasswordActivity::class.java))
        }


    }
}