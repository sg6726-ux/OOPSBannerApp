import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    /* ---------- BUILD MAP ---------- */
    public static Map<Character, String[]> buildCharacterMap() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        });

        map.put('P', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                " ***** ",
                "*      ",
                "*      ",
                "*      "
        });

        map.put('S', new String[]{
                " ***** ",
                "*      ",
                "*      ",
                " ***** ",
                "      *",
                "      *",
                " ***** "
        });

        return map;
    }

    /* ---------- RENDER FUNCTION ---------- */
    public static void renderBanner(String word,
                                    Map<Character,String[]> map) {

        for(int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for(char ch : word.toCharArray()) {
                line.append(map.get(ch)[row]).append(" ");
            }

            System.out.println(line);
        }
    }

    /* ---------- MAIN ---------- */
    public static void main(String[] args) {

        Map<Character,String[]> characterMap =
                buildCharacterMap();

        renderBanner("OOPS", characterMap);
    }
}