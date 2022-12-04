package 商品下单;

public class PayAdapter implements AliPay {
    ExtraPay ExtraPay;
    public PayAdapter(String type)
    {
        if(type.equals("BankCards"))
        {
            ExtraPay=new BankCards();
        }
        else {
            ExtraPay=new WeChat();
        }
    }
    @Override
    public void pay(String type, double price) {
        if(type.equals("BankCards"))
        {
            ExtraPay.BankCards(price);
        }
        else {
            ExtraPay.WeChat(price);
        }
    }
}
