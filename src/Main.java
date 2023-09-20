import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        int arrayLength = 10;
        Random random = new Random();  // skapar möjlighet till random som en scanner
        for (int i = 0; i < arrayLength; i++) {
            numbers.add(random.nextInt(10));
        }
        System.out.println(numbers);
        // 1  2  3  2  1  5
        ArrayList<Integer> duplicateIndex = new ArrayList<>();
        boolean isDuplicate = false;
        for (int i = 0; i < arrayLength; i++) {
            for (int j = i + 1; j < arrayLength; j++) {
                if (numbers.get(i) == numbers.get(j)) {
                    duplicateIndex.add(j);
                    isDuplicate = true;
                }
            }

            if (isDuplicate) {
                duplicateIndex.add(i);
                isDuplicate = false;
            } // dags att ta bort duplicates i numbers, sparade i duplicateIndex
        }

        int highestUnique = -1;
        for (int i = 0; i < arrayLength; i++) {
            if (!duplicateIndex.contains(i) && numbers.get(i) > highestUnique) {
                highestUnique = numbers.get(i);
            }
        }
        if (highestUnique == -1) {
            System.out.println("Inget unikt nummer fanns!");
        } else {
            System.out.println("Högsta unika numret är: " + highestUnique);
        }
        // göra en ny med hashmap
    }
}