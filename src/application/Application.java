package application;

public abstract class Application {

    public Application() {

    }

    public void initiate() {
        System.out.println("application Initiated!");
    }

    public void start() {
        System.out.println("application Started!");
    }

    public void halt() {
        System.out.println("application Halted!");
    }

    public void end() {
        System.out.println("application Ended!");
    }

}

