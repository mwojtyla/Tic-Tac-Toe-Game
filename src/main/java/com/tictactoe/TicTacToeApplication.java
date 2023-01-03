package com.tictactoe;

public class TicTacToeApplication {

    public static void main(String[] args) {

        UserInput userInput = new UserInput();
        UserCommunication startText = new UserCommunication(userInput);
        UserCommunication userCommunication = new UserCommunication(userInput);
        startText.startOfTheGame();

        Board board = new Board();
        board.userChoseBoard(userCommunication);

        board.drawBoard();

        GameEngine gameEngine = new GameEngine();
        gameEngine.gameEngine(board);

    }
}
