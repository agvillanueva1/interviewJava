package SamsungPrep;

public class SelectionSortArray {

    public static void main(String[] args) {

        //int arr[] = new int [] {8, 7, 9, 2, 3, 1, 5, 4, 6};  Can be declared this way, newer versions of Java no need
        int arr[] = {8, 7, 9, 2, 3, 1, 5, 4, 6};

/*
        Another way to print it is to convert Arrays as its string represntation, sort it, then print
*/
//        System.out.println(Arrays.toString(arr));
//        selectionSort(arr);
//        System.out.println(Arrays.toString(arr));

        selectionSort(arr);

        for (int i : arr){
            System.out.print(i);
        }
    }


    public static void selectionSort(int[] array){

                               //7     //8
        for (int i = 0; i < array.length-1; i++){

            int minIndex = i;
                              //8      //9
            for(int j = i + 1; j < array.length; j++){

                if(array[minIndex] > array[j]){  // if true, then re-assign
                    minIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }




}
