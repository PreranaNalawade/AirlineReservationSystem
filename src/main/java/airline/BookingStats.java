package airline;


import airline.Booking;
import airline.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BookingStats {

    public List<Booking> getAllBookings() {
        List<Booking> list = new ArrayList<>();

        try (Connection con = DBConnection.getConnection()) {
            String query = "SELECT * FROM bookings ORDER BY booking_time DESC";
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);

            while (rs.next()) {
                Booking booking = new Booking(
                        rs.getInt("id"),
                        rs.getInt("flight_id"),
                        rs.getString("passenger_name"),
                        rs.getTimestamp("booking_time")
                );
                list.add(booking);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return list;
    }

    public void printBookingStats() {
        List<Booking> bookings = getAllBookings();
        System.out.println("\n--- Booking Statistics ---");
        for (Booking b : bookings) {
            System.out.println("Booking ID: " + b.getId() +
                    ", Flight ID: " + b.getFlightId() +
                    ", Passenger: " + b.getPassengerName() +
                    ", Time: " + b.getBookingTime());
        }
    }
}
