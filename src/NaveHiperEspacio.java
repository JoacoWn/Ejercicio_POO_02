import java.util.Scanner;

public class NaveHiperEspacio {

    /**
     * Método principal que inicia la aplicación.
     * TODO: Llamar al método menu para iniciar la interacción con el usuario.
     */
    public static void main(String[] args) {
        menu();
    }
    public static void menu() {

        int opcion;
        do {
            mostrarOpciones();
            opcion = obtenerOpcion();
            ejecutarOpcion(opcion);
        } while (opcion != 9);  // ✅ Punto y coma, sin llave

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
    public static void ejecutarOpcion(int opcion, Scanner sc) {
        // TODO: Implementar switch-case para cada opción (1 a 6).
            switch (opcion){

                case 1:
                    operacionSuma();

                case 2:
                    operacionResta();

                case 3:
                    operacionMultiplicacion();

                case 4:
                    operacionInversa();

                case 5:
                    operacionDivision();

                case 6:
                    break;
            }
    }

    /**
     * Realiza la operación de suma de dos matrices 2x2.
     * TODO: Leer dos matrices 2x2, sumar elemento a elemento e imprimir el resultado.
     */
    public static void operacionSuma(Scanner sc) {
        // TODO: Invocar leerMatriz para ambas matrices, sumar y llamar a imprimirMatriz.
            double [][] matrizA = leerMatriz(sc, "A");
            double [][] matrizB = leerMatriz(sc, "B");
            double [][] resultado = new double[2][2];

            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 2; j++) {
                    resultado[i][j] = matrizA[i][j] + matrizB[i][j];  // Índices correctos
                }
            }

            imprimirMatriz(resultado);  // Llamada correctamente colocada
        }

    }

    /**
     * Realiza la operación de resta de dos matrices 2x2.
     * TODO: Leer dos matrices 2x2, restar elemento a elemento e imprimir el resultado.
     */
    public static void operacionResta() {
        // TODO: Invocar leerMatriz para ambas matrices, restar y llamar a imprimirMatriz.

        double [][] matrizA = leerMatriz();
        double [][] matrizB = leerMatriz();
        double [][] resultado = new double[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                resultado[i][j] = matrizA[i][j] - matrizB[i][j];  // Índices correctos
            }
        }

        imprimirMatriz(resultado);  // Llamada correctamente colocada
    }
}
    }

    /**
     * Realiza la operación de multiplicación de dos matrices 2x2.
     * TODO: Leer dos matrices 2x2, multiplicarlas utilizando la suma de productos y mostrar el resultado.
     */
    public static void operacionMultiplicacion(Scanner sc) {
        // TODO: Invocar leerMatriz para ambas matrices, multiplicar y llamar a imprimirMatriz.
    }

    /**
     * Realiza la operación de cálculo de la inversa de una matriz 2x2.
     * TODO: Leer una matriz 2x2, calcular su determinante, verificar invertibilidad y mostrar la inversa.
     */
    public static void operacionInversa(Scanner sc) {
        // TODO: Invocar leerMatriz, calcular determinante, verificar y calcular la inversa, luego llamar a imprimirMatriz.
    }

    /**
     * Realiza la operación de división de matrices resolviendo A * X = B.
     * TODO: Leer la matriz A, verificar que sea invertible, calcular su inversa, leer la matriz B y mostrar el resultado de A^-1 * B.
     */
    public static void operacionDivision(Scanner sc) {
        // TODO: Invocar leerMatriz para A y B, calcular inversa de A, multiplicar por B y llamar a imprimirMatriz.
    }

    /**
     * Lee una matriz 2x2 desde la entrada estándar.
     * TODO: Solicitar al usuario cada elemento de la matriz especificada y retornar la matriz.
     */
    public static double[][] leerMatriz(Scanner valores) {
        // TODO: Implementar lectura de 2x2 elementos y retornar la matriz.
            double[][] matriz = new double[2][2];

            for (int i = 0; i < 2 ; i++) {
                for (int j = 0; j < 2 ; j++) {
                    System.out.printf("Ingrese valor para fila" + i + "columna : " + j);
                    matriz[i][j] = valores.nextDouble();
                }
            }
            return matriz;
    }

    /**
     * Imprime una matriz 2x2 en formato sencillo.
     * TODO: Recorrer la matriz y mostrar cada uno de sus elementos.
     */
    public static void imprimirMatriz(double[][] matriz) {
        // TODO: Implementar impresión de cada elemento de la matriz.

            System.out.print(matriz[i][j]);
    }

    /**
     * Calcula el determinante de una matriz 2x2.
     * TODO: Calcular y retornar el determinante utilizando la fórmula: ad - bc.
     */
    public static double determinante(double[][] matriz) {
        // TODO: Implementar el cálculo del determinante.
    }

    /**
     * Suma dos matrices 2x2.
     * TODO: Sumar elemento a elemento y retornar la matriz resultante.
     */
    public static double[][] sumaMatrices(double[][] A, double[][] B) {
        // TODO: Implementar la suma de dos matrices.
    }

    /**
     * Resta dos matrices 2x2.
     * TODO: Restar elemento a elemento y retornar la matriz resultante.
     */
    public static double[][] restaMatrices(double[][] A, double[][] B) {
        // TODO: Implementar la resta de dos matrices.
    }

    /**
     * Multiplica dos matrices 2x2.
     * TODO: Calcular la suma de productos correspondiente a cada elemento y retornar la matriz resultante.
     */
    public static double[][] multiplicacionMatrices(double[][] A, double[][] B) {
        // TODO: Implementar la multiplicación de dos matrices.
    }

    /**
     * Calcula la inversa de una matriz 2x2.
     * TODO: Calcular el determinante; si es 0 retornar null, de lo contrario calcular y retornar la inversa.
     */
    public static double[][] inversaMatriz(double[][] A) {
        // TODO: Implementar el cálculo de la inversa de una matriz.
    }

    /**
     * Resuelve la ecuación A * X = B para X, usando la inversa de A.
     * TODO: Si A no es invertible, retornar null; de lo contrario, multiplicar A^-1 por B y retornar el resultado.
     */
    public static double[][] divisionMatrices(double[][] A, double[][] B) {
        // TODO: Implementar la división de matrices (A^-1 * B).
    }
}