import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

// Bogie class
class Bogie
{
    String name;
    int capacity;

    // Constructor
    Bogie(String name, int capacity)
    {
        this.name = name;
        this.capacity = capacity;
    }

    // Display method
    public String toString()
    {
        return name + " - Capacity: " + capacity;
    }
}

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create list of bogies
        List<Bogie> passengerBogies = new ArrayList<>();

        // Add bogies
        passengerBogies.add(new Bogie("Sleeper",72));
        passengerBogies.add(new Bogie("AC Chair",54));
        passengerBogies.add(new Bogie("First Class",24));

        System.out.println("\nBefore Sorting:");
        for(Bogie b : passengerBogies)
        {
            System.out.println(b);
        }

        // Sorting using Comparator
        passengerBogies.sort(
                Comparator.comparingInt(b -> b.capacity)
        );

        System.out.println("\nAfter Sorting (by Capacity):");

        for(Bogie b : passengerBogies)
        {
            System.out.println(b);
        }

    }
}
