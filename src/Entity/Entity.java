package Entity;

public abstract class Entity {

    protected Entity(){

    }
    protected Entity(String _name) {
        this._name = _name;
    }

    protected String getName() {
        return _name;
    }

    protected void setName(String _name) {
        this._name = _name;
    }


    private String _name = "Entity";
}
