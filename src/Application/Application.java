package Application;

public abstract class Application {

    public Application() {

    }

    public void initiate() {
        System.out.println("Application Initiated!");
    }

    public void start() {
        System.out.println("Application Started!");
    }

    public void halt() {
        System.out.println("Application Halted!");
    }

    public void end() {
        System.out.println("Application Ended!");
    }

}

