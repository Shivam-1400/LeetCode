class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int sum=numBottles;
        while(numBottles>=numExchange){
            int t=numBottles/numExchange;
            numBottles=t+(numBottles%numExchange);
            sum+=t;
        }
        return sum;
    }
}