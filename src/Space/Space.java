package Space;
import Entity.Animal;
import Entity.Human;
import Entity.Plant;
import java.util.Vector;

public abstract class Space {

    public Space(){

    }

    public Human get_spaceLeader() {
        return _spaceLeader;
    }

    public void set_spaceLeader(Human _spaceLeader) {
        this._spaceLeader = _spaceLeader;
    }

    public Vector<Human> get_humanList() {
        return _humanList;
    }

    public void set_humanList(Vector<Human> _humanList) {
        this._humanList = _humanList;
    }

    public Vector<Plant> get_plantList() {
        return _plantList;
    }

    public void set_plantList(Vector<Plant> _plantList) {
        this._plantList = _plantList;
    }

    public Vector<Animal> get_animalList() {
        return _animalList;
    }

    public void set_animalList(Vector<Animal> _animalList) {
        this._animalList = _animalList;
    }

    private Human           _spaceLeader    = null;
    private Vector<Human>   _humanList      = new Vector<>();
    private Vector<Plant>   _plantList      = new Vector<>();
    private Vector<Animal>  _animalList     = new Vector<>();


}
