package com.tictactoe;

public class ResultCheck {


    private boolean rowCheck(Board board, char symbol) {
        for (int row = 0; row < board.getBoardLength(); row++) {
            int symbolCount = 0;
            for (int column = 0; column < board.getBoardLength(); column++) {
                if (board.getSymbol(row, column) == symbol) {
                    symbolCount++;
                    if (symbolCount == 5)
                    break;
                    } else {
                    symbolCount = 0;
                    }
            }
            if (symbolCount == 3 && symbolCount == board.getBoardLength() || symbolCount == 5)
            return true;
        }
        return false;
    }

    private boolean columnCheck(Board board, char symbol) {
        for (int column = 0; column < board.getBoardLength(); column++) {
            int symbolCount = 0;
            for (int row = 0; row < board.getBoardLength(); row++) {
                if (board.getSymbol(row, column) == symbol) {
                    symbolCount++;
                    if (symbolCount == 3 && symbolCount == board.getBoardLength() || symbolCount == 5)
                        break;
                     } else {
                        symbolCount = 0;
                     }
                }
            if (symbolCount == 3 && symbolCount == board.getBoardLength() || symbolCount == 5) {
                return true;
            }
        }
        return false;
    }

    private boolean crossCheck1(Board board, char symbol) {
        int symbolCount = 0;
        for (int column = 0; column < board.getBoardLength(); column++) {
            for (int row = 0; row < board.getBoardLength(); row++) {
                if (board.getSymbol(row, column) == symbol) {
                    symbolCount++;
                    if (board.getBoardLength() ==3 && column <=1 || board.getBoardLength() ==10 && column <=8)
                    column++;
                    if (symbolCount == 5)
                        break;
                } else {
                    symbolCount = 0;
                }
            }
            if (symbolCount == 3 && symbolCount == board.getBoardLength() || symbolCount == 5) {
                return true;
            }
        }
        return false;
    }

    private boolean crossCheck2(Board board, char symbol) {
        int symbolCount = 0;
        for (int row = 0; row < board.getBoardLength(); row++) {
            for (int column = board.getBoardLength()-1 ; column >=0; column--) {
                if (board.getSymbol(row, column) == symbol) {
                    symbolCount++;
                    if (board.getBoardLength() ==3 && row <=1 || board.getBoardLength() ==10 && row <=8)
                        row++;
                    if (symbolCount == 5)
                        break;
                } else {
                    symbolCount = 0;
                }
            }
            if (symbolCount == 3 && symbolCount == board.getBoardLength() || symbolCount == 5) {
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

    private boolean checkDraw(int totalMoves, Board board) {
        if (totalMoves == 9 && board.getBoardLength() == 3 || totalMoves == 100 && board.getBoardLength() == 10) {
            return true;
        }
        return false;
    }

    public String checkWinOrDraw(ResultCheck resultCheck, Board board, char x, int totalMoves) {
        if(resultCheck.checkAll(board,x)) {
            return Result.wonUser;
        } else if(resultCheck.checkDraw(totalMoves, board)) {
            return Result.draw;
        } return null;
    }

}


