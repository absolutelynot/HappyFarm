package entity.human.template;

public class Employee extends Staff {

    public Employee() {
    }

    public Employee(String name) {
        super(name);
    }

    @Override
    public void addStaff(Staff staff) {
        System.out.println(NO_POWER_ERR_MSG);
    }

    @Override
    public void removeStaff(Staff staff) {
        System.out.println(NO_STAFF_ERR_MSG);
    }

    @Override
    public Staff getStaffByID(int id) {
        System.out.println(NO_POWER_ERR_MSG);
        return null;
    }

    private static String NO_STAFF_ERR_MSG = "Employee doesn't have under staff.";
    private static String NO_POWER_ERR_MSG = "Employee can't have under staff.";

}
