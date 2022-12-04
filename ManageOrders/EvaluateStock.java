package 订单管理;

public class EvaluateStock implements Order{
    private Stock Stock;
    public EvaluateStock(Stock Stock) {
        this.Stock = Stock;
    }

    @Override
    public void execute() {
        Stock.Evaluate();
    }
}
