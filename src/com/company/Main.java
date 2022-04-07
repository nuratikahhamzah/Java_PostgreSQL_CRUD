package com.company;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        DbFunctions db = new DbFunctions();
        Connection conn = db.connect_to_db("InventorySystem", "postgres", "123456");

//        db.createTable(conn, "Employee");
//        db.insert_row(conn, "Employee", "Hannah", "Singapore");
//        db.insert_row(conn, "Employee", "Daniel", "Indonesia");
//        db.insert_row(conn, "Employee", "Lily", "Thailand");
//        db.insert_row(conn, "Employee", "Nur", "Malaysia");
//        db.update_name(conn, "Employee", "Laila", "Lily");
//        db.insert_row(conn, "Employee", "Hannah", "Singapore");
//        db.search_by_name(conn, "Employee", "Nur");
//        db.search_by_id(conn, "Employee", 2);
//        db.delete_row_by_name(conn, "Employee","Hannah" );
//        db.delete_row_by_ID(conn, "Employee", 8);
//        db.read_data(conn, "Employee");
//        db.delete_table(conn, "Employee");

        /*Table for Inventory Management System*/
        db.createTable(conn, "ItemCategory");
        db.createTable(conn, "ItemMaster");
        db.createTable(conn, "Request_tbl");
        db.createTable(conn, "Users_tbl");
    }
}
