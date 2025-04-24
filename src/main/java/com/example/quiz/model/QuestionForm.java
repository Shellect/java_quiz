package com.example.quiz.model;

import java.util.HashMap;
import java.util.List;

public class QuestionForm {
    private List<Long> questionId;
    private List<String> answer;

    public QuestionForm() {
    }

    public QuestionForm(List<Long> questionId, List<String> answer) {
        this.questionId = questionId;
        this.answer = answer;
    }

    public void setQuestionId(List<Long> questionId) {
        this.questionId = questionId;
    }

    public void setAnswer(List<String> answer) {
        this.answer = answer;
    }

    public HashMap<Long, String> getUserAnswers() {
        HashMap<Long, String> userAnswers = new HashMap<>();
        for (int i = 0; i < questionId.size(); i++) {
            userAnswers.put(questionId.get(i), answer.get(i));
        }
        return userAnswers;
    }
}