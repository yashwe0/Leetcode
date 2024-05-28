class Solution {
    public int addDigits(int num) {

        String str = Integer.toString(num);


        while(str.length()>1){
            int count = 0;
            for(int i= 0; i<str.length();i++){
                count+= Integer.parseInt(String.valueOf(str.charAt(i)));
            }
            str = Integer.toString(count);
        }

        return Integer.parseInt(str);
        
    }
}