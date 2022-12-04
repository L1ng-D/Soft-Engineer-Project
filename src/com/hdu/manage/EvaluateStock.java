package com.hdu.manage;

public class EvaluateStock implements Order {
    private com.hdu.manage.Stock Stock;
    public EvaluateStock(com.hdu.manage.Stock Stock) {
        this.Stock = Stock;
    }

    @Override
    public void execute() {
        Stock.Evaluate();
    }
}
