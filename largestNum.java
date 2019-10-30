/**
 * Class which will hold all the logic for finding the largest three numbers in an array
 */
public class largestNum{

    /**
     * function that handles the array of numbers first
     * to shift through
     * @param array - array of unsorted numbers
     * @return int[] - largest three numbers in an array;
     */
    public static int[] largestNum(int[] array){
        int[] largest = {Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for(int num: array){
            check(num, largest);
        }

        return largest;
        
    }
    
    /**
     * Helper function which will check if the current number 
     * is larger than any number in the array
     */
    public static void check(int num, int[] largest){
        for(int i = largest.length -1; i >= 0; i--){
            if(num > largest[i]){
                shift(largest, num, i);
            }
        }
    }
    
    /**
     * Helper function to maintain that the array is sorted.
     */
    public static void shift(int largest, int num, int index){
        for(int i = 0; i <= index; i++){
            if(i == index){
                largest[i] = num;
            }else{
                largest[i] = largest[i + 1];
            }
        }
    }
}
