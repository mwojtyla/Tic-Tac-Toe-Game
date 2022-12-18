package com.tictactoe;

import java.util.InputMismatchException;

public class UserCommunication {
    UserInput userInput = new UserInput();
    private int row;
    private int column;

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public void setColumn(int column) {
        this.column = column;
    }
    public void startOfTheGame(){
        System.out.println("Welcome in the game TIC-TAC-TOE!" + "\n"
                + "Your symbol: X. "
                + "Computer symbol: O"
                + "\n");
    }
     public int userChoseRow() {
             while (true) {
                 System.out.println("Choose the number of row: ");
                 try {int row = userInput.getNextInt();
                     if (row >-1 && row <3) {
                         return row;
                     }
                     System.out.println("Wrong value.");
                 } catch (InputMismatchException e) {
                     System.out.println("Wrong value. Please choose number 0, 1 or 2.");
                     userInput.getNext();
                 }
             }
         }
    public int userChoseColumn() {
        while (true) {
            System.out.println("Choose the number of column: ");
            try {int column = userInput.getNextInt();
                if (column >-1 && column <3) {
                    return column;
                }
                System.out.println("Wrong value.");
            } catch (RuntimeException e) {
                System.out.println("Wrong value. Please choose number 0, 1 or 2.");
                userInput.getNext();
            }
        }
    }

    public void roundNumberInfo(int number){
          System.out.println("ROUND: " + number);
    }
    public void userMoveInfo(){
        System.out.println("Your move.");
    }
    public void computerMoveInfo(){
        System.out.println("Computer move.");
    }
    public void fieldOccupiedInfo() {
        System.out.println("The field is occupied! Choose again.");
    }
}
