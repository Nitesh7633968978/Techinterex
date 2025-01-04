import java.util.Scanner;

public class SimpleVotingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize votes for candidates
        int candidate1Votes = 0;
        int candidate2Votes = 0;

        System.out.println("Welcome to the Simple Voting System!");
        System.out.println("Vote for your candidate:");
        System.out.println("1. Candidate 1");
        System.out.println("2. Candidate 2");
        System.out.println("Enter 0 to finish voting and view results.");

        while (true) {
            System.out.print("Enter your vote (1 or 2, or 0 to finish): ");
            int vote = scanner.nextInt();

            if (vote == 0) {
                break;
            } else if (vote == 1) {
                candidate1Votes++;
                System.out.println("You voted for Candidate 1.");
            } else if (vote == 2) {
                candidate2Votes++;
                System.out.println("You voted for Candidate 2.");
            } else {
                System.out.println("Invalid choice. Please vote again.");
            }
        }

        System.out.println("\nVoting has ended. Here are the results:");
        System.out.println("Candidate 1: " + candidate1Votes + " votes");
        System.out.println("Candidate 2: " + candidate2Votes + " votes");

        if (candidate1Votes > candidate2Votes) {
            System.out.println("Candidate 1 wins!");
        } else if (candidate2Votes > candidate1Votes) {
            System.out.println("Candidate 2 wins!");
        } else {
            System.out.println("It's a tie!");
        }

        scanner.close();
    }
}
