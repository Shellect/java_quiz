package com.example.quiz.model;

import java.util.List;

public class Question {
    private Long id;
    private String text;
    private Category category;
    private List<String> options;
    private String correctAnswer;

    public Question () {}

    public Question(
            Long id,
            String text,
            Category category,
            List<String> options,
            String correctAnswer
            ) {

        this.id = id;
        this.text = text;
        this.category = category;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<String> getOptions() {
        return options;
    }

    public void setOptions(List<String> options) {
        this.options = options;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
