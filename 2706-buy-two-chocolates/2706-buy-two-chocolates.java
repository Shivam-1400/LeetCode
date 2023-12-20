class Solution {
    public int buyChoco(int[] prices, int money) {
        if(prices.length <2){
            return money;
        }
        Arrays.sort(prices);
        int min1= prices[0];
        int min2= prices[1];
        
        if(min1+ min2<= money){
            return money-min1- min2;
        }
        return money;
    }
}