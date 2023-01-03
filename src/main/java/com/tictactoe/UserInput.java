package com.tictactoe;
import java.util.Scanner;

public class UserInput {
    Scanner scanner = new Scanner(System.in);
    public int getNextInt(){
        return this.scanner.nextInt();
    }
    public String getNext(){
        return this.scanner.next();
    }
}
