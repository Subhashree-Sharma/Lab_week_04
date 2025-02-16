package org.example.com.AdvancedLevel.DependencyInjectionUsingReflection;

//service interface
interface Service {
    void serve();
}

//service Implementation
class ServiceImpl implements Service {
    @Override
    public void serve() {
        System.out.println("Service is serving...");
    }
}

//client class with a dependency
public class Client {
    @Inject
    private Service service;

    //performTask method
    public void performTask() {
        if (service != null) {
            service.serve();
        } else {
            System.out.println("Service not injected!");
        }
    }

    //getter for testing
    public Service getService() {
        return service;
    }
}
