package 订单管理;

import java.util.Scanner;

public class Broker {
    Stock Stock;
    Order order;
    public void TakeOrder(int OrderId,int type)
    {
        Stock = new Stock(OrderId,type);
        switch (type)
        {
            case 1:
            {
                this.order=new ShowStock(Stock);
                break;
            }
            case 2:
            {
                this.order = new DeleteStock(Stock);
                break;
            }
            case 3:
            {
                this.order = new AddStock(Stock);
                break;
            }
            case 4:
            {
                this.order = new EvaluateStock(Stock);
                break;
            }
            case 5:
            {
                this.order = new AfterSalesStock(Stock);
            }

        }
    }
    public void PlaceOrder()
    {
        this.order.execute();
    }

}
