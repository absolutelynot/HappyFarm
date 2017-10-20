package Entity;

public abstract class Plant extends Entity {
    public Plant() {
        super();
    }

    public Plant(String _name) {
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
