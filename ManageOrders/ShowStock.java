package 订单管理;

public class ShowStock  implements Order{
    private Stock Stock;
    public ShowStock(Stock Stock)
    {
        this.Stock=Stock;
    }
    @Override
    public void execute() {
        Stock.Show();
    }
}
