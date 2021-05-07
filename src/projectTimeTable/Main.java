package projectTimeTable;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        etc_5th_sem s = new etc_5th_sem();


        System.out.print("Enter Sem : ");
        int sem = sc.nextInt();

        System.out.println("Choose Branch : 1. ETC\t2. IT");
        System.out.println("Your Choice : ");
        int branch = sc.nextInt();

        if(sem==5 && branch==1) {
            s.setGroup_etc_5th();
            System.out.println("Monday :");
            s.monday();
            System.out.println("Tuesday :");
            s.tuesday();
            System.out.println("Wednesday :");
            s.wednesday();
            System.out.println("Thursday :");
            s.thursday();
            System.out.println("Friday :");
            s.friday();
        }

    }

}
