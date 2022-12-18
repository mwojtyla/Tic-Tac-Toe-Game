package com.tictactoe;

public class TicTacToeApplication {

    public static void main(String[] args) {

        UserCommunication startText = new UserCommunication();
        startText.startOfTheGame();

        Board board = new Board();
        board.drawBoard();

        GameEngine gameEngine = new GameEngine();
        gameEngine.gameEngine(board);


    }
}
