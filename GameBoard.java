public class GameBoard {
    private GameToken [][] board;
    private GameToken player, blank;


    public GameBoard(int rows, int cols) {
        player= new GameToken(true, false, true);
        blank= new GameToken(false, false, false);
        board = new GameToken[rows][cols];

        for(int i = 0; i < rows; i++){
            for(int j = 0; j < cols;j++){
                board[i][j] = blank;
            }
        }
        
        board[0][0] = player;
        board[0][1] = player;
    }


    public int countCharacters() { 
        int x = 0;
        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] != blank) {
                    x++;
                }
            }
        }
        return x;
    }


}