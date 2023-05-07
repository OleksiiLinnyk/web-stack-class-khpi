package ua.edu.khpi;

import ua.edu.khpi.builder.Builder;
import ua.edu.khpi.builder.MySQLQueryBuilder;

public class Main {
    public static void main(String[] args) {
        Builder builder = new MySQLQueryBuilder();
        String mysqlQuery = builder.limit(10)
                .select("*")
                .where("name = some_name")
                .build();

        System.out.println(mysqlQuery);
//        MYSQL query: SELECT * FROM name = some_name LIMIT 10

        Builder builder1 = new MySQLQueryBuilder();
        String mysqlQuery1 = builder1
                .select("*")
                .where("name = some_name")
                .build();
        System.out.println(mysqlQuery1);
//        Query without limit
//        MYSQL query: SELECT * FROM name = some_name

        Builder builder2 = new MySQLQueryBuilder();
        String postgreQuery = builder2.limit(5)
                .select("firstName, lastName")
                .where("name = some_name")
                .build();

        System.out.println(postgreQuery);
//        MYSQL query: SELECT firstName, lastName FROM name = some_name LIMIT 5
    }
}