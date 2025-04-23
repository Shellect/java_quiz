package com.example.quiz.model;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class QuestionRepository {
    private final List<Question> questions = new ArrayList<>();

    public QuestionRepository() {
        init();
    }

    private void init() {
        questions.add(new Question(
                1L, "В каком году началась Вторая мировая война?",
                Category.HISTORY, List.of("1939", "1941", "1945", "1914"),
                "1939")
        );

        questions.add(new Question(
                2L, "Какая страна выиграла Чемпионат мира по футболу в 2018?",
                Category.SPORT, List.of("Бразилия", "Германия", "Франция", "Аргентина"),
                "Франция")
        );

        questions.add(new Question(
                3L, "Как назывался корабль, на котором 12 апреля 1961 года Юрий Гагарин совершил первый полёт в космос?",
                Category.SPACE, null,
                "Восток"
        ));

        questions.add(new Question(
                4L, "Как называется роспись в бело-голубых цветах?",
                Category.CULTURE, null,
                "Гжель")
        );
    }

    public List<Question> findByCategory(Category category) {
        return questions.stream()
                .filter(q -> q.getCategory() == category)
                .limit(10)
                .collect(Collectors.toList());
    }

    public Question findById(Long id) {
        return questions.stream()
                .filter(q -> q.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}
