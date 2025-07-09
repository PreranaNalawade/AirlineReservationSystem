package airline;


import airline.BookingDAO;
import airline.FlightDAO;
import airline.Booking;
import airline.Flight;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FlightDAO flightDAO = new FlightDAO();
        BookingDAO bookingDAO = new BookingDAO();

        while (true) {
            System.out.println("\n--- Airline Reservation System ---");
            System.out.println("1. Add Flight");
            System.out.println("2. View All Flights");
            System.out.println("3. Book Ticket");
            System.out.println("4. Show Booking Statistics");
            System.out.println("4. Exit");

            System.out.print("Choose: ");
            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Source: ");
                    String src = sc.nextLine();
                    System.out.print("Destination: ");
                    String dst = sc.nextLine();
                    System.out.print("Seats: ");
                    int seats = sc.nextInt();
                    flightDAO.addFlight(new Flight(src, dst, seats));
                    break;

                case 2:
                    List<Flight> flights = flightDAO.getAllFlights();
                    for (Flight f : flights) {
                        System.out.println("ID: " + f.getId() + ", " + f.getSource() + " → " +
                                f.getDestination() + " | Seats: " + f.getSeats());
                    }
                    break;

                case 3:
                    System.out.print("Flight ID: ");
                    int fid = sc.nextInt(); sc.nextLine();
                    System.out.print("Passenger Name: ");
                    String name = sc.nextLine();

                    Flight flight = flightDAO.getFlightById(fid);
                    if (flight != null && flight.getSeats() > 0) {
                        bookingDAO.bookTicket(new Booking(fid, name));
                        flightDAO.updateSeats(fid, flight.getSeats() - 1);
                    } else {
                        System.out.println("Flight not found or no seats available.");
                    }
                    break;
                    
                case 4:
                    BookingStats stats = new BookingStats();
                    stats.printBookingStats();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    System.exit(0);
            }
        }
    }
}

