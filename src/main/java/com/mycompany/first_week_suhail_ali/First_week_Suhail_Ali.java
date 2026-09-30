
package com.mycompany.first_week_suhail_ali;
import java.util.Scanner;

public class First_week_Suhail_Ali {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- FIXTURE -----");
        System.out.println("Match 1: Team A vs Team B");
        System.out.println("Match 2: Team A vs Team C");
        System.out.println("Match 3: Team A vs Team D");
        System.out.println("Match 4: Team B vs Team C");
        System.out.println("Match 5: Team B vs Team D");
        System.out.println("Match 6: Team C vs Team D");

        String[] teams = {"A", "B", "C", "D"};

        int[] wins = new int[4];
        int[] draws = new int[4];
        int[] losses = new int[4];
        int[] points = new int[4];

        int[] goalsFor = new int[4];
        int[] goalsAgainst = new int[4];

        int aGoals;
        int bGoals;
        int cGoals;
        int dGoals;


        
        System.out.println("Match 1: Team A vs Team B");

        System.out.print("Team A goals: ");
        aGoals = scanner.nextInt();

        System.out.print("Team B goals: ");
        bGoals = scanner.nextInt();

        goalsFor[0] += aGoals;
        goalsAgainst[0] += bGoals;

        goalsFor[1] += bGoals;
        goalsAgainst[1] += aGoals;

        if (aGoals > bGoals) {

            wins[0]++;
            losses[1]++;
            points[0] += 3;

        } else if (bGoals > aGoals) {

            wins[1]++;
            losses[0]++;
            points[1] += 3;

        } else {

            draws[0]++;
            draws[1]++;

            points[0]++;
            points[1]++;
        }


        
        System.out.println("\nMatch 2: Team A vs Team C");

        System.out.print("Team A goals: ");
        aGoals = scanner.nextInt();

        System.out.print("Team C goals: ");
        cGoals = scanner.nextInt();

        goalsFor[0] += aGoals;
        goalsAgainst[0] += cGoals;

        goalsFor[2] += cGoals;
        goalsAgainst[2] += aGoals;

        if (aGoals > cGoals) {

            wins[0]++;
            losses[2]++;
            points[0] += 3;

        } else if (cGoals > aGoals) {

            wins[2]++;
            losses[0]++;
            points[2] += 3;

        } else {

            draws[0]++;
            draws[2]++;

            points[0]++;
            points[2]++;
        }


        
        System.out.println("\nMatch 3: Team A vs Team D");

        System.out.print("Team A goals: ");
        aGoals = scanner.nextInt();

        System.out.print("Team D goals: ");
        dGoals = scanner.nextInt();

        goalsFor[0] += aGoals;
        goalsAgainst[0] += dGoals;

        goalsFor[3] += dGoals;
        goalsAgainst[3] += aGoals;

        if (aGoals > dGoals) {

            wins[0]++;
            losses[3]++;
            points[0] += 3;

        } else if (dGoals > aGoals) {

            wins[3]++;
            losses[0]++;
            points[3] += 3;

        } else {

            draws[0]++;
            draws[3]++;

            points[0]++;
            points[3]++;
        }


        
        System.out.println("\nMatch 4: Team B vs Team C");

        System.out.print("Team B goals: ");
        bGoals = scanner.nextInt();

        System.out.print("Team C goals: ");
        cGoals = scanner.nextInt();

        goalsFor[1] += bGoals;
        goalsAgainst[1] += cGoals;

        goalsFor[2] += cGoals;
        goalsAgainst[2] += bGoals;

        if (bGoals > cGoals) {

            wins[1]++;
            losses[2]++;
            points[1] += 3;

        } else if (cGoals > bGoals) {

            wins[2]++;
            losses[1]++;
            points[2] += 3;

        } else {

            draws[1]++;
            draws[2]++;

            points[1]++;
            points[2]++;
        }


        
        System.out.println("\nMatch 5: Team B vs Team D");

        System.out.print("Team B goals: ");
        bGoals = scanner.nextInt();

        System.out.print("Team D goals: ");
        dGoals = scanner.nextInt();

        goalsFor[1] += bGoals;
        goalsAgainst[1] += dGoals;

        goalsFor[3] += dGoals;
        goalsAgainst[3] += bGoals;

        if (bGoals > dGoals) {

            wins[1]++;
            losses[3]++;
            points[1] += 3;

        } else if (dGoals > bGoals) {

            wins[3]++;
            losses[1]++;
            points[3] += 3;

        } else {

            draws[1]++;
            draws[3]++;

            points[1]++;
            points[3]++;
        }


        
        System.out.println("\nMatch 6: Team C vs Team D");

        System.out.print("Team C goals: ");
        cGoals = scanner.nextInt();

        System.out.print("Team D goals: ");
        dGoals = scanner.nextInt();

        goalsFor[2] += cGoals;
        goalsAgainst[2] += dGoals;

        goalsFor[3] += dGoals;
        goalsAgainst[3] += cGoals;

        if (cGoals > dGoals) {

            wins[2]++;
            losses[3]++;
            points[2] += 3;

        } else if (dGoals > cGoals) {

            wins[3]++;
            losses[2]++;
            points[3] += 3;

        } else {

            draws[2]++;
            draws[3]++;

            points[2]++;
            points[3]++;
        }


        
        int[] goalDifference = new int[4];

        for (int i = 0; i < 4; i++) {

            goalDifference[i] =
                    goalsFor[i] - goalsAgainst[i];
        }


       
        System.out.println("\n----- STANDINGS -----");

        for (int i = 0; i < 4; i++) {

            int matchesPlayed =
                    wins[i] + draws[i] + losses[i];

            System.out.println(
                    "Team " + teams[i]
                    + " | Matches: " + matchesPlayed
                    + " | Wins: " + wins[i]
                    + " | Draws: " + draws[i]
                    + " | Losses: " + losses[i]
                    + " | Points: " + points[i]
                    + " | Goal Difference: " + goalDifference[i]
            );
        }


        
        int champion = 0;

        for (int i = 1; i < 4; i++) {

            if (points[i] > points[champion]) {

                champion = i;

            } else if (points[i] == points[champion]
                    && goalDifference[i] > goalDifference[champion]) {

                champion = i;
            }
        }


        System.out.println(
                "\nTournament Champion: Team "
                + teams[champion]
        );

        scanner.close();
        
    }
}
        
        
        
    