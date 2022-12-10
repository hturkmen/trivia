package org.example;

import java.io.IOException;
import java.util.List;


public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Welcome to the Trivia Game!" );
        CreateQuestions createQuestions=new CreateQuestions();

        //read all questions into a list
        QuestionReader questionReader=new QuestionReader();
        List<Question> questions=questionReader.readQuestions("src/resources/questions.txt");

        // initialize and play the game
        TriviaGame triviaGame= new TriviaGame(questions);
        triviaGame.play();
    }
}
