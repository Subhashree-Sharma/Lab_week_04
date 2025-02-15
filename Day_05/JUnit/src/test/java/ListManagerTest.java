import org.example.com.TestingListOperations.ListManager;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

//Test class for ListManager
public class ListManagerTest {

    ListManager listManager = new ListManager();

    @Test
    void testAddElement() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 5);
        // Check if 5 is added
        assertTrue(list.contains(5));
    }

    @Test
    void testRemoveElement() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        listManager.removeElement(list, 10);
        // Check if 10 is removed
        assertFalse(list.contains(10));
    }

    @Test
    void testGetSize() {
        List<Integer> list = new ArrayList<>();
        listManager.addElement(list, 1);
        listManager.addElement(list, 2);
        //check size after adding elements
        assertEquals(2, listManager.getSize(list));
        listManager.removeElement(list, 1);
        //check size after removal
        assertEquals(1, listManager.getSize(list));
    }
}
