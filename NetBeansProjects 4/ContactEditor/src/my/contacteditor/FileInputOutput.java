/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package my.contacteditor;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class FileInputOutput{
   
public void OutputTxt (LinkedList <RecIntegral> records){
    
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(new File ("data.txt"), false))) {
           for (RecIntegral rec : records) {
               String line = String.valueOf(rec.getNP()) + "/" + String.valueOf(rec.getNP()) + "/" + String.valueOf(rec.getST()) + "/" + String.valueOf(rec.getRES());
               writer.write(line);
               writer.newLine();
           }
           //writer.close();
           JOptionPane.showMessageDialog(null, "Данные успешно сохранены в текстовый файл.", "Успех", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Ошибка при сохранении файла: " + e.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
    }
       
}

public void OutputTxt (LinkedList <RecIntegral> records, File file){
    
    try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, false))) {
           for (RecIntegral rec : records) {
               String line = String.valueOf(rec.getNP()) + "/" + String.valueOf(rec.getVP()) + "/" + String.valueOf(rec.getST()) + "/" + String.valueOf(rec.getRES());
               writer.write(line);
               writer.newLine();
           }
           //writer.close();
           JOptionPane.showMessageDialog(null, "Данные успешно сохранены в текстовый файл.", "Успех", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Ошибка при сохранении файла: " + e.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
    }
       
}

//----------------------------------------------

public void InputTxt (DefaultTableModel tModel){
    
    try (BufferedReader reader = new BufferedReader(new FileReader("data.txt"))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split("/"); 
                Double[] rowData = new Double[data.length];
                for (int i = 0; i < data.length; i++) {
                    rowData[i] = Double.valueOf(data[i].trim()); // Преобразование в Double
                }
                
                tModel.addRow(rowData);
               
            }
        } 
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ошибка при загрузке данных: " + e.getMessage());
        }
}

public void InputTxt (DefaultTableModel tModel, File file){
    
    try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = reader.readLine()) != null) {
                String[] data = line.split("/"); 
                Double[] rowData = new Double[data.length];
                for (int i = 0; i < data.length; i++) {
                    rowData[i] = Double.valueOf(data[i].trim());
                }
                
                tModel.addRow(rowData);
               
            }
        } 
        catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ошибка при загрузке данных: " + e.getMessage());
        }
}

//----------------------------------------------

public void OutputBin (ArrayList<RecTableBin> rectable) throws FileNotFoundException, IOException{
    
    if (rectable == null || rectable.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Нет данных для сохранения.", "Ошибка", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        FileOutputStream fs = new FileOutputStream("databin.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(fs)) {
            oos.writeObject(rectable);
            //oos.close();
        }
    JOptionPane.showMessageDialog(null, "Данные успешно сохранены в двоичный файл.", "Успех", JOptionPane.INFORMATION_MESSAGE);
   } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Ошибка при сохранении файла: " + e.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
    } catch (HeadlessException ex) {
        throw new RuntimeException(ex);
    }
      
}

public void OutputBin (ArrayList<RecTableBin> rectable, File file) throws FileNotFoundException, IOException{
    
    if (rectable == null || rectable.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Нет данных для сохранения.", "Ошибка", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        FileOutputStream fs = new FileOutputStream(file);
        try (ObjectOutputStream oos = new ObjectOutputStream(fs)) {
            oos.writeObject(rectable);
            //oos.close();
        }
    JOptionPane.showMessageDialog(null, "Данные успешно сохранены в двоичный файл.", "Успех", JOptionPane.INFORMATION_MESSAGE);
   } catch (IOException e) {
        JOptionPane.showMessageDialog(null, "Ошибка при сохранении файла: " + e.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
    } catch (HeadlessException ex) {
        throw new RuntimeException(ex);
    }
      
}

//----------------------------------------------

public void InputBin (DefaultTableModel tModel, ArrayList<RecTableBin> rectable) throws FileNotFoundException, IOException, ClassNotFoundException{
   
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("databin.ser"))) {
        rectable = (ArrayList<RecTableBin>) ois.readObject();
        
        for (RecTableBin rec : rectable) {
            tModel.addRow(new Double[]{rec.getVP(), rec.getNP(), rec.getST(), rec.getRES()});
        }
        //ois.close();
        JOptionPane.showMessageDialog(null, "Данные успешно загружены из двоичного файла.", "Успех", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException | ClassNotFoundException e) {
        JOptionPane.showMessageDialog(null, "Ошибка при загрузке файла: " + e.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
    }
   
    
}

public void InputBin (DefaultTableModel tModel, ArrayList<RecTableBin> rectable, File file) throws FileNotFoundException, IOException, ClassNotFoundException{
   
    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
        rectable = (ArrayList<RecTableBin>) ois.readObject();
        
        for (RecTableBin rec : rectable) {
            tModel.addRow(new Double[]{rec.getVP(), rec.getNP(), rec.getST(), rec.getRES()});
        }
        // ois.close();
        JOptionPane.showMessageDialog(null, "Данные успешно загружены из двоичного файла.", "Успех", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException | ClassNotFoundException e) {
        JOptionPane.showMessageDialog(null, "Ошибка при загрузке файла: " + e.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
    }
   
    
}

//----------------------------------------------

}
