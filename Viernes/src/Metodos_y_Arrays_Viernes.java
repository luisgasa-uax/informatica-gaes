public class Metodos_y_Arrays_Viernes {

    // TODO Profe: Revisar las declaraciones de variables para realizarlas al comienzo de los métodos
    // TODO Alumno: Implementar el método posicionNumeroMasGrande(arrayEnteros)
    public static void main(String[] args){
        // Declaración e inicialización de variables de tipo array
        // tipo_datos[] nombreArray = new tipo_datos[tamaño]
        char[] arrayChar = new char[10];

        int[] arrayEnteros = rellenarArrayEnteros(10); // tamaño
        imprimeArray(arrayEnteros);
        System.out.println( numeroMasGrande(arrayEnteros));
        System.out.println("El número más grande está en la posición: " + posicionNumeroMasGrande(arrayEnteros));
    }

    /**
     * Devuelve el valor entero ({@code int}) correspondiente a la posición del elemento de mayor tamaño del
     * array de números enteros recibido ({@code 0}
     *
     * @param      arrayEnteros     array de números enteros {@code int}
     * @return     número entero {@code int} correspondiente a la posición del valor más alto
     */

    private static int posicionNumeroMasGrande(int[] arrayEnteros) {
        int posicionNumeroMasGrande = -1;

        // desarrolla aquí tu solución

        return posicionNumeroMasGrande;
    }

    private static int numeroMasGrande(int[] arrayEnteros) {
        int masGrande = -1;

        // recorremos el array con un bucle
        for (int posicion = 0; posicion < arrayEnteros.length; posicion++) {
            // comparamos el elementoLeido con masGrande
            int elementoLeido = arrayEnteros[posicion];
            if( elementoLeido > masGrande ) {
                // si elementoLeido > masGrande
                masGrande = elementoLeido;
            }
            /*
            else {
                // si no, continuo
                continue;
            }
            */
        }
        return masGrande;
    }

    private static int numeroAleatorio(){
        return (int) ((Math.random()*100)+1);
    }

    private static void imprimeArray(int[] arrayEnteros) {
        //recorro el array hasta el tamaño de este
        // leo el valor de la posición
        // imprimo el valor leído
        for (int posicion = 0; posicion < arrayEnteros.length; posicion++) {
            int elementoLeido = arrayEnteros[posicion];
            System.out.printf("Posicion %d: %d\n", posicion, elementoLeido);
        }
    }

    private static int[] rellenarArrayEnteros(int tamanio) {
        // tipo_datos nombreArray[] = new tipo_datos[tamaño]
        int[] arrayInt = new int[tamanio];
        for (int posicion = 0; posicion < tamanio; posicion++) {
            //int numero = (int) ((Math.random()*100)+1);
            int numero = numeroAleatorio();
            arrayInt[posicion] = numero;
        }
        return arrayInt;
    }
}
