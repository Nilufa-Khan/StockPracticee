public class StockImpl {
    public static void main(String[] args) {
    Stock obj = new Stock("ORCL","Oracle Corporation");
    obj.prev_Closing_Price = 34.5;
    obj.curr_price = 34.35;
        System.out.println("Price change percentage = "+ obj.getChangePercent());
    }
}
