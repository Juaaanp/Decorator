package com.decorator.uniquindio;

class ExtraBaconTopping extends BaseToppingsDecorator {
    public ExtraBaconTopping(IPizza pizzaToDecorate) {
        super(pizzaToDecorate);
        this.price = 0.99;
    }
}

