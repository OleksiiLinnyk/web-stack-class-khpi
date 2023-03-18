package ua.edu.khpi;

import ua.edu.khpi.model.User;
import ua.edu.khpi.storage.AmazonStorage;
import ua.edu.khpi.storage.LocalFileStorage;

public class Main {
    public static void main(String[] args) {
        User user1 = new User(LocalFileStorage.getInstance());
        User user2 = new User(AmazonStorage.getInstance());
        User user3 = new User(AmazonStorage.getInstance());


        System.out.println(user1);
        System.out.println(user2);
        System.out.println(user3);

        /*
         * OUTPUT
         * As you can see for user 2 and user 3 we have the same object returned of AmazonStorage
         */
//        User{userStorage=khpi.storage.LocalFileStorage@73d16e93}
//        User{userStorage=khpi.storage.AmazonStorage@659e0bfd}
//        User{userStorage=khpi.storage.AmazonStorage@659e0bfd}
    }
}
