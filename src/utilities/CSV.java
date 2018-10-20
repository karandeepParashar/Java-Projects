/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilities;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Karandeep Parashar
 */
public class CSV {
    
    //This method will read data from .csv and read as a list
    public static List<String[]> read(String file) throws IOException{
        List<String[]> data = new LinkedList<String[]>();
        String dataRow;
        try{
            BufferedReader br = new BufferedReader(new FileReader(file));
            while((dataRow = br.readLine())!=null){
            String[] dataRecords = dataRow.split(",");
            data.add(dataRecords);
            }
        }
        catch(FileNotFoundException e) {
            System.out.println("COULD NOT FIND FILE");
            e.printStackTrace();
        }
        catch(IOException e){
            System.out.println("COULD NOT READ FILE");
            e.printStackTrace();
        }
        return data;
    }
}
