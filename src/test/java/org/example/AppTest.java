package org.example;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.List;

public class AppTest  {

    TriviaGame triviaGame;
    List<Question> questions;
    QuestionReader questionReader;
    @Before
    public void initGame() throws IOException {
        CreateQuestions createQuestions=new CreateQuestions(); //2 questions
        questionReader=new QuestionReader();
        questions=questionReader.readQuestions("src/resources/questions.txt");
    }

    @Test
    public void readQuestionsFromFile() throws IOException {
        Assert.assertEquals(6,questions.size());
    }

    @Test
    public void getQuestionTest(){
        String question=questions.get(0).getQuestion();
        Assert.assertEquals("What is the capital of France?",question);
    }
    @Test
    public void getOptionsTest(){
        String[] questionOptions=questions.get(0).getOptions();
        Assert.assertEquals(4,questionOptions.length);
    }

    @Test
    public void getCorrectOptionTest(){
        String getCorrectOption=questions.get(0).getCorrectOption();
        Assert.assertEquals("0",getCorrectOption);
    }


    @Test
    public void getCorrectOptionStrTest(){
        String getCorrectOptionStr=questions.get(0).getCorrectOptionStr();
        Assert.assertEquals("Paris",getCorrectOptionStr);
    }


    @Test
    public void correctAnswerTest () {
        Question question = new Question("What is the capital of France?", new String[]{"Paris","London","Rome","Madrid"},"1");
        Assert.assertTrue(question.isCorrect("1"));
    }

    @Test
    public void falseAnswerTest() {
        Question question = new Question("What is the capital of Australia?", new String[]{"Sydney","Canberra","Perth","Melbourne"},"1");
        Assert.assertFalse(question.isCorrect("2"));
    }

    @Test
    public void isGameObjectcreted() throws IOException {
        triviaGame= new TriviaGame(questions);
        Assert.assertNotNull(triviaGame);
    }


}
