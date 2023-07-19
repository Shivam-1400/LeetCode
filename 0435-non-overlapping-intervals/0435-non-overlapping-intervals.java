class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n= intervals.length;
        Arrays.sort(intervals, (a, b)-> Integer.compare(a[1], b[1]));

        int pr= 0;
        int cout= 1;

        for(int i=1; i< n; i++){
            if(intervals[i][0]>= intervals[pr][1]){
                pr= i;
                cout++;
            }
        }
        return n-cout;
    }
}