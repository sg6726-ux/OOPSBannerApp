public class OOPSBannerApp {

    /* ---------- INNER STATIC CLASS ---------- */
    static class CharacterPattern {

        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter methods
        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    /* ---------- PATTERN METHODS ---------- */

    public static String[] createOPattern() {
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

    public static String[] createPPattern() {
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

    public static String[] createSPattern() {
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

    /* ---------- MAIN METHOD ---------- */

    public static void main(String[] args) {

        CharacterPattern O =
                new CharacterPattern('O', createOPattern());

        CharacterPattern P =
                new CharacterPattern('P', createPPattern());

        CharacterPattern S =
                new CharacterPattern('S', createSPattern());

        CharacterPattern[] word = {O, O, P, S};

        for(int i = 0; i < 7; i++) {

            StringBuilder line = new StringBuilder();

            for(CharacterPattern cp : word) {
                line.append(cp.getPattern()[i]).append(" ");
            }

            System.out.println(line);
        }
    }
}