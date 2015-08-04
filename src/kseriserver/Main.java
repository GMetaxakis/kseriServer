/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kseriserver;


import javax.swing.UIManager;

/**
 *
 * @author MeTaXaS4
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
            MainForm f = new MainForm();
            f.setLocation(100, 100);
            f.setVisible(true);
        } catch (Exception e) {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
    }
}
