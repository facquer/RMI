/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author javier
 */
public class RMI extends UnicastRemoteObject implements Calculadora {

    // implementa la interfaz del servidor 
    //OBJETO REMOTO
    public RMI() throws RemoteException {
        int a, b;
    }

    @Override
    public int suma(int a, int b) throws RemoteException {
        System.out.println("Sumando " + a + " + " + b);
        return a + b;
    }

    public int resta(int a, int b) throws RemoteException {
        System.out.println("Restando " + a + " + " + b);
        return a - b;
    }

    public int multi(int a, int b) throws RemoteException {
        System.out.println("Multiplicando " + a + " + " + b);
        return a * b;
    }

    public double divi(int a, int b) throws RemoteException {
        System.out.println("Dividiendo " + a + " + " + b);
        return a / b;
    }

}
