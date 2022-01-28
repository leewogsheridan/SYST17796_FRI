/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package syst17796_w01;

import java.util.Scanner;
/**
 *
 * @author 727
 */
public class SYST17796_W01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /* char[] myWord = new char[7];
        myWord[0] = 's';
        myWord[1] = 't';
        myWord[2] = 'u';
        myWord[3] = 'd';
        myWord[4] = 'e';
        myWord[5] = 'n';
        myWord[6] = 't';
        
        for (char c : myWord)
            System.out.print(c);
        System.out.println();
        for (int i = 0; i < myWord.length; i++)
            System.out.print(myWord[i]);
        System.out.println("\nReversing the word...");
        for (int i = myWord.length - 1; i > -1; i--)
            System.out.print(myWord[i]);
        System.out.println();
        */
        
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a word: ");
        String word = in.next();
        
        char[] myLetters = new char[word.length()];
        
        for (int i = 0; i < myLetters.length; i++) {
            myLetters[i] = word.charAt(i);
            System.out.println(myLetters[i]);
        }
        
        Student s = new Student("34", "VInz");
        System.out.println("Vinz keeps adding random semicolons to his code lmao");
        System.out.println(s);
    }
    
}
