package airline;

import airline.Booking;
import airline.DBConnection;

import java.sql.*;

public class BookingDAO {

    public void bookTicket(Booking booking) {
        try (Connection con = DBConnection.getConnection()) {
            String query = "INSERT INTO bookings(flight_id, passenger_name) VALUES (?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, booking.getFlightId());
            ps.setString(2, booking.getPassengerName());
            ps.executeUpdate();
            System.out.println("Booking successful.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
