package entity.human.template;

public abstract class Staff extends Human{

    public Staff() {
        super();
    }

    public Staff(String name) {
        super(name);
        this.staffID = STAFF_NUM++;
    }

    public int getStaffID() {
        return staffID;
    }


    public abstract void addStaff (Staff staff);
    public abstract void removeStaff (Staff staff);
    public abstract Staff getStaffByID(int id);

    protected int staffID;
    private static int STAFF_NUM;

    static {
        STAFF_NUM = 0;
    }

}
