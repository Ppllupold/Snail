import java.util.*;
public class Snail {
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        int up = scan.nextInt();
        int down =  scan.nextInt();
        int treeHeight =  scan.nextInt();
        int distance = 0;
        int amountOfDays = 0;



        if (up < 0 || down < 0 || treeHeight < 0) {
            System.out.println("Ops, check your input again, each of them should not be negative");
            System.exit(0);
        }
        if (up > treeHeight) {
            amountOfDays++;
            System.out.println("amount of days  = " + " " + amountOfDays);
            System.exit(0);
        }

        if (up <= down & treeHeight > up-down ) {
            System.out.println("Impossible to reach the top");
            System.exit(0);
        }
        while(true) {
            distance += up;
            amountOfDays++;
            if(distance >= treeHeight) {
            break;
            }
            distance -= down;
        }
        System.out.println("amount of days  = " + " " + amountOfDays);


    }
}