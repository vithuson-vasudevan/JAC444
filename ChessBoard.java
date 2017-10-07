package queenseight;
        numQueens = 0;
        board = new int[8][8];
        for(int x = 0; x < 8; x++){
            for(int y = 0; y < 8; y++){
                board[x][y] = 0;
            }            
        }
    }
    
    public int getNumQueens(){
        return numQueens;
    }
    
    public void start(){
        solve(0);
    }
    
    public boolean solve(int numQueens){
        if(numQueens == 8){
            System.out.println("Puzzle Complete.");
            this.printBoard();
            return true;
        }
        else {
            for(int x = 0; x < 8; x++){
                for(int y = 0; y < 8; y++){
                    if(validMove(x,y) == 0){
                        this.placeQueen(x, y, 0);
                        numQueens++;
                        if(solve(numQueens)){
                            return true;
                        }
                        else {
                            this.placeQueen(x, y, 1);
                            numQueens--;
                        }
                    }
                }
            }
        }
        return false;
    }
    
    public static int validMove(int x, int y){
        for(int i = 0; i < 8; i++){
            if(get(x,i) == 1){
                return -1;
            }
            if(get(i,y) == 1){
                return -1;
            }
        }
        for(int i = 0; i < 8; i++){
            //Diagonal Checks
            if(get(x-i, y-i) == 1){
                return -1;
            }
            if(get(x+i, y+i) == 1){
                return -1;
            }
            if(get(x-i, y+i) == 1){
                return -1;
            }
            if(get(x+i, y-i) == 1){
                return -1;
            }
        }
        return 0;
    }
    
    public int placeQueen(int x, int y, int type){
        
        if(type == 0){
            board[x][y] = 1;
            numQueens++;
            return 0;
        }
        else if(type == 1){
            board[x][y] = 0;
            return 0;
        }
        System.out.println("Invalid Type.");
        return -1;
    }
    
    public static int get(int x, int y){
        if(x < 0 || y < 0 || x > 7 || x > 7){
            return -1;
        }
        return board[x][y];
    }
    
    public void printBoard(){
        for(int x = 0; x < 8; x++){
            for(int y = 0; y < 8; y++){
                System.out.print(this.get(x,y) + " ");
            }
            System.out.println(" ");
        }
    }
}
