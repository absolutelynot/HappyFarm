package entity.animal.behavior;

public interface Flyable{
    default String fly(){
        return "Flying";
    }
}
