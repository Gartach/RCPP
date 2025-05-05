import javax.swing.JOptionPane;
import javax.swing.*;
import java.net.*;
import java.io.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;


public  class  NewJFrame extends javax.swing.JFrame {
    
    private DatagramSocket socket;
    private InetAddress serverAddress;
    
    private static final int SERVER_PORT = 9876;
    
    private   ArrayList<RecIntegral> integralsList;
    public NewJFrame() {
        initComponents();
        integralsList = new ArrayList<>();
        try {
            socket = new DatagramSocket();
            serverAddress = InetAddress.getByName("localhost"); // или IP сервера
            
            // Отправляем серверу уведомление о подключении
            String connectMessage = "CLIENT_CONNECTED";
            byte[] connectData = connectMessage.getBytes();
            DatagramPacket connectPacket = new DatagramPacket(
                connectData, connectData.length, 
                serverAddress, SERVER_PORT
            );
            socket.send(connectPacket);
            
            // Ждем подтверждение (опционально)
            byte[] ackBuffer = new byte[1025];
            DatagramPacket ackPacket = new DatagramPacket(ackBuffer, ackBuffer.length);
            socket.receive(ackPacket);
            String ack = new String(ackPacket.getData(), 0, ackPacket.getLength());
            
            System.out.println("подключено к серверу.");
            socket.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        
    
    public  void Table(){
       
    }
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextFieldLowLim = new javax.swing.JTextField();
        jTextFieldUpLim = new javax.swing.JTextField();
        jTextFieldStep = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Удалить");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Нижняя граница", "Верхняя гранциа", "Шаг", "Результат"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("Рассчитать");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Добавить");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTextFieldLowLim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLowLimActionPerformed(evt);
            }
        });

        jLabel1.setText("Нижняя граница");

        jLabel2.setText("Верхняя граница");

        jLabel3.setText("Шаг интегрирования");

        jButton4.setText("Заполнить");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Очистить");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel4.setText("Работа со списком");

        jLabel5.setText("Работа с текстом");

        jLabel6.setText("Работа с двоичным кодом");

        jButton6.setText("Загрузка");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setText("Сохранение");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setText("Загрузка");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton9.setText("Сохранение");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton1)
                                .addComponent(jButton3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton4)
                                    .addComponent(jButton5))
                                .addGap(8, 8, 8))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(24, 24, 24))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 86, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton8)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton9)
                        .addGap(36, 36, 36))))
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldLowLim, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldUpLim, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldStep))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLowLim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldUpLim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldStep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(62, 62, 62)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton8))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
        
        int rowNum = jTable1.getSelectedRow();
        
        if (rowNum == -1){
            JOptionPane.showMessageDialog(null, "выберите строку");
        }else tModel.removeRow(rowNum);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextFieldLowLimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLowLimActionPerformed

    }//GEN-LAST:event_jTextFieldLowLimActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        
    try {
            double upperLim;
            double lowLim;
            double step;

            
            lowLim = Double.parseDouble(jTextFieldLowLim.getText());
            upperLim = Double.parseDouble(jTextFieldUpLim.getText());
            step = Double.parseDouble(jTextFieldStep.getText());

            if (upperLim < 0.000001 || upperLim > 1000000 ||
            lowLim < 0.000001 || lowLim> 1000000 ||
            step < 0.000001 || step > 1000000) {
            throw new CustomException("Значения должны находиться в диапазоне от 0.000001 до 1000000.");
            }
            if (upperLim < lowLim){
                throw new CustomException("Нижний предел должен быть меньше верхнего предела."); 
            }
            if ((upperLim - lowLim) < step){
                throw new CustomException("Шаг интегрирования должен быть меньше интервала."); 
            }
            
            // Создаем экземпляр RecIntegral с проверкой данных
            RecIntegral recIntegral = new RecIntegral(lowLim, upperLim, step, 0.0);

            // Добавляем строку в таблицу
            DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
            tModel.addRow(new Object[]{lowLim, upperLim, step});

            // Добавляем запись в коллекцию
            integralsList.add(recIntegral);

            // Очищаем поля ввода
            jTextFieldLowLim.setText("");
            jTextFieldUpLim.setText("");
            jTextFieldStep.setText("");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Введены некорректные данные. Пожалуйста, введите числа.", "Ошибка", JOptionPane.ERROR_MESSAGE);
        } catch (CustomException ex) {

        JOptionPane.showMessageDialog(this, ex.getMessage(), "Ошибка диапазона", JOptionPane.WARNING_MESSAGE);
        }    
    
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
    
    for (int row = 0; row < tModel.getRowCount(); row++) {
        final int finalRow = row;
        double a = ((Number) tModel.getValueAt(row, 0)).doubleValue();
        double b = ((Number) tModel.getValueAt(row, 1)).doubleValue();
        double step = ((Number) tModel.getValueAt(row, 2)).doubleValue();

        // Разбиваем интервал на 3 части
        double interval = (b - a) / 3;
        final double[] totalResult = {0.0};  

        // Создаем 3 потока
        Thread[] threads = new Thread[3];
        for (int i = 0; i < 3; i++) {
            final double start = a + i * interval;
            final double end = (i == 2) ? b : start + interval;
            threads[i] = new Thread(() -> {
                double partialSum = 0;
                for (double x = start; x < end; x += step) {
                    partialSum += Math.min (step, (b - start));
                }
                synchronized (totalResult) {
                    totalResult[0] += partialSum;  
                }
            });
            threads[i].start();
        }

        // Ждем завершения потоков
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        // Обновляем GUI и отправляем на сервер
        SwingUtilities.invokeLater(() -> {
            tModel.setValueAt(totalResult[0], finalRow, 3);
            integralsList.get(finalRow).setResult(totalResult[0]);
            sendResultToServer(a, b, step, totalResult[0]);
        });
    }

    }//GEN-LAST:event_jButton2ActionPerformed

    
    class IntegralCalculatorThread extends Thread {
    private final double a;          
    private final double b;          
    private final double step;       // Шаг интегрирования
    private double partialSum;       // Частичная сумма (результат потока)

    public IntegralCalculatorThread(double a, double b, double step) {
        this.a = a;
        this.b = b;
        this.step = step;
        this.partialSum = 0;
    }
    
    @Override
    public void run() {
        double start, h, sum=0;
        
        start = a;
        
        do{
            h= Math.min (step, (b - start));
            sum +=h * (1/ start + 1/(start + h)) / 2;
            start += h;
        } while ((start)< b);
        
        this.partialSum = sum;
    }

    public double getPartialSum() {
        return partialSum;
    }
}
    
    private void sendResultToServer(double a, double b, double step, double result) {
        try {
            String data = String.format("a=%.2f, b=%.2f, step=%.4f, result=%.6f", a, b, step, result);
            byte[] buffer = data.getBytes();
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length, serverAddress, SERVER_PORT);
            socket.send(packet);
        } catch (Exception e) {
            //System.err.println("Ошибка отправки: " + e.getMessage());
        }
    }
    
    
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
        tModel.setRowCount(0); 

        for (RecIntegral rec : integralsList) {
            tModel.addRow(new Object[]{
                rec.getLowerLimit(),
                rec.getUpperLimit(),
                rec.getStep(),
                rec.getResult()
            });
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
        tModel.setRowCount(0);
        integralsList.clear();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            saveToTextFile(file);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            loadFromBinaryFile(file);
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            saveToBinaryFile(file);
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            loadFromTextFile(file);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    public class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}
    private void saveToTextFile(File file) {
        try (PrintWriter writer = new PrintWriter(file)) {
            for (RecIntegral rec : integralsList) {
                writer.println(rec.getLowerLimit() + "," + rec.getUpperLimit() + "," + rec.getStep() + "," + rec.getResult());
            }
            JOptionPane.showMessageDialog(this, "Данные успешно сохранены в текстовый файл.", "Успех", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Ошибка при сохранении файла: " + e.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void loadFromTextFile(File file) {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            integralsList.clear();
            DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
            tModel.setRowCount(0);
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                double lowerLimit = Double.parseDouble(parts[0]);
                double upperLimit = Double.parseDouble(parts[1]);
                double step = Double.parseDouble(parts[2]);
                double result = Double.parseDouble(parts[3]);
                RecIntegral rec = new RecIntegral(lowerLimit, upperLimit, step, result);
                integralsList.add(rec);
                tModel.addRow(new Object[]{lowerLimit, upperLimit, step, result});
            }
            JOptionPane.showMessageDialog(this, "Данные успешно загружены из текстового файла.", "Успех", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException | CustomException e) {
            JOptionPane.showMessageDialog(this, "Ошибка при загрузке файла: " + e.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void saveToBinaryFile(File file) {
        System.out.println("Сохранение данных: " + integralsList);
        if (integralsList == null || integralsList.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Нет данных для сохранения.", "Ошибка", JOptionPane.ERROR_MESSAGE);
            return;
        }
        
        try (FileOutputStream fileOut = new FileOutputStream(file)) {
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(integralsList);
        JOptionPane.showMessageDialog(this, "Данные успешно сохранены в двоичный файл.", "Успех", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Ошибка при сохранении файла: " + e.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            throw new RuntimeException(ex);
        }
        
        //integralsList.removeAll(integralsList);
        
    }

    private void loadFromBinaryFile(File file) {
         if (!file.exists() || file.length() == 0) {
        JOptionPane.showMessageDialog(this, "Файл не существует или пуст.", "Ошибка", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
        integralsList = (ArrayList<RecIntegral>) ois.readObject(); // Десериализуем только integralsList

        // Обновляем таблицу
        DefaultTableModel tModel = (DefaultTableModel) jTable1.getModel();
        tModel.setRowCount(0); // Очищаем таблицу
        for (RecIntegral rec : integralsList) {
            tModel.addRow(new Object[]{
                rec.getLowerLimit(),
                rec.getUpperLimit(),
                rec.getStep(),
                rec.getResult()
            });
        }

        JOptionPane.showMessageDialog(this, "Данные успешно загружены из двоичного файла.", "Успех", JOptionPane.INFORMATION_MESSAGE);
    } catch (IOException | ClassNotFoundException e) {
        JOptionPane.showMessageDialog(this, "Ошибка при загрузке файла: " + e.getMessage(), "Ошибка", JOptionPane.ERROR_MESSAGE);
    }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldLowLim;
    private javax.swing.JTextField jTextFieldStep;
    private javax.swing.JTextField jTextFieldUpLim;
    // End of variables declaration//GEN-END:variables
}
