package Scene;


import Space.Space;



public abstract class Scene {
    public Scene(){

    }

    public Scene(Space space) {
        this._boundSpace = space;
    }


    protected abstract void action();

    public void bindSpace(Space space){
        _boundSpace = space;
    }

    public Space get_boundSpace() {
        return _boundSpace;
    }


    private Space _boundSpace;
    private String _name = "";


}

