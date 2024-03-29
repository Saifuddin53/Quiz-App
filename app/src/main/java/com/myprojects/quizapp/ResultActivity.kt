package com.myprojects.quizapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ResultActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_result)

        val userNameView: TextView = findViewById(R.id.userName)
        val score: TextView = findViewById(R.id.tvScore)
        val btnFinish: Button = findViewById(R.id.btnResultFinish)

        userNameView.text = intent.getStringExtra(Constants.USER_NAME)
        val correctanswered = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)
        val total = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        score.text = "Your score is ${correctanswered} out of ${total}"
        
        btnFinish.setOnClickListener{
            startActivity(Intent(this, MainActivity::class.java))
        }
    
    }
}