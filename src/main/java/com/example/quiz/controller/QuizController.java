package com.example.quiz.controller;

import com.example.quiz.model.*;
import com.example.quiz.service.QuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.ui.Model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller
@RequestMapping("/")
public class QuizController {

    private final QuizService quizService;

    @Autowired
    public QuizController(QuizService quizService) {
        this.quizService = quizService;
    }

    @GetMapping
    public String showCategories(Model model) {
        model.addAttribute("categories", Category.values());
        return "categories";
    }

    @PostMapping("/start")
    public String startQuiz(@RequestParam Category category, Model model) {
        List<Question> questions = quizService.getQuestionsByCategory(category);
        model.addAttribute("questions", questions);
        model.addAttribute("category", category);
        return "quiz";
    }

    @PostMapping("/result")
    public String finishQuiz(@ModelAttribute("questionForm") QuestionForm form, Model model) {
        System.out.println(form.getUserAnswers());
        Map<Long, String> userAnswers = form.getUserAnswers()
                .stream()
                .collect(Collectors.toMap(
                        UserAnswer::getQuestionId,
                        UserAnswer::getAnswer
                ));
        List<Answer> answers = quizService.checkResult(userAnswers);
        model.addAttribute("answers", answers);
        return "result";
    }
}
