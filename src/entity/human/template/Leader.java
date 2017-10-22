package entity.human.template;

import com.sun.xml.internal.bind.v2.model.core.ID;

import java.util.HashMap;

public class Leader extends Staff {

    private HashMap<Integer, Staff> unders;

    public Leader(String name) {
        super(name);
        this.unders = new HashMap<Integer, Staff>();
    }

    @Override
    public void addStaff(Staff staff) {
        if (this.unders.get(staff.getStaffID()) == null) {
            this.unders.put(staff.getStaffID(), staff);
        }
        else {
            System.out.println("This staff has already existed.");
        }
    }

    @Override
    public void removeStaff(Staff staff) {
        this.unders.remove(staff.getStaffID());
    }

    @Override
    public Staff getStaffByID(int id) {
        return this.unders.get(id);
    }
}
