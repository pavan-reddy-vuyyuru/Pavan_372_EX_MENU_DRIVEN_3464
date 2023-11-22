public class Passenger {
    static int passport_id;
    static String firstName;
     static String lastName;
    static String age;
   static String flightFare;
    static boolean hasBooked;

    public Passenger(int passport_id,String firstName,String lastName,String age,String flightFare,boolean hasBooked)
    {
        this.passport_id = passport_id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.flightFare = flightFare;
        this.hasBooked = hasBooked;

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAge() {
        return age;
    }

    public String getFlightFare() {
        return flightFare;
    }

    public boolean isHasBooked() {
        return hasBooked;
    }

    public void setHasBooked(boolean hasBooked) {
        this.hasBooked = hasBooked;
    }

    public void setFlightFare(String flightFare) {
        this.flightFare = flightFare;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static int getPassport_id() {
        return passport_id;
    }

    public void setPassport_id(int passport_id) {
        this.passport_id = passport_id;
    }

    public static void bookFlight() {
        hasBooked = true;
        System.out.println("---------------------------------");
        System.out.println("Flight booked for " + firstName);
        System.out.println("---------------------------------");
    }
    public static void cancelFlight(){
        hasBooked = false;
        System.out.println("---------------------------------");
        System.out.println("Flight Cancelled for "+ firstName);
        System.out.println("---------------------------------");
    }
    public static void displayInfo(){
        System.out.println("------------------ Passenger Info ----------------");
        System.out.println("Passport ID: " + passport_id);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name:" +  lastName);
        System.out.println("Age: " + age);
        System.out.println("Flight Fare: $" + flightFare);
        String confirmation = hasBooked ? "Booked" : "Not Booked";
        System.out.println("Booking Status: " + confirmation);
    }
    @Override
    public String toString() {
        return "Passenger{" +
                "passportId=" + passport_id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", flightFare=" + flightFare +
                ", hasBooked=" + hasBooked +
                '}';
    }
}
