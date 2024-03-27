package com.myprojects.quizapp

object Constants {
    fun getQuestions(): ArrayList<Question> {

        val questions = ArrayList<Question>()

        val question1 = Question(
            1,
            "Which county flag it is ?",
            R.drawable.ic_flag_of_india,
            "Australia",
            "India",
            "Japan",
            "Pakistan",
            "India"
        )

        questions.add(question1)

        return questions
    }
}