package POO2.exercicios.exerciciosC;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class exercicioC {

    // 1
    public <T extends Comparable> boolean checkArrays(T array1[], T array2[]) {

        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }

        return true;
    }

    // 2
    public <T extends Number> double[] sumEvenOdd(List<T> numbers) {

        double even = 0;
        double odd = 0;

        for (T num : numbers) {
            double value = num.doubleValue();
            if (value % 2 == 0) {
                even += value;
            } else {
                odd += value;
            }
        }

        return new double[]{even, odd};

    }

    // 3
    public <T extends Number, Comparable> int targetElement(List<T> numbers, T element) {

        for (T number : numbers) {
            if (number.equals(element)) {
                return numbers.indexOf(number);
            }
        }

        return -1;
    }

    // 4
    public <T> List<T> reverse(List<T> elements) {

        List<T> reversedList = new ArrayList<>();
        for (int i = elements.size() - 1; i >= 0; i--) {
            reversedList.add(elements.get(i));
        }

        return reversedList;
    }

    // 5
    public <T> List<T> mergedList(List<T> list1, List<T> list2) {

        List<T> listMerge = new ArrayList<>();

        int maxSize = Math.max(list1.size(), list2.size());
        for (int i = 0; i < maxSize; i++) {
            if (i < list1.size()) {
                listMerge.add(list1.get(i));
            }
            if (i < list2.size()) {
                listMerge.add(list2.get(i));
            }
        }

        return listMerge;
    }

    // 6
    public static <T> ArrayList<T> filterList(List<T> originalList, Predicate<T> predicate) {
        ArrayList<T> filteredList = new ArrayList<>();
        for (T element : originalList) {
            if (predicate.test(element)) {
                filteredList.add(element);
            }
        }
        return filteredList;
    }
}
