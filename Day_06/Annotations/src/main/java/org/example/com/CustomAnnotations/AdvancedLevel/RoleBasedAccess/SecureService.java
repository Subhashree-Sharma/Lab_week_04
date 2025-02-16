package org.example.com.CustomAnnotations.AdvancedLevel.RoleBasedAccess;
//SecureService class
public class SecureService {

    @RoleAllowed("ADMIN")
    public void adminTask() {
        System.out.println("Admin Task Executed!");
    }

    public void generalTask() {
        System.out.println("General Task Executed!");
    }
}
