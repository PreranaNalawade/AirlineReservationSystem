package airline;

import java.sql.Timestamp;

public class Booking {
    private int id;
    private int flightId;
    private String passengerName;
    private Timestamp bookingTime;

    public Booking(int flightId, String passengerName) {
        this.flightId = flightId;
        this.passengerName = passengerName;
    }

    public Booking(int id, int flightId, String passengerName, Timestamp bookingTime) {
        this.id = id;
        this.flightId = flightId;
        this.passengerName = passengerName;
        this.bookingTime = bookingTime;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public int getFlightId() { return flightId; }
    public void setFlightId(int flightId) { this.flightId = flightId; }

    public String getPassengerName() { return passengerName; }
    public void setPassengerName(String passengerName) { this.passengerName = passengerName; }

    public Timestamp getBookingTime() { return bookingTime; }
    public void setBookingTime(Timestamp bookingTime) { this.bookingTime = bookingTime; }
}
