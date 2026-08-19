class Solution {
    public double[] convertTemperature(double celsius) {
        double k=(double)celsius+273.15;
        double far=(double)celsius*1.80+32.00;
        double [] arr=new double[2];
        arr[0]=k;
        arr[1]=far;
       
            return arr;
        
    }
}