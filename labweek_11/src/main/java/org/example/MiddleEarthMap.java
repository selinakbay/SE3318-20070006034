package org.example;

import java.util.HashMap;
import java.util.Map;

/**
 * Represents the geographical world of Middle-Earth.
 * Contains various locations and provides navigation between them based on predefined paths.
 */
public class MiddleEarthMap {
    /** A map storing possible navigation paths from one location to another. */
    private final Map<String, Map<String, Boolean>> navigationPaths;

    /**
     * Constructs a new MiddleEarthMap and initializes navigation paths.
     *
     * @comment This constructor was added to initialize the navigation paths.
     */
    public MiddleEarthMap() {
        navigationPaths = new HashMap<>();
        // Define paths from Shire
        Map<String, Boolean> shirePaths = new HashMap<>();
        shirePaths.put("Bree", false); // Not a secret passage
        navigationPaths.put("Shire", shirePaths);

        // Define paths from Bree
        Map<String, Boolean> breePaths = new HashMap<>();
        breePaths.put("Rivendell", false);
        breePaths.put("Minas Tirith", true); // Secret passage example
        navigationPaths.put("Bree", breePaths);

        // Define paths from Rivendell
        Map<String, Boolean> rivendellPaths = new HashMap<>();
        rivendellPaths.put("Moria", true); // Secret passage
        rivendellPaths.put("Lothlórien", false);
        navigationPaths.put("Rivendell", rivendellPaths);

        // Define paths from Mordor
        Map<String, Boolean> mordorPaths = new HashMap<>();
        mordorPaths.put("Mount Doom", true); // Secret passage to Mount Doom
        navigationPaths.put("Mordor", mordorPaths);

        // Define paths from Gondor
        Map<String, Boolean> gondorPaths = new HashMap<>();
        gondorPaths.put("Minas Tirith", false);
        navigationPaths.put("Gondor", gondorPaths);
    }

    /**
     * Navigates to a specified location.
     * This method now uses a map to determine if a path exists and if it's a secret passage.
     *
     * @param currentLocation The current location of the character.
     * @param destination The target location to navigate to.
     * @param isSecretPassageAttempt A boolean indicating if a secret passage attempt is made.
     * @comment This method was refactored to add Javadoc, fix FallThrough violation,
     * remove empty if block, remove redundant switch, and use a Map for navigation rules.
     */
    public void navigate(final String currentLocation, final String destination, final boolean isSecretPassageAttempt) {
        System.out.println("Attempting to navigate from " + currentLocation + " to " + destination + ".");

        if (navigationPaths.containsKey(currentLocation)) {
            Map<String, Boolean> pathsFromCurrent = navigationPaths.get(currentLocation);
            if (pathsFromCurrent.containsKey(destination)) {
                boolean requiresSecretPassage = pathsFromCurrent.get(destination);

                if (requiresSecretPassage && !isSecretPassageAttempt) {
                    System.out.println("Navigation to " + destination + " requires a secret passage, but none was attempted.");
                } else if (!requiresSecretPassage && isSecretPassageAttempt) {
                    System.out.println("Navigation to " + destination + " does not require a secret passage. Secret attempt ignored.");
                    System.out.println("Successfully navigated to " + destination + ".");
                } else {
                    System.out.println("Successfully navigated to " + destination + ".");
                }
            } else {
                System.out.println("No direct path from " + currentLocation + " to " + destination + ".");
            }
        } else {
            System.out.println("Unknown current location: " + currentLocation + ".");
        }

        // Example of a simple switch statement for location-specific actions,
        // ensuring each case has a break.
        switch (destination) {
            case "Mordor":
                System.out.println("Beware, the air is thick with shadow in Mordor.");
                break;
            case "Shire":
                System.out.println("Welcome to the peaceful Shire!");
                break;
            case "Rivendell":
                System.out.println("Elven wisdom awaits in Rivendell.");
                break;
            case "Gondor":
                System.out.println("The White City stands strong in Gondor.");
                break;
            case "Lothlórien":
                System.out.println("Enter the golden wood of Lothlórien.");
                break;
            default:
                System.out.println("Arrived at an uncharted location.");
                break;
        }
    }

    public void navigate(String mordor) {
        
    }
}
