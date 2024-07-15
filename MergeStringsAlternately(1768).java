class Solution {
    public String mergeAlternately(String word1, String word2) {
       return solve(word1, word2, false);

    }

    String solve(String word1, String word2, boolean isReverse) {
        if (word1.length() > word2.length()) {
            return solve(word2, word1, true);
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < word1.length(); i++) {
            if (isReverse) {
                sb.append(word2.charAt(i));
                sb.append(word1.charAt(i));
                continue;
            }
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        sb.append(word2.substring(word1.length()));
        return sb.toString();
    }
}