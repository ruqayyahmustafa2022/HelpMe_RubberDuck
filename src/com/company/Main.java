package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	/* (1) Ask Rubber Duck a Question
	     (a) if too show (<200 characters), Output "Ask a better question"
	     (b) if question is too long (>500 chars), output "Simplify your question!"
	     (c) if question is just right (between 200 to 500 chars), "<make up something>"
	 */

        //declare the question variable
        //String statement = "What is the matter with you?";

        //User Question Input
        Scanner myQuestion = new Scanner(System.in);
        System.out.println("Enter your question for Mr. Rubber Duck");
        String statement = myQuestion.nextLine();


        int statementCounter = statement.length();

        System.out.println("Total chars = " + statementCounter);

        if(statementCounter < 200)
            System.out.println("Ask a better question!");
        else if(statementCounter > 500)
            System.out.println("Simplify your question!");
        else if(statementCounter > 200 && statementCounter < 500)
            System.out.println("Please be more precise.");



    }
}
