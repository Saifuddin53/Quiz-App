package com.myprojects.quizapp

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {

    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<Question>? = null
    private var mOptionSelected: Int = 0

    private var tvProgress: ProgressBar? = null
    private var progressText: TextView? = null
    private var questionView: TextView? = null
    private var imageView: ImageView? = null
    private var buttonSubmit: Button? = null

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
        buttonSubmit = findViewById(R.id.btn_submit)

        option1 = findViewById(R.id.option1)
        option2 = findViewById(R.id.option2)
        option3 = findViewById(R.id.option3)
        option4 = findViewById(R.id.option4)

        option1?.setOnClickListener(this)
        option2?.setOnClickListener(this)
        option3?.setOnClickListener(this)
        option4?.setOnClickListener(this)
        buttonSubmit?.setOnClickListener(this)

        mQuestionList = Constants.getQuestions()
        setQuestion()
    }

    private fun setQuestion() {
        defaultOptionView()
        val question = mQuestionList!![mCurrentPosition - 1]
        questionView?.text = question.question
        imageView?.setImageResource(question.image)
        progressText?.text = "$mCurrentPosition/10"
        option1?.text = question.option1
        option2?.text = question.option2
        option3?.text = question.option3
        option4?.text = question.option4
        mCurrentPosition++
    }

    private fun defaultOptionView() {
        val options = ArrayList<TextView>()

        option1?.let {
            options.add(0, it)
        }

        option2?.let {
            options.add(1, it)
        }

        option3?.let {
            options.add(2, it)
        }

        option4?.let {
            options.add(3, it)
        }

        for (option in options) {
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(
                this,
                R.drawable.default_option_border_bg
            )
        }
    }

    private fun selectedOptionView(textView: TextView, selectedOption: Int) {
        defaultOptionView()

        mOptionSelected = selectedOption

        textView.setTextColor(Color.parseColor("#363A43"))
        textView.setTypeface(textView.typeface, Typeface.BOLD)
        textView.background = ContextCompat.getDrawable(
            this,
            R.drawable.select_option_border_bg
        )
    }

    override fun onClick(view: View?) {
        when(view?.id) {
            R.id.option1 -> {
                option1?.let {
                    selectedOptionView(it, 1)
                }
            }
            R.id.option2 -> {
                option2?.let {
                    selectedOptionView(it, 2)
                }
            }
            R.id.option3 -> {
                option3?.let {
                    selectedOptionView(it, 3)
                }
            }
            R.id.option4 -> {
                option4?.let {
                    selectedOptionView(it, 4)
                }
            }
            R.id.btn_submit -> {
                if (mOptionSelected == 0) {
                    mCurrentPosition++

                    when {
                        mCurrentPosition <= mQuestionList!!.size -> {
                            setQuestion()
                        }
                    }
                } else {
                    val question = mQuestionList?.get(mCurrentPosition - 1)
                    if (question!!.correctAnswer != mOptionSelected) {
                        answerView(mOptionSelected, R.drawable.wrong_option_border_bg)
                    }
                    answerView(question.correctAnswer, R.drawable.correct_option_border_bg)
                }
                if (mCurrentPosition == mQuestionList!!.size) {
                    buttonSubmit?.text = "FINISH"
                } else{
                    buttonSubmit?.text = "GO TO NEXT QUESTION"
                }

                mOptionSelected = 0
            }
        }
    }
    private fun answerView(answer: Int, drawableView: Int) {
        when(answer) {
            1 -> {
                option1?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            2 -> {
                option2?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            3 -> {
                option3?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
            4 -> {
                option4?.background = ContextCompat.getDrawable(
                    this,
                    drawableView
                )
            }
        }
    }
}