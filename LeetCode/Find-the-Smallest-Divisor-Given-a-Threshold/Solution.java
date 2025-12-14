1class Solution {
2    public int smallestDivisor(int[] nums, int t) {
3        int n = nums.length;
4        int max = Integer.MIN_VALUE;
5        for(int i=0; i<n; i++){
6            max = Math.max(max, nums[i]);
7        }
8        int low = 1, high = max;
9        int div=0;
10        while(low<=high){
11            int mid = low + (high-low)/2;
12            int sum =0;
13            for(int i=0; i<n; i++){
14                if(nums[i]%mid==0) sum += nums[i]/mid;
15                else sum += nums[i]/mid +1;
16            }
17            if(sum<=t){
18                div= mid;
19                high= mid-1;
20            }
21            else{
22                low=mid+1;
23            }
24        }
25        return div;
26    }
27}