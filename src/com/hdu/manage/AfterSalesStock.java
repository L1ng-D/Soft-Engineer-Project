package com.hdu.manage;

public class AfterSalesStock implements Order {
    private com.hdu.manage.Stock Stock;
    public AfterSalesStock(com.hdu.manage.Stock Stock) {
        this.Stock = Stock;
    }

    @Override
    public void execute() {
        Stock.AfterSales();
    }
}
