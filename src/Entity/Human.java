package Entity;


public class Human extends Entity {
    public Human(){
        super();
    }
    public Human(String _name){
        super(_name);
    }
    public Human(String _name, int age, int level) {
        super(_name);
        this._age = age;
        this._level = level;
    }

    private int _age = 18;
    private int _level = 0;


}
