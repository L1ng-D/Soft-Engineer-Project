package com.hdu.order;

public class WeChat implements ExtraPay {
    @Override
    public void BankCards(double price) {

    }

    @Override
    public void WeChat(double price) {
        System.out.println("将为你使用微信支付"+price+"元");
    }
}
