package clases;
import java.util.Scanner;


public class ClasePadre_Abstracta {
    protected int transacciones, retiro, deposito;
    private static int saldo;
    Scanner entrada  = new Scanner(System.in);
    
    //Creamos metodo Operaciones
    public void Operaciones(){
        int bandera = 0;
        int seleccion;
        
        do{
            System.out.println("Por favor seleccione una opcion: ");
            System.out.println("    1.- Consultad de saldo.");
            System.out.println("    2.- Retiro de efectivo.");
            System.out.println("    3.- Deposito de efectivo.");
            System.out.println("    4.- Salir.");
            seleccion = entrada.nextInt();
            
            //Validamos los campos por si el usuario presiona otra tecla a las indicadas
            if(seleccion );        
        }while(bandera == 0);
        
    }

    
    
    
}
