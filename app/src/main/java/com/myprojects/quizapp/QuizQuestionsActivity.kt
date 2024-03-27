package com.myprojects.quizapp

import android.annotation.SuppressLint
import android.media.Image
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.w3c.dom.Text

class QuizQuestionsActivity : AppCompatActivity() {

    private var tvProgress: ProgressBar? = null
    private var progressText: TextView? = null
    private var questionView: TextView? = null
    private var imageView: ImageView? = null

    private var option1: TextView? = null
    private var option2: TextView? = null
    private var option3: TextView? = null
    private var option4: TextView? = null

    @SuppressLint("CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        tvProgress = findViewById(R.id.progressBar)
        progressText = findViewById(R.id.text_progress)
        questionView = findViewById(R.id.questionView)
        imageView = findViewById(R.id.imageView)
        val buttonSubmit = findViewById<Button>(R.id.btn_submit)

        option1 = findViewById(R.id.option1)
        option2 = findViewById(R.id.option2)
        option3 = findViewById(R.id.option3)
        option4 = findViewById(R.id.option4)

        val questionList = Constants.getQuestions()
        Log.i("Question size is ", "${questionList.size}")

        var currentPosition = 1

        buttonSubmit.setOnClickListener {
            var question = questionList[currentPosition - 1]
            questionView?.text = question.question
            imageView?.setImageResource(question.image)
            progressText?.text = "$currentPosition/10"
            option1?.text = question.option1
            option2?.text = question.option2
            option3?.text = question.option3
            option4?.text = question.option4
            currentPosition++
        }
    }
}