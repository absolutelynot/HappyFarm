package entity;

public abstract class Entity {

    protected Entity(){

    }
    protected Entity(String name) {
        this.name = name;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }


    private String name = "entity";
}
