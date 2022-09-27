package com.nest.hotel;

public class Fooditems {
    Integer tea;
    Integer coffee;
    Integer juice;
    Integer cake;
    Integer icecream;

    public Fooditems(Integer tea, Integer coffee, Integer juice, Integer cake, Integer icecream) {
        this.tea = tea;
        this.coffee = coffee;
        this.juice = juice;
        this.cake = cake;
        this.icecream = icecream;
    }

    public Integer getJuice() {
        return juice;
    }

    public void setJuice(Integer juice) {
        this.juice = juice;
    }

    public Integer getCake() {
        return cake;
    }

    public void setCake(Integer cake) {
        this.cake = cake;
    }

    public Integer getIcecream() {
        return icecream;
    }

    public void setIcecream(Integer icecream) {
        this.icecream = icecream;
    }

    public Integer getTea() {
        return tea;
    }

    public void setTea(Integer tea) {
        this.tea = tea;
    }

    public Integer getCoffee() {
        return coffee;
    }

    public void setCoffee(Integer coffee) {
        this.coffee = coffee;
    }
}
