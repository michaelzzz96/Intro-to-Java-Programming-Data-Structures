public class Problem_9_2 {

    public static void main(String[] args) {
        Stock obj1 = new Stock("Oracle", "Name");
        obj1.previousClosingPrice = 34.5;
        obj1.currentPrice = 34.35;
        System.out.println("Stock name: " + obj1.name);
        System.out.println("Stock symbol: " + obj1.symbol);
        System.out.printf("Price-change percentage: %.2f%%\n",
                obj1.getChangePercentage());
    }

    private  static class Stock {
        String symbol;
        String name;
        double previousClosingPrice;
        double currentPrice;

        Stock(String NewSymbol, String NewName){
            symbol = NewSymbol;
            name = NewName;
        }

        double getChangePercentage(){
            return  ((currentPrice - previousClosingPrice) /
                    previousClosingPrice) * 100;
        }


    }

}
