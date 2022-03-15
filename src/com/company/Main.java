package com.company;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("testDB", "postgres", "123456");
//        db.createTable(conn, "Employee");
//        db.insert_row(conn, "Employee", "Hannah", "Singapore");
//        db.insert_row(conn, "Employee", "Daniel", "Indonesia");
//        db.insert_row(conn, "Employee", "Lily", "Thailand");
//        db.insert_row(conn, "Employee", "Nur", "Malaysia");
//        db.update_name(conn, "Employee", "Laila", "Lily");
//        db.insert_row(conn, "Employee", "Hannah", "Singapore");
//        db.search_by_name(conn, "Employee", "Nur");
        db.search_by_id(conn, "Employee", 2);
//        db.read_data(conn, "Employee");
    }
}
