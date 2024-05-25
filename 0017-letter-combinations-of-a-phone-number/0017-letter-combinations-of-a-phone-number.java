class Solution {
    

    public List<String> letterCombinations(String digits) {

        List<String> result = new ArrayList<>();
        if(digits.length()==0){
            return result;
        }

        result.add("");

        String[] Letter = new String[]{"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        for( char digit : digits.toCharArray()){
            String letters = Letter[digit - '2'];
            List<String> temp = new ArrayList<>();
            for(String a : result){
                for(char combin : letters.toCharArray()){
                    temp.add(a+combin);
                }
            }
            result = temp;


        }
        
        return result;
        
        
        
        

        
        
        
    }
}