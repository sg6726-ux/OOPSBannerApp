import java.util.Scanner;

public class OOPSBannerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text: ");
        String text = sc.nextLine().toUpperCase();

        for (int row = 0; row < 7; row++) {

            for (int i = 0; i < text.length(); i++) {

                char ch = text.charAt(i);

                switch (ch) {

                    case 'O':
                        printO(row);
                        break;

                    case 'P':
                        printP(row);
                        break;

                    case 'S':
                        printS(row);
                        break;

                    default:
                        System.out.print("       ");
                }

                System.out.print("  ");
            }

            System.out.println();
        }

        sc.close();
    }

    // ---------- LETTER O ----------
    static void printO(int row) {
        switch(row){
            case 0: case 6:
                System.out.print(" ***** ");
                break;
            default:
                System.out.print("*     *");
        }
    }

    // ---------- LETTER P ----------
    static void printP(int row) {
        switch(row){
            case 0: case 3:
                System.out.print(" ***** ");
                break;
            case 1: case 2:
                System.out.print("*     *");
                break;
            default:
                System.out.print("*      ");
        }
    }

    // ---------- LETTER S ----------
    static void printS(int row) {
        switch(row){
            case 0: case 3: case 6:
                System.out.print(" ***** ");
                break;
            case 1: case 2:
                System.out.print("*      ");
                break;
            default:
                System.out.print("      *");
        }
    }
}