public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] O = {
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        };

        String[] P = {
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        };

        String[] S = {
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        };

        String[][] word = {O, O, P, S};

        for (int i = 0; i < 7; i++) {
            for (String[] letter : word) {
                System.out.print(letter[i] + " ");
            }
            System.out.println();
        }
    }
}