import java.util.Scanner;

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
        } else {
            System.out.println("Change password?");
            savedPassword = new_password();
            System.out.println("Return to the login page");
            System.out.println();
            adminLogin(savedPassword);
        }
    }

    static void adminLogin(String savedPassword) {
        String savedUsername = "hello java";
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the Login Page");
        System.out.println("(Username and password are case sensitive)");

        System.out.print("Username: ");
        String username = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        if (username.equals(savedUsername) && password.equals(savedPassword)) {
            System.out.println("Login Successful!");
            Arrangement();
        } else {
            System.out.println("Change password?");
            savedPassword = new_password();
            System.out.println("Return to the login page");
            System.out.println();
            adminLogin(savedPassword);

        }
    }

    static void Arrangement() {
        System.out.println("Greetings, please let me know of which group's arrangement you are looking for.");
        Scanner sc = new Scanner(System.in);
        int group = sc.nextInt();
        System.out.println("Welcome to the group " + group);
        System.out.println();
        System.out.print("Enter the strength of your group: ");
        int strength = sc.nextInt();

        System.out.print("Enter the number of rows: ");
        int Rows = sc.nextInt();

        System.out.print("Enter the number of columns: ");
        int Cols = sc.nextInt();

        int totalSeats = Rows * Cols;
        if (strength > totalSeats) {
            System.out.println("There are not enough seats for all the students!");
        }
        int[][]arr = new int[Rows][Cols];

        // Assign seats to students
        int rollNum = 1;
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Cols; j++) {
                if (rollNum<= strength) {
                    arr[i][j] = rollNum;
                    rollNum++;
                }
                else{
                    System.out.println("Remaining students need to sit in another room");
                }
            }
        }

        // Print the seating arrangement
        System.out.println("Seating Arrangement:");
        for (int i = 0; i < Rows; i++) {
            for (int j = 0; j < Cols; j++) {
                if (arr[i][j] == 0) System.out.print(" ");
                else System.out.print(arr[i][j]+" ");
            }
            System.out.println();
            System.out.println("ARRANGEMENT CREATED.");
          logOut();
        }
    }
    static void studentLogin(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Welcome to the Login Page");
        System.out.println("(Username and password are case sensitive)");
        String savedUsername = "hello java";
        String savedPassword = "password";
        
        System.out.print("enter Student Id:");
        String id = sc.nextLine();

        System.out.print("Password: ");
        String password = sc.nextLine();

        if (id.equals(savedUsername) && password.equals(savedPassword)) {
            System.out.println("Login Successful!");
            System.out.println("Enter your group: ");
            int group=sc.nextInt();
            System.out.println("you belong to the G"+group);
            searchSeat();
            logOut();
        } 
    }
     static void searchSeat() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your Id: ");
        String id=sc.nextLine();
        //INCOMPLETENCE HERE
    }
static void logOut(){
    System.exit(0);
}
    public static void main(String[] args) {
        System.out.println("WELCOME TO XYZ UNIVERSITY");
        System.out.println("HERE YOU CAN FIND THE SEATING ARRANGEMENT FOR YOUR EXAM.");
        System.out.println("WE WISH YOU ALL THE VERY BEST FOR THIS.");
        System.out.println();
        System.out.println("You are Staff Or Student?");
        Scanner sc=new Scanner(System.in);
        System.out.println("1. Student\n2: Faculty");
        int num=sc.nextInt();
        switch(num)
        {
            case 1:
                studentLogin();
                break;
            case 2:
                adminLogin();
                break;
        }
    }
}
