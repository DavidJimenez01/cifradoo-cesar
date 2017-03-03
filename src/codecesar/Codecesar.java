package codecesar;

import java.util.Scanner;



/**
 *
 * @author david jimenez - duvan poveda
 */
public class Codecesar {
    
    public static void cesar(){
    Scanner teclado =new Scanner (System.in);
    //variable que guarda un arreglo de letras del abecedario y caracteres especiales
    char abecedario[]= {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z','+','-',' ' ,'*'};
    // variables que guardan contadores de un arreglo y la decision del usuario
    byte i,j,decision;
    //imprime mensaje de solicitud al usurio
    System.out.println("desea codificar (1) o decodificar (2)");
    //variable decision guarda lo que entra por teclado
    decision= teclado.nextByte();
    // solicita al usuario la clave 
    System.out.println("digite la clave");
    byte clave;
    // clave= lo que recibe por teclado del usuario
    clave=teclado.nextByte();
    //pide al usuario la frase a codificar o decodificar
    System.out.println("digite la frase");
    //guarda en la variable buffer el mensaje a codificar o decodificar
        String buffer= teclado.nextLine();
    if(decision==1){
        
    }
   
    
    }

    /**
     *
     * @param abecedario
     * @param buffer
     * @return buffer comparado
     */
    // esta funcion compara cada letra contenida en el buffer con cada letra contenida en el arreglo abecedario
    public static int comparar(char[] abecedario,String[]buffer){
         byte posicion=0;
         byte i,j,k;
         // arreglo de buffer donde queda almacenado el posicionamiento de cada letra luego de ser comparado
         int[] buffercomparado= new buffercomparado[2000];
         //i=recorre una a una las posciciones en buffer
         //j=recorre una a una las posciciones en abecedario 
         for(i=0;i<=buffer.length;i++){
            for(j=0;j<=abecedario.length;j++){
                //si las letras no son iguales aumenta posicion
                posicion++;
                // si son iguales entra en un for que aumentara k++ llenando cada posicion
                if(i==j){
                    for(k=0;k<=buffer.length;k++){
                        buffercomparado[k]=posicion;
                    }
                 
                }
            }
         }
        return 0;
    }
   
    
    public static void codificar(){
        
    }
    

    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        cesar();
 
    }

    
}
