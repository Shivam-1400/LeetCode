class Solution {
    public boolean checkNumBalls(int[] position, int mid, int m){
        int c = 1, l = 0;
        boolean check = false;
        for(int i = 1; i <= position.length-1; i++){
            if(position[i] - position[l] >= mid){
                c++;
                l = i;
            }
            if(c >= m) {
                check = true;
                break;
            }
        }
        return check;
    }
    public int maxDistance(int[] position, int m) {
        Arrays.sort(position);

        int l = 1, r = (position[position.length - 1] - position[0]) / (m - 1);
        int result = 0, mid = 0;
        while(l <= r){
            mid = l + (r - l) / 2;
            if(checkNumBalls(position, mid, m)){
                result = mid;
                l = mid + 1;
            } else{
                r = mid - 1;
            }
        }
        return result;
    }
}