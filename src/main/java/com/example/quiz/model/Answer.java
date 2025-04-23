package com.example.quiz.model;

public class Answer {
    public String questionText;
    public String userAnswer;
    public boolean correct;

    public Answer(String questionText, String userAnswer, boolean correct) {
        this.questionText = questionText;
        this.userAnswer = userAnswer;
        this.correct = correct;
    }
}
