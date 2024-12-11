import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NaturalSort {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("file1.txt");
        strings.add("file10.txt");
        strings.add("file2.txt");

        List<String> sortedStrings = naturalSort(strings);

        for (String str : sortedStrings) {
            System.out.println(str);
        }
    }

    private static List<String> naturalSort(List<String> strings) {
        strings.sort(Comparator.comparing(NaturalSort::extractNumericValue).thenComparing(Comparator.naturalOrder()));
        return strings;
    }

    private static Integer extractNumericValue(String str) {
        String numericPart = "";
        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(str);

        if (matcher.find()) {
            numericPart = matcher.group();
        }

        return numericPart.isEmpty() ? 0 : Integer.parseInt(numericPart);
    }
}
