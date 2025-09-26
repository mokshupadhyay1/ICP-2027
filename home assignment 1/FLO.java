public class FLO {
    private int first(int[] arr, int x) {
        int s=0,e=arr.length -1, ans=-1;
        while (s<=e){
            int m=s+(e-s)/2;
            if (arr[m]==x){
                ans=m;
                e=m-1;
            } 
            else if(arr[m]<x){
                s=m+1;
            } 
            else{
                e=m-1;
            }
        }
        return ans;
    }
    private int last(int[] arr, int x) {
        int s=0,e=arr.length-1,ans=-1;
        while (s<=e) {
            int m=s+(e-s)/2;
            if (arr[m]==x) {
                ans=m;
                s=m+1;
            } 
            else if (arr[m]<x) {
                s=m+1;
            } 
            else {
                e=m-1;
            }
        }
        return ans;
    }
    public int[] searchRange(int[] nums, int target) {
        return new int[]{first(nums,target),last(nums,target)};
    }
}
