/*
 Zavala Concha Silvia Nallely
 */
package TabladeMultiplicar;

/**
 *
 * @author Hogar
 */
public class Main {

    /**
     * @param args the command line arguments
     */
   
        
        static int[][] generaMatriz(int filas, int columnas){
        int i,j;
        int[][] matriz = new int[filas][columnas];
        
       
        for (i=0 ; i < matriz.length ; i++){
            matriz[i][0]=i;
            matriz[0][i]=i;
        }
     
        for (i=1 ; i < matriz.length ; i++){
            for (j=1 ; j < matriz[i].length ; j++){
               matriz[i][j]=i*j; 
            }
        }
        return matriz;
    }
  
    static void muestraMatriz(int[][] matriz){
        int i,j;
        
        for (i=0; i < matriz.length ; i++){
            for (j=0 ; j < matriz[i].length ; j++){
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] matriz=new int[11][11];
        
        matriz=generaMatriz(11,11);
        muestraMatriz(matriz);        
        
   
        
        
        
        
        
        
    }
    
}
