package Scene;

import Entity.Entity;
import Space.Space;

import java.util.Vector;

public abstract class Scene implements Runnable{
    public Scene(){

    }

    public Scene(Space space) {
        this._bindedSpace = space;
    }

    @Override
    public void run() {

    }

    public void bindSpace(Space space){
        _bindedSpace = space;
    }

    public Space get_bindedSpace() {
        return _bindedSpace;
    }

    public Vector<Entity> get_actors() {
        return _actors;
    }

    private Space _bindedSpace;
    private Vector<Entity> _actors = new Vector<>();

}

