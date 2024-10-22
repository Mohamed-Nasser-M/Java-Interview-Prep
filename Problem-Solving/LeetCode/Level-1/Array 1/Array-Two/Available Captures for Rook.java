class Solution {
    public int numRookCaptures(char[][] board) {
        int sum = 0;
        int rookRow = -1, rookCol = -1;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 'R') {
                    rookRow = i;
                    rookCol = j;
                    break;
                }
            }
            if (rookRow != -1) break;
        }
        for (int i = rookRow - 1; i >= 0; i--) {
            if (board[i][rookCol] == 'B') break; 
            if (board[i][rookCol] == 'p') {
                sum++;
                break; 
            }
        }

        for (int i = rookRow + 1; i < board.length; i++) {
            if (board[i][rookCol] == 'B') break; 
            if (board[i][rookCol] == 'p') {
                sum++;
                break;
            }
        }

        for (int j = rookCol - 1; j >= 0; j--) {
            if (board[rookRow][j] == 'B') break;
            if (board[rookRow][j] == 'p') {
                sum++;
                break;
            }
        }

        for (int j = rookCol + 1; j < board[0].length; j++) {
            if (board[rookRow][j] == 'B') break;
            if (board[rookRow][j] == 'p') {
                sum++;
                break; 
            }
        }

        return sum;
    }
}
