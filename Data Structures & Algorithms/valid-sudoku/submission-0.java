class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] row = new HashSet[9];
        HashSet<Character>[] col = new HashSet[9];
        HashSet<Character>[] box = new HashSet[9];
        for(int i=0;i<9;i++){
            row[i] = new HashSet<>();
            col[i] = new HashSet<>();
            box[i] = new HashSet<>();
            
        }
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(board[i][j] == '.') continue;
                int boxidx = (i/3)*3 + (j/3);
                char num = board[i][j];
                if(row[i].contains(num)) return false;
                if(col[j].contains(num)) return false;
                if(box[boxidx].contains(num)) return false;
                row[i].add(num);
                col[j].add(num);
                box[boxidx].add(num);
            }
        }
        return true;
    }
}
