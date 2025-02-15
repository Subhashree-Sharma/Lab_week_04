import org.example.com.TestingPerformance.PerformanceTester;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import java.util.concurrent.TimeUnit;

// Test class for PerformanceTester
public class PerformanceTesterTest {

    PerformanceTester tester = new PerformanceTester();

    @Test
    // Fails if execution takes more than 2 seconds
    @Timeout(value = 2, unit = TimeUnit.SECONDS)

    void testLongRunningTask() {
        assertEquals("Task Completed", tester.longRunningTask());
    }
}
