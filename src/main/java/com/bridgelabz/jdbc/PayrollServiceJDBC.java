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
            ResultSet rs = stmt.executeQuery("show databases");
            while (rs.next()) {
                System.out.println(rs.getString(1));
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
