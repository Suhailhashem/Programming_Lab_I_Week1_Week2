
package com.mycompany.second_week_project_suhail_ali;

import java.util.Scanner;

public class Second_Week_Project_Suhail_Ali {

    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // 1. Ask how many stops
        System.out.print("How many stops are there? ");
        int stopCount = scanner.nextInt();

        scanner.nextLine();

        
        String[] stopNames = new String[stopCount];
        int[] boarding = new int[stopCount];
        int[] alighting = new int[stopCount];
        int[] occupancy = new int[stopCount];

        
        System.out.print("Enter bus capacity: ");
        int capacity = scanner.nextInt();

        scanner.nextLine();

        
        for (int i = 0; i < stopCount; i++) {

            System.out.println("\nStop " + (i + 1));

            System.out.print("Enter stop name: ");
            stopNames[i] = scanner.nextLine();

            System.out.print("Passengers boarding: ");
            boarding[i] = scanner.nextInt();

            System.out.print("Passengers alighting: ");
            alighting[i] = scanner.nextInt();

            scanner.nextLine();
        }

        
        int currentPassengers = 0;
        int overCapacityCount = 0;
        int totalOccupancy = 0;

        int busiestIndex = 0;

        System.out.println("\n----- ROUTE -----");

        
        for (int i = 0; i < stopCount; i++) {

            currentPassengers =
                    currentPassengers + boarding[i] - alighting[i];

            // Prevent negative occupancy
            if (currentPassengers < 0) {

                System.out.println(
                        "Data error at " + stopNames[i]
                        + ": more passengers are getting off than are on the bus."
                );

                currentPassengers = 0;
            }

            occupancy[i] = currentPassengers;

            totalOccupancy = totalOccupancy + currentPassengers;

            // Capacity check
            if (currentPassengers > capacity) {

                System.out.println(
                        "Warning: Bus is over capacity at "
                        + stopNames[i] + "!"
                );

                overCapacityCount++;
            }

            // Find busiest stop
            if (boarding[i] > boarding[busiestIndex]) {
                busiestIndex = i;
            }

            // Print current stop
            System.out.println(
                    stopNames[i]
                    + " | Boarding: " + boarding[i]
                    + " | Alighting: " + alighting[i]
                    + " | Occupancy: " + occupancy[i]
            );
        }

        // 4. Statistics
        double average =
                (double) totalOccupancy / stopCount;

        System.out.println("\n----- STATISTICS -----");

        System.out.println(
                "Busiest stop: " + stopNames[busiestIndex]
        );

        System.out.println(
                "Average occupancy: " + average
        );

        System.out.println(
                "Stops over capacity: " + overCapacityCount
        );

        // Final occupancy check
        if (currentPassengers != 0) {

            System.out.println(
                    "Warning: " + currentPassengers
                    + " passengers still on the bus after the final stop."
            );

        } else {

            System.out.println(
                    "All passengers left the bus."
            );
        }

        scanner.close();
    }
}
        
        
        
    
