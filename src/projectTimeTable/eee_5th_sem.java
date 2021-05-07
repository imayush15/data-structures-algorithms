package projectTimeTable;

import java.util.Scanner;

public class eee_5th_sem {
    Scanner sc = new Scanner(System.in);
    int ce, gtd, pec, acs, mmi, re;

    void setGroupEEE() {
        System.out.println("Enter Your Group For Each Subject : Group A--> 1\tGroup B--> 2");
        System.out.println("CE : ");
        this.ce = sc.nextInt();
        System.out.println("GTD : ");
        this.gtd = sc.nextInt();
        System.out.println("PEC : ");
        this.pec = sc.nextInt();
        System.out.println("ACS : ");
        this.acs = sc.nextInt();
        System.out.println("MMI : ");
        this.mmi = sc.nextInt();
        System.out.println("RE/IAC : ");
        this.re = sc.nextInt();
    }

//    Monday Time Table
    void eee_monday() {
        switch (ce) {
            case 1:
                System.out.println("\tCE : 8 AM to 9 AM");
                break;
            case 2:
                System.out.println("\tCE : 11 AM to 12 Noon");
                break;
        }
        switch (mmi) {
            case 1:
                System.out.println("\tMMI : 9 AM to 10 AM");
                break;
            case 2 :
                System.out.println("\tMMI : 12 Noon to 1 PM");
                break;
        }
        switch (gtd) {
            case 1:
                System.out.println("\tGTD : 10 AM to 11 AM");
                break;
            case 2:
                System.out.println("\tGTD : 1 PM to 2 PM");
                break;
        }
        switch (pec) {
            case 2:
                System.out.println("\tPEC/IAC : 3 PM to 4 PM");
                break;
        }
    }

//    Tuesday
    void eee_tuesday() {
        switch (acs) {
            case 1:
                System.out.println("\tACS : 8 AM to 9 AM");
                break;
        }
        switch (gtd) {
            case 1:
                System.out.println("\tGTD : 9 AM to 10 AM");
                break;
            case 2:
                System.out.println("\tGTD : 5 PM to 6 PM");
                break;
        }
        switch (mmi) {
            case 1:
                System.out.println("\tMMI : 10 AM to 11 AM");
                break;
            case 2:
                System.out.println("\tMMI : 4 PM to 5 PM");
                break;
        }
        switch (ce) {
            case 1:
                System.out.println("\tCE : 11 AM to 12 Noon");
                break;
            case 2:
                System.out.println("\tCE : 3 PM to 4 PM");
                break;
        }
        switch (pec) {
            case 1:
                System.out.println("\tPEC : 6 PM to 7 PM");
                break;
        }
    }
    //        Wednesday
    void eee_wednesday() {
        switch (pec) {
            case 2:
                System.out.println("\tPEC : 8 AM to 9 PM");
                break;
        }
        switch (re) {
            case 2:
                System.out.println("\tRE/IAC : 9 AM to 10 AM");
                break;
            case 1:
                System.out.println("\tRE/IAC : 6 PM to 7 PM");
                break;
        }
        switch (acs) {
            case 2:
                System.out.println("\tACS : 10 AM to 11 AM");
                System.out.println("\tACS : 2 PM to 3 PM");
                break;
            case 1:
                System.out.println("\tACS : 11 AM to 12 Noon");
                break;
        }
        if(gtd==1 && ce==1 && mmi==1 && re==1) {
            System.out.println("\tGTD : 3 PM to 4 PM");
            System.out.println("\tCE : 4PM to 5 PM");
            System.out.println("\tMMI : 5 PM to 6 PM");
            System.out.println("\tRE/IAC : 6 PM to 7 PM");
        }

    }

//    Thursday
    void eee_thursday() {
        
    }



}
