class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>ans =new ArrayList<>();
        int n=s.length();
        int k=p.length();
        char[]pc=p.toCharArray();
        Arrays.sort(pc);
        for(int i=0;i<=n-k;i++){
            String t=s.substring(i,i+k);
            char tc[]=t.toCharArray();
            Arrays.sort(tc);
            if(Arrays.equals(pc,tc)) ans.add(i) ;   
        }
        return ans;
    }
}
