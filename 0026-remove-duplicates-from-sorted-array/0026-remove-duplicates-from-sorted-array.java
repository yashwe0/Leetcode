class Solution {
    public int removeDuplicates(int[] nums) {

        Map<Integer, Integer> Mapfreq = new HashMap<>();
        for(int num : nums){
            Mapfreq.put(num, Mapfreq.getOrDefault(num,0)+1);
        }


        int k = Mapfreq.size();
        int index = 0;

        for(int key : Mapfreq.keySet()){
            nums[index++] = key;
        }
        
        Arrays.sort(nums, 0, k);
        return k;
        
    }
}