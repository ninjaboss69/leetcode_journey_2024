class Solution {
    public void nextPermutation(int[] nums) {

        int last = nums.length - 1;
        TreeMap<Integer, Integer> treeMap = new TreeMap<>();
        List<Integer> list = new ArrayList();

        // Total Time Complexity is O(nlogn)

        for (int i = last; i >= 0; i--) {


            if (treeMap.higherKey(nums[i]) != null) {
               list.add(nums[i]);
               list.remove(treeMap.higherKey(nums[i])); // O(n)
               nums[i] = treeMap.higherKey(nums[i]);

                Collections.sort(list);  // O(nlogn)
                ++i;
                for(Integer s:list){
                    
                    nums[i++]=s;
                }
                return;

            } else {
                // log(n) for putting

                treeMap.put(nums[i], i);
                list.add(nums[i]);

            }
        }
        Arrays.sort(nums);
    }

}