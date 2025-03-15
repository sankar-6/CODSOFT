class Solution {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        char ch[] = moves.toCharArray();
        for(char c:ch){
            if(c=='U'){
                y++;
            }
            else if(c=='D'){
                y--;
            }
            else if(c=='R'){
                x++;
            }
            else if(c=='L'){
                x--;
            }
            else{
                ;
            }
        }
        if(x==0 && y==0){
            return true;
        }
        else{
            return false;
        }
    }
}
