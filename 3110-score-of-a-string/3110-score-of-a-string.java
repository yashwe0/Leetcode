class Solution {
    public int scoreOfString(String s) {

        int result = 0;

    for(int i = 0 ; i<s.length()-1; i++){
        int m = (int)s.charAt(i);
        int n = (int)s.charAt(i+1);
        result = result + Math.abs(m-n);
    }
        return result;
    }
}