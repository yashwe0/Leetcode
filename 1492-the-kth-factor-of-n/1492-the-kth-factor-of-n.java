class Solution {
    public int kthFactor(int n, int k) {

        List<Integer> output = new ArrayList<>();

        for(int i = 1; i<=n; i++){
            if(n%i==0){
                output.add(i);
            }
        }
        if(output.size()>=k){
            return output.get(k-1);
        }
        return -1;
    }
}