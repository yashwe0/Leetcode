class Solution {
    public boolean isPalindrome(int x) {
        
        String s = String.valueOf(x);
        
        int n = s.length();
        int count = 0;
        for(int i = 0; i<n/2 ;i++){
            
            if (s.charAt(i)!= s.charAt(n-i-1)){
                count+=1;
                break;
            }
            else{
                continue;
            }
        }
        
        if(count!=0){
            return false;
        }
        else{
            return true;
        }
        
        
        
        
    }
}