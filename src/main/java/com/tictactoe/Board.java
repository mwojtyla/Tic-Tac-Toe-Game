package com.tictactoe;

public class Board {
    private char board[][] = {{' ', ' ', ' '},
                              {' ', ' ', ' '},
                              {' ', ' ', ' '}};
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


    //sprawdzanie czy ruch użytkownika jest poprawny - czy pole nie jest już zajęte
    public void moveCheck(UserCommunication userCommunication, char symbol) {
        int row = userCommunication.userChoseRow();
        int column = userCommunication.userChoseColumn();
            while (board[row][column] != ' ') {
                userCommunication.fieldOccupiedInfo();
                row = userCommunication.userChoseRow();
                column = userCommunication.userChoseColumn();
            }
            board[row][column] = symbol;
    }

}
