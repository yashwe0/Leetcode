class Solution {
    public static int left (int n){
        if(n==1){
            return 1;
        }
        else{

            return 2*((n/2)-left(n/2)+1);


        }
    }
    public int lastRemaining(int n) {
        int output = left(n);
        return output;
        


        
    }
}