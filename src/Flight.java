import java.util.Date;

public class Flight {
    String flightNumber;
    Date date;
    String source;
    String destination;
    Passenger[] passengers;
    int maxPassengers;
    int currentCount;

    public Flight(String flightNumber,Date date,String source, String destination, int maxPassengers,int currentCount) {

        this.flightNumber = flightNumber;
        this.date = date;
        this.source = source;
        this.destination = destination;
        this.maxPassengers = maxPassengers;
        this.passengers = new Passenger[maxPassengers];
        this.currentCount = 0;
    }
    public String getFlightNumber() {
        return flightNumber;
    }
    public String getDestination() {
        return destination;
    }
    public int getMaxPassengers() {
        return maxPassengers;
    }
    public int getCurrentCount() {
        return currentCount;
    }
    public void setCurrentCount(int currentCount) {
        this.currentCount = currentCount;
    }
    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public Passenger[] getPassengers() {
        return passengers;
    }
    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }
    public String getSource() {
        return source;
    }
    public void setSource(String source) {
        this.source = source;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void addPassenger(Passenger passenger) {
        if (currentCount < maxPassengers) {
            passengers[currentCount] = passenger;
            currentCount++;
            System.out.println("Passenger added to the flight.");
        } else {
            System.out.println("Sorry, the flight is filled.");
        }
    }
    public void bookFlight(int passportId) {
        for (int i = 0; i < passengers.length; i++){
            if (passengers != null && Passenger.getPassport_id() == passportId) {
                Passenger.bookFlight();
                System.out.println("Flight booked for passenger with Passport ID: " + passportId);
                return;
            }
        }
        System.out.println("Passenger with Passport ID " + passportId + " not found on this flight.");
    }
    public void cancelFlight(int passportId) {
        for (int i = 0; i < passengers.length; i++) {
            if (Passenger.getPassport_id() == passportId) {
                Passenger.cancelFlight();
                System.out.println("Flight canceled for Passenger with Passport ID: " + passportId);
                return;
            }
        }
        System.out.println("Passenger with Passport ID " + passportId + " not found on this flight.");
    }
    public void displayAllPassengers() {
        System.out.println("Passengers on Flight " + flightNumber + ":");
        for (int i = 0; i < passengers.length; i++) {
            if (passengers != null) {
                Passenger.displayInfo();
                System.out.println("***************************");
            }
        }
    }
    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", date=" + date +
                ", source='" + source + '\'' +
                ", destination='" + destination + '\'' +
                ", maxPassengers=" + maxPassengers +
                ", currentCount=" + currentCount +
                '}';
    }
}
