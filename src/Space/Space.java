package Space;
import Entity.Animal;
import Entity.Human;
import Entity.Plant;

import java.util.HashMap;


public abstract class Space {

    Space(){

    }

    public Human getSpaceLeader() {
        return _spaceLeader;
    }

    public void setSpaceLeader(Human _spaceLeader) {
        this._spaceLeader = _spaceLeader;
    }

    public Human addHuman(String name, Human human){return _humanList.put(name,human);}
    public Human deleteHuman(String name){return _humanList.remove(name);}
    public Plant addPlant(String name, Plant plant){return _plantList.put(name,plant);}
    public Plant deletePlant(String name){return _plantList.remove(name);}
    public Animal addAnimal(String name, Animal animal){return _animalList.put(name,animal);}
    public Animal deleteAnimal(String name){return _animalList.remove(name);}


    private Human                   _spaceLeader    = null;
    private HashMap<String, Human>  _humanList      = new HashMap<>();
    private HashMap<String, Plant>  _plantList      = new HashMap<>();
    private HashMap<String, Animal> _animalList     = new HashMap<>();


}
