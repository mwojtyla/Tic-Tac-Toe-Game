package com.tictactoe;

public class Board {
    private char board[][];
    private char board1[][] = {{' ', ' ', ' '},
                               {' ', ' ', ' '},
                               {' ', ' ', ' '}};
    private char board2[][] = {{' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                               {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                               {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                               {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                               {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                               {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                               {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                               {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                               {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                               {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}};

   public void userChoseBoard(UserCommunication userCommunication){
       int size = userCommunication.userChoseBoardSize();
           if (size == 1){
               board = board1;
           } if (size == 2) {
               board = board2;
           }
   }
    public char[][] getBoard() {
        return board;
    }

    public int getBoardLength(){
        return this.board.length;
    }

    public char getSymbol(int row, int column){
        return this.board[row][column];
    }

    public void setSymbol(int row, int column, char symbol) {
        this.board[row][column] = symbol;
    }
    public void drawBoard() {
        System.out.print("  ");
        for (int i = 0; i < board.length; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int row = 0; row < board.length; row++) {
            System.out.print(row + "|");
            for (int column = 0; column < board[row].length; column++) {
                System.out.print(board[row][column] + "|");
            }
            System.out.println();
        }
    }

    // checking if the user's move is correct - whether the field is not already occupied
    public void moveCheck(UserCommunication userCommunication, char symbol, Board boardChosed) {

        int row = userCommunication.userChoseRow(boardChosed);
        int column = userCommunication.userChoseColumn(boardChosed);
        while (board[row][column] != ' ') {
            userCommunication.fieldOccupiedInfo();
            row = userCommunication.userChoseRow(boardChosed);
            column = userCommunication.userChoseColumn(boardChosed);
        }
        board[row][column] = symbol;
    }
}

