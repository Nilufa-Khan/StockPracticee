 public class Stock {
        String symbol;
        String name;
        double prev_Closing_Price;
        double curr_price;
        Stock(String symbol,String name){
            this.symbol = symbol;
            this.name = name;
        }
        public double getChangePercent(){
            double result = ((prev_Closing_Price -curr_price) / prev_Closing_Price) * 100;
            return  result;
        }
    }


