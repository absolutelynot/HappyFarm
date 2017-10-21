package Entity.Behavior;

import Entity.Entity;

public interface Growable {
    default String grow(){
        return "Growing";
    }
    default String grow(int weight){
        return "Growing";
    }
}
