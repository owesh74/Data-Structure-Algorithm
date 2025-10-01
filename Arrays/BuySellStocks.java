public class BuySellStocks {
    public static void Stocks(int arr[]){
    
        int MaxProfit =  0;
        int Buy = Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            int Sell = arr[i];
            if(Buy < Sell){
                int Profit = Sell - Buy;
                MaxProfit = Math.max(MaxProfit, Profit);

            }
            else{
                Buy = arr[i];
            }
        }

        System.out.println("Maximum Profit : "  + MaxProfit);

    }
public static void main(String[] args) {
    int arr[] = {7,1,5,3,6,4};
    Stocks(arr);
}
}
