/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rmi;

/**
 *
 * @author angel
 */
import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author elpan
 */
public class Cliente {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            Registry miRegistro = LocateRegistry.getRegistry("localhost", 1099);
            Calculadora c = (Calculadora) Naming.lookup("//localhost/Calculadora");

            while (true) {
                String menu = JOptionPane.showInputDialog(" Ejercicio calculadora \n "
                        + "Suma ....(1) \n"
                        + "Resta....(2) \n"
                        + "Multiplicacion....(3) \n"
                        + "Division...(4) \n"
                        + "Extra...(5) \n\n"
                        + "Cancelar para salir");
                switch (menu) {
                    case "1": {
                        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                        JOptionPane.showInputDialog(null, "La suma es: " + c.suma(x, y));
                        break;
                    }
                    case "2": {
                        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                        JOptionPane.showInputDialog(null, "La resta es: " + c.resta(x, y));
                        break;
                    }
                    case "3": {
                        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                        JOptionPane.showInputDialog(null, "La multiplicacion es: " + c.multi(x, y));
                        break;
                    }
                    case "4": {
                        int x = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer numero"));
                        int y = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo numero"));
                        JOptionPane.showInputDialog(null, "La division es: " + c.divi(x, y));
                        break;
                    }

                    case "5": {
                        CalculadoraVista vista = new CalculadoraVista();
                        vista.setVisible(true);
                        vista.setResizable(false);
                        break;
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showInputDialog("Servidor no conectado" + e);
        }
    }

}
