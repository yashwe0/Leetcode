import java.util.*;
class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        List<String>[] bucket = new ArrayList[words.length +1 ];
        Map<String, Integer> mapFreq = new HashMap<>();

        for(String word : words){
            mapFreq.put(word, mapFreq.getOrDefault(word, 0)+1);
        }

        for(String key : mapFreq.keySet()){
            int frequency = mapFreq.get(key);
            if(bucket[frequency]==null){
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        }

        List<String> res = new ArrayList<>();
        int counter = 0;

        for(int pos = bucket.length -1 ;pos>=0 && counter<k ;pos--){
            if(bucket[pos]!=null){
                Collections.sort(bucket[pos]);
                for(String s: bucket[pos]){
                    res.add(s);
                    if(res.size() == k){
                        return res;
                    }
                    counter++;
                    
                }
            }
        }
        // Collections.sort(res);
        return res;
        
    }
}