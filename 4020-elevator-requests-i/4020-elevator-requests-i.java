class Solution {
    public int elevatorRequests(int n, int[] requests) {
        int time=0,floor=0;
        for(int i: requests)
            {
                time=time+(Math.abs(i-floor));
                floor=i;
            }
        return time;
    }
}
