package com.asd.caselocationsmap.dao;

import com.asd.caselocationsmap.entity.covidPtl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateCovidptlSQL {
    public void createcovidPtl(covidPtl tb) {
        try{
            String username = "asd";
            String password = "ASDpassword";
            String connectionUrl = "jdbc:mysql://aa1k7pic2tpxd6q.cn9vqfnivxwa.us-east-2.rds.amazonaws.com:3306/CovidMap";

            Connection conn = DriverManager.getConnection(connectionUrl, username, password);

            String sql = "insert into Covid19_PublicTestLocation (testLocation_id, ptl_street, ptl_suburb, open_time, close_time, ptl_name,ptl_tel, ptl_longitude, ptl_latitude) values ('"+tb.getId()+"', '"+tb.getPtlStreet()+"', '"+tb.getPtlSuburb()+"', '"+tb.getOpenTime()+"', '"+tb.getCloseTime()+"', '"+tb.getPtlName()+"', '"+tb.getPtlTel()+"', '"+tb.getPtlLongitude()+"', '"+tb.getPtlLatitude()+"');";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error occurred at ConSql->createcovidPtl()");
        }
    }
}
