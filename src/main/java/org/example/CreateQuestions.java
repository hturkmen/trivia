package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CreateQuestions {
    File testFile = new File("src/resources/questions.txt");
    PrintWriter file = new PrintWriter(testFile);
    public CreateQuestions() throws FileNotFoundException {
        file.println("What is the capital of France?;Paris,London,Rome,Madrid;0");
        file.println("What is the capital of Italy?;Paris,Rome,Madrid,Athens;1");
        file.println("What is the capital of Australia?;Sydney,Canberra,Perth,Melbourne;1");
        file.println("What is the capital of India?;Mumbai,Bangalore,Jaipur,New Delhi;3");
        file.println("What is the capital of Niger?;Zinder,Gaya,Niamey,Abalak;2");
        file.println("What is the capital of Turkey?;Istanbul,Antalya,Ankara,Adana;2");
        file.close();
    }
}

