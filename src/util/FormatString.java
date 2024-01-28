
package util;

/**
 *
 * @author Admin
 */
public class FormatString {
    public static String formatName(String name) {
        String[] words = name.split(" ");
        StringBuilder formattedNameBuilder = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                String firstLetter = word.substring(0, 1).toUpperCase();
                String restOfWord = word.substring(1).toLowerCase();
                String formattedWord = firstLetter + restOfWord;
                formattedNameBuilder.append(formattedWord).append(" ");
            }
        }

        String formattedName = formattedNameBuilder.toString().trim();
        formattedName = formattedName.replaceAll("[^a-zA-Z\\s.]", ""); // Loại bỏ tất cả các kí tự đặc biệt
        formattedName = formattedName.replaceAll("\\s+", " ");
        return formattedName;
    }
}
