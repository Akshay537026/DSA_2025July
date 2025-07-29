import java.util.HashMap;
import java.util.Map;

public class CharIntoMobileNumericKeypadSeq {
    public static void main(String[] args) {
        CharIntoMobileNumericKeypadSeq a = new CharIntoMobileNumericKeypadSeq();

        System.out.println(a.printSequence("GFG"));

        System.out.println(a.printSequence("JVWN"));

        System.out.println(a.printSequence("HEY U"));

        System.out.println(a.printSequence("GEEKSFORGEEKS"));

    }

    String printSequence(String S) {
        Map<Map<Character, Integer>, Integer> outerMap = new HashMap<>();

        Map<Character, Integer> innerMap2 = new HashMap<>();

        innerMap2.put('A', 1);
        innerMap2.put('B', 2);
        innerMap2.put('C', 3);

        outerMap.put(innerMap2, 2);

        Map<Character, Integer> innerMap3 = new HashMap<>();

        innerMap3.put('D', 1);
        innerMap3.put('E', 2);
        innerMap3.put('F', 3);

        outerMap.put(innerMap3, 3);

        Map<Character, Integer> innerMap4 = new HashMap<>();

        innerMap4.put('G', 1);
        innerMap4.put('H', 2);
        innerMap4.put('I', 3);

        outerMap.put(innerMap4, 4);

        Map<Character, Integer> innerMap5 = new HashMap<>();

        innerMap5.put('J', 1);
        innerMap5.put('K', 2);
        innerMap5.put('L', 3);

        outerMap.put(innerMap5, 5);

        Map<Character, Integer> innerMap6 = new HashMap<>();

        innerMap6.put('M', 1);
        innerMap6.put('N', 2);
        innerMap6.put('O', 3);

        outerMap.put(innerMap6, 6);

        Map<Character, Integer> innerMap7 = new HashMap<>();

        innerMap7.put('P', 1);
        innerMap7.put('Q', 2);
        innerMap7.put('R', 3);
        innerMap7.put('S', 4);

        outerMap.put(innerMap7, 7);

        Map<Character, Integer> innerMap8 = new HashMap<>();

        innerMap8.put('T', 1);
        innerMap8.put('U', 2);
        innerMap8.put('V', 3);

        outerMap.put(innerMap8, 8);

        Map<Character, Integer> innerMap9 = new HashMap<>();

        innerMap9.put('W', 1);
        innerMap9.put('X', 2);
        innerMap9.put('Y', 3);
        innerMap9.put('Z', 4);

        outerMap.put(innerMap9, 9);

        StringBuilder sb = new StringBuilder();
        boolean found = false;

        for (char ch : S.toCharArray()) {
            if (ch == ' ') {
                sb.append("0");
                continue;
            }

            for (Map.Entry<Map<Character, Integer>, Integer> entry : outerMap.entrySet()) {

                Map<Character, Integer> innerEntry = entry.getKey();

                if (innerEntry.containsKey(ch)) {
                    int pos = innerEntry.get(ch); // we see for particular char
                    // int valueChar = outerMap.get(innerEntry);
                    int valueChar = entry.getValue();

                    while (pos != 0) {
                        sb.append(valueChar);
                        pos--;
                    }

                    found = true;
                    break;
                }
            }

            if (!found)
                break;

        }

        return sb.toString();
    }
}

// JVWN output => 05888966
