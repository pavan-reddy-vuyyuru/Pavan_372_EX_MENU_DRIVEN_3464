import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);

        Flight flight = createSampleFlight();
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add a passenger to the flight");
            System.out.println("2. Book the flight using passport id");
            System.out.println("3. Cancel the flight using passport id");
            System.out.println("4. Display details of all passengers");
            System.out.println("5. Exit");

            System.out.print("Enter your choice (1-5): ");
            int choice = scanner.nextInt();
            if (choice > 5) {
                System.out.println("Invalid choice Please Try Again");
                break;
            } else if (choice == 5) {
                System.out.println("Thank You.....");
            }
            else {
                switch (choice) {
                    case 1:
                        addPassengerToFlight(scanner, flight);
                        break;
                    case 2:
                        bookFlight(scanner, flight);
                        break;
                    case 3:
                        cancelFlight(scanner, flight);
                        break;
                    case 4:
                        flight.displayAllPassengers();
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 5.");
                }
            }
        }
    }

        private static Flight createSampleFlight() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            Date date = null;
            try {
                date = dateFormat.parse("2023-01-01");
            } catch (ParseException e) {
                e.printStackTrace();
            }

            return new Flight("ABC123",date, "City A", "City B", 2,0);
        }

        private static void addPassengerToFlight(Scanner scanner, Flight flight) {
            System.out.print("Enter Passport ID: ");
            int passportId = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Enter First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Enter Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Enter Age: ");
            String age = scanner.nextLine();

            System.out.print("Enter Flight Fare: ");
            String flightFare = scanner.nextLine();

            Passenger newPassenger = new Passenger(passportId, firstName, lastName, age, flightFare, Passenger.hasBooked);
            flight.addPassenger(newPassenger);
        }

        private static void bookFlight(Scanner scanner, Flight flight) {
            System.out.print("Enter Passport ID to book the flight: ");
            int passportId = scanner.nextInt();
            flight.bookFlight(passportId);
        }

        private static void cancelFlight(Scanner scanner, Flight flight) {
            System.out.print("Enter Passport ID to cancel the flight: ");
            int passportId = scanner.nextInt();
            flight.cancelFlight(passportId);
        }
    }



