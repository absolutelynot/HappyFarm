package Entity.Behavior;

public interface Speakable{
    default String speak(){
        return "Speaking";
    }
}
