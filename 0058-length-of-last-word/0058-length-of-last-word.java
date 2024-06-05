class Solution {

    public String removeExtraSpaces(String s) {
        // Replace multiple spaces with a single space using regular expression
        s = s.replaceAll("\\s+", " ");
        
        // Trim leading and trailing spaces
        return s.trim();
    }
    public int lengthOfLastWord(String s) {

        String ans = removeExtraSpaces(s);
        String[] an = ans.split(" ");

        String word = an[an.length-1];
        

        return word.length();

        
    }
}