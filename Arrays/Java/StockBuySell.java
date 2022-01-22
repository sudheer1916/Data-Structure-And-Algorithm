class StockBuySell {

    static int maxProfit(int[] price){      //efficient
        int profit = 0;
        for (int i = 1; i < price.length; i++) {
            if(price[i]>price[i-1])
            profit = profit + price[i] - price[i-1];
        }
        return profit;
    }

    public static void main(String[] args) {
        int arr[] = {1, 5, 3, 8, 12};

        System.out.println(maxProfit(arr));
    }
}
