package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MenuPrincipal {
    public static void mostrarMenu(Scanner scanner) {
        List<Integer> listaDatos = new ArrayList<>();
        int opcion;
        do {
            System.out.println("\n========== MENÚ PRINCIPAL ==========");
            System.out.println("1. Cargar datos desde un archivo CSV");
            System.out.println("2. Ordenar datos usando Bubble Sort");
            System.out.println("3. Ordenar datos usando Enhanced Bubble Sort");
            System.out.println("4. Ordenar datos usando Quick Sort");
            System.out.println("5. Ordenar datos usando Selection Sort");
            System.out.println("6. Ordenar datos usando Merge Sort");
            System.out.println("7. Buscar un número con Binary Search");
            System.out.println("8. Salir");
            System.out.print("Ingrese una opción: ");

            opcion = scanner.nextInt();
            scanner.nextLine();  // Limpiar el buffer

            switch (opcion) {
                case 1:
                    CargaDatosCSV.opcionCargarDatos(scanner, listaDatos);
                    break;
                case 2:
                    BubbleSort.opcionBubbleSort(listaDatos);
                    break;
                case 3:
                    EnhancedBubbleSort.opcionEnhancedBubbleSort(listaDatos);
                    break;
                case 4:
                    QuickSort.opcionQuickSort(listaDatos);
                    break;
                case 5:
                    SelectionSort.opcionSelectionSort(listaDatos);
                    break;
                case 6:
                    MergeSort.opcionMergeSort(listaDatos);
                    break;
                case 7:
                    BinarySearch.opcionBinarySearch(listaDatos, scanner);
                    break;
                case 8:
                    System.out.println("👋 Saliendo del programa...");
                    break;
                default:
                    System.out.println("⚠️ Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 8);
    }
}
