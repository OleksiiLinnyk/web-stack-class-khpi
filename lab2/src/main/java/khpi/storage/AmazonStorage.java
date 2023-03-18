package khpi.storage;

public final class AmazonStorage implements Storage {

    private static AmazonStorage instance;

    private AmazonStorage() {

    }

    public static AmazonStorage getInstance() {
        if (instance == null) {
            instance = new AmazonStorage();
        }
        return instance;
    }

    @Override
    public void store() {
        System.out.println("Amazon S3 storage");
    }
}
