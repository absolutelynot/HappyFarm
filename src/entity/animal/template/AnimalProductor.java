package entity.animal.template;

import entity.Entity;
import entity.animal.behavior.AnimalBehavior;
import entity.animal.behavior.Speakable;

public abstract class AnimalProductor extends Entity implements AnimalBehavior{

    public AnimalProductor(AnimalBehavior animalBehavior) {
        super();
        this.animalBehavior = animalBehavior;
    }

    @Override
    public String fly() {
        return this.animalBehavior.fly();
    }

    @Override
    public String speak() {
        return this.animalBehavior.speak();
    }

    @Override
    public String move() {
        return this.animalBehavior.move();
    }

    @Override
    public String grow() {
        return this.animalBehavior.grow();
    }

    public String reproduct() {
        return this.getName() + "produced a new" + this.getName() + "!";
    }

    private AnimalBehavior animalBehavior;

}
