package Entity;


public abstract class Human extends Entity {
    protected Human(){
        super();
    }
    protected Human(String _name){
        super(_name);
    }
    protected Human(String _name,  int level, Authority authority) {
        super(_name);
        this._level = level;
        this._authority = authority;
    }


    public int getLevel() {
        return _level;
    }

    protected void setLevel(int _level) {
        this._level = _level;
    }

    public double getSalaryPerPeriod() {
        return _salaryPerPeriod;
    }

    protected void setSalaryPerPeriod(double _salaryPerPeriod) {
        this._salaryPerPeriod = _salaryPerPeriod;
    }

    public Authority getAuthority() {
        return _authority;
    }

    protected void setAuthority(Authority _authority) {
        this._authority = _authority;
    }

    private int         _level              = 0;
    private double      _salaryPerPeriod    = 0;
    private Authority   _authority          = Authority.NONE;


}
