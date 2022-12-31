package com.tictactoe;

import java.util.InputMismatchException;

/*public class UserCommunication {
    UserInput userInput;

    public UserCommunication(UserInput userInput) {
        this.userInput = userInput;
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
                     if (row >-1 && row < 3) {
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
                if (column >-1 && column < 3) {
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

}*/


/////////// WERSJA Z OPCJĄ DO 5 WYGRANYCH!

public class UserCommunication {
    UserInput userInput;

    public UserCommunication(UserInput userInput) {
        this.userInput = userInput;
    }
       /* public int userChoseBoardSize() {
            System.out.println("Choose the size of board: for 3x3 enter 1 for 10x10 enter 2");
            return userInput.getNextInt();
        }*/
    public int userChoseBoardSize() {
        while (true) {
            System.out.println("Choose the size of board: for 3x3 enter 1 for 10x10 enter 2. ");
            try{int size = userInput.getNextInt();
                if (size == 1 || size == 2) {
                    return size;
                }
                System.out.println("Wrong number. Choose again (1 or 2):");
                } catch (InputMismatchException e) {
                    System.out.println("Wrong value. Choose again (1 or 2):");
                    userInput.getNext();
                }
        }
    }



        /*int amountOfSymbolWin;
        public int amountOfSymbolWin(){
            if (userChoseBoardSize() ==1){
                return amountOfSymbolWin = 3;
            } return amountOfSymbolWin = 5;
        }*/
    public void startOfTheGame(){
        System.out.println("Welcome in the game TIC-TAC-TOE!" + "\n"
                + "Your symbol: X. "
                + "Computer symbol: O"
                + "\n");
    }
    public int userChoseRow(Board board) {
        while (true) {
            System.out.println("Choose the number of row: ");
            try {int row = userInput.getNextInt();
                if (row >-1 && row < board.getBoardLength()) {
                    return row;
                }
                System.out.println("Wrong value.");
            } catch (InputMismatchException e) {
                System.out.println("Wrong value. Please choose number 0, 1 or 2.");
                userInput.getNext();
            }
        }
    }
    public int userChoseColumn(Board board) {
        while (true) {
            System.out.println("Choose the number of column: ");
            try {int column = userInput.getNextInt();
                if (column >-1 && column < board.getBoardLength()) {
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

