package clases;

import java.util.Scanner;

public abstract class ClasePadre_Abstracta {

    Scanner entrada = new Scanner(System.in);
    protected int transacciones, retiro, deposito;
    private static int saldo;

    //Metodo para operaciones
    public void Operaciones() {
      
        int seleccion = 0;

        do {
            do {
                System.out.println("Selecciona una opción");
                System.out.println("   1.- Consulta de saldo.");
                System.out.println("   2.- Retiro de efectivo.");
                System.out.println("   3.- Deposito de efectivo.");
                System.out.println("   4.- Salir.");
                seleccion = entrada.nextInt();

                System.out.println("---------------------------------");
            } while (seleccion > 4 || seleccion < 1);

            switch (seleccion) {
                case 1:
                    ClasePadre_Abstracta mensajero = new ClaseHija_Consulta();
                    mensajero.Transacciones();
                    break;

                case 2:
                    ClasePadre_Abstracta mensajero_r = new ClaseHija_Retiro();
                    mensajero_r.Transacciones();
                    break;
                case 3:
                    ClasePadre_Abstracta mensajero_d = new ClaseHija_Deposito();
                    mensajero_d.Transacciones(); 
                    
                    break;
                case 4:
                    System.out.println("---------------------------------");
                    System.out.println("¡Gracias!, vuelva pronto.");
                    System.out.println("---------------------------------");
                    break;
            }
        } while (seleccion != 4);
    }

    //Metodo para solicitar cantidad de dinero
    public void Retiro() {
        retiro = entrada.nextInt();
    }

    //Metodo para solicitar deposito
    public void Deposito() {
        deposito = entrada.nextInt();
    }

    //Metodo abstracto
    public abstract void Transacciones();

    //Metodos Setter y getter
    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;

    }

}
