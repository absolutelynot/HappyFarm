package Entity.AnimalTemplates;


import Entity.Animal;
import Entity.Entity;

public class Dog extends Animal{

    public Dog(){
        super();
    }

    @Override
    public String fly() {
        return null;
    }


    @Override
    public String move() {
        return "Running Fast";
    }

    @Override
    public Entity reproduce() {
        return new Dog();
    }

    @Override
    public String speak() {
        return "Woof Woof";
    }
}
