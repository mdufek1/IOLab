/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iolab;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author mdufek1
 */
public class FileInputReader {

    OutputStrategy outputStrat;

    public FileInputReader(OutputStrategy outputStrat) {
        this.outputStrat = outputStrat;
    }

    public void readFile(File file) {
        int recordNum = 1;
        BufferedReader in = null;
        String output = "";
        try {
            in = new BufferedReader(new FileReader(file));
            String line = in.readLine();
            while (line != null) {
                output += "Record Number " + recordNum+"\n";
                for (int i = 0; i < 3; i++) {
                    if (line.equals("")) {
                        i--;
                    } else {
                        if (i == 0) {
                            String[] tempArray = line.split(" ");
                            output += "First Name: " + tempArray[0];
                            output += "\nLast Name: " + tempArray[1];
                        } else if (i == 1) {
                            String[] tempArray = line.split(" ");
                            output += "\nAddress: " + tempArray[0];
                            output += "\nStreet: " + tempArray[1];

                        } else {
                            String[] tempArray = line.split(" ");
                            System.out.println(tempArray.length);
                            output += "\nCity: " + tempArray[0].replace(",", "");
                            output += "\nState: " + tempArray[1];
                            output += "\nZip Code: " + tempArray[2];
                        }

                    }
                    line = in.readLine();
                }
                output += "\n\n";
                recordNum++;
            }

        } catch (IOException e) {
            output = "Invalid file input";
        } finally {
            try {
                in.close();
            } catch (Exception e) {

            }
            outputStrat.outputMessage(output);
        }
    }
}
