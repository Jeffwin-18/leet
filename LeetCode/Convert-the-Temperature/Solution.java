1class Solution {
2    public double[] convertTemperature(double celsius) {
3        double k=(double)celsius+273.15;
4        double far=(double)celsius*1.80+32.00;
5        double [] arr=new double[2];
6        arr[0]=k;
7        arr[1]=far;
8       
9            return arr;
10        
11    }
12}