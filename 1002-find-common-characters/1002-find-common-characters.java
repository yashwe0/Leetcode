class Solution {
    public List<String> commonChars(String[] words) {

        int[] minFreq = new int[26];
        Arrays.fill(minFreq, Integer.MAX_VALUE);

        for(String s : words){
            int[] charCount = new int[26];
            for(char c :  s.toCharArray()){
                charCount[c-'a']++;
            }

            for(int i = 0; i<26; i++){
                minFreq[i] = Math.min(minFreq[i], charCount[i]);
            }
        }

        List<String> commonChars = new ArrayList<>();

        for(int i = 0; i<26;i++){
            for(int j = 0; j<minFreq[i];j++){
                commonChars.add(String.valueOf((char)(i+'a')));
            }
        }

        return commonChars;




        
    }
}