package entity.animal.behavior;

import entity.Entity;
import java.util.Vector;

public interface Reproducable {
    default Entity reproduce(){
        return null;
    }

    default Vector<Entity> reproduceMany(int number) {
        return null;
    }
}
