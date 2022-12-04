package 订单管理;

public class AfterSalesStock implements Order{
    private Stock Stock;
    public AfterSalesStock(Stock Stock) {
        this.Stock = Stock;
    }

    @Override
    public void execute() {
        Stock.AfterSales();
    }
}
