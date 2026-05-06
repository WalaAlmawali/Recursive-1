
public class Array11Demo {

    public static void main(String[] args){

        //Create an object of the Array11 class
        Array11 array11 = new Array11();

        // Test arrays
        int[] arr1 = {1, 2, 11};
        int[] arr2 = {11, 11};
        int[] arr3 = {1, 2, 3, 4};

        // Call the method starting from index 0 and print results
        System.out.println( array11.array11(arr1, 0));
        System.out.println( array11.array11(arr2, 0));
        System.out.println(  array11.array11(arr3, 0));

    }


    }
