package junit5.vademecum;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
