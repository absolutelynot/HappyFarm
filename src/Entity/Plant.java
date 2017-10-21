package Entity;

import Entity.Behavior.Growable;
import Entity.Behavior.Reproducable;

public abstract class Plant extends Entity implements Reproducable, Growable {
    public Plant() {
        super();
    }

    public Plant(String _name) {
        super(_name);
    }

    public double getCost() {
        return _cost;
    }

    public void setCost(double _cost) {
        this._cost = _cost;
    }

    private double _cost = 0;

}
