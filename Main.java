import java.util.Scanner;

class SeatingArrangement {
    private int[][] seats;

    public SeatingArrangement(int rows, int cols) {
        seats = new int[rows][cols];
    }

    public void assignSeats(int strength) {
        int rollNum = 1;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (rollNum <= strength) {
                    seats[i][j] = rollNum;
                    rollNum++;
                } else {
                    break;
                }
            }
        }
    }

    public void printArrangement() {
        System.out.println("Seating Arrangement:");
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[i].length; j++) {
                if (seats[i][j] == 0) {
                    System.out.print(" ");
                } else {
                    System.out.print(seats[i][j] + " ");
                }
            }
            System.out.println();
        }
    }
}

public class Main {
    static String new_password() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a new password: ");
        String newPassword = sc.nextLine();
        System.out.println("Password changed.");
        return newPassword;
    }

    static void adminLogin() {
        String savedUsername = "hello java";
        String savedPassword = "password";
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Login Page");
        System.out.println("(Username and password are case sensitive)");

        System.out.print("Username: ");
        String username = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        if (username.equals(savedUsername) && password.equals(savedPassword)) {
            System.out.println("Login Successful!");
            arrangementManagement();
        } else {
            System.out.println("Change password?");
            savedPassword = new_password();
            System.out.println("Return to the login page");
            System.out.println();
            adminLogin(savedPassword);
        }
    }

    static void arrangementManagement() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int cols = sc.nextInt();

        SeatingArrangement arrangement = new SeatingArrangement(rows, cols);

        System.out.print("Enter the strength of your group: ");
        int strength = sc.nextInt();
        arrangement.assignSeats(strength);
        arrangement.printArrangement();
        logOut();
    }

    static void studentLogin() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Login Page");
        System.out.println("(Username and password are case sensitive)");
        String savedUsername = "hello java";
        String savedPassword = "password";

        System.out.print("Enter Student Id: ");
        String id = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        if (id.equals(savedUsername) && password.equals(savedPassword)) {
            System.out.println("Login Successful!");
            arrangementManagement();
        }
    }

    static void logOut() {
        System.exit(0);
    }

    public static void main(String[] args) {
        System.out.println("WELCOME TO XYZ UNIVERSITY");
        System.out.println("HERE YOU CAN FIND THE SEATING ARRANGEMENT FOR YOUR EXAM.");
        System.out.println("WE WISH YOU ALL THE VERY BEST FOR THIS.");
        System.out.println();
        System.out.println("Are you a Student or Faculty?");
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Student\n2: Faculty");
        int num = sc.nextInt();
        switch (num) {
            case 1:
                studentLogin();
                break;
            case 2:
                adminLogin();
                break;
        }
    }
}
