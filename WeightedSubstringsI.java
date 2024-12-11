import java.util.HashSet;

public class WeightedSubstringsI {
    public static void main(String[] args) {
        String p = "acbacbacaa";
        String q = "12300045600078900012345000";
        int K = 2;
        int N = p.length();
        System.out.println(distinctSubString(p, q, K, N));
    }

    static int distinctSubString(String p, String q, int k, int n) {
        HashSet<String> S = new HashSet<>();
        for (int i = 0; i < n; i++) {
            int sum = 0;
            String str = "";
            for (int j = i; j < n; j++) {
                int pos = p.charAt(j) - 'a';
                sum += q.charAt(pos) - '0';
                str += p.charAt(j);

                if (sum <= k) {
                    S.add(str);
                } else {
                    break;
                }
            }
        }
        return S.size();
    }
}
