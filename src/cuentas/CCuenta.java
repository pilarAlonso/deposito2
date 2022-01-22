/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentas;

/**
 *
 * @author Pilar Alonso Suela
 * Clase CCuenta
 */
public class CCuenta {
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Método get que retorna el nombre de la cuenta y no tiene parámetros
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método set que asignará un valor a la variable de clase nombre y es de tipo void
     * @param nombre String
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este método retorna un String cuenta
     * @return cuenta String
     */
    public String getCuenta() {
        return cuenta;
    }

    /**
     * Este método asigna un valor a la variable cuenta
     * @param cuenta String
     */
    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    /**
     * este método retorna el saldo
     * @return saldo double
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * este método setea la variable de clase saldo y es de tipo void
     * @param saldo double
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Este método retorna el tipo de interés
     * @return tipoInterés double
     */
    public double getTipoInterés() {
        return tipoInterés;
    }

    /**
     * este método setea la variable de clase tipo de interés
     * @param  tipoInterés double
     */
    public void setTipoInterés(double tipoInterés) {
        this.tipoInterés = tipoInterés;
    }
    

    /**
     * Constructor vacío de la clase CCuenta
     */
    public CCuenta()
    {
    }
/**
 * Constructor de la clase cuenta
 * @param nom String
 * @param cue String
 * @param sal double
 * @param tipo double
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        nombre =nom;
        cuenta=cue;
        saldo=sal;
    }
/**
 * método que retorna el valor de saldo llamando al método get
 * @return saldo double
 * @see getSaldo()
 */
    public double estado()
    {
        return getSaldo();
    }
/**
 * Metodo que permite ingresar una cantidad y es de tipo void
 * @param cantidad double
 * @throws Exception 
 * @see getSaldo()
 * @see setSaldo(double saldo)
 */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }
/**
 * método que permite retirar una cantidad de una cuenta
 * @param cantidad double
 * @throws Exception 
 * @see getSaldo()
 * @see setSaldo(double saldo)
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }
}

