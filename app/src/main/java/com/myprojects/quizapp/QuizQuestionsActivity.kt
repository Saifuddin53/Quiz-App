package com.myprojects.quizapp

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class QuizQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val questionList = Constants.getQuestions()
        Log.i("Question size is ", "${questionList.size}")
    }
}