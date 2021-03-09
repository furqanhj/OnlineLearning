package Loops;

public class ForLoops {

    public static void main(String[] args) {

        int[] listOfNumbers = {123, -55, -45, -15, 0, 45, 2, 13, 50, 116, 255};
        ForLoops obj = new ForLoops();
        int[] listSorted = obj.sortingArray(listOfNumbers);
        for (int s : listSorted)
            System.out.print(s + "\t");

    }

    public int[] sortingArray(int[] numList){
        int placeHolder;
        for(int x = 0; x < numList.length; x++)
            for (int y = x+1; y < numList.length; y++)
                if (numList[x] > numList[y]){
                    placeHolder = numList[x];
                    numList[x] = numList[y];
                    numList[y] = placeHolder;
                }
        return numList;
    }
}
