/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package it.rockpaperscissor.model;

/**
 *
 * @author a.lota
 */
public class OptionNotFoundException extends Exception {

    /**
     * Creates a new instance of <code>OptionNotFoundException</code> without
     * detail message.
     */
    public OptionNotFoundException() {
    }

    /**
     * Constructs an instance of <code>OptionNotFoundException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public OptionNotFoundException(String msg) {
        super(msg);
    }
}
