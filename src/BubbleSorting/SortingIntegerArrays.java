package BubbleSorting;

public class SortingIntegerArrays {

    public static void main(String[] args) {

        int[] numbers = {54, 24,  -50, -1,  156, 255, 14,   0};
        int[] sorted = numArrays(numbers);
        for (int s: sorted) {
            System.out.print(s + "\t");
        }
    }

    public static int[] numArrays(int[] numbers){

        int swapper;
        for ( int x=0; x < numbers.length; x++){
            for (int y=x+1; y < numbers.length; y++){
                if (numbers[x] > numbers[y]){
                    swapper = numbers[x];
                    numbers[x] = numbers[y];
                    numbers[y] = swapper;
                }
            }
        }
        return numbers;
    }
}
