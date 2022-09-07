package junit5.vademecum;

import java.util.HashSet;
import java.util.Set;

public class GroceryList {
    private Set<String> items;

    public GroceryList() {
        this.items = new HashSet<>();
    }

    public void addItem(String newItem) {
        boolean notPresent = this.items.add(newItem);
        if(!notPresent) {
            throw new UnsupportedOperationException();
        }
    }

    public int itemsCount() {
        return this.items.size();
    }

    public void clear() {
        this.items.clear();
    }
}
