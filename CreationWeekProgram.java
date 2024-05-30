import java.util.Scanner;

public class CreationWeekProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Creation Week Program");
        System.out.print("Enter a day (1-7) to see the events of that day: ");
        
        int day = scanner.nextInt();
        
        switch(day) {
            case 1:
                System.out.println("Day 1: God created light and separated light from darkness. (Genesis 1:3-5)");
                break;
            case 2:
                System.out.println("Day 2: God created the sky to separate the waters above from the waters below. (Genesis 1:6-8)");
                break;
            case 3:
                System.out.println("Day 3: God gathered the waters to create dry land and created vegetation. (Genesis 1:9-13)");
                break;
            case 4:
                System.out.println("Day 4: God created the sun, moon, and stars to give light and to separate day from night. (Genesis 1:14-19)");
                break;
            case 5:
                System.out.println("Day 5: God created sea creatures and birds and blessed them to multiply. (Genesis 1:20-23)");
                break;
            case 6:
                System.out.println("Day 6: God created land animals and mankind, giving them dominion over the Earth. (Genesis 1:24-31)");
                break;
            case 7:
                System.out.println("Day 7: God finished His work and rested, blessing the seventh day. (Genesis 2:1-3)");
                break;
            default:
                System.out.println("Invalid input. Please enter a number between 1 and 7.");
        }
        
        scanner.close();
    }
}
