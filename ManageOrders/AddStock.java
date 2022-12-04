package 订单管理;

public class AddStock implements Order{
    private Stock Stock;
    public AddStock(Stock Stock) {
        this.Stock = Stock;
    }

    @Override
    public void execute() {
        Stock.Add();
    }
}
