import java.util.HashMap;

class WordFrequency {

    public static void main(String[] args) {

        String sentence = "java is easy java is powerful";

        String[] words = sentence.split(" ");

        HashMap<String, Integer> frequency = new HashMap<>();

        for (String word : words) {
            frequency.put(word,
                frequency.getOrDefault(word, 0) + 1);
        }

        System.out.println(frequency);
    }
}