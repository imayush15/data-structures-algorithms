package projectTimeTable;
import java.util.Scanner;

public class etc_5th_sem {
    Scanner sc = new Scanner(System.in);

//    ETC 5th Sem Subjects
    int aap, dsp, dct, dcn, mwe, ocn;

//    Setting Group for subjects
    void setGroup_etc_5th() {
        System.out.println("Enter Your Group For Each Subject : Group A--> 1\tGroup B--> 2");
        System.out.print("AAP : ");
        this.aap = sc.nextInt();
        System.out.print("DCN : ");
        this.dcn= sc.nextInt();
        System.out.print("DCT : ");
        this.dct = sc.nextInt();
        System.out.print("DSP : ");
        this.dsp = sc.nextInt();
        System.out.print("MWE : ");
        this.mwe = sc.nextInt();
        System.out.print("OCN : ");
        this.ocn = sc.nextInt();
    }
    void monday() {
        switch (dsp) {
            case 1:
                System.out.println("\tDSP : 8 AM to 9 AM");
                break;
            case 2:
                System.out.println("\tDSP : 12 Noon to 1 PM");
                break;
        }

        switch (dct) {
            case 1:
                System.out.println("\tDCT : 9 AM to 10 AM");
                break;
            case 2:
                System.out.println("\tDSP : 1 PM to 2 PM");
                break;
        }

        switch (mwe) {
            case 1:
                System.out.println("\tMWE : 10 AM to 11 AM");
                break;
            case 2:
                System.out.println("\tDSP : 11 AM to 12 Noon");
                break;
        }
        switch (ocn) {
            case 2:
                System.out.println("\tDSP : 1 PM to 2 PM");
                break;
        }
    }

    void tuesday() {
        switch (ocn) {
            case 1:
                System.out.println("\tOCN : 8 AM to 9 AM");
                break;
            case 2:
                System.out.println("\tDSP : 1 PM to 2 PM");
                break;
        }

        switch (aap) {
            case 1:
                System.out.println("\tAAP : 9 AM to 10 AM");
                break;
            case 2:
                System.out.println("\tDSP : 11 AM to 12 Noon");
                break;
        }

        switch (dsp) {
            case 1:
                System.out.println("\tDSP : 10 AM to 11 AM");
                break;
        }
        switch (dct) {
            case 1:
                System.out.println("\tDSP : 3 PM to 4 PM");
                break;
        }
    }

    void wednesday() {
        switch (dct) {
            case 2:
                System.out.println("\tDCT : 9 AM to 10 AM");
                break;
        }

        switch (aap) {
            case 1:
                System.out.println("\tAAP : 11 AM to 12 Noon");
                break;
            case 2:
                System.out.println("\tAAP : 10 AM to 11 AM");
                break;
        }

        switch (dsp) {
            case 2:
                System.out.println("\tDSP : 7 PM to 8 PM");
                break;
        }
        switch (ocn) {
            case 1:
                System.out.println("\tOCN : 12 Noon to 1 PM");
                break;
            case 2:
                System.out.println("\tOCN : 2 PM to 3 PM");
                break;
        }
        switch (mwe) {
            case 2:
                System.out.println("\tMWE : 3 PM to 4 PM");
                break;
        }
    }

    void thursday() {
        switch (dct) {
            case 1:
                System.out.println("\tDCT : 10 AM to 11 AM");
                break;
            case 2:
                System.out.println("\tDCT : 1 PM to 2 PM");
                break;
        }

        switch (aap) {
            case 1:
                System.out.println("\tAAP : 9 AM to 10 AM");
                break;
            case 2:
                System.out.println("\tAAP : 10 AM to 11 AM");
                break;
        }

        switch (dsp) {
            case 1:
                System.out.println("\tDSP : 4 PM to 5 PM");
                break;
            case 2:
                System.out.println("\tDSP : 12 Noon to 1 PM");
                break;
        }
        switch (ocn) {
            case 1:
                System.out.println("\tOCN : 5 PM to 6 PM");
                break;

        }
        switch (mwe) {
            case 1:
                System.out.println("\tMWE : 3 PM to 4 PM");
                break;
        }
    }

    void friday() {
        switch (dct) {
            case 1:
                System.out.println("\tDCT : 12 Noon to 1 PM");
            case 2:
                System.out.println("\tDCT : 8 AM to 9 AM");
                break;
        }

        switch (dsp) {
            case 2:
                System.out.println("\tDSP : 10 AM to 11 AM");
                break;
            case 1:
                System.out.println("\tDSP : 1 PM to 2 PM");
                break;
        }
        switch (dcn) {
            case 2:
                System.out.println("\tDCN : 3 PM to 4 PM");
        }
        switch (mwe) {
            case 2:
                System.out.println("\tMWE : 9 AM to 10 AM");
                break;
            case 1:
                System.out.println("\tMWE : 11 AM to 12 Noon");
                break;
        }
    }
}
