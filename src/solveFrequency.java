import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class solveFrequency {

    public int[] solve(int[] values) {
        TreeMap<Integer, Integer> hashedValues = new TreeMap<>();
        for (int i = 0; i < values.length; i++) {
            if (hashedValues.containsKey(values[i]))
                hashedValues.replace(values[i], hashedValues.get(values[i]) + 1);
            else
                hashedValues.put(values[i], 1);
        }
        System.out.println(hashedValues);
        int count = 0;
        int[] sortedList = new int[values.length];
        int max = Collections.max(hashedValues.values());
        for (int j = 0; j < max; j++)
            for (Map.Entry<Integer, Integer> entry : hashedValues.entrySet())
                if (entry.getValue() == (max - j))
                    for (int a = 0; a < entry.getValue(); a++)
                        sortedList[count++] = entry.getKey();
        return sortedList;
    }

}
