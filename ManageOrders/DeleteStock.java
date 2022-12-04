package 订单管理;

public class DeleteStock implements Order {

    private Stock Stock;
    public DeleteStock(Stock Stock) {
        this.Stock = Stock;
    }

    @Override
    public void execute() {
        Stock.Delete();
    }
}