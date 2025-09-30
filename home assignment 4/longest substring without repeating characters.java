class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l=0,r=0,max=0;
        Set<Character> set= new HashSet<>();
        while(r<s.length()){
            char ch=s.charAt(r);
             if(!set.contains(ch)){
                set.add(ch);
                max=Math.max(max,set.size());
                r++;
            }
            else{
                set.remove(s.charAt(l));
                l++;
            }
             
        }
        return max;
    }
}
