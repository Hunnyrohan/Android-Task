package com.example.dayone

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class signupActivity : AppCompatActivity() {
    lateinit var firstName: EditText
    lateinit var lastName: EditText
    lateinit var email: EditText
    lateinit var password: EditText
    lateinit var Button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup4)

        firstName = findViewById(R.id.firstname)
        lastName = findViewById(R.id.lastName)
        email = findViewById(R.id.email)
        password = findViewById(R.id.password)
        Button = findViewById(R.id.Button)

        Button.setOnClickListener {
            // Handle signup action
            val fName = firstName.text.toString()
            val lName = lastName.text.toString()
            val emailAddr = email.text.toString()
            val pass = password.text.toString()

            // For demonstration, just show a Toast
            if (fName.isNotBlank() && lName.isNotBlank() && emailAddr.isNotBlank() && pass.isNotBlank()) {
                Toast.makeText(this, "Signed up: $fName $lName", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show()
            }
        }
    }
}




