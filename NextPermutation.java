class Solution {
    public void nextPermutation(int[] nums) {
        
        int last = nums.length-1;
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        
        for(int i=last;i>=0;i--){

            // checking is logn(n), will be n if we used normal loop to find

            if(treeMap.higherKey(nums[i])!=null){
                
                // only loop another 1 time if found
               
                int swapIndex = index(i,treeMap.higherKey(nums[i]),nums);

                int temp = nums[i];
                nums[i] = nums[swapIndex];
                nums[swapIndex] =temp;
                return;

            }else{
                // we don't have to constantly swap for every loop
                // we can use another structure to store pass elements
                // and just put all back after we found higher key
                
                // worst case, O(n^2)
                treeMap.put(nums[i],i);
                int first = nums[i];
                for(int j=i+1;j<nums.length;j++){
                    nums[j-1] = nums[j];
                }
                nums[last] = first; 
                
            }
        }
    }

    public int index(int start,int t,int[] arr){
        for(int i=start;i<arr.length;i++){
            if(arr[i] ==t ){
                return i;
            }
        }
        return 0;
    }
}