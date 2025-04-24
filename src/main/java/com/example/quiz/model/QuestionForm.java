package com.example.quiz.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class QuestionForm {
    private List<UserAnswer> userAnswers = new ArrayList<>();

    public void setUserAnswers(List<UserAnswer> userAnswers) {
        this.userAnswers = userAnswers;
    }

    public List<UserAnswer> getUserAnswers() {
        return userAnswers;
    }
}