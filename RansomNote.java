class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] words = new int[26];
        char[] m = magazine.toCharArray();

        for (int i = 0; i < m.length; i++) {
            words[m[i] - 'a']++;
        }
        char[] r = ransomNote.toCharArray();
        for (int i = 0; i < r.length; i++) {
            words[r[i] - 'a']--;
            if (words[r[i] - 'a'] < 0)
                return false;
        }

        return true;

    }
}