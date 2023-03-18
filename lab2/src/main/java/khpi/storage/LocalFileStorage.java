package khpi.storage;

public final class LocalFileStorage implements Storage {

    private static LocalFileStorage instance;

    private LocalFileStorage() {

    }

    public static LocalFileStorage getInstance() {
        if (instance == null) {
            instance = new LocalFileStorage();
        }
        return instance;
    }


    @Override
    public void store() {
        System.out.println("Save file in local file storage");
    }
}
