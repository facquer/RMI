/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author javier
 */
public interface Calculadora extends Remote {
    
    
    // INTERFAZ 
    public int suma(int a, int b) throws RemoteException;
    public int resta(int a, int b) throws RemoteException;
    public int multi(int a, int b) throws RemoteException;
    public double divi(int a, int b) throws RemoteException;
}
