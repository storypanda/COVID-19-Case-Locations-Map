package com.asd.caselocationsmap.dao;



import com.asd.caselocationsmap.entity.vaccInjectLocation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateVaccInjectLocationSql {
    public void updatevaccInjectLocation(vaccInjectLocation vaccInjectLocation) {
        try{
            String username = "asd";
            String password = "Mypassword1@";
            String connectionUrl = "jdbc:mysql://103.149.46.76:3306/demodb";

            Connection conn = DriverManager.getConnection(connectionUrl, username, password);

            String sql = "update VaccInjectLocation set vacc_street = '"+vaccInjectLocation.getVaccStreet()+"', vacc_suburb = '"+vaccInjectLocation.getVaccSuburb()+"',is_available = '"+vaccInjectLocation.getIsAvailable()+"',remaining_vaccine = '"+vaccInjectLocation.getRemainingVaccine()+"',location_name = '"+vaccInjectLocation.getLocationName()+"',booking_website = '"+vaccInjectLocation.getBookingWebsite()+"',booking_tel = '"+vaccInjectLocation.getBookingTel()+"',location_longitude = '"+vaccInjectLocation.getLocationLongitude()+"',location_latitude = '"+vaccInjectLocation.getLocationLatitude()+"' where location_Id = '"+vaccInjectLocation.getId()+"'";
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(sql);
            conn.close();

        } catch (SQLException e) {
            System.out.println("Error occurred at updateVaccInjectLocation()");
        }
    }
}
