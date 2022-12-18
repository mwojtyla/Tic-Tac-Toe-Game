package com.tictactoe;

public class ResultCheck {

    private boolean rowCheck(Board board, char symbol) {
        for (int row = 0; row < board.getBoardLength(); row++) {
            int symbolCount = 0;
            for (int column = 0; column < board.getBoardLength(); column++) {
                if (board.getSymbol(row, column)== symbol) {
                    symbolCount++;
                }
            }
            if (symbolCount == 3) {
                return true;
            }
        }
        return false;

    }

    private boolean columnCheck(Board board, char symbol) {
        for (int column = 0; column < board.getBoardLength(); column++) {
            int symbolCount = 0;
            for (int row = 0; row < board.getBoardLength(); row++) {
                if (board.getSymbol(row, column) == symbol) {
                    symbolCount++;
                }
            }
            if (symbolCount == 3) {
                return true;
            }
        }
        return false;
    }

    private boolean crossCheck1(Board board, char symbol) {
        int symbolCount = 0;
        for (int row = 0; row < board.getBoardLength(); row++) {
            if (board.getSymbol(row, row) == symbol) {
                symbolCount++;
            }
            if (symbolCount == 3) {
                return true;
            }
        }
        return false;
    }

    private boolean crossCheck2(Board board, char symbol) {
        int symbolCount = 0;
        for (int row = 0; row < board.getBoardLength(); row++) {
            if (board.getSymbol(row, board.getBoardLength() - row - 1)==symbol) {
                symbolCount++;
            }
            if (symbolCount == 3) {
                return true;
            }
        }
        return false;
    }

    public boolean checkAll(Board board, char symbol) {
        if (rowCheck(board, symbol) || columnCheck(board, symbol) ||
                crossCheck1(board, symbol) || crossCheck2(board, symbol)) {

            return true;
        }
        return false;
    }

    private boolean checkDraw(int totalMoves) {
        if (totalMoves == 9) {
            return true;
        }
        return false;
    }

    public String checkWinOrDraw(ResultCheck resultCheck, Board board, char x, int totalMoves) {
      if(resultCheck.checkAll(board,x)) {
        return Result.wonUser;
    } else if(resultCheck.checkDraw(totalMoves)) {
        return Result.draw;
    } return null;
    }

}

