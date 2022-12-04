package com.hdu.manage;

public class DeleteStock implements Order {

    private com.hdu.manage.Stock Stock;
    public DeleteStock(com.hdu.manage.Stock Stock) {
        this.Stock = Stock;
    }

    @Override
    public void execute() {
        Stock.Delete();
    }
}