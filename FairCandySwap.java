class Solution {
    public int[] fairCandySwap(int[] left, int[] right) {

        // if(left.length>right.length){
        //     return fairCandySwap
        // }
        
        int leftSum=0,rightSum=0;

        for(int i=0;i<left.length;i++){
            leftSum+=left[i];
        }

        for(int i=0;i<right.length;i++){
            rightSum+=right[i];
        }

        for(int i=0;i<left.length;i++){
            int c = left[i];
            int lt = leftSum-c;

            int rt = rightSum+c;

            // we can use binary search here, but i am bored today,
            // fix later

            for(int j=0;j<right.length;j++){
                if(lt+right[j] == rt-right[j]){
                    return new int[]{c,right[j]};
                }
            }
        }
        return new int[]{0,0};

    }
}