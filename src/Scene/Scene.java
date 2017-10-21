package Scene;


import Space.Space;



public abstract class Scene {
    public Scene(){

    }

    public Scene(Space space) {
        this.boundSpace = space;
    }


    protected abstract void action();

    public void bindSpace(Space space){
        boundSpace = space;
    }

    public Space getBoundSpace() {
        return boundSpace;
    }


    private Space boundSpace;
    private String name = "";


}

