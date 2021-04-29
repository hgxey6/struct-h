package binary_search;

public class BinarySearchExample {

    // Функция binarySearch получает отсортированный массив и значение.
    // Если значение присутствует в массиве, то функция возвращает индекс значения.
    public static Integer binarySearch(int[] array, int value) {
        // low и high хранят границы списка, где выполняется поиск
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2; // проверка средний элемент
            int guess = array[mid];

            if (guess == value) // Значение найдено
                return mid;
            if (guess > value)  // много
                high = mid - 1;
            else                // мало
                low = mid + 1;
        }
        return null; // значение не существует
    }

    public static void main(String[] args) {
        //             0  1  2  3  4  5
        int[] array = {1, 3, 5, 7, 9, 11};
        System.out.println(binarySearch(array, 3));
        System.out.println(binarySearch(array, 2));
    }
}
