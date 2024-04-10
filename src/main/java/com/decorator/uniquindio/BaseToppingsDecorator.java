package com.decorator.uniquindio;

public abstract class BaseToppingsDecorator extends IPizza {
    protected IPizza pizza;
    
    public BaseToppingsDecorator(IPizza pizzaToDecorate) {
        this.pizza = pizzaToDecorate;
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice() + this.price;
    }
}