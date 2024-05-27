import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        Map<Integer, Integer> dict = new HashMap<>();
        for (int num : nums) {
            set.add(num);
        }
        
        for (int i : set) {
            dict.put(i, 0);
        }

        for (int num : nums) {
            dict.put(num, dict.get(num) + 1);
            if (dict.get(num) == 2) {
                return num;
            }
        }

        // Just for syntax completeness, although the problem guarantees a duplicate exists.
        return -1;
    }
}
