public class BubbleSortOptimizado {

    // Método que implementa Bubble Sort optimizado
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        int newN;

        do {
            newN = 0; // Marca la última posición donde hubo intercambio

            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    // Intercambio
                    int temp = arr[i - 1];
                    arr[i - 1] = arr[i];
                    arr[i] = temp;

                    newN = i; // Actualizamos la última posición de intercambio
                }
            }

            n = newN; // Reducimos el rango de la siguiente pasada
        } while (n > 0);
    }

    // Método auxiliar para imprimir el arreglo
    public static void imprimirArreglo(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // Método principal para probar el algoritmo
    public static void main(String[] args) {
        int[] datos = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Arreglo original:");
        imprimirArreglo(datos);

        bubbleSort(datos);

        System.out.println("Arreglo ordenado:");
        imprimirArreglo(datos);
    }
}