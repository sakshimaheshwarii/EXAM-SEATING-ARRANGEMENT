import java.util.Scanner;

public class Main {
    static void loginCandidate() {
        String savedUser = "hello candidate";
        String savedPwd = "password";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username:");
        String username = sc.nextLine();
        System.out.print("Enter your password:");
        String password = sc.nextLine();
        if (savedUser.equals(username) && savedPwd.equals(password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
        CandidateDashboard();
    }

    static void CandidateDashboard() {

        System.out.println("--- Candidate Dashboard ---");
        System.out.println("Welcome to your dashboard, [Candidate Name]!");
        System.out.println(
                "Here are some options and information available for you: \n1.View Profile Details\n2.View Job Listings\n3.Apply for Jobs\n4.Check Application Status\n5.Update Password\n6.Update Personal Information\n7.Upload Resume\n8.Preview Resume\n9.log out");

        System.out.println("\nPlease select an option by entering the corresponding number: ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                CviewProfileDetails();
                break;
            case 2:
                CviewJob();
                break;
            case 3:
                CapplyForJobs();
                break;
            case 4:
                CcheckApplicationStatus();
                break;
            case 5:
                CupdatePassword();
                break;
            case 6:
                CupdatePersonalInfo();
                break;
            case 7:
                CuploadResume();
                break;
            case 8:
                CpreviewResume();
                break;
            case 9:
                logout();
                break;
        }
    }

    static void CviewProfileDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Phone Number: ");
        String phone = sc.nextLine();
        System.out.print("Skills: ");
        String skills = sc.nextLine();
        System.out.print("Education: ");
        String edu = sc.nextLine();
        System.out.print("Experience: ");
        int exp = sc.nextInt();

        System.out.println("--- Candidate Profile Details ---");
        System.out.print("Name: " + name);
        System.out.print("Email: " + email);
        System.out.print("Phone Number: " + phone);
        System.out.print("Skills: " + skills);
        System.out.print("Education: " + edu);
        System.out.print("Experience: " + exp);

        System.out.println("\nWhat would you like to do next?");
        System.out.println("1. Update Profile Details");
        System.out.println("2. Go back to Dashboard");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                CupdatePersonalInfo();
                break;
            case 2:
                CandidateDashboard();
                break;
        }
    }

    static void CviewJob() {
        System.out.println("--- Available Job Listings ---");

        Scanner sc = new Scanner(System.in);
        String title = "abc";
        String company = "xyz";
        String location = "mnop";
        int salary = 456784;
        System.out.print("Job Title: \n" + title);
        System.out.print("Company: \n" + company);
        System.out.print("Location: \n" + location);
        System.out.print("Salary: \n" + salary);
        System.out.println();

        System.out.println("What would you like to do next?");
        System.out.println("1. Apply for a Job");
        System.out.println("2. Go back to Dashboard");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                CapplyForJobs();
                break;
            case 2:
                CandidateDashboard();
                break;
        }
    }

    static void CapplyForJobs() {
        System.out.println("--- Apply for Jobs ---");

        Scanner scanner = new Scanner(System.in);
        System.out.print("enter cgpa: ");
        float cgpa = scanner.nextFloat();
        System.out.print("enter 12th percentage: ");
        float percentage = scanner.nextFloat();

        if (cgpa >= 8.0 && percentage >= 75) {
            System.out.println("You have successfully applied for the job.");
        } else {
            System.out.println("Invalid job selection. Please try again.");
        }
    }

    static void CcheckApplicationStatus() {
    }

    static void CupdatePassword() {
    }

    static void CupdatePersonalInfo() {
    }

    static void CuploadResume() {
        System.out.println("--- Upload Resume ---");
        System.out.println("Please enter the file path of your resume or choose an option to browse for the file:");
        System.out.println("Resume uploaded successfully!");
    }

    static void CpreviewResume() {
    }
    // -------------------------------------------------------------------------------------------------------------------

    static void loginAdmin() {
        String savedUser = "hello admin";
        String savedPwd = "password";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username:");
        String username = sc.nextLine();
        System.out.print("Enter your password:");
        String password = sc.nextLine();
        if (savedUser.equals(username) && savedPwd.equals(password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }

    static void AdminDashboard() {
        System.out.println("---Admin Dashboard ---");
        System.out.println("Welcome to your dashboard, [Admin Name]!");
        System.out.println(
                "Here are some options and information available for you: \n1.viewJob\n2: applyForJobs\n3. addNewJobDetails\n4. changePassword\n5. applicantList\n6. searchStudent\n7. updateDetail\n8. uploadLogo\n9.log out");

        System.out.println("\nPlease select an option by entering the corresponding number: ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                AviewJob();
                break;
            case 2:
                AapplyForJobs();
                break;
            case 3:
                AaddNewJobDetails();
                break;
            case 4:
                AchangePassword();
                break;
            case 5:
                AapplicantList();
                break;
            case 6:
                AsearchStudent();
                break;
            case 7:
                AupdateDetail();
                break;
            case 8:
                AuploadLogo();
                break;
            case 9:
                logout();
                break;
        }
    }

    static void AviewJob() {
    }

    static void AapplyForJobs() {
    }

    static void AaddNewJobDetails() {
    }

    static void AchangePassword() {
    }

    static void AapplicantList() {
    }

    static void AsearchStudent() {
    }

    static void AupdateDetail() {
    }

    static void AuploadLogo() {
    }

    // -----------------------------------------------------------------------------------------------------------------------
    static void loginRecruiter() {
        String savedUser = "hello recruiter";
        String savedPwd = "password";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your username:");
        String username = sc.nextLine();
        System.out.print("Enter your password:");
        String password = sc.nextLine();
        if (savedUser.equals(username) && savedPwd.equals(password)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }

    static void RecruiterDashboard() {
        System.out.println("---Recruiter Dashboard ---");
        System.out.println("Welcome to your dashboard, [Recruiter Name]!");
        System.out.println(
                "Here are some options and information available for you: \n1.View Profile Details\n2.View Job Listings\n3.Apply for Jobs\n4.Check Application Status\n5.Update Password\n6.Update Personal Information\n7.Upload Resume\n8.Preview Resume\n9.log Out");

        System.out.println("\nPlease select an option by entering the corresponding number: ");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        switch (option) {
            case 1:
                RmanageStudents();
                break;
            case 2:
                RmanageRecruiter();
                break;
            case 3:
                RviewJobs();
                break;
            case 4:
                RnonPlacedCandidates();
                break;
            case 5:
                RplacedCandidates();
                break;
            case 6:
                RupdatePassword();
                break;
            case 7:
                logout();
                break;
        }
    }

    static void RmanageStudents() {
    }

    static void RmanageRecruiter() {
    }

    static void RviewJobs() {
    }

    static void RnonPlacedCandidates() {
    }

    static void RplacedCandidates() {
    }

    static void RupdatePassword() {
    }

    // -----------------------------------------------------
    static void logout() {
        System.exit(0);
        System.out.println("Logout Successful");
    }

    // ----------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {
        System.out.println("---Welcome to the Placement portal---\n");
        System.out.println("User is 1.Candidate 2.Admin 3.Recruiter");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        switch (num) {
            case 1:
                loginCandidate();
                break;
            case 2:
                loginAdmin();
                break;
            case 3:
                loginRecruiter();
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        // -----------------------------------------------------------
    }
}