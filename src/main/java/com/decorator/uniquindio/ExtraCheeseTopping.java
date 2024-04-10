package com.decorator.uniquindio;

class ExtraCheeseTopping extends BaseToppingsDecorator {
    public ExtraCheeseTopping(IPizza pizzaToDecorate) {
        super(pizzaToDecorate);
        this.price = 0.99;
    }
}

