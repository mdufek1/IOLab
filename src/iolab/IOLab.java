/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package iolab;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author mdufek1
 */
public class IOLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File file = new File("src" + File.separatorChar + "Example_File.txt");        
        FileInputReader i = new FileInputReader(new ConsoleOutput());
        i.readFile(file);
        
        MailingRecord r1 = new MailingRecord("Bob","Jones","1234 Street","Nowhere","KS","45678");
        MailingRecord r2 = new MailingRecord("Tim","Smith","4597 Easy Street","Somewhere","MI","78946");
        
        FileOutputWriter o = new FileOutputWriter();
        
        o.writeRecord(file, r1);
        o.writeRecord(file, r2);
        i.readFile(file);
    }
    
}
