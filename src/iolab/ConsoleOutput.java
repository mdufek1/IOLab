/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iolab;

/**
 *
 * @author Mike
 */
public class ConsoleOutput implements OutputStrategy {

    @Override
    public void outputMessage(String messageText) {
        System.out.println(messageText);
    }
    
    
}
