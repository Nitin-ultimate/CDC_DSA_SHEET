1class Solution {
2    public String countAndSay(int n) {
3        if(n==1) return "1";
4        String s = countAndSay(n-1);
5        String ans = "";
6        int i=0, j=0;
7        while(j<s.length()){
8            if(s.charAt(i)==s.charAt(j)) j++;
9            else{
10                int len = j-i;
11                ans += len;
12                ans += s.charAt(i);
13                i=j;
14            }
15        }
16        int len = j-i;
17        ans += len;
18        ans += s.charAt(i);
19        i=j;
20        return ans;
21    }
22}