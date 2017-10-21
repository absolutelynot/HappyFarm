package Application;

/**
 *
 */
public class Owner {

    private Owner(){

    }

    @Override
    public String toString() {
        return "Owner{" +
                "name='" + name + '\'' +
                ", currentMoneyFlow=" + currentMoneyFlow +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCurrentMoneyFlow() {
        return currentMoneyFlow;
    }

    public void setCurrentMoneyFlow(double currentMoneyFlow) {
        this.currentMoneyFlow = currentMoneyFlow;
    }


    public static Owner getInstance(){
        return instance;
    }

    private String name = "Owner";
    private double currentMoneyFlow = 0;
    private static Owner instance = new Owner();
}
