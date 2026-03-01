public class OOPSBannerApp {

    // Method to create O pattern
    public static String[] getOPattern() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            "*     *",
            " ***** "
        };
    }

    // Method to create P pattern
    public static String[] getPPattern() {
        return new String[]{
            " ***** ",
            "*     *",
            "*     *",
            " ***** ",
            "*      ",
            "*      ",
            "*      "
        };
    }

    // Method to create S pattern
    public static String[] getSPattern() {
        return new String[]{
            " ***** ",
            "*      ",
            "*      ",
            " ***** ",
            "      *",
            "      *",
            " ***** "
        };
    }

    public static void main(String[] args) {

        String[] O = getOPattern();
        String[] P = getPPattern();
        String[] S = getSPattern();

        for(int i = 0; i < 7; i++) {
            System.out.println(O[i] + " " + O[i] + " " + P[i] + " " + S[i]);
        }
    }
}