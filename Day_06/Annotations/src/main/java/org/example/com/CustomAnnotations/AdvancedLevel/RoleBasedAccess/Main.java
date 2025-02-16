package org.example.com.CustomAnnotations.AdvancedLevel.RoleBasedAccess;

//main class
public class Main {
    public static void main(String[] args) {
        SecureService service = new SecureService();

        User admin = new User("Subha", "ADMIN");
        User user = new User("Priya", "USER");

        System.out.println("\nAdmin trying to access adminTask:");
        AccessControl.executeMethod(admin, service, "adminTask");

        System.out.println("\nUser trying to access adminTask:");
        AccessControl.executeMethod(user, service, "adminTask");

        System.out.println("\nUser trying to access generalTask:");
        AccessControl.executeMethod(user, service, "generalTask");
    }
}
