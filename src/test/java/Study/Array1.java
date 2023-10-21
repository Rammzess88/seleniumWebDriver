package Study;

public class Array1 {
    public static void main(String[] args) {
        int[] array = {1, 1, 0, 1, 0, 1, 0, 1, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                array[i] = 1;
            }else {
                array[i]=0;
            }
            System.out.print(array[i] + " ");
        }


    }
}
// arr[i] = (arr[i} - 1) * -1;
