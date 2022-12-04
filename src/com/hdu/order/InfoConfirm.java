package com.hdu.order;

public class InfoConfirm implements ConfirmAPI {
    @Override
    public void Confirm() {
        ConfirmAPI AddressConfirm = new AddressConfirm();
        ConfirmAPI GoodsConfirm = new GoodsConfirm();
        ConfirmAPI PriceConfirm = new PriceConfirm();
        GoodsConfirm.Confirm();
        PriceConfirm.Confirm();
        AddressConfirm.Confirm();
    }
}
