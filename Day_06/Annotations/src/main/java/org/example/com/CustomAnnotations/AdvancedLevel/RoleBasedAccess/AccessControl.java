package org.example.com.CustomAnnotations.AdvancedLevel.RoleBasedAccess;
import java.lang.reflect.Method;

//AccessControl class
public class AccessControl {

    //using executeMethod
    public static void executeMethod(User user, Object service, String methodName) {
        try {
            Method method = service.getClass().getMethod(methodName);

            if (method.isAnnotationPresent(RoleAllowed.class)) {
                String requiredRole = method.getAnnotation(RoleAllowed.class).value();

                if (!user.getRole().equals(requiredRole)) {
                    System.out.println("Access Denied! " + user.getUsername() + " does not have the required role.");
                    return;
                }
            }
            method.invoke(service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

