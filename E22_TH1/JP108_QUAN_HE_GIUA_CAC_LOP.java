import java.util.*;
public class JP108_QUAN_HE_GIUA_CAC_LOP {
    private static Map<String, List<String>> isa = new HashMap<>();
    private static Map<String, List<String>> has = new HashMap<>();
    private static Map<String, Map<String, Boolean>> memIsa = new HashMap<>();
    private static Map<String, Map<String, Boolean>> memHas = new HashMap<>();
    private static boolean isaCheck(String a, String b) {
        if (a.equals(b)) return true;
        if (memIsa.containsKey(a) && memIsa.get(a).containsKey(b)) return memIsa.get(a).get(b);
        Set<String> vis = new HashSet<>();
        Stack<String> st = new Stack<>();
        st.push(a);
        while (!st.isEmpty()) {
            String u = st.pop();
            if (!vis.add(u)) continue;
            if (isa.containsKey(u)) {
                for (String v : isa.get(u)) {
                    if (v.equals(b)) {
                        if (!memIsa.containsKey(a)) memIsa.put(a, new HashMap<>());
                        memIsa.get(a).put(b, true);
                        return true;
                    }
                    st.push(v);
                }
            }
        }
        if (!memIsa.containsKey(a)) memIsa.put(a, new HashMap<>());
        memIsa.get(a).put(b, false);
        return false;
    }
    private static boolean hasCheck(String a, String b) {
        if (memHas.containsKey(a) && memHas.get(a).containsKey(b)) return memHas.get(a).get(b);
        Set<String> vis = new HashSet<>();
        Stack<String> st = new Stack<>();
        st.push(a);
        while (!st.isEmpty()) {
            String u = st.pop();
            if (!vis.add(u)) continue;
            if (has.containsKey(u)) {
                for (String v : has.get(u)) {
                    if (v.equals(b) || isaCheck(v, b)) {
                        if (!memHas.containsKey(a)) memHas.put(a, new HashMap<>());
                        memHas.get(a).put(b, true);
                        return true;
                    }
                    st.push(v);
                }
            }
            if (isa.containsKey(u)) {
                for (String v : isa.get(u)) st.push(v);
            }
        }
        if (!memHas.containsKey(a)) memHas.put(a, new HashMap<>());
        memHas.get(a).put(b, false);
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            String[] line = sc.nextLine().split(" ");
            String x = line[0], r = line[1], y = line[2];
            if (r.equals("is-a")) {
                if (!isa.containsKey(x)) isa.put(x, new ArrayList<>());
                isa.get(x).add(y);
            } else {
                if (!has.containsKey(x)) has.put(x, new ArrayList<>());
                has.get(x).add(y);
            }
        }
        for (int i = 1; i <= m; i++) {
            String[] query = sc.nextLine().split(" ");
            String x = query[0], r = query[1], y = query[2];
            boolean result = r.equals("is-a") ? isaCheck(x, y) : hasCheck(x, y);
            System.out.println("Query " + i + ": " + (result ? "true" : "false"));
        }
    }
}
