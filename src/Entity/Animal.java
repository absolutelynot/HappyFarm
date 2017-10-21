package Entity;

import Entity.Behavior.*;

public abstract class Animal extends Entity implements AnimalBehavior, Growable, Reproducable {
    protected Animal() {
        super();
    }

    protected Animal(String _name) {
        super(_name);
    }

    public double getCost() {
        return _cost;
    }

    protected void setCost(double _cost) {
        this._cost = _cost;
    }


    protected double getWeight() {
        return _weight;
    }



    protected void setWeight(double _weight) {
        this._weight = _weight;
    }

    @Override
    public String grow(int weight) {
        setWeight(getWeight() + weight);
        return "Growing";
    }

    private double _cost = 0;
    private double _weight = 0;

}
