class Solution {
    public int[] fairCandySwap(int[] left, int[] right) {
        
      // This times, i tried to use different approach with set
      // and try java stream api, instead of normal loop
      
        Set<Integer> set = IntStream.of(right)
                .boxed()
                .collect(HashSet::new, HashSet::add, HashSet::addAll);

        int leftSum = Arrays.stream(left)
                .reduce(0, Integer::sum);

        int rightSum = Arrays.stream(right)
                .reduce(0, Integer::sum);

        for (int i = 0; i < left.length; i++) {
            int c = left[i];
            int lt = leftSum - c;
            int rt = rightSum + c;
            int re = (rt - lt) / 2;
            if (set.contains(re)) {
                return new int[] { c, re };
            }

        }
        return new int[] { 0, 0 };

    }
}
