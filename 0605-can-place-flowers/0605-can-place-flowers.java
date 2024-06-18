class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int first = 0;
        int count = 0;
        int length = flowerbed.length;
        
        if(length == 1 && flowerbed[0]==0){
            return true;
            
        }

        if(flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            count++;
        }

        if(flowerbed[length-1]==0 && flowerbed[length-2]==0){
            flowerbed[length-1]=1;
            count++;
        }

        for(int i = 1; i<length-1;i++){
            if(flowerbed[i] ==0 && flowerbed[i-1]==0 && flowerbed[i+1]==0){
                count++;
                flowerbed[i]=1;
            }
        }

        //System.out.println(count);

        if(count>=n){
            return true;
        }
        return false;



        
    }
}