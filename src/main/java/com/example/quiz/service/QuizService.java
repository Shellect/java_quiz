package com.example.quiz.service;

import com.example.quiz.model.Answer;
import com.example.quiz.model.Category;
import com.example.quiz.model.Question;
import com.example.quiz.model.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class QuizService {
    private final QuestionRepository questionRepository;

    @Autowired
    public QuizService(QuestionRepository repository) {
        this.questionRepository = repository;
    }

    public List<Question> getQuestionsByCategory(Category category) {
        return questionRepository.findByCategory(category);
    }

    public Question getQuestionById(Long id) {
        return questionRepository.findById(id);
    }

    public List<Answer> checkResult (Map<Long, String> userAnswers) {
        List<Answer> answers = new ArrayList<>();
        System.out.println(userAnswers);
        for (Map.Entry<Long, String> userAnswer : userAnswers.entrySet()) {
            Long questionId = userAnswer.getKey();
            String value = userAnswer.getValue();

            Question question = getQuestionById(questionId);
            String questionText = question.getText();
            answers.add(new Answer(questionText, value, Objects.equals(question.getCorrectAnswer(), value)));
        }
        return answers;
    }
}
