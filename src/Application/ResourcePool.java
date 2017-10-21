package Application;

import Space.Space;
import java.util.HashMap;


public class ResourcePool {


    private static ResourcePool _instance = new ResourcePool();
    private ResourcePool(){

    }

    public static ResourcePool get_instance(){
        return _instance;
    }


    public Space addSpace(String name, Space space){
        return _spaces.put(name, space);
    }

    public Space getSpaceByName(String name) {
        return _spaces.get(name);
    }

    public boolean deleteSpace(String name){
        return _spaces.remove(name) != null;
    }

    public Iterable getAllSpaces(){
        return _spaces.values();
    }

    public void clearSpaces(){
        _spaces.clear();
    }

    private HashMap<String, Space> _spaces = new HashMap<>();

}
