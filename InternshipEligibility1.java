import java.util.Scanner;

public class InternshipEligibility1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name:");
        String Name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        System.out.print("Enter Email:")
        String Email = sc.nextLine();
        System.out.print("Enter Contact")
        int Contact = sc.nextInt();
        System.out.print("Enter Graduatio Percentage")
        Double percentage =sc.nextDouble();
        
        if (age >= 18 && percentage >= 60) {
            System.out.println("\nEligible for Internship");
        } else {
            System.out.println("\nNot Eligible for Internship");
            if (percentage < 60) {
                System.out.println("Reason: Graduation percentage must be at least 60%");
            }
        }
        sc.close();
    }
}
