import java.util.*;

class Solution {
    // 1. ENTRY POINT: LeetCode calls this method
    public void solveSudoku(char[][] board) {
        if (board == null || board.length == 0) return;
        solve(board);
    }
    
    // 2. RECURSIVE ENGINE: Backtracks through the board cells
    private boolean solve(char[][] board) {
        // Radar scanner: loops over every coordinate
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                
                // If we find an empty cell marked with '.'
                if (board[i][j] == '.') {
                    
                    // Try filling characters '1' through '9'
                    for (char c = '1'; c <= '9'; c++) {
                        
                        // Check if character 'c' is unique in row, column, and 3x3 box
                        if (isValid(board, i, j, c)) {
                            board[i][j] = c; // Tentatively place the number
                            
                            // Recurse deeper to solve the remaining empty cells
                            if (solve(board)) {
                                return true; // Found the final correct puzzle solution!
                            } else {
                                board[i][j] = '.'; // Backtrack: erase and reset choice
                            }
                        }
                    }
                    // If no numbers 1-9 fit in this spot, this entire path is wrong
                    return false; 
                }
            }
        }
        // If the scanner scans the entire board and finds no '.' cells, the board is solved
        return true; 
    }
    
    // 3. VALIDATION SCANNER: Checks Row, Column, and the local 3x3 Grid
    private boolean isValid(char[][] board, int row, int col, char c) {
        for (int i = 0; i < 9; i++) {
            // Check Row uniqueness
            if (board[row][i] == c) return false;
            
            // Check Column uniqueness
            if (board[i][col] == c) return false;
            
            // Check 3x3 Box uniqueness using the shifting division math
            int boxRow = 3 * (row / 3) + i / 3;
            int boxCol = 3 * (col / 3) + i % 3;
            if (board[boxRow][boxCol] == c) return false;
        }
        return true; // The number is safe and unique
    }
}
