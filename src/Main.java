import application.*;
import entity.human.template.Staff;
import space.*;

public class Main {

    public static void main(String[] args) {
//        Application myApp= new MyApp();
//        myApp.initiate();
//        myApp.start();
        Staff
    }
}

class MyApp extends Application{
    MyApp() {
        super();
    }

    @Override
    public void initiate() {
        super.initiate();
        initiateResourcePool();
    }

    @Override
    public void start() {

    }

    @Override
    public void halt() {
    }

    @Override
    public void end() {

    }

    private void initiateResourcePool(){
        ResourcePool.getInstance().addSpace("Field", new Field());
        ResourcePool.getInstance().addSpace("Zoo", new Zoo());
    }
}