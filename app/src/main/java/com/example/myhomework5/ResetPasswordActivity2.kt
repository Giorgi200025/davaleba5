package com.example.myhomework5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class ResetPasswordActivity2 : AppCompatActivity() {

    private lateinit var resetButton: Button
    private lateinit var resetEmaileditText: EditText

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reset_password2)


        auth = FirebaseAuth.getInstance()

        resetButton = findViewById(R.id.resetSendButton)
        resetEmaileditText = findViewById(R.id.resetEmaileditText)

        resetButton.setOnClickListener{
            val email = resetEmaileditText.text.toString()
            auth.sendPasswordResetEmail(email).addOnCompleteListener {task ->
                if (task.isSuccessful){
                    Toast.makeText(this, "Chek Email", Toast.LENGTH_LONG).show()
                } else{
                    Toast.makeText(this, "ERORR", Toast.LENGTH_LONG).show()
                }

            }
        }
    }
}