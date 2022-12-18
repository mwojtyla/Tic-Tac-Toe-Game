package com.tictactoe;

import java.util.Random;

public class GameEngine {
    public void gameEngine (Board board) {
        char x = 'X';
        char o = 'O';

        int round = 1;
        int totalMoves = 0;
        boolean win = true;
        int row;
        int column;


        UserCommunication userCommunication = new UserCommunication();
        ResultCheck resultCheck = new ResultCheck();

        while (win) {
            // wyświetlanie numeru rundy
            userCommunication.roundNumberInfo(round);

            // wyświetlenie informacji o ruchu użytkownika
            userCommunication.userMoveInfo();

            // sprawdzanie wartości podanych przez użytkownika
            board.moveCheck(userCommunication, x);

            // rysowanie planszy w prawidłowymi wartościami podanymi przez użytkownika
            board.drawBoard();

            // licznik prawidłowych ruchów
            totalMoves++;

            // sprawdzenie wygranej symbolu X lub remisu
            String resultForX = resultCheck.checkWinOrDraw(resultCheck, board, x, totalMoves);
            if (resultForX!=null){
                System.out.println(resultForX);
                break;
            }

            // wyświetlenie informacji o ruchu komputera
            userCommunication.computerMoveInfo();

            // losowanie współrzędnych dla ruchu komputera
            boolean fieldFree = false;
            Random random = new Random();
            while (!fieldFree) {
                row = random.nextInt(3);
                column = random.nextInt(3);
                if (board.getBoard()[row][column] == ' ') {
                    board.getBoard()[row][column] = o;
                    board.drawBoard();
                    fieldFree = true;
                }
            }

            // sprawdzenie wygranej computera (symbolu O)
            if (resultCheck.checkAll(board,o)) {
                String resultForO = Result.wonComputer;
                System.out.println(resultForO);
                win = false;
                break;}

            // licznik prawidłowych ruchów
            totalMoves++;

            // licznik rund
            round++;
        }


    }
}

