package com.tictactoe;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class TicTacToeApplicationTestSuite{

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
    @DisplayName("Tests for symbol X")
    class TestsForX {

        @DisplayName("Check rows for X: when use rowCheck method for X, then return true")
        @Test
        void testRowCheckForX() {
            // Given
            Board board1 = new Board();
            Board board2 = new Board();
            Board board3 = new Board();
            ResultCheck resultCheck = new ResultCheck();

            board1.setSymbol(0, 0, 'X');
            board1.setSymbol(0, 1, 'X');
            board1.setSymbol(0, 2, 'X');

            board2.setSymbol(1, 0, 'X');
            board2.setSymbol(1, 1, 'X');
            board2.setSymbol(1, 2, 'X');

            board3.setSymbol(2, 0, 'X');
            board3.setSymbol(2, 1, 'X');
            board3.setSymbol(2, 2, 'X');

            // When
            boolean receivedResult1 = resultCheck.checkAll(board1, 'X');
            boolean receivedResult2 = resultCheck.checkAll(board1, 'X');
            boolean receivedResult3 = resultCheck.checkAll(board1, 'X');

            // Then
            Assertions.assertTrue(receivedResult1);
            Assertions.assertTrue(receivedResult2);
            Assertions.assertTrue(receivedResult3);
        }

        @DisplayName("Check columns for X: when use columnCheck method for X, then return true")
        @Test
        void testColumnCheckForX() {
            // Given
            Board board1 = new Board();
            Board board2 = new Board();
            Board board3 = new Board();
            ResultCheck resultCheck = new ResultCheck();

            board1.setSymbol(0, 0, 'X');
            board1.setSymbol(1, 0, 'X');
            board1.setSymbol(2, 0, 'X');

            board2.setSymbol(0, 1, 'X');
            board2.setSymbol(1, 1, 'X');
            board2.setSymbol(2, 1, 'X');

            board3.setSymbol(0, 2, 'X');
            board3.setSymbol(1, 2, 'X');
            board3.setSymbol(2, 2, 'X');

            // When
            boolean receivedResult1 = resultCheck.checkAll(board1, 'X');
            boolean receivedResult2 = resultCheck.checkAll(board1, 'X');
            boolean receivedResult3 = resultCheck.checkAll(board1, 'X');

            // Then
            Assertions.assertTrue(receivedResult1);
            Assertions.assertTrue(receivedResult2);
            Assertions.assertTrue(receivedResult3);
        }

        @DisplayName("Check cross1 for X: when use cross1Check method for X, then return true")
        @Test
        void testCross1CheckForX() {
            // Given
            Board board = new Board();
            ResultCheck resultCheck = new ResultCheck();

            board.setSymbol(0, 0, 'X');
            board.setSymbol(1, 1, 'X');
            board.setSymbol(2, 2, 'X');

            // When
            boolean receivedResult1 = resultCheck.checkAll(board, 'X');

            // Then
            Assertions.assertTrue(receivedResult1);

        }

        @DisplayName("Check cross2 for X: when use cross2Check method for X, then return true")
        @Test
        void testCross2CheckForX() {
            // Given
            Board board = new Board();
            ResultCheck resultCheck = new ResultCheck();

            board.setSymbol(0, 2, 'X');
            board.setSymbol(1, 1, 'X');
            board.setSymbol(2, 0, 'X');

            // When
            boolean receivedResult1 = resultCheck.checkAll(board, 'X');

            // Then
            Assertions.assertTrue(receivedResult1);

        }
    }

    @Nested
    @DisplayName("Tests for symbol O")
    class TestsForY {

        @DisplayName("Check rows for O: when use rowCheck method for X, then return true")
        @Test
        void testRowCheckForO() {
            // Given
            Board board1 = new Board();
            Board board2 = new Board();
            Board board3 = new Board();
            ResultCheck resultCheck = new ResultCheck();

            board1.setSymbol(0, 0, 'O');
            board1.setSymbol(0, 1, 'O');
            board1.setSymbol(0, 2, 'O');

            board2.setSymbol(1, 0, 'O');
            board2.setSymbol(1, 1, 'O');
            board2.setSymbol(1, 2, 'O');

            board3.setSymbol(2, 0, 'O');
            board3.setSymbol(2, 1, 'O');
            board3.setSymbol(2, 2, 'O');

            // When
            boolean receivedResult1 = resultCheck.checkAll(board1, 'O');
            boolean receivedResult2 = resultCheck.checkAll(board1, 'O');
            boolean receivedResult3 = resultCheck.checkAll(board1, 'O');

            // Then
            Assertions.assertTrue(receivedResult1);
            Assertions.assertTrue(receivedResult2);
            Assertions.assertTrue(receivedResult3);
        }

        @DisplayName("Check columns for O: when use columnCheck method for O, then return true")
        @Test
        void testColumnCheckForO() {
            // Given
            Board board1 = new Board();
            Board board2 = new Board();
            Board board3 = new Board();
            ResultCheck resultCheck = new ResultCheck();

            board1.setSymbol(0, 0, 'O');
            board1.setSymbol(1, 0, 'O');
            board1.setSymbol(2, 0, 'O');

            board2.setSymbol(0, 1, 'O');
            board2.setSymbol(1, 1, 'O');
            board2.setSymbol(2, 1, 'O');

            board3.setSymbol(0, 2, 'O');
            board3.setSymbol(1, 2, 'O');
            board3.setSymbol(2, 2, 'O');

            // When
            boolean receivedResult1 = resultCheck.checkAll(board1, 'O');
            boolean receivedResult2 = resultCheck.checkAll(board1, 'O');
            boolean receivedResult3 = resultCheck.checkAll(board1, 'O');

            // Then
            Assertions.assertTrue(receivedResult1);
            Assertions.assertTrue(receivedResult2);
            Assertions.assertTrue(receivedResult3);
        }

        @DisplayName("Check cross1 for O: when use cross1Check method for O, then return true")
        @Test
        void testCross1CheckForO() {
            // Given
            Board board = new Board();
            ResultCheck resultCheck = new ResultCheck();

            board.setSymbol(0, 0, 'O');
            board.setSymbol(1, 1, 'O');
            board.setSymbol(2, 2, 'O');

            // When
            boolean receivedResult1 = resultCheck.checkAll(board, 'O');

            // Then
            Assertions.assertTrue(receivedResult1);

        }

        @DisplayName("Check cross2 for O: when use cross2Check method for O, then return true")
        @Test
        void testCross2CheckForO() {
            // Given
            Board board = new Board();
            ResultCheck resultCheck = new ResultCheck();

            board.setSymbol(0, 2, 'O');
            board.setSymbol(1, 1, 'O');
            board.setSymbol(2, 0, 'O');

            // When
            boolean receivedResult1 = resultCheck.checkAll(board, 'O');

            // Then
            Assertions.assertTrue(receivedResult1);

        }
    }




    @DisplayName("Check the draw: when use checkWinOrDraw method, then return \"Draw.\"")
    @Test
    void testCheckWinOrDraw() {
        // Given
        Board board1 = new Board();
        Board board2 = new Board();
        Board board3 = new Board();
        ResultCheck resultCheck = new ResultCheck();
        int totalMoves = 9;
        char x = 'X';

        board1.setSymbol(0,0,'X');
        board1.setSymbol(0,1,'O');
        board1.setSymbol(0,2,'X');
        board1.setSymbol(1,0,'X');
        board1.setSymbol(1,1,'O');
        board1.setSymbol(1,2,'X');
        board1.setSymbol(2,0,'O');
        board1.setSymbol(2,1,'X');
        board1.setSymbol(2,2,'O');



        board2.setSymbol(0,0,'X');
        board2.setSymbol(0,1,'O');
        board2.setSymbol(0,2,'X');
        board2.setSymbol(1,0,'X');
        board2.setSymbol(1,1,'X');
        board2.setSymbol(1,2,'O');
        board2.setSymbol(2,0,'O');
        board2.setSymbol(2,1,'X');
        board2.setSymbol(2,2,'O');

        board3.setSymbol(0,0,'O');
        board3.setSymbol(0,1,'X');
        board3.setSymbol(0,2,'X');
        board3.setSymbol(1,0,'X');
        board3.setSymbol(1,1,'O');
        board3.setSymbol(1,2,'O');
        board3.setSymbol(2,0,'O');
        board3.setSymbol(2,1,'X');
        board3.setSymbol(2,2,'X');

        // When
        String resultReceived1 = resultCheck.checkWinOrDraw(resultCheck, board1, x, totalMoves);
        String resultReceived2 = resultCheck.checkWinOrDraw(resultCheck, board2, x, totalMoves);
        String resultReceived3 = resultCheck.checkWinOrDraw(resultCheck, board3, x, totalMoves);

        // Then
        Assertions.assertEquals("Draw.", resultReceived1);
        Assertions.assertEquals("Draw.", resultReceived2);
        Assertions.assertEquals("Draw.", resultReceived3);
    }

   /*
    @DisplayName("MoveCheck for occupied field: when use moveCheck method, then return true")
    @Test
    void testMoveCheck() {
        // Given
        UserInput userInputMock = mock(UserInput.class);
        Board board = new Board();
        board.setSymbol(1,1,'X');
        UserCommunication userCommunication = new UserCommunication();
        char x = 'X';
        int expectedValue = 1;
        when(userInputMock.getNextInt()).thenReturn(expectedValue);

        // When & Then
        Assertions.assertEquals("The field is occupied! Choose again.", board.moveCheck(userCommunication, x));

*/

    @DisplayName("UserChooseRow: when use userChooseRow method, and: user enter number 0, 1 or 2,then return this number as number of row.")
    @Test
    void testUserChooseRowForCorrectEnterValues() {
        // Given
        UserInput userInputMock = mock(UserInput.class);
        UserCommunication userCommunication = new UserCommunication();
        int expectedRow = 1;
        when(userInputMock.getNextInt()).thenReturn(expectedRow);
        when(userInputMock.getNext()).thenReturn("");

        // When
        int receivedRow = userCommunication.userChoseRow();

        // Then
        assertEquals(expectedRow, receivedRow);
    }

    /*@DisplayName("UserChooseRow: when use userChooseRow method, and: user enter String, then throws InputMismatchException")
    @Test
    void testUserChooseRowForIncorrectEnterValues() {
        // Given
        UserInput userInputMock = mock(UserInput.class);
        UserCommunication userCommunication = new UserCommunication();

        // When & then
        assertThrows(InputMismatchException.class, () -> userCommunication.userChoseRow());
        assertDoesNotThrow(()->userCommunication.userChoseRow());
    }
*/

}
