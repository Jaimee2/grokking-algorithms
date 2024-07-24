import java.util.ArrayList;
import java.util.List;

public class selectionSort {

    public static void main(String[] args) {
        System.out.println(selectionSort(new ArrayList<>(List.of(1, 3, 3, 2, 1, 6))));
    }

    public static List<Integer> selectionSort(List<Integer> arrayList) {
        int initArraySize = arrayList.size(), smaller;
        List<Integer> newArray = new ArrayList<>();

        for (int i = 0; i < initArraySize; i++) {
            smaller = findSmaller(arrayList);
            newArray.add(smaller);
            arrayList.remove(Integer.valueOf(smaller));
        }

        return newArray;
    }

    public static int findSmaller(List<Integer> arrayList) {
        int smallerElement = arrayList.get(0);

        for (Integer element : arrayList)
            if (smallerElement > element) smallerElement = element;

        return smallerElement;
    }


}
