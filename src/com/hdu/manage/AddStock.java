package com.hdu.manage;

public class AddStock implements Order {
    private com.hdu.manage.Stock Stock;
    public AddStock(com.hdu.manage.Stock Stock) {
        this.Stock = Stock;
    }

    @Override
    public void execute() {
        Stock.Add();
    }
}
