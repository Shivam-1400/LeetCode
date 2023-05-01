class Solution {
    public double average(int[] salary) {
        // int min = Collections.min(Arrays.asList(num));
 
        // using Collections.max()
        // to find maximum element
        // using only 1 line.
        // int max = Collections.max(Arrays.asList(num));
        Arrays.sort(salary);
        double sm=0.00000;
        for(int i=1; i< salary.length -1; i++){
            sm= sm+ (double)salary[i];
        }
        return (sm*1.00000)/ (salary.length-2);
    }
}