package com.tictactoe;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TicTacToeApplicationTestSuite {

    private static int testCounter = 0;

    @BeforeEach
    public void beforeEach() {
        testCounter++;
        System.out.println("Test " + testCounter + " : begin");
    }

    @AfterEach
    public void afterEach() {
        System.out.println("Test " + testCounter + " : end");
    }

    @BeforeAll
    public static void beforeAll() {
        System.out.println("Start of tests.");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("End of tests.");
    }

    @Nested
    @DisplayName("Tests win for symbol X")
    class TestsForX {

        @DisplayName("Check rows for X: when use rowCheck method for X, then return true")
        @Test
        void testRowCheckForX() {
            // Given
            UserInput userInputMock = mock(UserInput.class);
            UserCommunication userCommunication = new UserCommunication(userInputMock);

            Board board1For3x3 = new Board();
            Board board2For3x3 = new Board();
            Board board3For3x3 = new Board();
            when(userInputMock.getNextInt()).thenReturn(1);
            board1For3x3.userChoseBoard(userCommunication);
            board2For3x3.userChoseBoard(userCommunication);
            board3For3x3.userChoseBoard(userCommunication);

            Board board1For10x10 = new Board();
            Board board2For10x10 = new Board();
            Board board3For10x10 = new Board();
            when(userInputMock.getNextInt()).thenReturn(2);
            board1For10x10.userChoseBoard(userCommunication);
            board2For10x10.userChoseBoard(userCommunication);
            board3For10x10.userChoseBoard(userCommunication);

            ResultCheck resultCheck = new ResultCheck();

            board1For3x3.setSymbol(0, 0, 'X');
            board1For3x3.setSymbol(0, 1, 'X');
            board1For3x3.setSymbol(0, 2, 'X');

            board2For3x3.setSymbol(1, 0, 'X');
            board2For3x3.setSymbol(1, 1, 'X');
            board2For3x3.setSymbol(1, 2, 'X');

            board3For3x3.setSymbol(2, 0, 'X');
            board3For3x3.setSymbol(2, 1, 'X');
            board3For3x3.setSymbol(2, 2, 'X');

            board1For10x10.setSymbol(2, 2, 'X');
            board1For10x10.setSymbol(2, 3, 'X');
            board1For10x10.setSymbol(2, 4, 'X');
            board1For10x10.setSymbol(2, 5, 'X');
            board1For10x10.setSymbol(2, 6, 'X');

            board2For10x10.setSymbol(0, 1, 'X');
            board2For10x10.setSymbol(0, 2, 'X');
            board2For10x10.setSymbol(0, 3, 'X');
            board2For10x10.setSymbol(0, 4, 'X');
            board2For10x10.setSymbol(0, 5, 'X');

            board3For10x10.setSymbol(7, 5, 'X');
            board3For10x10.setSymbol(7, 6, 'X');
            board3For10x10.setSymbol(7, 7, 'X');
            board3For10x10.setSymbol(7, 8, 'X');
            board3For10x10.setSymbol(7, 9, 'X');

            // When
            boolean receivedResult1 = resultCheck.checkAll(board1For3x3, 'X');
            boolean receivedResult2 = resultCheck.checkAll(board2For3x3, 'X');
            boolean receivedResult3 = resultCheck.checkAll(board3For3x3, 'X');
            boolean receivedResult4 = resultCheck.checkAll(board1For10x10, 'X');
            boolean receivedResult5 = resultCheck.checkAll(board2For10x10, 'X');
            boolean receivedResult6 = resultCheck.checkAll(board3For10x10, 'X');

            // Then
            Assertions.assertTrue(receivedResult1);
            Assertions.assertTrue(receivedResult2);
            Assertions.assertTrue(receivedResult3);
            Assertions.assertTrue(receivedResult4);
            Assertions.assertTrue(receivedResult5);
            Assertions.assertTrue(receivedResult6);
        }


        @DisplayName("Check columns for X: when use columnCheck method for X, then return true")
        @Test
        void testColumnCheckForX() {
            // Given
            UserInput userInputMock = mock(UserInput.class);
            UserCommunication userCommunication = new UserCommunication(userInputMock);

            Board board1For3x3 = new Board();
            Board board2For3x3 = new Board();
            Board board3For3x3 = new Board();
            when(userInputMock.getNextInt()).thenReturn(1);
            board1For3x3.userChoseBoard(userCommunication);
            board2For3x3.userChoseBoard(userCommunication);
            board3For3x3.userChoseBoard(userCommunication);

            Board board1For10x10 = new Board();
            Board board2For10x10 = new Board();
            Board board3For10x10 = new Board();
            when(userInputMock.getNextInt()).thenReturn(2);
            board1For10x10.userChoseBoard(userCommunication);
            board2For10x10.userChoseBoard(userCommunication);
            board3For10x10.userChoseBoard(userCommunication);

            ResultCheck resultCheck = new ResultCheck();

            board1For3x3.setSymbol(0, 0, 'X');
            board1For3x3.setSymbol(1, 0, 'X');
            board1For3x3.setSymbol(2, 0, 'X');

            board2For3x3.setSymbol(0, 1, 'X');
            board2For3x3.setSymbol(1, 1, 'X');
            board2For3x3.setSymbol(2, 1, 'X');

            board3For3x3.setSymbol(0, 2, 'X');
            board3For3x3.setSymbol(1, 2, 'X');
            board3For3x3.setSymbol(2, 2, 'X');

            board1For10x10.setSymbol(3, 5, 'X');
            board1For10x10.setSymbol(4, 5, 'X');
            board1For10x10.setSymbol(5, 5, 'X');
            board1For10x10.setSymbol(6, 5, 'X');
            board1For10x10.setSymbol(7, 5, 'X');

            board2For10x10.setSymbol(0, 0, 'X');
            board2For10x10.setSymbol(1, 0, 'X');
            board2For10x10.setSymbol(2, 0, 'X');
            board2For10x10.setSymbol(3, 0, 'X');
            board2For10x10.setSymbol(4, 0, 'X');

            board3For10x10.setSymbol(5, 9, 'X');
            board3For10x10.setSymbol(6, 9, 'X');
            board3For10x10.setSymbol(7, 9, 'X');
            board3For10x10.setSymbol(8, 9, 'X');
            board3For10x10.setSymbol(9, 9, 'X');

            // When
            boolean receivedResult1 = resultCheck.checkAll(board1For3x3, 'X');
            boolean receivedResult2 = resultCheck.checkAll(board2For3x3, 'X');
            boolean receivedResult3 = resultCheck.checkAll(board3For3x3, 'X');
            boolean receivedResult4 = resultCheck.checkAll(board1For10x10, 'X');
            boolean receivedResult5 = resultCheck.checkAll(board2For10x10, 'X');
            boolean receivedResult6 = resultCheck.checkAll(board3For10x10, 'X');

            // Then
            Assertions.assertTrue(receivedResult1);
            Assertions.assertTrue(receivedResult2);
            Assertions.assertTrue(receivedResult3);
            Assertions.assertTrue(receivedResult4);
            Assertions.assertTrue(receivedResult5);
            Assertions.assertTrue(receivedResult6);
        }

        @DisplayName("Check cross1 for X: when use cross1Check method for X, then return true")
        @Test
        void testCross1CheckForX() {
            // Given
            UserInput userInputMock = mock(UserInput.class);
            UserCommunication userCommunication = new UserCommunication(userInputMock);

            Board boardFor3x3 = new Board();
            when(userInputMock.getNextInt()).thenReturn(1);
            boardFor3x3.userChoseBoard(userCommunication);

            Board board1For10x10 = new Board();
            Board board2For10x10 = new Board();
            Board board3For10x10 = new Board();
            when(userInputMock.getNextInt()).thenReturn(2);
            board1For10x10.userChoseBoard(userCommunication);
            board2For10x10.userChoseBoard(userCommunication);
            board3For10x10.userChoseBoard(userCommunication);

            ResultCheck resultCheck = new ResultCheck();

            boardFor3x3.setSymbol(0, 0, 'X');
            boardFor3x3.setSymbol(1, 1, 'X');
            boardFor3x3.setSymbol(2, 2, 'X');

            board1For10x10.setSymbol(2, 2, 'X');
            board1For10x10.setSymbol(3, 3, 'X');
            board1For10x10.setSymbol(4, 4, 'X');
            board1For10x10.setSymbol(5, 5, 'X');
            board1For10x10.setSymbol(6, 6, 'X');

            board2For10x10.setSymbol(5, 0, 'X');
            board2For10x10.setSymbol(6, 1, 'X');
            board2For10x10.setSymbol(7, 2, 'X');
            board2For10x10.setSymbol(8, 3, 'X');
            board2For10x10.setSymbol(9, 4, 'X');

            board3For10x10.setSymbol(0, 5, 'X');
            board3For10x10.setSymbol(1, 6, 'X');
            board3For10x10.setSymbol(2, 7, 'X');
            board3For10x10.setSymbol(3, 8, 'X');
            board3For10x10.setSymbol(4, 9, 'X');

            // When
            boolean receivedResult1 = resultCheck.checkAll(boardFor3x3, 'X');
            boolean receivedResult2 = resultCheck.checkAll(board1For10x10, 'X');
            boolean receivedResult3 = resultCheck.checkAll(board2For10x10, 'X');
            boolean receivedResult4 = resultCheck.checkAll(board3For10x10, 'X');

            // Then
            Assertions.assertTrue(receivedResult1);
            Assertions.assertTrue(receivedResult2);
            Assertions.assertTrue(receivedResult3);
            Assertions.assertTrue(receivedResult4);
        }


        @DisplayName("Check cross2 for X: when use cross2Check method for X, then return true")
        @Test
        void testCross2CheckForX() {
            // Given
            UserInput userInputMock = mock(UserInput.class);
            UserCommunication userCommunication = new UserCommunication(userInputMock);

            Board boardFor3x3 = new Board();
            when(userInputMock.getNextInt()).thenReturn(1);
            boardFor3x3.userChoseBoard(userCommunication);

            Board board1For10x10 = new Board();
            Board board2For10x10 = new Board();
            Board board3For10x10 = new Board();
            when(userInputMock.getNextInt()).thenReturn(2);
            board1For10x10.userChoseBoard(userCommunication);
            board2For10x10.userChoseBoard(userCommunication);
            board3For10x10.userChoseBoard(userCommunication);

            ResultCheck resultCheck = new ResultCheck();

            boardFor3x3.setSymbol(0, 2, 'X');
            boardFor3x3.setSymbol(1, 1, 'X');
            boardFor3x3.setSymbol(2, 0, 'X');

            board1For10x10.setSymbol(4, 0, 'X');
            board1For10x10.setSymbol(3, 1, 'X');
            board1For10x10.setSymbol(2, 2, 'X');
            board1For10x10.setSymbol(1, 3, 'X');
            board1For10x10.setSymbol(0, 4, 'X');

            board2For10x10.setSymbol(6, 3, 'X');
            board2For10x10.setSymbol(5, 4, 'X');
            board2For10x10.setSymbol(4, 5, 'X');
            board2For10x10.setSymbol(3, 6, 'X');
            board2For10x10.setSymbol(2, 7, 'X');

            board3For10x10.setSymbol(9, 5, 'X');
            board3For10x10.setSymbol(8, 6, 'X');
            board3For10x10.setSymbol(7, 7, 'X');
            board3For10x10.setSymbol(6, 8, 'X');
            board3For10x10.setSymbol(5, 9, 'X');
            ;
            // When
            boolean receivedResult1 = resultCheck.checkAll(boardFor3x3, 'X');
            boolean receivedResult2 = resultCheck.checkAll(board1For10x10, 'X');
            boolean receivedResult3 = resultCheck.checkAll(board2For10x10, 'X');
            boolean receivedResult4 = resultCheck.checkAll(board3For10x10, 'X');

            // Then
            Assertions.assertTrue(receivedResult1);
            Assertions.assertTrue(receivedResult2);
            Assertions.assertTrue(receivedResult3);
            Assertions.assertTrue(receivedResult4);
        }
    }

    @Nested
    @DisplayName("Tests win for symbol O")
    class TestsForO {

        @DisplayName("Check rows for O: when use rowCheck method for X, then return true")
        @Test
        void testRowCheckForO() {
            // Given
            UserInput userInputMock = mock(UserInput.class);
            UserCommunication userCommunication = new UserCommunication(userInputMock);

            Board board1For3x3 = new Board();
            Board board2For3x3 = new Board();
            Board board3For3x3 = new Board();
            when(userInputMock.getNextInt()).thenReturn(1);
            board1For3x3.userChoseBoard(userCommunication);
            board2For3x3.userChoseBoard(userCommunication);
            board3For3x3.userChoseBoard(userCommunication);

            Board board1For10x10 = new Board();
            Board board2For10x10 = new Board();
            Board board3For10x10 = new Board();
            when(userInputMock.getNextInt()).thenReturn(2);
            board1For10x10.userChoseBoard(userCommunication);
            board2For10x10.userChoseBoard(userCommunication);
            board3For10x10.userChoseBoard(userCommunication);

            ResultCheck resultCheck = new ResultCheck();

            board1For3x3.setSymbol(0, 0, 'O');
            board1For3x3.setSymbol(0, 1, 'O');
            board1For3x3.setSymbol(0, 2, 'O');

            board2For3x3.setSymbol(1, 0, 'O');
            board2For3x3.setSymbol(1, 1, 'O');
            board2For3x3.setSymbol(1, 2, 'O');

            board3For3x3.setSymbol(2, 0, 'O');
            board3For3x3.setSymbol(2, 1, 'O');
            board3For3x3.setSymbol(2, 2, 'O');

            board1For10x10.setSymbol(2, 2, 'O');
            board1For10x10.setSymbol(2, 3, 'O');
            board1For10x10.setSymbol(2, 4, 'O');
            board1For10x10.setSymbol(2, 5, 'O');
            board1For10x10.setSymbol(2, 6, 'O');

            board2For10x10.setSymbol(0, 1, 'O');
            board2For10x10.setSymbol(0, 2, 'O');
            board2For10x10.setSymbol(0, 3, 'O');
            board2For10x10.setSymbol(0, 4, 'O');
            board2For10x10.setSymbol(0, 5, 'O');

            board3For10x10.setSymbol(7, 5, 'O');
            board3For10x10.setSymbol(7, 6, 'O');
            board3For10x10.setSymbol(7, 7, 'O');
            board3For10x10.setSymbol(7, 8, 'O');
            board3For10x10.setSymbol(7, 9, 'O');

            // When
            boolean receivedResult1 = resultCheck.checkAll(board1For3x3, 'O');
            boolean receivedResult2 = resultCheck.checkAll(board2For3x3, 'O');
            boolean receivedResult3 = resultCheck.checkAll(board3For3x3, 'O');
            boolean receivedResult4 = resultCheck.checkAll(board1For10x10, 'O');
            boolean receivedResult5 = resultCheck.checkAll(board2For10x10, 'O');
            boolean receivedResult6 = resultCheck.checkAll(board3For10x10, 'O');

            // Then
            Assertions.assertTrue(receivedResult1);
            Assertions.assertTrue(receivedResult2);
            Assertions.assertTrue(receivedResult3);
            Assertions.assertTrue(receivedResult4);
            Assertions.assertTrue(receivedResult5);
            Assertions.assertTrue(receivedResult6);
        }


        @DisplayName("Check columns for O: when use columnCheck method for O, then return true")
        @Test
        void testColumnCheckForO() {
            // Given
            UserInput userInputMock = mock(UserInput.class);
            UserCommunication userCommunication = new UserCommunication(userInputMock);

            Board board1For3x3 = new Board();
            Board board2For3x3 = new Board();
            Board board3For3x3 = new Board();
            when(userInputMock.getNextInt()).thenReturn(1);
            board1For3x3.userChoseBoard(userCommunication);
            board2For3x3.userChoseBoard(userCommunication);
            board3For3x3.userChoseBoard(userCommunication);

            Board board1For10x10 = new Board();
            Board board2For10x10 = new Board();
            Board board3For10x10 = new Board();
            when(userInputMock.getNextInt()).thenReturn(2);
            board1For10x10.userChoseBoard(userCommunication);
            board2For10x10.userChoseBoard(userCommunication);
            board3For10x10.userChoseBoard(userCommunication);

            ResultCheck resultCheck = new ResultCheck();

            board1For3x3.setSymbol(0, 0, 'O');
            board1For3x3.setSymbol(1, 0, 'O');
            board1For3x3.setSymbol(2, 0, 'O');

            board2For3x3.setSymbol(0, 1, 'O');
            board2For3x3.setSymbol(1, 1, 'O');
            board2For3x3.setSymbol(2, 1, 'O');

            board3For3x3.setSymbol(0, 2, 'O');
            board3For3x3.setSymbol(1, 2, 'O');
            board3For3x3.setSymbol(2, 2, 'O');

            board1For10x10.setSymbol(3, 5, 'O');
            board1For10x10.setSymbol(4, 5, 'O');
            board1For10x10.setSymbol(5, 5, 'O');
            board1For10x10.setSymbol(6, 5, 'O');
            board1For10x10.setSymbol(7, 5, 'O');

            board2For10x10.setSymbol(0, 0, 'O');
            board2For10x10.setSymbol(1, 0, 'O');
            board2For10x10.setSymbol(2, 0, 'O');
            board2For10x10.setSymbol(3, 0, 'O');
            board2For10x10.setSymbol(4, 0, 'O');

            board3For10x10.setSymbol(5, 9, 'O');
            board3For10x10.setSymbol(6, 9, 'O');
            board3For10x10.setSymbol(7, 9, 'O');
            board3For10x10.setSymbol(8, 9, 'O');
            board3For10x10.setSymbol(9, 9, 'O');

            // When
            boolean receivedResult1 = resultCheck.checkAll(board1For3x3, 'O');
            boolean receivedResult2 = resultCheck.checkAll(board2For3x3, 'O');
            boolean receivedResult3 = resultCheck.checkAll(board3For3x3, 'O');
            boolean receivedResult4 = resultCheck.checkAll(board1For10x10, 'O');
            boolean receivedResult5 = resultCheck.checkAll(board2For10x10, 'O');
            boolean receivedResult6 = resultCheck.checkAll(board3For10x10, 'O');

            // Then
            Assertions.assertTrue(receivedResult1);
            Assertions.assertTrue(receivedResult2);
            Assertions.assertTrue(receivedResult3);
            Assertions.assertTrue(receivedResult4);
            Assertions.assertTrue(receivedResult5);
            Assertions.assertTrue(receivedResult6);
        }


        @DisplayName("Check cross1 for O: when use cross1Check method for O, then return true")
        @Test
        void testCross1CheckForO() {
            // Given
            UserInput userInputMock = mock(UserInput.class);
            UserCommunication userCommunication = new UserCommunication(userInputMock);

            Board boardFor3x3 = new Board();
            when(userInputMock.getNextInt()).thenReturn(1);
            boardFor3x3.userChoseBoard(userCommunication);

            Board board1For10x10 = new Board();
            Board board2For10x10 = new Board();
            Board board3For10x10 = new Board();
            when(userInputMock.getNextInt()).thenReturn(2);
            board1For10x10.userChoseBoard(userCommunication);
            board2For10x10.userChoseBoard(userCommunication);
            board3For10x10.userChoseBoard(userCommunication);

            ResultCheck resultCheck = new ResultCheck();

            boardFor3x3.setSymbol(0, 0, 'O');
            boardFor3x3.setSymbol(1, 1, 'O');
            boardFor3x3.setSymbol(2, 2, 'O');

            board1For10x10.setSymbol(2, 2, 'O');
            board1For10x10.setSymbol(3, 3, 'O');
            board1For10x10.setSymbol(4, 4, 'O');
            board1For10x10.setSymbol(5, 5, 'O');
            board1For10x10.setSymbol(6, 6, 'O');

            board2For10x10.setSymbol(5, 0, 'O');
            board2For10x10.setSymbol(6, 1, 'O');
            board2For10x10.setSymbol(7, 2, 'O');
            board2For10x10.setSymbol(8, 3, 'O');
            board2For10x10.setSymbol(9, 4, 'O');

            board3For10x10.setSymbol(0, 5, 'O');
            board3For10x10.setSymbol(1, 6, 'O');
            board3For10x10.setSymbol(2, 7, 'O');
            board3For10x10.setSymbol(3, 8, 'O');
            board3For10x10.setSymbol(4, 9, 'O');

            // When
            boolean receivedResult1 = resultCheck.checkAll(boardFor3x3, 'O');
            boolean receivedResult2 = resultCheck.checkAll(board1For10x10, 'O');
            boolean receivedResult3 = resultCheck.checkAll(board2For10x10, 'O');
            boolean receivedResult4 = resultCheck.checkAll(board3For10x10, 'O');

            // Then
            Assertions.assertTrue(receivedResult1);
            Assertions.assertTrue(receivedResult2);
            Assertions.assertTrue(receivedResult3);
            Assertions.assertTrue(receivedResult4);
        }


        @DisplayName("Check cross2 for O: when use cross2Check method for O, then return true")
        @Test
        void testCross2CheckForO() {
            // Given
            UserInput userInputMock = mock(UserInput.class);
            UserCommunication userCommunication = new UserCommunication(userInputMock);

            Board boardFor3x3 = new Board();
            when(userInputMock.getNextInt()).thenReturn(1);
            boardFor3x3.userChoseBoard(userCommunication);

            Board board1For10x10 = new Board();
            Board board2For10x10 = new Board();
            Board board3For10x10 = new Board();
            when(userInputMock.getNextInt()).thenReturn(2);
            board1For10x10.userChoseBoard(userCommunication);
            board2For10x10.userChoseBoard(userCommunication);
            board3For10x10.userChoseBoard(userCommunication);

            ResultCheck resultCheck = new ResultCheck();

            boardFor3x3.setSymbol(0, 2, 'O');
            boardFor3x3.setSymbol(1, 1, 'O');
            boardFor3x3.setSymbol(2, 0, 'O');

            board1For10x10.setSymbol(4, 0, 'O');
            board1For10x10.setSymbol(3, 1, 'O');
            board1For10x10.setSymbol(2, 2, 'O');
            board1For10x10.setSymbol(1, 3, 'O');
            board1For10x10.setSymbol(0, 4, 'O');

            board2For10x10.setSymbol(6, 3, 'O');
            board2For10x10.setSymbol(5, 4, 'O');
            board2For10x10.setSymbol(4, 5, 'O');
            board2For10x10.setSymbol(3, 6, 'O');
            board2For10x10.setSymbol(2, 7, 'O');

            board3For10x10.setSymbol(9, 5, 'O');
            board3For10x10.setSymbol(8, 6, 'O');
            board3For10x10.setSymbol(7, 7, 'O');
            board3For10x10.setSymbol(6, 8, 'O');
            board3For10x10.setSymbol(5, 9, 'O');

            // When
            boolean receivedResult1 = resultCheck.checkAll(boardFor3x3, 'O');
            boolean receivedResult2 = resultCheck.checkAll(board1For10x10, 'O');
            boolean receivedResult3 = resultCheck.checkAll(board2For10x10, 'O');
            boolean receivedResult4 = resultCheck.checkAll(board3For10x10, 'O');

            // Then
            Assertions.assertTrue(receivedResult1);
            Assertions.assertTrue(receivedResult2);
            Assertions.assertTrue(receivedResult3);
            Assertions.assertTrue(receivedResult4);
        }
    }

    @Nested
    @DisplayName("Tests draw")
    class TestsDraw {
        @DisplayName("Check the draw: when use checkWinOrDraw method, then return \"Draw.\"")
        @Test
        void testCheckWinOrDraw() {
            // Given
            UserInput userInputMock = mock(UserInput.class);
            UserCommunication userCommunication = new UserCommunication(userInputMock);

            Board board1For3x3 = new Board();
            Board board2For3x3 = new Board();
            Board board3For3x3 = new Board();
            when(userInputMock.getNextInt()).thenReturn(1);
            board1For3x3.userChoseBoard(userCommunication);
            board2For3x3.userChoseBoard(userCommunication);
            board3For3x3.userChoseBoard(userCommunication);

            Board boardFor10x10 = new Board();
            when(userInputMock.getNextInt()).thenReturn(2);
            boardFor10x10.userChoseBoard(userCommunication);

            ResultCheck resultCheck = new ResultCheck();
            int totalMovesFor3X3 = 9;
            int totalMovesFor10X10 = 100;
            char x = 'X';

            board1For3x3.setSymbol(0, 0, 'X');
            board1For3x3.setSymbol(0, 1, 'O');
            board1For3x3.setSymbol(0, 2, 'X');
            board1For3x3.setSymbol(1, 0, 'X');
            board1For3x3.setSymbol(1, 1, 'O');
            board1For3x3.setSymbol(1, 2, 'X');
            board1For3x3.setSymbol(2, 0, 'O');
            board1For3x3.setSymbol(2, 1, 'X');
            board1For3x3.setSymbol(2, 2, 'O');


            board2For3x3.setSymbol(0, 0, 'X');
            board2For3x3.setSymbol(0, 1, 'O');
            board2For3x3.setSymbol(0, 2, 'X');
            board2For3x3.setSymbol(1, 0, 'X');
            board2For3x3.setSymbol(1, 1, 'X');
            board2For3x3.setSymbol(1, 2, 'O');
            board2For3x3.setSymbol(2, 0, 'O');
            board2For3x3.setSymbol(2, 1, 'X');
            board2For3x3.setSymbol(2, 2, 'O');

            board3For3x3.setSymbol(0, 0, 'O');
            board3For3x3.setSymbol(0, 1, 'X');
            board3For3x3.setSymbol(0, 2, 'X');
            board3For3x3.setSymbol(1, 0, 'X');
            board3For3x3.setSymbol(1, 1, 'O');
            board3For3x3.setSymbol(1, 2, 'O');
            board3For3x3.setSymbol(2, 0, 'O');
            board3For3x3.setSymbol(2, 1, 'X');
            board3For3x3.setSymbol(2, 2, 'X');

            boardFor10x10.setSymbol(0, 0, 'X');
            boardFor10x10.setSymbol(0, 1, 'O');
            boardFor10x10.setSymbol(0, 2, 'X');
            boardFor10x10.setSymbol(0, 3, 'O');
            boardFor10x10.setSymbol(0, 4, 'X');
            boardFor10x10.setSymbol(0, 5, 'O');
            boardFor10x10.setSymbol(0, 6, 'X');
            boardFor10x10.setSymbol(0, 7, 'O');
            boardFor10x10.setSymbol(0, 8, 'X');
            boardFor10x10.setSymbol(0, 9, 'O');
            boardFor10x10.setSymbol(1, 0, 'X');
            boardFor10x10.setSymbol(1, 1, 'O');
            boardFor10x10.setSymbol(1, 2, 'X');
            boardFor10x10.setSymbol(1, 3, 'O');
            boardFor10x10.setSymbol(1, 4, 'X');
            boardFor10x10.setSymbol(1, 5, 'O');
            boardFor10x10.setSymbol(1, 6, 'X');
            boardFor10x10.setSymbol(1, 7, 'O');
            boardFor10x10.setSymbol(1, 8, 'X');
            boardFor10x10.setSymbol(1, 9, 'O');
            boardFor10x10.setSymbol(2, 0, 'X');
            boardFor10x10.setSymbol(2, 1, 'O');
            boardFor10x10.setSymbol(2, 2, 'X');
            boardFor10x10.setSymbol(2, 3, 'O');
            boardFor10x10.setSymbol(2, 4, 'X');
            boardFor10x10.setSymbol(2, 5, 'O');
            boardFor10x10.setSymbol(2, 6, 'X');
            boardFor10x10.setSymbol(2, 7, 'O');
            boardFor10x10.setSymbol(2, 8, 'X');
            boardFor10x10.setSymbol(2, 9, 'O');
            boardFor10x10.setSymbol(3, 0, 'O');
            boardFor10x10.setSymbol(3, 1, 'X');
            boardFor10x10.setSymbol(3, 2, 'O');
            boardFor10x10.setSymbol(3, 3, 'X');
            boardFor10x10.setSymbol(3, 4, 'O');
            boardFor10x10.setSymbol(3, 5, 'X');
            boardFor10x10.setSymbol(3, 6, 'O');
            boardFor10x10.setSymbol(3, 7, 'X');
            boardFor10x10.setSymbol(3, 8, 'O');
            boardFor10x10.setSymbol(3, 9, 'X');
            boardFor10x10.setSymbol(4, 0, 'O');
            boardFor10x10.setSymbol(4, 1, 'X');
            boardFor10x10.setSymbol(4, 2, 'O');
            boardFor10x10.setSymbol(4, 3, 'X');
            boardFor10x10.setSymbol(4, 4, 'O');
            boardFor10x10.setSymbol(4, 5, 'X');
            boardFor10x10.setSymbol(4, 6, 'O');
            boardFor10x10.setSymbol(4, 7, 'X');
            boardFor10x10.setSymbol(4, 8, 'O');
            boardFor10x10.setSymbol(4, 9, 'X');
            boardFor10x10.setSymbol(5, 0, 'O');
            boardFor10x10.setSymbol(5, 1, 'X');
            boardFor10x10.setSymbol(5, 2, 'O');
            boardFor10x10.setSymbol(5, 3, 'X');
            boardFor10x10.setSymbol(5, 4, 'O');
            boardFor10x10.setSymbol(5, 5, 'X');
            boardFor10x10.setSymbol(5, 6, 'O');
            boardFor10x10.setSymbol(5, 7, 'X');
            boardFor10x10.setSymbol(5, 8, 'O');
            boardFor10x10.setSymbol(5, 9, 'X');
            boardFor10x10.setSymbol(6, 0, 'O');
            boardFor10x10.setSymbol(6, 1, 'X');
            boardFor10x10.setSymbol(6, 2, 'O');
            boardFor10x10.setSymbol(6, 3, 'X');
            boardFor10x10.setSymbol(6, 4, 'O');
            boardFor10x10.setSymbol(6, 5, 'X');
            boardFor10x10.setSymbol(6, 6, 'O');
            boardFor10x10.setSymbol(6, 7, 'X');
            boardFor10x10.setSymbol(6, 8, 'O');
            boardFor10x10.setSymbol(6, 9, 'X');
            boardFor10x10.setSymbol(7, 0, 'X');
            boardFor10x10.setSymbol(7, 1, 'O');
            boardFor10x10.setSymbol(7, 2, 'X');
            boardFor10x10.setSymbol(7, 3, 'O');
            boardFor10x10.setSymbol(7, 4, 'X');
            boardFor10x10.setSymbol(7, 5, 'O');
            boardFor10x10.setSymbol(7, 6, 'X');
            boardFor10x10.setSymbol(7, 7, 'O');
            boardFor10x10.setSymbol(7, 8, 'X');
            boardFor10x10.setSymbol(7, 9, 'O');
            boardFor10x10.setSymbol(8, 0, 'X');
            boardFor10x10.setSymbol(8, 1, 'O');
            boardFor10x10.setSymbol(8, 2, 'X');
            boardFor10x10.setSymbol(8, 3, 'O');
            boardFor10x10.setSymbol(8, 4, 'X');
            boardFor10x10.setSymbol(8, 5, 'O');
            boardFor10x10.setSymbol(8, 6, 'X');
            boardFor10x10.setSymbol(8, 7, 'O');
            boardFor10x10.setSymbol(8, 8, 'X');
            boardFor10x10.setSymbol(8, 9, 'O');
            boardFor10x10.setSymbol(9, 0, 'X');
            boardFor10x10.setSymbol(9, 1, 'O');
            boardFor10x10.setSymbol(9, 2, 'X');
            boardFor10x10.setSymbol(9, 3, 'O');
            boardFor10x10.setSymbol(9, 4, 'X');
            boardFor10x10.setSymbol(9, 5, 'O');
            boardFor10x10.setSymbol(9, 6, 'X');
            boardFor10x10.setSymbol(9, 7, 'O');
            boardFor10x10.setSymbol(9, 8, 'X');
            boardFor10x10.setSymbol(9, 9, 'O');

            // When
            String resultReceived1 = resultCheck.checkWinOrDraw(resultCheck, board1For3x3, x, totalMovesFor3X3);
            String resultReceived2 = resultCheck.checkWinOrDraw(resultCheck, board2For3x3, x, totalMovesFor3X3);
            String resultReceived3 = resultCheck.checkWinOrDraw(resultCheck, board3For3x3, x, totalMovesFor3X3);
            String resultReceived4 = resultCheck.checkWinOrDraw(resultCheck, boardFor10x10, x, totalMovesFor10X10);

            // Then
            assertEquals("Draw.", resultReceived1);
            assertEquals("Draw.", resultReceived2);
            assertEquals("Draw.", resultReceived3);
            assertEquals("Draw.", resultReceived4);
        }
    }

    @Nested
    @DisplayName("Tests for users moves (entered values)")
    class TestsUserMoves {
        @DisplayName("MoveCheck for occupied field (board 3x3): when use moveCheck method, then return true")
        @Test
        void testMoveCheckFor3x3Board() {
            // Given
            UserInput userInputMock = mock(UserInput.class);
            UserCommunication userCommunication = new UserCommunication(userInputMock);
            char x = 'X';

            when(userInputMock.getNextInt()).thenReturn(1);

            Board boardExpectedFor3x3 = new Board();
            boardExpectedFor3x3.userChoseBoard(userCommunication);
            boardExpectedFor3x3.setSymbol(1, 1, 'X');

            Board board3x3 = new Board();
            board3x3.userChoseBoard(userCommunication);

            Board boardReceivedFor3x3 = new Board();
            boardReceivedFor3x3.userChoseBoard(userCommunication);

            // When
            boardReceivedFor3x3.moveCheck(userCommunication, x, board3x3);

            // Then
            assertEquals(boardExpectedFor3x3.getSymbol(1, 1), boardReceivedFor3x3.getSymbol(1, 1));

        }

        @DisplayName("MoveCheck for occupied field (board 10x10): when use moveCheck method, then return true")
        @Test
        void testMoveCheckFor10x10Board() {
            // Given
            UserInput userInputMock = mock(UserInput.class);
            UserCommunication userCommunication = new UserCommunication(userInputMock);
            char x = 'X';

            when(userInputMock.getNextInt()).thenReturn(2);

            Board boardExpectedFor10x10 = new Board();
            boardExpectedFor10x10.userChoseBoard(userCommunication);
            boardExpectedFor10x10.setSymbol(2, 2, 'X');

            Board board10x10 = new Board();
            board10x10.userChoseBoard(userCommunication);

            Board boardReceivedFor10x10 = new Board();
            boardReceivedFor10x10.userChoseBoard(userCommunication);

            // When
            boardReceivedFor10x10.moveCheck(userCommunication, x, board10x10);

            // Then
            assertEquals(boardExpectedFor10x10.getSymbol(2, 2), boardReceivedFor10x10.getSymbol(2, 2));
        }

        @DisplayName("UserChooseRow (board 3x3: when use userChooseRow method, and: user enter number 0, 1 or 2," +
                "then return this number as number of row and doesn't throw InputMismatchException")
        @Test
        void testUserChooseRowForCorrectEnterValuesFor3x3Board() {
            // Given
            UserInput userInputMock = mock(UserInput.class);
            UserCommunication userCommunication = new UserCommunication(userInputMock);
            int expectedRow = 1;
            when(userInputMock.getNextInt()).thenReturn(expectedRow);
            when(userInputMock.getNext()).thenReturn("");
            Board board3x3 = new Board();
            board3x3.userChoseBoard(userCommunication);

            // When
            int receivedRow = userCommunication.userChoseRow(board3x3);

            // Then
            assertEquals(expectedRow, receivedRow);
            assertDoesNotThrow(() -> userCommunication.userChoseRow(board3x3));

        }

        @DisplayName("UserChooseRow (board 10x10): when use userChooseRow method, and: user enter number 0, 1 or 2," +
                "then return this number as number of row and doesn't throw InputMismatchException")
        @Test
        void testUserChooseRowForCorrectEnterValuesFor10x10Board() {
            // Given
            UserInput userInputMock = mock(UserInput.class);
            UserCommunication userCommunication = new UserCommunication(userInputMock);
            int expectedRow = 2;
            when(userInputMock.getNextInt()).thenReturn(expectedRow);
            when(userInputMock.getNext()).thenReturn("");
            Board board10x10 = new Board();
            board10x10.userChoseBoard(userCommunication);

            // When
            int receivedRow = userCommunication.userChoseRow(board10x10);

            // Then
            assertEquals(expectedRow, receivedRow);
            assertDoesNotThrow(() -> userCommunication.userChoseRow(board10x10));
        }
    }
}


