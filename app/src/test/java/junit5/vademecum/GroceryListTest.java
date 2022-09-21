package junit5.vademecum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GroceryListTest {
    GroceryList groceryList;

    @Test
    void testItemsCount_whenOneItemIsAdded() {
        // Setup
        groceryList = new GroceryList();
        // Execute
        groceryList.addItem("Milk");
        // Verify
        assertEquals(1, groceryList.itemsCount());
    }

    /*
     * In some cases two phases may be compacted into a single block of code.
     * This is not necessarily wrong, and very common as well, as soon as the
     * structure of the test is clear.
     */
    @Test
    void testHasItem_withExistingItem() {
        // Setup
        groceryList = new GroceryList();
        groceryList.addItem("Milk");
        // Execute and Verify
        assertTrue(groceryList.hasItem("Milk"));
    }

    @Test
    void testItemsCount_whenTwoItemsAreAdded() {
        // Setup
        groceryList = new GroceryList();
        // Execute
        groceryList.addItem("Milk");
        groceryList.addItem("Bread");
        // Verify
        assertEquals(2, groceryList.itemsCount());
    }
}
