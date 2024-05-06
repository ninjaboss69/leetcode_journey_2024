class Solution {
    public int binaryGap(int n) {
        String binString = Integer.toBinaryString(n);

        int max = 0;


        for (int i = 0; i < binString.length();) {

            if (binString.charAt(i) == '1') {
                int count = 0;
                int j = i + 1;
                for (; j < binString.length(); j++) {

                    count++;
                    if (binString.charAt(j) == '1') {
                        max = Math.max(count, max);
                        break;

                    }
                }
                i = j;

            } else
                i++;

        }
        return max;

    }
}