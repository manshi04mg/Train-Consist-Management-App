import java.util.LinkedHashSet;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create LinkedHashSet for train formation
        LinkedHashSet<String> trainFormation = new LinkedHashSet<>();

        // Adding bogies
        trainFormation.add("Engine");
        trainFormation.add("Sleeper");
        trainFormation.add("Cargo");
        trainFormation.add("Guard");

        // Adding duplicate intentionally
        trainFormation.add("Sleeper");

        System.out.println("\nTrain Formation (Insertion Order Preserved):");

        // Display formation
        System.out.println(trainFormation);

        System.out.println("\nTotal unique bogies: "
                + trainFormation.size());

    }
}
