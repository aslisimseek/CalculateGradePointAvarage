import java.util.Scanner;

public class CalculateGradePointAvarage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please Enter a Your Physics Note..:");
        int physicsNote = scanner.nextInt();
        System.out.print("Please Enter a Your Chemistry Note..:");
        int chemistryNote = scanner.nextInt();
        System.out.print("Please Enter a Your Math Note..:");
        int mathNote = scanner.nextInt();
        System.out.print("Please Enter a Your Biology Note..:");
        int bioNote = scanner.nextInt();
        System.out.print("Please Enter a Your Music Note..:");
        int musicNote = scanner.nextInt();

        int avarage = (physicsNote + chemistryNote + mathNote + bioNote + musicNote) / 5;
        System.out.println("Your Avarage..:" + avarage);
        //If Cases Homework
        /*if (avarage < 60) {
            System.out.println("You failed the class!");
        } else {
            System.out.println("You passed the class!");
        }*/

        //Elvis Operator Condition
        String situation = avarage > 60 ? "You pass the class!" : "You failed the class!";
        System.out.println(situation);
    }
}
