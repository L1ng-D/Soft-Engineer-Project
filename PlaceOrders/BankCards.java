package 商品下单;

public class BankCards implements ExtraPay{

    @Override
    public void BankCards(double price) {
        System.out.println("将为你使用银行卡支付"+price+"元");
    }

    @Override
    public void WeChat(double price) {

    }
}
