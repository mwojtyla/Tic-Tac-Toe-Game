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
        int n=5;

        UserInput userInput = new UserInput();

        UserCommunication userCommunication = new UserCommunication(userInput);
        ResultCheck resultCheck = new ResultCheck();



        while (win) {
            // display round number
            userCommunication.roundNumberInfo(round);

            // display information about user move
            userCommunication.userMoveInfo();

            // checking the values entered by user
            board.moveCheck(userCommunication, x, board);

            // draw board with correct values entered by user
            board.drawBoard();

            // correct moves counter
            totalMoves++;

            // checking the symbol X win or draw
            String resultForX = resultCheck.checkWinOrDraw(resultCheck, board, x, totalMoves);
            if (resultForX!=null){
                System.out.println(resultForX);
                break;
            }

            // display information about computer move
            userCommunication.computerMoveInfo();

            // randomization the numbers for computer move
            boolean fieldFree = false;
            Random random = new Random();
            while (!fieldFree) {
                row = random.nextInt(board.getBoardLength());
                column = random.nextInt(board.getBoardLength());
                if (board.getBoard()[row][column] == ' ') {
                    board.getBoard()[row][column] = o;
                    board.drawBoard();
                    fieldFree = true;
                }
            }

            // checking the computer (symbol O) win
            if (resultCheck.checkAll(board,o)) {
                String resultForO = Result.wonComputer;
                System.out.println(resultForO);
                win = false;
                break;}

            // correct moves counter
            totalMoves++;

            // round counter
            round++;
        }
    }
}


