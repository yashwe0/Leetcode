class Solution {

    public List<String> addint(String s, int[] spaces){
        List<String> temp = new ArrayList<>();
        temp.add(s.substring(0, spaces[0]));
        for(int i = 1 ; i<spaces.length; i++){
            temp.add(s.substring(spaces[i-1], spaces[i]));

        }
        temp.add(s.substring(spaces[spaces.length-1], s.length()));
        return temp;

    }
    public String addSpaces(String s, int[] spaces) {
        int n = s.length();
        StringBuilder str = new StringBuilder();
        List<String> ind = addint(s, spaces);
        for(int i = 0; i<ind.size(); i++){
            str.append(ind.get(i));

            if(i!= ind.size()-1){
                str.append(" ");
            }
        }
        return str.toString();

        
    }
}