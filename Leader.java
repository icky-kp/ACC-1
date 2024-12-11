import java.util.ArrayList;
import java.util.Collections;

public class Leader {
    // public static ArrayList<Integer> printLeadersBrute(int[] arr, int n) {
    // ArrayList<Integer> ans = new ArrayList<>();
    // for (int i = 0; i < n; i++) {
    // boolean leader = true;
    // for (int j = i + 1; j < n; j++) {
    // if (arr[i] < arr[j]) {
    // leader = false;
    // break;
    // }
    // }
    // }
    // return ans;
    // }

    public static ArrayList<Integer> printLeadersOptimal(int[] arr, int n) {
        ArrayList<Integer> ans = new ArrayList<>();
        int max = arr[n - 1];
        ans.add(arr[n - 1]);

        for (int i = n - 2; i >= 0; i--) {
            if (arr[i] > max) {
                ans.add(arr[i]);
                max = arr[i];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int n = 6;
        int[] arr = { 2, 4, 6, 3, 1, 2 };
        ArrayList<Integer> ans = printLeadersOptimal(arr, n);
        Collections.sort(ans, Collections.reverseOrder());
        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i) + " ");
        }
    }
}
