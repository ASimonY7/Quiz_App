package com.example.quizapp

object setData {

    const val name:String="name"
    const val score:String="score"

   fun getQuestion():ArrayList<QuestionData>{
       var que:ArrayList<QuestionData> = arrayListOf()

       var question1 = QuestionData(
           1,
           "Leo's are always mean?",

           "Yes, I hate them",
           "Yes, I partly felt that",
           "I don't know",
           "No, leo's the best",
           4
       )
       var question2 = QuestionData(
           2,
           "You are Leo if u r born in",

           "23 july",
           "1 january",
           "15 september",
           "I do not believe to zodiac signs",
           1
       )
       var question3 = QuestionData(
           3,
           "What Leo likes??",

           "Good grades",
           "Good food btw we can survive everywhere",
           "Slay clothes",
           "None of the above",
           1
       )
       var question4 = QuestionData(
           4,
           "What's your zodiac sign?",

           "Scorpio",
           "Leo",
           "Capricorn",
           "Aquarius",
           2
       )

       var question5 = QuestionData(
           5,
           "Leo signs are ?",

           "Air signs",
           "Water signs",
           "Earth signs",
           "Fire signs",
           4
       )

       var question6 = QuestionData(
           6,
           "Leo's best qualities are _______.",

           "Proud and loving",
           "Generous and thoughtful",
           "Happy and nice",
           "Smart and witty",
           2
       )

       var question7 = QuestionData(
           7,
           " Which color is said to best suit Leo?",

           "blue",
           "purple",
           "gold",
           "lavender",
           3
       )

       var question8 = QuestionData(
           8,
           "What's Leos ruler?",

           "Sun",
           "Mercury",
           "Mars",
           "Jupyter",
           1
       )

       var question9 = QuestionData(
           9,
           "Which season do Leos like most?",

           "Spring",
           "Summer",
           "Fall",
           "Winter",
           2
       )

       var question10 = QuestionData(
           10,
           "Which role do Leos play in your friend group?",

           "mom friend",
           "baby",
           "crazy sister",
           "dramatic one",
           4
       )


       que.add(question1)
       que.add(question2)
       que.add(question3)
       que.add(question4)
       que.add(question5)
       que.add(question6)
       que.add(question7)
       que.add(question8)
       que.add(question9)
       que.add(question10)
       return que

   }
}