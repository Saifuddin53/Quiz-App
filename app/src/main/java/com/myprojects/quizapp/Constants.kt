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

        val question2 = Question(
            2,
            "Which county flag it is ?",
            R.drawable.ic_flag_of_argentina,
            "Australia",
            "Argentina",
            "Japan",
            "Pakistan",
            "Argentina"
        )

        val question3 = Question(
            3,
            "Which county flag it is ?",
            R.drawable.ic_flag_of_australia,
            "Australia",
            "India",
            "Japan",
            "Pakistan",
            "Australia"
        )

        val question4 = Question(
            4,
            "Which county flag it is ?",
            R.drawable.ic_flag_of_belgium,
            "Australia",
            "India",
            "Japan",
            "Belgium",
            "Belgium"
        )

        val question5 = Question(
            5,
            "Which county flag it is ?",
            R.drawable.ic_flag_of_brazil,
            "Australia",
            "India",
            "Japan",
            "Brazil",
            "Brazil"
        )

        val question6 = Question(
            6,
            "Which county flag it is ?",
            R.drawable.ic_flag_of_denmark,
            "Australia",
            "India",
            "Japan",
            "Denmark",
            "Denmark"
        )

        val question7 = Question(
            7,
            "Which county flag it is ?",
            R.drawable.ic_flag_of_fiji,
            "Australia",
            "Fiji",
            "Japan",
            "Pakistan",
            "Fiji"
        )

        val question8 = Question(
            8,
            "Which county flag it is ?",
            R.drawable.ic_flag_of_germany,
            "Australia",
            "India",
            "Germany",
            "Pakistan",
            "Germany"
        )

        val question9 = Question(
            9,
            "Which county flag it is ?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait",
            "India",
            "Japan",
            "Pakistan",
            "Kuwait"
        )

        val question10 = Question(
            10,
            "Which county flag it is ?",
            R.drawable.ic_flag_of_new_zealand,
            "Australia",
            "India",
            "Japan",
            "New Zealand",
            "New Zealand"
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