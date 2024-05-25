class Solution {

    public static List<String> divide(String s, int k){
        List<String> groups = new ArrayList<>();
    
        if(k<=0||s==null){
            return groups;
        }

        int length = s.length();

        for(int i = 0; i<length; i+=k){
            groups.add(s.substring(i, Math.min(length, i+k)));
        }

        return groups;
    }

    public static int sumDigits(String a){
        int sum = 0;
        for(int i = 0; i<a.length(); i++){
            sum+=Character.getNumericValue(a.charAt(i));
        }
        return sum;
    }
    
    public static String xx(String s, int k){
        StringBuilder str = new StringBuilder();

        List<String> grp = divide(s, k);

        for(int i = 0; i< grp.size(); i++){
            str.append(Integer.toString(sumDigits(grp.get(i))));

        }
        return str.toString();

    }

    public String digitSum(String s, int k) {
        String a = s;
        while(a.length()>k){
            a = xx(a,k);
        }

        return a;




        
    }
}