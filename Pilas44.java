
package pilas4;
//@sandy 
import java.util.Random;
import java.util.Scanner;

public class Pilas44 {
    char pila[]= new char [26]; //Tamaño de la pila
    int tope= 0;//Creacion de la variable tope 
    Random rnd =new Random(); 
    public char abecedario[]= new char[26];
    
    public void llenaarpila(){ //Creacion del primer metodo
       Random letra = new Random(); 
        for(int i=0; i <26; i++){
            //char letra=(char)(Math.random()*26 + 'A');
            char abecedario = (char) (letra.nextInt(26)+ 'A');
            pila[tope]=abecedario;
            abecedario++;
            tope++;
        }
        
    }
public void mostrarpila(){
for(int i=tope-1;i>=0;i--){
            System.out.print(""+pila[i]);
        }
}
    public void eliminarpila(){
    tope--;
    System.out.println("Dato eliminado");
    }
            
    public void agregarpila(char v){
        pila[tope]=v;
        tope++;
         System.out.println("Dato agregado ");
    }
            public void ordenarpila(){
                int i,j, aux;
                for(i=0; i<pila.length;i++){
                    for(j=i+1; j<pila.length;j++){
                        if(pila[i]<pila[j]){
                            aux=pila[i];
                            pila[j]=(char)aux;
                        }
                    }
                }
                System.out.print("Ordenar");
                for(i=0; i<pila.length;i++){
                    System.out.print(" "+pila[i]+"");
                }
                }
                
    
     public static void main(String[]args) {
         Pilas44 p= new Pilas44();
         Scanner sc= new Scanner (System.in);
         int opt=0;
         do{
             System.out.println("\n1 Llenar\n"
                     + "2 Mostrar\n"
                     + "3 eliminar\n"
                     + "4 Agregar un dato manualmente\n"
                     + "5 Ordenar abecedario\n"
                     + "6 Salir :)");
             switch(opt=sc.nextInt()){
                 case 1:
                     p.llenaarpila();
                     break;
                 case 2:
                     p.mostrarpila();
                     break;
                 case 3:
                     p.eliminarpila();
                     break;
                 case 4:
                    System.out.println("ingresa el dato");
                    char v=sc.next().charAt(0);
                    p.agregarpila(v);                     
                    break; 
                     case 5:
                       p.ordenarpila();
                      break; 
             }
         }while (opt !=6);
     }   
}
