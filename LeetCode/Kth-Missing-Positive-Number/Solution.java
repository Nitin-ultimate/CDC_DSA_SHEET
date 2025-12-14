1class Solution {
2    public int findKthPositive(int[] arr, int k) {
3        int low = 0, high = arr.length-1;
4        while(low<=high){
5            int mid = low + (high-low)/2;
6            int missed = arr[mid] - (mid+1);
7            if(missed<k) low = mid+1;
8            else high = mid-1;
9        }
10        return k+low;
11    }
12}