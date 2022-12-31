package com.tictactoe;

/*public class Board {
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

}*/

//////////// WERSJA Z OPCJĄ DO 5 WYGRANYCH!

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

   /* public void userChoseBoard(UserCommunication userCommunication){
        if (userCommunication.userChoseBoardSize() == 1){
            board = board1;
        } else {board = board2;};
    }*/

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


/* public int getBoardLength(UserCommunication userCommunication){
        if(userCommunication.userChoseBoardSize() == 1){
            return 3;
        } else {return 10;}
    }*/


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
    public void moveCheck(UserCommunication userCommunication, char symbol, Board board1) {

        int row = userCommunication.userChoseRow(board1);
        int column = userCommunication.userChoseColumn(board1);
        while (board[row][column] != ' ') {
            userCommunication.fieldOccupiedInfo();
            row = userCommunication.userChoseRow(board1);
            column = userCommunication.userChoseColumn(board1);
        }
        board[row][column] = symbol;
    }

}

