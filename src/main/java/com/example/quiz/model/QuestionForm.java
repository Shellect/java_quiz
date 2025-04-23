package com.example.quiz.model;

import java.util.HashMap;
import java.util.Map;

public class QuestionForm {
    private Map<Long, String> question = new HashMap<>();

    // Геттеры и сеттеры
    public Map<Long, String> getUserAnswers() {
        return question;
    }
}