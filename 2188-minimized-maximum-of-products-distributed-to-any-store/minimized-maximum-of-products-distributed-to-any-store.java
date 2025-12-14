class Solution {
    public boolean isPossible(int maxQ, int n, int[] arr){
        int store = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]%maxQ == 0) store += arr[i]/maxQ;
            else store += arr[i]/maxQ + 1;
        }
        if(store>n) return false;
        else return true;
    }
    public int minimizedMaximum(int n, int[] arr) {
        int m = arr.length;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<m; i++){
            max = Math.max(max,arr[i]);
        }
        int low = 1, high = max;
        int ans =0;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isPossible(mid, n, arr)==true){
                ans = mid;
                high = mid-1;
            }
            else{
                low = mid+1;
            }
        }
        return ans;
    }
}