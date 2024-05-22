public class AscendingArrays {
    public static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] input = {14, 56, 49, 101, 99};
        sortArray(input);

        for (int num : input) {
            System.out.print(num + " ");
        }
    }
}
