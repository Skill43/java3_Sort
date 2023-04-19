public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {99,45,6,48,1,12,4,68,9,13,9};

        selectionSort(arr);

        for (int i : arr) {
            System.out.print(i + "\n");
        }
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Один за другим перемещаем границу неотсортированной части
        for (int i = 0; i < n - 1; i++) {
            // Находим минимальный элемент в неотсортированной части массива
            int min_idx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min_idx]) {
                    min_idx = j;
                }
            }

            // Меняем найденный минимальный элемент со значением в начале неотсортированной части
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
}
