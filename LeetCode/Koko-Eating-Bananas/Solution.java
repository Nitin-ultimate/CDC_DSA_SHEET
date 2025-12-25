1class Solution {
2    public boolean isPossible(int mid, int [] arr, int h){
3        int hour = 0;
4        for(int p : arr){
5            hour += (p+mid-1)/mid;
6        }
7        return hour<=h; 
8    }
9    public int minEatingSpeed(int[] piles, int h) {
10        int lo=1, high=0;
11        for(int p : piles){
12            high = Math.max(high,p);
13        }
14        while(lo<high){
15            int mid = lo + (high-lo)/2;
16            if(isPossible(mid,piles,h)==true){
17                high = mid;
18            }
19            else{
20                lo = mid+1;
21            }
22        }
23        return lo;
24    }
25}