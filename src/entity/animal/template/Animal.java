package entity.animal.template;

import entity.Entity;
import entity.animal.behavior.*;

public abstract class Animal extends Entity implements AnimalBehavior {
    protected Animal() {
        super();
    }

    protected Animal(String name) {
        super(name);
    }

    public double getCost() {
        return cost;
    }

    protected void setCost(double cost) {
        this.cost = cost;
    }


    protected double getWeight() {
        return weight;
    }



    protected void setWeight(double weight) {
        this.weight = weight;
    }


    private double cost = 0;
    private double weight = 0;

}
