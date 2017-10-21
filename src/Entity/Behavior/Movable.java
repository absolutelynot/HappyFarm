package Entity.Behavior;

public interface Movable {
    default String move(){
        return "Moving";
    }
}
