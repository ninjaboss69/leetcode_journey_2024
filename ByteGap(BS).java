class Solution {
    public int[] fairCandySwap(int[] left, int[] right) {
        int leftSum = 0, rightSum = 0;
        Arrays.sort(right);

        for (int i = 0; i < left.length; i++) {
            leftSum += left[i];
        }

        for (int i = 0; i < right.length; i++) {
            rightSum += right[i];
        }

        for (int i = 0; i < left.length; i++) {
            int c = left[i];
            int lt = leftSum - c;

            int rt = rightSum + c;

           
            int j=0,last=right.length-1;
            while(j<=last){
                int middle = j  + ((last - j) / 2);
               

                if(lt+right[middle] == rt-right[middle]){
                    return new int[]{c,right[middle]};
                }
                else if(lt+right[middle]>rt-right[middle]){
                   
                    last=middle-1;
                }else {
                    
                     j=middle+1;
                }
                

            }

        }
        return new int[] { 0, 0 };

    }
}
