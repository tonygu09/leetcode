// Implement a function "sortArray" to sort an array of strings based on their length
// const arr = ["apple", "banana", "pear", "grape", "orange"];

public class test {
    public static void main(String[] args) {
        String[] arr = new String[]{"apple"};
        sortArray(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    public static void sortArray(String[] arr) {
       for(int i = 1; i < arr.length; i++) {
            String temp = arr[i];

            int j = i - 1; 

            while(j >= 0 && temp.length() < arr[j].length()) {
                arr[j+1] = arr[j];
                j--;

            }

            arr[j+1] = temp;
       }

    }
}
