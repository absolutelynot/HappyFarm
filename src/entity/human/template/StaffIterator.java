package entity.human.template;

import java.util.HashMap;
import java.util.Iterator;

public class StaffIterator implements Iterator {

    public StaffIterator(Leader leader) {
        super();
        this.under = leader.getUnder();
        this.staffIterator = under.entrySet().iterator();
    }

    @Override
    public boolean hasNext() {
        return this.staffIterator.hasNext();
    }

    @Override
    public Object next() {
        return this.staffIterator.next();
    }

    private HashMap<Integer, Staff> under;
    private Iterator staffIterator;
}
