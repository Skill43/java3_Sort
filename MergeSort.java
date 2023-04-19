public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {99,45,6,48,1,12,4,68,9,13,9};

        mergeSort(arr, 0, arr.length - 1);

        for (int i : arr) {
            System.out.print(i + "\n");
        }
    }

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            // Находим среднюю точку
            int mid = (left + right) / 2;

            // Сортируем левую и правую половины
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);

            // Сборка отсортированного массива
            merge(arr, left, mid, right);
        }
    }

    // Слияние двух подмассивов arr[l..m] и arr[m+1..r]
    public static void merge(int[] arr, int left, int mid, int right) {
        // Находим размеры двух подмассивов для слияния
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Создаем временные подмассивы
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Копируем данные во временные подмассивы
        for (int i = 0; i < n1; ++i)
            L[i] = arr[left + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        // Объединяем временные подмассивы

        // Инициализация индексов первого и второго подмассива
        int i = 0, j = 0;

        // Инициализация индекса слияния
        int k = left;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        // Копируем оставшиеся элементы L[]
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }

        // Копируем оставшиеся элементы R[]
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}
