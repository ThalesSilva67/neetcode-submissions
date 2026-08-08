class Solution {
    public boolean isValidSudoku(char[][] board) {
        int len = board.length;
        boolean valid = true;

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                for (int k = j + 1; k < len; k++) {
                    if (board[i][j] == board[i][k] && board[i][j] != '.') {
                        valid = false;
                        break;
                    }
                }
            }
        }

        for (int r = 0; r < len; r++) {
            for (int l = 0; l < len; l++) {
                for (int c = r + 1; c < len; c++) {
                    if (board[r][l] == board[c][l] && board[r][l] != '.') {
                        valid = false;
                        break;
                    }
                }
            }
        }

        for (int line = 0; line < 2; line++) {
            for (int column = 0; column < 2; column++) {
                for (int bline = line * 3; bline < (line * 3) + 3; bline++) {
                    for (int bcol = column * 3; bcol < (column * 3) + 3; bcol++) {

                        if (board[bline][bcol] == '.')
                            continue;

                        for (int row = line*3; row < (line * 3) + 3; row++) {
                            for (int col = column*3; col < (column * 3) + 3; col++) {

                                if (bline == row && bcol == col)
                                    continue;

                                if (board[bline][bcol] == board[row][col]) {
                                    valid = false;
                                    break;
                                }
                            }
                        }
                    }

                }
            }
        }

        return valid;
    }
}
