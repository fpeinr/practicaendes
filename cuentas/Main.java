package cuentas;

/**
 * MODIFICACI�N PARA HACE EL SEGUNDO COMMIT
 * Inicio del programa. Sobre una cuenta dada de un titular, con saldo y tipo de inter�s
 * se realizan dos operaciones: una de retirar y otra de ingresar
 * @author Fernando Peinado Recas
 * @version 1.0
 * @since 1.0
 */
public class Main {

/**
 * M�todo principal
 * @param args Aqu� van los argumentos de la l�nea de comandos
 */
    public static void main(String[] args) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio Lopez","1000-2365-85-1230456789",300,0);
        operativa_cuenta(cuenta1, 0);
    }
    
/**
 * M�todo que intenta realizar dos operaciones, la primera de reintegro y la segunda de ingreso en una cta.
 * @param cuenta1 que es del tipo CCuenta
 * @param cantidad que en este caso no se usa
 * @exception Exception e
 */
	private static void operativa_cuenta(CCuenta cuenta1, double cantidad) {
		double saldoActual;
		saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            cuenta1.retirar(2300);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
