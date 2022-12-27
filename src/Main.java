import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task();
    }

    public static void task() {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] newArr = new int[5];
        newArr = returnArray(arr);
        System.out.println(Arrays.toString(newArr));

    }

    public static int[] returnArray(int[] arrOne) {

        int index = 0;
        int[] tempArr = new int[5];
        for (int i = 0; i < arrOne.length; i++) {
            if (arrOne[i] % 2 == 0) {
                arrOne[i]++;
            }
        }
        for (int i = 2; i < 7; i++) {
            tempArr[index] = arrOne[i];
            index++;
        }
        return tempArr;

    }

}