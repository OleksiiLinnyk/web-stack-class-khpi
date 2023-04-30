package ua.edu.khpi;

import ua.edu.khpi.dao.DBAccess;
import ua.edu.khpi.dao.MongoDBAccess;
import ua.edu.khpi.dao.PostgreSQLAccess;

public class Main {
    public static void main(String[] args) {
        DBAccess access1 = MongoDBAccess.getInstance();
        DBAccess access2 = MongoDBAccess.getInstance();
        access1.access();
        access2.access();

//        Accessed to MongoDB
//        Executed using instance ua.edu.khpi.dao.MongoDBAccess@6cd8737
//        Accessed to MongoDB
//        Executed using instance ua.edu.khpi.dao.MongoDBAccess@6cd8737

        DBAccess access3 = PostgreSQLAccess.getInstance();
        DBAccess access4 = PostgreSQLAccess.getInstance();
        DBAccess access5 = PostgreSQLAccess.getInstance();
        access3.access();
        access4.access();
        access5.access();

//        Accessed to PostgreSQL
//        Executed using instance ua.edu.khpi.dao.PostgreSQLAccess@13969fbe
//        Accessed to PostgreSQL
//        Executed using instance ua.edu.khpi.dao.PostgreSQLAccess@13969fbe
//        Accessed to PostgreSQL
//        Executed using instance ua.edu.khpi.dao.PostgreSQLAccess@13969fbe


//        The same hash 6cd8737 and 13969fbe for objects which means we are using singleton

    }
}