package entity.animal.behavior;

public interface Speakable{
    default String speak(){
        return "Speaking";
    }
}
