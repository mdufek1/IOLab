/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iolab;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mdufek1
 */
public class FileOutputWriter {
    
    public void writeRecord(File file, MailingRecord record) throws IOException{
        
        PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(file, true)));

        out.println("\n");
        out.println(record);
        out.close();
    }
    
}
