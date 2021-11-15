import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {3, 2, 5, 4, 8};

        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 1, 0);
        System.out.println(Arrays.toString(numbers));

        MainProgram.swap(numbers, 0, 3);
        System.out.println(Arrays.toString(numbers));
    }

    public static int smallest(int[] array) {
        int smallest = array[0];

        for(int i = 0; i < array.length; i++) {
            if(smallest > array[i]) {
                smallest = array[i];
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;

        for(int i = 0; i < array.length; i++) {
            if(smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int startIndex) {
        int smallest = array[startIndex];
        int index = startIndex;

        for(int i = startIndex; i < array.length; i++) {
            if(smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static void swap(int array[], int index1, int index2) {
        int temp = array[index1];
        int temp2 = array[index2];
        array[index1] = temp2;
        array[index2] = temp;
        }

        public static void sort(int[] array) {
            for (int i = 0; i < array.length; i++) {
                System.out.println(Arrays.toString(array));
                swap(array, indexOfSmallestFrom(array, i), i);
            }

        }
    }




