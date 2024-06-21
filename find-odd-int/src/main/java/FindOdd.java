import java.util.HashSet;

public class FindOdd {
    public static int findIt(int[] a) {
        if (a.length == 1) {
            return a[0];
        }

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : a) {
            if (hashSet.contains(i)) {
                hashSet.remove(i);
            } else {
                hashSet.add(i);
            }
        }
        return (int) hashSet.toArray()[0];
    }
}
