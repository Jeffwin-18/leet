1class Solution {
2    public int minMovesToSeat(int[] seats, int[] students) {
3        int s1=0;
4        Arrays.sort(seats);
5        Arrays.sort(students);
6        for (int i=0;i<seats.length;i++)
7        {
8            s1=s1+(Math.abs(seats[i]-students[i]));
9        }
10       return s1;
11    }
12}