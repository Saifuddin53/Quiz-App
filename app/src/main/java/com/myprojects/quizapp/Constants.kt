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
            2
        )

        val question2 = Question(
            2,
            "Which county flag it is ?",
            R.drawable.ic_flag_of_argentina,
            "Australia",
            "Argentina",
            "Japan",
            "Pakistan",
            2
        )

        val question3 = Question(
            3,
            "Which county flag it is ?",
            R.drawable.ic_flag_of_australia,
            "Australia",
            "India",
            "Japan",
            "Pakistan",
            1
        )

        val question4 = Question(
            4,
            "Which county flag it is ?",
            R.drawable.ic_flag_of_belgium,
            "Australia",
            "India",
            "Japan",
            "Belgium",
            4
        )

        val question5 = Question(
            5,
            "Which county flag it is ?",
            R.drawable.ic_flag_of_brazil,
            "Australia",
            "India",
            "Japan",
            "Brazil",
            4
        )

        val question6 = Question(
            6,
            "Which county flag it is ?",
            R.drawable.ic_flag_of_denmark,
            "Australia",
            "India",
            "Japan",
            "Denmark",
            4
        )

        val question7 = Question(
            7,
            "Which county flag it is ?",
            R.drawable.ic_flag_of_fiji,
            "Australia",
            "Fiji",
            "Japan",
            "Pakistan",
            2
        )

        val question8 = Question(
            8,
            "Which county flag it is ?",
            R.drawable.ic_flag_of_germany,
            "Australia",
            "India",
            "Germany",
            "Pakistan",
            3
        )

        val question9 = Question(
            9,
            "Which county flag it is ?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait",
            "India",
            "Japan",
            "Pakistan",
            1
        )

        val question10 = Question(
            10,
            "Which county flag it is ?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia",
            "India",
            "Japan",
            "New Zealand",
            4
        )

        questions.add(question1)
        questions.add(question2)
        questions.add(question3)
        questions.add(question4)
        questions.add(question5)
        questions.add(question6)
        questions.add(question7)
        questions.add(question8)
        questions.add(question9)
        questions.add(question10)

        return questions
    }
}