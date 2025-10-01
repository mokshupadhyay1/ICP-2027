class Solution {
    public boolean lemonadeChange(int[] bills) {
        
        int n= bills.length;
        int s5=0;
        int s10=0;
        for (int bill : bills) {
            if (bill==5) {
                s5++;
            } 
            else if (bill==10) {
                if (s5==0) return false; 
                s5--;
                s10++;
            } 
            else { 
                if (s10>0 && s5>0) {
                    s10--;
                    s5--;
                } 
                else if (s5>=3) { 
                    s5-=3;
                } 
                else {
                    return false; 
                }
            }
        }

        return true;
    }
}    
