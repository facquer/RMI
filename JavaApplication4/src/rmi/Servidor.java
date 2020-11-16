/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author javier
 */
public class Servidor {
    
    public static void main(String[] args){
        try {
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(1099);
            r.rebind("Calculadora", new RMI());
            JOptionPane.showMessageDialog(null,"Servidor Conectado");
        } catch (RemoteException ex) {
            JOptionPane.showMessageDialog(null,"Servidor NO Conectado");
            Logger.getLogger(Servidor.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
            
}
