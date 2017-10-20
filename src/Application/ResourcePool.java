package Application;

public class ResourcePool {


    private static ResourcePool _instance = new ResourcePool();
    private ResourcePool(){

    }

    public static ResourcePool get_instance(){
        return _instance;
    }


}
