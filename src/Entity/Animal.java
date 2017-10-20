package Entity;

import Entity.Behavior.*;

public abstract class Animal extends Entity implements AnimalBehavior {
    public Animal() {
        super();
    }

    public Animal(String _name) {
        super(_name);
    }

    public double get_cost() {
        return _cost;
    }

    public void set_cost(double _cost) {
        this._cost = _cost;
    }

    private double _cost = 0;

}
