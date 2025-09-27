class Solution {
    public boolean isPerfectSquare(int num) {
        
        int s=0,e=num;
        while(s<=e){
            int m=s+(e-s)/2;
            long sqr=(long) m*m;
            if(sqr==num){
                return true;
            }
            else if(sqr>num){
                e=m-1;
            }
            else{
                s=m+1;
            }
        }
        return false;
    }
}
