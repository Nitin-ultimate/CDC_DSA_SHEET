1class Solution {
2    public boolean isPossible(int c, int[] arr, int d){
3        int n = arr.length;
4        int load = 0;
5        int days = 1;
6        for(int i=0; i<n; i++){
7            if(load + arr[i] <= c) load += arr[i];
8            else{
9                load = arr[i];
10                days++;
11            }
12        }
13        if(days>d) return false;
14        else return true;        
15    }
16    public int shipWithinDays(int[] arr, int d) {
17        int n = arr.length;
18        int sum =0, mx = Integer.MIN_VALUE;
19        for(int i=0; i<n; i++){
20            mx = Math.max(mx,arr[i]);
21            sum += arr[i];
22        }
23        int low = mx, high = sum, minC = sum;
24        while(low<=high){
25            int mid = low + (high-low)/2;
26            if(isPossible(mid,arr,d)==true){
27                minC = mid;
28                high = mid-1;
29            }
30            else low = mid+1;
31        }
32        return minC;
33    }
34}