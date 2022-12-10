package org.example;

class Question {
    private String question;
    private String[] options;
    private String correctOption;

    public Question(String question, String[] options, String correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public String getCorrectOption() {
        return correctOption;
    }

    public String getCorrectOptionStr() {
        return options[Integer.valueOf(correctOption)];
    }

    public boolean isCorrect(String answer) {
        return correctOption.equals(answer);
    }
}
