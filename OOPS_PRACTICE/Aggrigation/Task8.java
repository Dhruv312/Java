// Scenario 8: Travel Itinerary Planner
// Create a travel itinerary planning system where a trip consists of multiple destinations. The trip class contains a list of destination objects, representing an aggregation relationship.
import java.util.Scanner;
class Destination {
    private String name;
    private String country;
    private int durationInDays;

    public Destination(String name, String country, int durationInDays) {
        this.name = name;
        this.country = country;
        this.durationInDays = durationInDays;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public int getDurationInDays() {
        return durationInDays;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setDurationInDays(int durationInDays) {
        this.durationInDays = durationInDays;
    }

    public void setName(String name) {
        this.name = name;
    }

}

class Trip {
    private String tripName;
    private Destination[] destinations;
    private int destinationCount;

    public Trip(String tripName, int maxDestinations) {
        this.tripName = tripName;
        this.destinations = new Destination[maxDestinations];
        this.destinationCount = 0;
    }

    public void addDestination(Destination destination) {
        if (destinationCount < destinations.length) {
            destinations[destinationCount++] = destination;
        } else {
            System.out.println("Cannot add: Maximum number of destinations .");
        }
    }

    public void findDestination(String destinationName) {
        for (int i = 0; i < destinationCount; i++) {
            if (destinations[i].getName().equals(destinationName)) {
                System.out.println("Found: " + destinations[i].getName() + " ," + destinations[i].getCountry() + " ,"
                        + destinations[i].getDurationInDays());
                return;
            }
        }
        System.out.println("Destination with name " + destinationName + " not found.");
    }

    public void deleteDestination(String destinationName) {
        for (int i = 0; i < destinationCount; i++) {
            if (destinations[i].getName().equals(destinationName)) {
                for (int j = i; j < destinationCount - 1; j++) {
                    destinations[j] = destinations[j + 1];
                }
                destinations[--destinationCount] = null;
                System.out.println("Deleted destination with name " + destinationName);
                return;
            }
        }
        System.out.println("Destination with name " + destinationName + " not found.");
    }

    public void updateDestination(String destinationName){
        for (int i = 0; i < destinationCount; i++) {
            if (destinations[i].getName().equals(destinationName)){
                int choice;
                do{
                    Scanner sc = new Scanner(System.in);
                    System.out.println("1------------>Name");
                    System.out.println("2------------>Country");
                    System.out.println("3------------>durationInDays");  
                    System.out.println("0------------>exit");
                    System.out.println("Enter your choice :- ");
                    choice = sc.nextInt();

                    switch (choice) {
                        case 1: System.out.println("Enter the new Name:- ");
                                sc.nextLine();
                                String name = sc.nextLine();
                                destinations[i].setName(name);
                                break;
                        case 2: System.out.println("Enter the new Country :- ");
                                sc.nextLine();
                                String con = sc.nextLine();
                                destinations[i].setCountry(con);
                                break;
                        case 3: System.out.println("Enter the new durationInDays :- ");
                                sc.nextLine();
                                int day = sc.nextInt();
                                destinations[i].setDurationInDays(day);
                                break;    
                
                        case 0: break;            
                        default:System.out.println("Invailid Choice!!!");
                            break;
                    }
                } while (choice != 0);
                System.out.println("The duration is updated succesfully.");
                
                return;
            }
        }
    }

    public void displayDestinations() {
        System.out.println("Itinerary for trip " + tripName + ":");
        for (int i = 0; i < destinationCount; i++) {
            System.out.println(destinations[i].getName() + " ," + destinations[i].getCountry() + " ,"
                    + destinations[i].getDurationInDays());

        }
    }
}

public class Task8 {
    public static void main(String[] args) {
        Destination paris = new Destination("Paris", "France", 5);
        Destination rome = new Destination("Rome", "Italy", 4);
        Destination tokyo = new Destination("Tokyo", "Japan", 7);

        Trip trip = new Trip("European Adventure", 3);

        trip.addDestination(paris);
        trip.addDestination(rome);
        trip.addDestination(tokyo);

        trip.displayDestinations();

        trip.findDestination("Rome");

        trip.deleteDestination("Tokyo");

        trip.displayDestinations();
    }
}
