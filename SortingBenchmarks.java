public class SortingBenchmarks {
    public static void main(String[] args){
        int[] array1 = {10, 0, 23, 15, 2, 75, 3, 57, 13, 56, 7, 45, 124, 64, 374, 1, 34, 84, 74, 94};
        int[] array2 = {10, 0, 23, 15, 2, 75, 3, 57, 13, 56, 7, 45, 124, 64, 374, 1, 34, 84, 74, 94};
        int count1 = bubbleSort(array1);
        System.out.println("Number of Exchanges: " + count1);
        int count2 = selectionSort(array2);
        System.out.println("Number of Exchanges: " + count2);
        if (count1 < count2){
            System.out.println("Bubble Sort did the least amount of exchanges.");
        }
        else if (count1 > count2){
            System.out.println("Selection Sort did the least amount of exchanges.");
        }
        else if (count1 == count2){
            System.out.println("Both methods had the same amount of exchangse.");
        }

    }
    public static int bubbleSort(int[] array1){
        int count1 = 0;
        boolean pass = false;
        for (int i = 0; i < 19; i ++){
            for (int j = 0; j < 19 - i; j++){
                if (array1[j] > array1[j + 1]){
                    int temp = array1[j];
                    array1[j] = array1[j + 1];
                    array1[j+1] = temp;
                    count1 ++;
                    pass = true;
                }
            }
            if (!pass){
                break;
            }
        }
        System.out.println("Bubble Sort Results:");
        for (int i = 0; i < 20; i ++){
            System.out.print(array1[i] + " ");
        }
        System.out.println("");
        return count1;
    }
    public static int selectionSort(int[] array2){
        int count2 = 0;
        boolean pass = false;
        int temp;
            for (int i = 0; i < (array2.length-1); i ++){
                int min = i;
                for (int j = 0 + i; j < array2.length; j ++){
                    if (array2[j] < array2[min]){
                        min = j;
                    }
                    
                }
                if (min != i){
                    temp = array2[i];
                    array2[i] = array2[min];
                    array2[min] = temp;
                    count2++;
                }
            }
        System.out.println("Selection Sort Results: ");
        for (int i = 0; i < 20; i ++){
            System.out.print(array2[i] + " ");
        }
        System.out.println("");
        return count2;
    }
}
