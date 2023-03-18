package ua.edu.khpi.model;

import ua.edu.khpi.storage.Storage;

public class User {

    private Storage userStorage;

    public User() {
    }

    public User(Storage userStorage) {
        this.userStorage = userStorage;
    }

    public Storage getUserStorage() {
        return userStorage;
    }

    public void setUserStorage(Storage userStorage) {
        this.userStorage = userStorage;
    }

    @Override
    public String toString() {
        return "User{" +
                "userStorage=" + userStorage +
                '}';
    }
}
