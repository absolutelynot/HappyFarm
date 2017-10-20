package Entity;


public abstract class Human extends Entity {
    public Human(){
        super();
    }
    public Human(String _name){
        super(_name);
    }
    public Human(String _name,  int level) {
        super(_name);
        this._level = level;
    }


    public int get_level() {
        return _level;
    }

    public void set_level(int _level) {
        this._level = _level;
    }

    public double get_salaryPerPeriod() {
        return _salaryPerPeriod;
    }

    public void set_salaryPerPeriod(double _salaryPerPeriod) {
        this._salaryPerPeriod = _salaryPerPeriod;
    }

    public Authority get_authority() {
        return _authority;
    }

    public void set_authority(Authority _authority) {
        this._authority = _authority;
    }

    private int         _level              = 0;
    private double      _salaryPerPeriod    = 0;
    private Authority   _authority          = Authority.NONE;


}
