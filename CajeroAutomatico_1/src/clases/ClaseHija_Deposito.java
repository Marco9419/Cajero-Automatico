package clases;

public class ClaseHija_Deposito extends ClasePadre_Abstracta{
    
    @Override
    public void Transacciones(){
        
        System.out.print("¿cuanto deseas depositar ?: ");
        Deposito();
        
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("---------------------------------");
        System.out.println("Depositaste : $" + deposito); 
        System.out.println("Tu saldo actual es de: $"+ getSaldo());
        System.out.println("---------------------------------");
    }

}
