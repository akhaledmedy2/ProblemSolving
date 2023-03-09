package org.example;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {

        int bestProfit = 0;
        int todayProfit;
        int sellPrice = Integer.MAX_VALUE;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < sellPrice) {
                sellPrice = prices[i];
            }
            todayProfit = prices[i] - sellPrice;
            if (bestProfit < todayProfit) {
                bestProfit = todayProfit;
            }
        }

        return bestProfit;
    }
}