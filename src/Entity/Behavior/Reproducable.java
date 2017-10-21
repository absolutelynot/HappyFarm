package Entity.Behavior;

import Entity.Entity;
import java.util.Vector;

public interface Reproducable {
    default Entity reproduce(){
        return null;
    }

    default Vector<Entity> reproduceMany(int number) {
        return null;
    }
}
