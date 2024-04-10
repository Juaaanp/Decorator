package com.decorator.uniquindio;

class ExtraPineappleTopping extends BaseToppingsDecorator {
    public ExtraPineappleTopping(IPizza pizzaToDecorate) {
        super(pizzaToDecorate);
        this.price =  1.49;
    }
}