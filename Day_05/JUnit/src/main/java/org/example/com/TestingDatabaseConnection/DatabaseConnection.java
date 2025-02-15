package org.example.com.TestingDatabaseConnection;

public class DatabaseConnection {

    private boolean isConnected = false;

    //connects to the database
    public void connect() {
        isConnected = true;
        System.out.println("Database connected.");
    }

    //Disconnects from the database
    public void disconnect() {
        isConnected = false;
        System.out.println("Database disconnected.");
    }

    //Checks if the database is connected
    public boolean isConnected() {
        return isConnected;
    }
}

