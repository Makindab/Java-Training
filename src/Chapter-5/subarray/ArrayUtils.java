class ArrayUtils {
    public static boolean contains(int[] arr1, int[] arr2) {
        // Write your code here
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                j++;
            }
        i++;
        }
        return j == arr2.length;
    }
}