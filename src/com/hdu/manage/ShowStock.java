package com.hdu.manage;

public class ShowStock  implements Order {
    private com.hdu.manage.Stock Stock;
    public ShowStock(com.hdu.manage.Stock Stock)
    {
        this.Stock=Stock;
    }
    @Override
    public void execute() {
        Stock.Show();
    }
}
