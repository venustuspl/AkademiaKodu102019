import java.util.*;

public class ListEx1 {

    public static List<Integer> listDividedBy3(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (Integer entry : list) {
            if (entry % 3 == 0) {
                result.add(entry);
            }
        }
        return result;
    }

    public static List<Integer> listSorted(List<Integer> list) {
       /* Set<Integer> result = new TreeSet<>();
        for (Integer entry : list) {
            result.add(entry);
        }*/
        Collections.sort(list);
        return list;
    }

    public static void listInfo(List<Integer> list) {

        int max = list.get(0);
        for (Integer entry : list) {
            if (entry > max) {
                max = entry;
            }
        }

        Map<Integer, Integer> result = new TreeMap<>();
        for (Integer entry : list) {
            if (result.containsKey(entry)) {
                result.put(entry, result.get(entry) + 1);
            } else
                result.put(entry, 1);
        }
        System.out.println(Collections.frequency(list, 6));

        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static String dictionary(String word) {
        Map<String, String> polishDictionary = new HashMap<>();

        polishDictionary.put("pies", "dog");
        polishDictionary.put("kot", "cat");
        polishDictionary.put("auto", "car");
        polishDictionary.put("czołg", "tank");

        for (Map.Entry<String, String> entry : polishDictionary.entrySet()) {
            if (entry.getKey().equals(word)) {
                return entry.getValue();
            } else if (entry.getValue().equals(word)){
                return entry.getKey();
            }
                    }
        System.out.println(polishDictionary.get("auto"));

        return "Nie znaleziono wyrazu " + word + " w słowniku.";
    }

    public static void main(String[] args) {

        List<Integer> test = new ArrayList<>();
        test.add(5);
        test.add(3);
        test.add(6);
        test.add(6);

        System.out.println(ListEx1.listDividedBy3(test));

        System.out.println(ListEx1.listSorted(test));

        listInfo(test);

        System.out.println(ListEx1.dictionary("kane"));

        System.out.println(ListEx1.dictionary("dog"));


        System.out.println("End.");
    }


}
