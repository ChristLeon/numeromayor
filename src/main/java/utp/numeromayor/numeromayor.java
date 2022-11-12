package utp.numeromayor;

import java.util.Scanner;

public class numeromayor {
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        System.out.println("Ingrese la cantidad de numeros que desea evaluar");
        
        int cantidadNumeros= scanner.nextInt();
        int numeroMayor=0;
        
        for (int i = 0;i < cantidadNumeros;i++){
            System.out.println("Digite el numero "+(i+1)+" :"); 
            int tmp=scanner.nextInt();
            if(i==0){
                numeroMayor=tmp;
            }else if(tmp>numeroMayor){
                numeroMayor=tmp;
            }
        }
        System.out.println("El numero mayor es: "+numeroMayor);
    }
    
}
