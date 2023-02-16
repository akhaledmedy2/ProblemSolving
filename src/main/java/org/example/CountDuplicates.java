package javaapplication16;

public class CountDuplicates {

    public static int solution(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                {
                    if (arr[i] == arr[j]) {
                        result++;
                    }
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr = {3, 5, 6, 3, 3, 5};
        System.out.println(solution(arr));
    }
}
