import org.example.com.TestingDatabaseConnection.DatabaseConnection;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

// Test class for DatabaseConnection
public class DatabaseConnectionTest {

    DatabaseConnection db;

    @BeforeEach
    void setUp() {
        db = new DatabaseConnection();
        db.connect();
    }

    @AfterEach
    void tearDown() {
        db.disconnect();
    }

    @Test
    void testConnection() {
        assertTrue(db.isConnected());
    }

    @Test
    void testDisconnection() {
        db.disconnect();
        assertFalse(db.isConnected());
    }
}
