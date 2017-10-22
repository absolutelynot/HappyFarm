package entity.human.template;

import java.util.HashMap;
import java.util.Iterator;

public class Leader extends Staff {

    private HashMap<Integer, Staff> under;

    public Leader(String name) {
        super(name);
        this.under = new HashMap<Integer, Staff>();
    }

    public int getUnderNum() {
        return under.size();
    }

    protected HashMap<Integer, Staff> getUnder() {
        return this.under;
    }

    public Iterator iterator() {
        return new StaffIterator(this);
    }

    @Override
    public void addStaff(Staff staff) {
        if (this.under.get(staff.getStaffID()) == null) {
            this.under.put(staff.getStaffID(), staff);
        }
        else {
            System.out.println("This staff has already existed.");
        }
    }

    @Override
    public void removeStaff(Staff staff) {
        this.under.remove(staff.getStaffID());
    }

    @Override
    public Staff getStaffByID(int id) {
        return this.under.get(id);
    }

}
