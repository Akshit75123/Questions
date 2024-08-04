package Recursion;

import java.util.*;

public class NQueen {

    public static boolean isSafe(int row, int col, char[][] boards) {
        //horizontal
        for (int j = 0; j < boards.length; j++) {
            if (boards[row][j] == 'Q') return false;
        }
        //vertical
        for (int i = 0; i < boards.length; i++) {
            if (boards[i][col] == 'Q') return false;
        }

        //upper left
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (boards[r][c] == 'Q') return false;
        }

        //upper right
        r = row;
        for (int c = col; c < boards.length && r >= 0; r--, c++) {
            if (boards[r][c] == 'Q') return false;
        }

        // lower left
        r = row;
        for (int c = col; c >= 0 && r < boards.length; r++, c--) {
            if (boards[r][c] == 'Q') return false;
        }
        //lower right
        for (int c = col; c < boards.length && r < boards.length; c++, r++) {
            if (boards[r][c] == 'Q') return false;
        }
        return true;
    }

    public static void saveBoard(char[][] boards, List<List<String>> allBoards) {
        String row = "";
        List<String> newboard = new ArrayList<>();

        for (int i = 0; i < boards.length; i++) {
            row = "";
            for (int j = 0; j < boards[0].length; j++) {
                if (boards[i][j] == 'Q') row += 'Q';
                else row += '.';
            }
            newboard.add(row);
        }
        allBoards.add(newboard);

    }

    public static void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public static List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];

        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }


}