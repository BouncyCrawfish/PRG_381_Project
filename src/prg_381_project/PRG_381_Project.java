/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prg_381_project;

import javax.swing.WindowConstants;



/**
 *
 * @author regar
 */
public class PRG_381_Project {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Start login Page using background thread
        //Reason for this is because Swing components are not thread safe
        //This ensures the proper background thread is used(Preventing wierd visual glitches)
        java.awt.EventQueue.invokeLater(()->{
          Login_Page Login = new  Login_Page();
          Login.setVisible(true);
        });
        
        
        
        
       
    }
    
}
