package entity.animal.behavior;

public interface Movable {
    default String move(){
        return "Moving";
    }
}
