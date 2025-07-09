package airline;


public class Flight {
    private int id;
    private String source;
    private String destination;
    private int seats;

    // Constructors
    public Flight(int id, String source, String destination, int seats) {
        this.id = id;
        this.source = source;
        this.destination = destination;
        this.seats = seats;
    }

    public Flight(String source, String destination, int seats) {
        this.source = source;
        this.destination = destination;
        this.seats = seats;
    }

    // Getters and Setters
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }
}
