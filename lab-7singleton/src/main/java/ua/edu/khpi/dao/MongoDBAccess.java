package ua.edu.khpi.dao;

public final class MongoDBAccess implements DBAccess {

    private static MongoDBAccess instance;

    private MongoDBAccess() {

    }
    public static MongoDBAccess getInstance() {
        if (instance == null) {
            instance = new MongoDBAccess();
        }
        return instance;
    }
    @Override
    public void access() {
        System.out.println("Accessed to MongoDB");
        System.out.println("Executed using instance " + instance);
    }
}
