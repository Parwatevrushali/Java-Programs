import java.util.Scanner;

class ReadDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name:");
        String name = sc.nextLine();

        System.out.println("Enter your College name:");
        String collagename = sc.nextLine();

        System.out.println("Enter your age:");
        int age = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter your gender:");
        char gender = sc.next().charAt(0);
        sc.nextLine(); // consume newline

        System.out.println("Enter your Course:");
        String course = sc.nextLine();

        System.out.println("Enter your Percentage:");
        float percentage = sc.nextFloat();
        sc.nextLine(); // consume newline

        System.out.println("Enter your email:");
        String email = sc.nextLine();

        System.out.println("\n-----Your Details-----");
        System.out.println("Name: " + name);
        System.out.println("College name: " + collagename);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Course: " + course);
        System.out.println("Percentage: " + percentage);
        System.out.println("Email: " + email);

        sc.close();
    }
}
