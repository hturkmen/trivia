package org.example;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

class TriviaGame {

    int questionCount=0;
    private List<Question> questions;
    private int score;

    public TriviaGame(List<Question> questions) {
        this.questions = questions;
        this.score = 0;
    }

    public void printQuestions(Question question){
        System.out.println(question.getQuestion());
        for (int i = 0; i < question.getOptions().length; i++) {
            System.out.println(i + ": " + question.getOptions()[i]);
        }
    }

    public String enterQuestion(){
        System.out.println("Enter the number of the correct answer: ");
        //int answer = System.in.read();
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        return answer;
    }

    public void play() throws IOException {
        for (Question question : questions) {

            printQuestions(question);
            String answer= enterQuestion();
            if (answer.equals(question.getCorrectOption())) {
                score++;
                System.out.println("Correct!");
            }else {
                System.out.println("Wrong !!!,  it is :" + question.getCorrectOptionStr());
            }
        }
        System.out.println("Game over! Your score is: " + score);
    }
}
