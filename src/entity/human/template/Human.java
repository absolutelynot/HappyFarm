package entity.human.template;

import entity.Authority;
import entity.Entity;

public abstract class Human extends Entity {
    protected Human(){
        super();
    }
    protected Human(String name){
        super(name);
    }
    protected Human(String name,  int level, Authority authority) {
        super(name);
        this.level = level;
        this.authority = authority;
    }


    public int getLevel() {
        return level;
    }

    protected void setLevel(int level) {
        this.level = level;
    }

    public double getSalaryPerPeriod() {
        return salaryPerPeriod;
    }

    protected void setSalaryPerPeriod(double salaryPerPeriod) {
        this.salaryPerPeriod = salaryPerPeriod;
    }

    public Authority getAuthority() {
        return authority;
    }

    protected void setAuthority(Authority authority) {
        this.authority = authority;
    }

    private int level = 0;
    private double salaryPerPeriod = 0;
    private Authority authority = Authority.NONE;


}
