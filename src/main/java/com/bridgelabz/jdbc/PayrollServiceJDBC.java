package com.bridgelabz.jdbc;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PayrollServiceJDBC {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://root@localhost:3306/payroll_service", "root", "root");
            Statement stmt = con.createStatement();
            String sql =  "CREATE TABLE employee_payroll " +
                    "(id int unsigned not null auto_increment, " +
                    " name VARCHAR(255), " +
                    " salary Double, " +
                    " Start_Date date, " +
                    " PRIMARY KEY ( id ))";
            stmt.executeUpdate(sql);
            System.out.println("Created table in given database...");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
