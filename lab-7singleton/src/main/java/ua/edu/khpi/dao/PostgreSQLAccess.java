package ua.edu.khpi.dao;

public final class PostgreSQLAccess implements DBAccess {

    private static PostgreSQLAccess instance;

    private PostgreSQLAccess() {

    }

    public static PostgreSQLAccess getInstance() {
        if (instance == null) {
            instance = new PostgreSQLAccess();
        }
        return instance;
    }
    @Override
    public void access() {
        System.out.println("Accessed to PostgreSQL");
        System.out.println("Executed using instance " + instance);
    }
}
