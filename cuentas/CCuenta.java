package cuentas;

/**
 * Las cuentas pueden hacer ingresos y reintegros y saber el saldo de la cta. 
 * @author Fernando Peinado Recas
 * @version 1.0
 * @since 1.0
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInteres;
    
/**
 * Constructor sin parámetros
 */       
    public CCuenta()
    {
    }
    
/**
 * Constructores para la clase CCuenta
 * El segundo con los parámetros 
 * @param nom nombre del titular cta.
 * @param cue formato de la cta.
 * @param sal es el saldo de la cta.
 * @param tipo es el tipo de interés de la cta.
 */      
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }

 
    		//Área de getters y setters
/**
 * getNombre
 * @return nombre
 */         
    public String getNombre() {
		return nombre;
	}
/**
 * setNombre
 * @param nombre Es el del titular de la cta.
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * getCuenta
 * @return cuenta
 */  
	public String getCuenta() {
		return cuenta;
	}
/**
 * setCuenta
 * @param cuenta  Es el formato de la cta.
 */
	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}
/**
 * getSaldo
 * @return saldo
 */
	public double getSaldo() {
		return saldo;
	}
/**
 * setSaldo
 * @param saldo Es el saldo que tiene la cta.
 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * getTipoInteres
 * @return tipoInteres
 */
	public double getTipoInteres() {
		return tipoInteres;
	}
/**
 * setTipoInteres
 * @param tipoInteres Es el tipo de interés de la cta.
 */
	public void setTipoInteres(double tipoInteres) {
		this.tipoInteres = tipoInteres;
	}
    
/**
 * Respuesta al saldo que tiene la cuenta
 * @return saldo
 */    
    public double estado()
    {
        return saldo;
    }
    
/**
 * Método para ingresar cantidades
 * @param cantidad es la cantidad a ingresar
 * @throws Exception  salta con:No se puede retirar una cantidad negativa o No hay suficiente saldo
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        saldo = saldo + cantidad;
    }
    
/**
 * Método para retirar cantidades
 * @param cantidad es la cantidad a reintegrar
 * @throws Exception salta con:No se puede ingresar una cantidad negativa
 */ 
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        saldo = saldo - cantidad;
    }
}
