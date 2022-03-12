package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbFunctions {
    public Connection connect_to_db(String dbname, String user, String pass){
        Connection conn = null;
        try {
            Class.forName("org.postgresql.Driver");
            conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/" + dbname, user, pass);
            if(conn != null){
                System.out.println("Connection Established");
            }
            else {
                System.out.println("Connection Failed");
            }
        }catch (Exception e) {
            System.out.println(e);
        }
        return conn;
    }

    public void createTable(Connection conn, String table_name) {
        Statement statement;
        try {
            String query = " create table " + table_name + "(empid SERIAL, name varchar(200), address varchar(200), primary key(empid));";
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Table Created");
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    public void insert_row(Connection conn, String table_name, String name, String address) {
        Statement statement;
        try {
            String query = String.format("insert into %s(name, address) values('%s', '%s');", table_name, name, address);
            statement = conn.createStatement();
            statement.executeUpdate(query);
            System.out.println("Row Inserted!");
        }catch (Exception e) {
            System.out.println(e);
        }
    }

    public void read_data(Connection conn, String table_name) {
        Statement statement;
        ResultSet rs = null;
        try{
            String query = String.format("SELECT * FROM %s", table_name);
            statement = conn.createStatement();
            rs = statement.executeQuery(query);
            while(rs.next()){
                System.out.print(rs.getString("empID")+" ");
                System.out.print(rs.getString("name")+" ");
                System.out.println(rs.getString("address")+" ");
            }
        }catch (Exception e) {
            System.out.println(e);
        }
    }
}
