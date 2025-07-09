package airline;

import airline.Flight;
import airline.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class FlightDAO {

    public void addFlight(Flight flight) {
        try (Connection con = DBConnection.getConnection()) {
            String query = "INSERT INTO flights(source, destination, seats) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, flight.getSource());
            ps.setString(2, flight.getDestination());
            ps.setInt(3, flight.getSeats());
            ps.executeUpdate();
            System.out.println("Flight added successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Flight> getAllFlights() {
        List<Flight> flights = new ArrayList<>();
        try (Connection con = DBConnection.getConnection()) {
            String query = "SELECT * FROM flights";
            ResultSet rs = con.createStatement().executeQuery(query);
            while (rs.next()) {
                flights.add(new Flight(
                        rs.getInt("id"),
                        rs.getString("source"),
                        rs.getString("destination"),
                        rs.getInt("seats")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return flights;
    }

    public Flight getFlightById(int id) {
        try (Connection con = DBConnection.getConnection()) {
            String query = "SELECT * FROM flights WHERE id=?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                return new Flight(rs.getInt("id"), rs.getString("source"),
                        rs.getString("destination"), rs.getInt("seats"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void updateSeats(int id, int seats) {
        try (Connection con = DBConnection.getConnection()) {
            String query = "UPDATE flights SET seats = ? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, seats);
            ps.setInt(2, id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
