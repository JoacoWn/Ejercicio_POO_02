import java.util.Scanner;

public class NaveHiperEspacio {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        int opcion;
        Scanner sc = new Scanner(System.in);
        do {
            mostrarMenu();
            opcion = obtenerOpcion(sc);
            ejecutarOpcion(opcion, sc);
        } while (opcion != 8);
    }

    public static void mostrarMenu() {
        System.out.println("___Bienvenido a la Nave Hiper-Espacio___");
        System.out.println("___Que operación matricial quiere hacer?___");
        System.out.println("___Opción 1: Crear Matriz___");
        System.out.println("___Opción 2: Eliminar Matriz___");
        System.out.println("___Opción 3: Sumar Matriz___");
        System.out.println("___Opción 4: Restar Matriz___");
        System.out.println("___Opción 5: Multiplicar Matriz___");
        System.out.println("___Opción 6: Inversa de la Matriz___");
        System.out.println("___Opción 7: Dividir Matriz___");
        System.out.println("___Opción 8: Cerrar Programa___");
    }

    public static int obtenerOpcion(Scanner sc) {
        System.out.print("Ingrese una opción: ");
        return sc.nextInt();
    }

    public static void ejecutarOpcion(int opcion, Scanner sc) {
        switch (opcion) {
            case 3:
                operacionSuma(sc);
                break;
            case 4:
                operacionResta(sc);
                break;
            case 5:
                operacionMultiplicacion(sc);
                break;
            case 6:
                operacionInversa(sc);
                break;
            case 7:
                operacionDivision(sc);
                break;
            case 8:
                System.out.println("Cerrando programa...");
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }

    public static void operacionSuma(Scanner sc) {
        double[][] matrizA = leerMatriz(sc, "A");
        double[][] matrizB = leerMatriz(sc, "B");
        double[][] resultado = sumaMatrices(matrizA, matrizB);
        imprimirMatriz(resultado);
    }

    public static void operacionResta(Scanner sc) {
        double[][] matrizA = leerMatriz(sc, "A");
        double[][] matrizB = leerMatriz(sc, "B");
        double[][] resultado = restaMatrices(matrizA, matrizB);
        imprimirMatriz(resultado);
    }

    public static void operacionMultiplicacion(Scanner sc) {
        double[][] matrizA = leerMatriz(sc, "A");
        double[][] matrizB = leerMatriz(sc, "B");
        double[][] resultado = multiplicacionMatrices(matrizA, matrizB);
        imprimirMatriz(resultado);
    }

    public static void operacionInversa(Scanner sc) {
        double[][] matrizA = leerMatriz(sc, "A");
        // TODO: Implementar la inversa de la matriz
    }

    public static void operacionDivision(Scanner sc) {
        double[][] matrizA = leerMatriz(sc, "A");
        double[][] matrizB = leerMatriz(sc, "B");
        // TODO: Implementar la división de matrices
    }

    public static double[][] leerMatriz(Scanner sc, String nombre) {
        double[][] matriz = new double[2][2];
        System.out.println("Ingrese los valores para la matriz " + nombre + ":");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.printf("Ingrese valor para fila %d columna %d: ", i, j);
                matriz[i][j] = sc.nextDouble();
            }
        }
        return matriz;
    }

    public static void imprimirMatriz(double[][] matriz) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] sumaMatrices(double[][] A, double[][] B) {
        double[][] resultado = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = A[i][j] + B[i][j];
            }
        }
        return resultado;
    }

    public static double[][] restaMatrices(double[][] A, double[][] B) {
        double[][] resultado = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = A[i][j] - B[i][j];
            }
        }
        return resultado;
    }

    public static double[][] multiplicacionMatrices(double[][] A, double[][] B) {
        double[][] resultado = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = 0;
                for (int k = 0; k < 2; k++) {
                    resultado[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return resultado;
    }

    public static double[][] inversaMatriz(double[][] A) {
        // TODO: Implementar el cálculo de la inversa de una matriz.

        double[][] adjunta = {
                {A[1][1], -A[0][1]},
                {-A[1][0], A[0][0]}
        };

        double[][] inversa = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                inversa[i][j] = adjunta[i][j] / determinante(A);
            }
        }

        return inversa;
    }

    public static double[][] divisionMatrices(double[][] A, double[][] B) {
        // TODO: Implementar la división de matrices (A^-1 * B).

        A = inversaMatriz(A);

        double[][] resultado = multiplicacionMatrices(A, B);
        return resultado;
    }

    public static double determinante(double[][] matriz) {
        // TODO: Implementar el cálculo del determinante.

        double determinante = matriz[0][0] * matriz[1][1] - matriz[0][1] * matriz[1][0];
        return determinante;
    }
}
