package com.mastercoding.thequizapp.model;

import java.util.ArrayList;

public class QuestionList extends ArrayList<Question> {

    public static QuestionList getSampleQuestions() {
        QuestionList list = new QuestionList();

        Question q1 = new Question();
        q1.setQuestion("What is the capital of Japan?");
        q1.setOption1("Tokyo");
        q1.setOption2("Beijing");
        q1.setOption3("Seoul");
        q1.setOption4("Bangkok");
        q1.setCorrectOption("Tokyo");
        list.add(q1);

        Question q2 = new Question();
        q2.setQuestion("Which element has the chemical symbol 'O'?");
        q2.setOption1("Gold");
        q2.setOption2("Oxygen");
        q2.setOption3("Silver");
        q2.setOption4("Iron");
        q2.setCorrectOption("Oxygen");
        list.add(q2);

        Question q3 = new Question();
        q3.setQuestion("Who painted the Mona Lisa?");
        q3.setOption1("Vincent van Gogh");
        q3.setOption2("Pablo Picasso");
        q3.setOption3("Leonardo da Vinci");
        q3.setOption4("Claude Monet");
        q3.setCorrectOption("Leonardo da Vinci");
        list.add(q3);

        Question q4 = new Question();
        q4.setQuestion("What is the largest planet in our Solar System?");
        q4.setOption1("Earth");
        q4.setOption2("Jupiter");
        q4.setOption3("Saturn");
        q4.setOption4("Mars");
        q4.setCorrectOption("Jupiter");
        list.add(q4);

        Question q5 = new Question();
        q5.setQuestion("Which language is primarily spoken in Brazil?");
        q5.setOption1("Spanish");
        q5.setOption2("Portuguese");
        q5.setOption3("French");
        q5.setOption4("English");
        q5.setCorrectOption("Portuguese");
        list.add(q5);

        return list;
    }
}
