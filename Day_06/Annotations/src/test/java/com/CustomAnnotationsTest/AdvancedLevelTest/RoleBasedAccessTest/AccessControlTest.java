package com.CustomAnnotationsTest.AdvancedLevelTest.RoleBasedAccessTest;

import org.example.com.CustomAnnotations.AdvancedLevel.RoleBasedAccess.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AccessControlTest {

    @Test
    public void testAdminAccess() {
        User admin = new User("Subha", "ADMIN");
        SecureService service = new SecureService();

        assertDoesNotThrow(() -> AccessControl.executeMethod(admin, service, "adminTask"));
    }

    @Test
    public void testUserAccessDenied() {
        User user = new User("Priya", "USER");
        SecureService service = new SecureService();

        AccessControl.executeMethod(user, service, "adminTask");
    }

    @Test
    public void testGeneralTaskAccessible() {
        User user = new User("Namami", "USER");
        SecureService service = new SecureService();

        assertDoesNotThrow(() -> AccessControl.executeMethod(user, service, "generalTask"));
    }
}
