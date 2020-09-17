package com.example.quizapp

object Constants{

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionList = ArrayList<Question>()

        val q1 = Question(1, "რომელ ქვეყანას ეკუთვნის მოცემული დროშა",
            R.drawable.ic_burkinafaso,
            "ზელანდია",
            "არგენტინა",
            "ბურკინა ფასო",
            "ნამიბია",
            3
            )
        questionList.add(q1)

        val q2 = Question(2, "რომელ ქვეყანას ეკუთვნის მოცემული დროშა",
            R.drawable.ic_israel,
            "საფრანგეთი",
            "ისრაელი",
            "აფხაზეთი",
            "რუსეთი",
            2
        )
        questionList.add(q2)

        val q3 = Question(3, "რომელ ქვეყანას ეკუთვნის მოცემული დროშა",
            R.drawable.ic_tanzania,
            "ტანზანია",
            "ტუვალუ",
            "კონკორდია",
            "სამცხე-ჯავახეთი",
            1
        )
        questionList.add(q3)

        val q4 = Question(4, "რომელ ქვეყანას ეკუთვნის მოცემული დროშა",
            R.drawable.ic_sanmarino,
            "ზელანდია",
            "მარტვილი",
            "ბურკინა ფასო",
            "სან მარინო",
            4
        )
        questionList.add(q4)

        val q5 = Question(5, "რომელ ქვეყანას ეკუთვნის მოცემული დროშა",
            R.drawable.ic_tuvalu,
            "ტრინიდადი და ტობაგო",
            "ტანზანია",
            "ტუვალუ",
            "ნამიბია",
            3
        )
        questionList.add(q5)

        val q6 = Question(6, "რომელ ქვეყანას ეკუთვნის მოცემული დროშა",
            R.drawable.ic_nauru,
            "სირია",
            "ნაურუ",
            "ტონგა",
            "ტოგო",
            2
        )
        questionList.add(q6)


        val q7 = Question(7, "რომელ ქვეყანას ეკუთვნის მოცემული დროშა",
            R.drawable.ic_liechtenstein,
            "ლინხენშტეინი",
            "ზამბია",
            "ზიმბაბუე",
            "ფარცხანაყანები",
            1
        )
        questionList.add(q7)

        val q8 = Question(8, "რომელ ქვეყანას ეკუთვნის მოცემული დროშა",
            R.drawable.ic_venezuela,
            "ვენესუელა",
            "ვანუატუ",
            "ვიეტნამი",
            "ტუნისი",
            1
        )
        questionList.add(q8)

        val q9 = Question(9, "რომელ ქვეყანას ეკუთვნის მოცემული დროშა",
            R.drawable.ic_kenya,
            "უგანდა",
            "სენეგალი",
            "სინგაპური",
            "ყენია",
            4
        )
        questionList.add(q9)

        val q10 = Question(0, "რომელ ქვეყანას ეკუთვნის მოცემული დროშა",
            R.drawable.ic_georgia,
            "მარტვილის კანიონი",
            "ფარცხანაყანები",
            "საქართველო",
            "აწეწილი ყვითელი მარშუტკა",
            3
        )
        questionList.add(q10)



        return questionList

    }

}