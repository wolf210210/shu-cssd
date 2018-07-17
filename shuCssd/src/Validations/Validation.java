/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validations;

import java.awt.event.KeyEvent;
import javax.swing.JTextField;

/**
 *
 * @author Piyu
 */
public class Validation {
      private static boolean dot = false;
    
    /**
     *
     * @param email
     * @return
     */
    public static boolean isEmail(String email) {
        String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        return email.matches(EMAIL_REGEX);
    }
    
    /**
     *
     * @param textField
     * @param evt
     */
    public static void validateNumber(JTextField textField, KeyEvent evt) {
        char vChar = evt.getKeyChar();
        if (textField.getText().equals("")) {
            dot = false;
        }
        if (dot == false) {
            if (vChar == '.') {
                dot = true;
            } else if (!(Character.isDigit(vChar)
                    || (vChar == KeyEvent.VK_BACK_SPACE)
                    || (vChar == KeyEvent.VK_DELETE))) {
                evt.consume();
            }
        } else {
            if (!(Character.isDigit(vChar)
                    || (vChar == KeyEvent.VK_BACK_SPACE)
                    || (vChar == KeyEvent.VK_DELETE))) {
                evt.consume();
            }
        }

    }

}
