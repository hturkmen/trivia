package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

class QuestionReader {
    public List<Question> readQuestions(String filePath) throws IOException {
        List<Question> questions = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(";");
            String question = parts[0];
            String[] options = parts[1].split(",");
            String correctOption =  parts[2];
            questions.add(new Question(question, options, correctOption));
        }
        reader.close();
        return questions;
    }
}