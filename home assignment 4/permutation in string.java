class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;

        int[] s1C = new int[26];
        int[] s2C = new int[26];
        
        for (int i = 0; i < s1.length(); i++) {
            s1C[s1.charAt(i) - 'a']++;
            s2C[s2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s2.length() - s1.length(); i++) {
            if (helper(s1C, s2C)) return true;
            s2C[s2.charAt(i)-'a']--;
            s2C[s2.charAt(i+s1.length())-'a']++;
        }
        return helper(s1C, s2C);
    }
    private boolean helper(int[] s1C, int[] s2C) {
        for (int i=0;i<26;i++) {
            if (s1C[i]!=s2C[i]) return false;
        }
        return true;
    }
}
