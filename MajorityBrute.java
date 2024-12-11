public class MajorityBrute {
    // O(n^2) time
    // O(1) space
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 1, 3, 5, 1 };
        findMajority(arr, arr.length);
    }

    private static void findMajority(int[] arr, int length) {
        // TODO Auto-generated method stub
        int max = 0;
        int index = -1;
        for (int i = 0; i < length; i++) {
            int count = 0;
            for (int j = 0; j < length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            // update count if count of curent element is greater
            if (count > max) {
                max = count;
                index = i;
            }
        }
        if (max > length / 2) {
            System.out.println(arr[index]);
        } else {
            System.out.println("null");
        }
    }
}
