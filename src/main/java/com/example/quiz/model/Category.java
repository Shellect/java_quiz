package com.example.quiz.model;

public enum Category {
    HISTORY("История"),
    SPORT("Спорт"),
    CULTURE("Культура"),
    SPACE("Космос");

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}
