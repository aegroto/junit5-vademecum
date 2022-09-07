package junit5.vademecum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GroceryListWrongTest {
    GroceryList groceryList;

    /*
     * Wrong
     * There are multiple asserts, so it should be split in two different tests.
     */
    @Test
    void testNewItemAdding() {
        groceryList = new GroceryList();
        groceryList.addItem("Milk");
        assertEquals(1, groceryList.itemsCount());
        assertTrue(groceryList.hasItem("Milk"));
    }

    /*
     * Wrong
     * This test has no assertions. What are you verifying? Calling a method is not enough, you must define precise verification criteria.
     */
    @Test
    void testClear() {
        groceryList = new GroceryList();
        groceryList.clear();
    }
}
