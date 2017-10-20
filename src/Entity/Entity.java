package Entity;

public abstract class Entity {

    public Entity(){

    }
    public Entity(String _name) {
        this._name = _name;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }



    private String _name = "Entity";
}
