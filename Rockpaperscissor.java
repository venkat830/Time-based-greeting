import java.util.*;

public class Rockpaperscissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        System.out.println("Welcome to rock, paper, scissor game");
        System.out.println("Please choose your option: ");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissor");        
        System.out.println("Enter your choice (1/2/3): ");
        int choice = sc.nextInt();        
        int scs = (int) (Math.random() * 3) + 1;
        if (choice == scs) {
            System.out.println("It's a tie!");
        } else if (choice == 1 && scs == 3 || choice == 2 && scs == 1 || choice == 3 && scs == 2) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
    }
    public static String getChoiceName(int choice) {
        if (choice == 1) {
            return "Rock";
        } else if (choice == 2) {
            return "Paper";
        } else {
            return "Scissor";
        }
    }
}
