package Space;
import Entity.Animal;
import Entity.Human;
import Entity.Plant;

import java.util.HashMap;


public abstract class Space {

    Space(){

    }

    public Human getSpaceLeader() {
        return spaceLeader;
    }

    public void setSpaceLeader(Human _spaceLeader) {
        this.spaceLeader = _spaceLeader;
    }

    public Human addHuman(String name, Human human){return humanList.put(name,human);}
    public Human deleteHuman(String name){return humanList.remove(name);}
    public void clearHumans(){
        humanList.clear();}
    public Plant addPlant(String name, Plant plant){return plantList.put(name,plant);}
    public Plant deletePlant(String name){return plantList.remove(name);}
    public void clearPlants(){
        plantList.clear();}
    public Animal addAnimal(String name, Animal animal){return animalList.put(name,animal);}
    public Animal deleteAnimal(String name){return animalList.remove(name);}
    public void clearAnimals(){
        animalList.clear();}


    private Human spaceLeader = null;
    private HashMap<String, Human> humanList = new HashMap<>();
    private HashMap<String, Plant> plantList = new HashMap<>();
    private HashMap<String, Animal> animalList = new HashMap<>();


}
