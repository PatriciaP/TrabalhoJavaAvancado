/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.swing.JOptionPane;

/**
 *
 * @author devai
 */
public class NegocioException extends Exception {

       public NegocioException() {
        super();
    }
    
    
    public NegocioException(String msg, String title) {
         JOptionPane.showMessageDialog(null, msg,
                    title, JOptionPane.ERROR_MESSAGE);
    }
    
}
