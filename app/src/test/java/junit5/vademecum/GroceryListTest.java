package junit5.vademecum;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class GroceryListTest {
    GroceryList groceryList;

    @Test
    void testItemsCount_whenOneItemIsAdded() {
        // Arrange
        groceryList = new GroceryList();
        // Act
        groceryList.addItem("Milk");
        // Assert
        assertEquals(1, groceryList.itemsCount());
    }

    /*
     * In some cases two phases may be compacted into a single block of code.
     * This is not necessarily wrong, and very common as well, as soon as the
     * structure of the test is clear.
     */
    @Test
    void testHasItem_withExistingItem() {
        // Arrange
        groceryList = new GroceryList();
        groceryList.addItem("Milk");
        // Act and Assert
        assertTrue(groceryList.hasItem("Milk"));
    }

    @Test
    void testItemsCount_whenTwoItemsAreAdded() {
        // Arrange
        groceryList = new GroceryList();
        // Act
        groceryList.addItem("Milk");
        groceryList.addItem("Bread");
        // Assert
        assertEquals(2, groceryList.itemsCount());
    }
}
