package pilas;

import java.util.Scanner;


public class Pilas {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //variables de la pila 
        int tope =0 ,tam,opt;

        String pila[] = new String[tam = 27];

        //menu
        do {
            System.out.println("\n1- Llenar\n"
                    + "2- Mostrar\n"
                    + "3- Eliminar\n"
                    +"4-Agregar\n");
            switch (opt = sc.nextInt()) {

                case 1:
                 
                   char [] abecedario = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','ñ','o','p','q','r','s','t','u','v','w','x','y','z'};
                     
                    //char pila[tope] = ( abecedario.length );
                    tope++;
                    System.out.println(abecedario );
                    
                    break;
                    
                    
                   
                case 2:
                    if (tope > 0) {
                        // Mostrar los elementos
                        System.out.println("Los elementos de la pila son:");
                        // Iniciamos con tope-1, porque el vector inicia en posición 0
                        for (int i = tope - 1; i >= 0; i--) {
                            System.out.println("dato " + pila[i]);
                        }
                    } else {
                        System.out.println("Pila vacía...");
                    }
                    break;

                case 3:
                    if (tope != 0) {
                        // Tope nos indica la posición en la que vamos a guardar un valor
                        // Por eso le restamos una unidad para sobreescribir un elemento
                        System.out.println("Eliminando el último valor");
                        tope--;
                    } else {
                        System.out.println("No hay elementos para eliminar.");
                    }
                    break;

                case 4:
                    if (tope < tam) {
                        // Pedir dato
                        System.out.println("Ingrese dato: ");
                        // Dato se guarda en la posición de la variable tope
                        pila[tope] = sc.nextLine();
                        pila[tope] = sc.nextLine();
                        // Aumentamos una unidad a tope para guardar el siguiente valor en la siguiente posición
                        tope++;
                    } else {
                        System.out.println("Pila llena...");
                    }
                    break;

            }

        } while (opt != 5);
    }

}
