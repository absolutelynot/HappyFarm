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
                "_name='" + _name + '\'' +
                ", _currentMoneyFlow=" + _currentMoneyFlow +
                '}';
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public double get_currentMoneyFlow() {
        return _currentMoneyFlow;
    }

    public void set_currentMoneyFlow(double _currentMoneyFlow) {
        this._currentMoneyFlow = _currentMoneyFlow;
    }


    public static Owner getInstance(){
        return _instance;
    }

    private String _name = "Owner";
    private double _currentMoneyFlow = 0;
    private static Owner _instance = new Owner();
}
