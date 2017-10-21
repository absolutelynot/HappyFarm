package application;

import Space.Space;
import java.util.HashMap;

public class ResourcePool {

    private static ResourcePool instance = new ResourcePool();

    private ResourcePool(){

    }

    public static ResourcePool getInstance(){
        return instance;
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
