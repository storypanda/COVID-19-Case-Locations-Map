package com.asd.caselocationsmap.dao;

import com.asd.caselocationsmap.entity.Cases;

import java.sql.*;

public class CreateCasesSql {
    public void createCases(Cases cases) {
        try{
            String username = "asd";
            String password = "ASDpassword";
            String connectionUrl = "jdbc:mysql://aa1k7pic2tpxd6q.cn9vqfnivxwa.us-east-2.rds.amazonaws.com:3306/CovidMap";
            Connection conn = DriverManager.getConnection(connectionUrl, username, password);

            String sql = "insert into COVID19_Case (case_id, first_name, last_name, case_date, last_updated, location_postcode,location_suburb, location_latitude, location_longitude, location) values ('"+cases.getId()+"', '"+cases.getFirstName()+"', '"+cases.getLastName()+"', '"+cases.getCaseDate()+"', '"+cases.getLastUpdated()+"', '"+cases.getPostcode()+"', '"+cases.getSuburb()+"', '"+cases.getLat()+"', '"+cases.getLng()+"', '"+cases.getLocation()+"');";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error occurred at ConSql->createCases()");
        }
    }
}
