package school.lesson8.task1;

import java.util.*;

public class Words {
    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Microsoft", "Apple", "Samsung", "Google", "Xiaomi",
                "Tesla", "Amazon", "Intel", "Apple", "Microsoft",
                "Xiaomi", "Amazon", "Tesla", "Google", "Google",
                "Intel", "Samsung", "Apple", "Apple", "Samsung"
        );

        System.out.println("Уникальные слова: ");
        Set<String> unique = new HashSet<>(words);
        unique.forEach(System.out::println);


        System.out.println("\nЧастота встречаемост слов:");
        Map<String, Integer> wordsCount = new HashMap<>();
        for (String s : words) {
            wordsCount.put(s, wordsCount.getOrDefault(s, 0) + 1);
        }
        wordsCount.entrySet().forEach(System.out::println);
    }
}


