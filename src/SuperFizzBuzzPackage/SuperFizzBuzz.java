package SuperFizzBuzzPackage;
import sun.tools.tree.NullExpression;

import java.util.*;

public class SuperFizzBuzz {

    private int start;
    private int end;
    private boolean increasing = false;
    private Map<Integer, HashSet<Integer>> map;
    private Map<Integer, String> multiple_String;

    SuperFizzBuzz(int start, int end) {
        this.start = start;
        this.end = end;
        if (start <= end) {
            increasing = true;
        }
        this.map = new HashMap<Integer, HashSet<Integer>>();
        this.multiple_String = new HashMap<>();
    }

    public void add(int divisor, String s) {
        if (s == null) {
            throw new NullPointerException("s is null.");
        }
        if (divisor == 0) {
            throw new ArithmeticException("divisor must be greater than 0.");
        }
        multiple_String.put(divisor, s);
        HashSet<Integer> set = new HashSet<>();
        if (increasing) {
            addMultiples(divisor, set, start, end);
        } else {
            addMultiples(divisor, set, end, start);
        }
    }

    public void addMultiples(int divisor, HashSet<Integer> set, int start, int end) {
        for (int i = start; i <= end; i++) {
            if (i % divisor == 0) {
                set.add(i);
            }
        }
        map.put(divisor, set);
    }

    public void printFizzBuzz() {
        if (increasing) {
            printHelper(start, end);
        } else {
            printHelper(end, start);
        }
    }

    public void printHelper(int start, int end) {
        for (int i = start; i <= end; i++) {
            ArrayList<Integer> a = new ArrayList<>();
            for (Map.Entry<Integer, HashSet<Integer>> entry : map.entrySet()) {
                HashSet<Integer> set = entry.getValue();
                if (set.contains(i)) {
                    a.add(entry.getKey());
                }
            }
            Collections.sort(a);
            String res = "";
            for (Integer integer : a) {
                String s = multiple_String.get(integer);
                res += s;
            }
            if (res.length() == 0) {
                System.out.println(i);
            } else {
                System.out.println(res);
            }
        }
    }
}
