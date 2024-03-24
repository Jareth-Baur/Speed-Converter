/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main;

/**
 * @author Jareth Baur;
 * @since November 21, 2023;
 */
public class MainFrame extends javax.swing.JFrame {

    private static int fromUnit, toUnit;

    public MainFrame() {
        initComponents();
        jTextField2.setEditable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Speed Converter");

        jComboBox1.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "meters per second", "meters per hour", "kilometers per hour", "inches per second", "inches per hour", "feet per second", "feet per hour", "miles per second", "miles per hour", "knots" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jComboBox2.setBackground(new java.awt.Color(153, 153, 153));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "meters per second", "meters per hour", "kilometers per hour", "inches per second", "inches per hour", "feet per second", "feet per hour", "miles per second", "miles per hour", "knots" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 18)); // NOI18N
        jButton1.setText("Convert");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel1.setText("Convert From:");

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel2.setText("Converted To:");

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel3.setText("SPEED CONVERTER");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    @SuppressWarnings("unused")
    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed
    @SuppressWarnings("static-access")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String from = jComboBox1.getSelectedItem().toString();
        String to = jComboBox2.getSelectedItem().toString();
        switch (from) {
            case "meters per second":
                this.fromUnit = 1;
                break;
            case "meters per hour":
                this.fromUnit = 2;
                break;
            case "kilometers per hour":
                this.fromUnit = 3;
                break;
            case "inches per second":
                this.fromUnit = 4;
                break;
            case "inches per hour":
                this.fromUnit = 5;
                break;
            case "feet per second":
                this.fromUnit = 6;
                break;
            case "feet per hour":
                this.fromUnit = 7;
                break;
            case "miles per second":
                this.fromUnit = 8;
                break;
            case "miles per hour":
                this.fromUnit = 9;
                break;
            case "knots":
                this.fromUnit = 10;
                break;
            default:
                throw new AssertionError();
        }
        switch (to) {
            case "meters per second":
                this.toUnit = 1;
                break;
            case "meters per hour":
                this.toUnit = 2;
                break;
            case "kilometers per hour":
                this.toUnit = 3;
                break;
            case "inches per second":
                this.toUnit = 4;
                break;
            case "inches per hour":
                this.toUnit = 5;
                break;
            case "feet per second":
                this.toUnit = 6;
                break;
            case "feet per hour":
                this.toUnit = 7;
                break;
            case "miles per second":
                this.toUnit = 8;
                break;
            case "miles per hour":
                this.toUnit = 9;
                break;
            case "knots":
                this.toUnit = 10;
                break;
            default:
                throw new AssertionError();
        }
        try {
            if (!jTextField1.getText().isBlank()) {
                double speed = Double.parseDouble(jTextField1.getText());
                jTextField1.setText(jTextField1.getText().trim());
                double convertedSpeed = convertSpeed(speed, this.fromUnit, this.toUnit);
                jTextField2.setText(String.valueOf(convertedSpeed));
            }
        } catch (NumberFormatException e) {
            jTextField2.setText("Do not include special characters.");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new MainFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables

    private static double convertSpeed(double speed, int fromUnit, int toUnit) {
        switch (fromUnit) {
            case 1 -> {
                // Meters per second
                return convertToMetersPerSecond(speed, toUnit);
            }
            case 2 -> {
                // Meters per hour
                return convertToMetersPerHour(speed, toUnit);
            }
            case 3 -> {
                // Kilometers per hour
                return convertToKilometersPerHour(speed, toUnit);
            }
            case 4 -> {
                // Inches per second
                return convertToInchesPerSecond(speed, toUnit);
            }
            case 5 -> {
                // Inches per hour
                return convertToInchesPerHour(speed, toUnit);
            }
            case 6 -> {
                // Feet per second
                return convertToFeetPerSecond(speed, toUnit);
            }
            case 7 -> {
                // Feet per hour
                return convertToFeetPerHour(speed, toUnit);
            }
            case 8 -> {
                // Miles per second
                return convertToMilesPerSecond(speed, toUnit);
            }
            case 9 -> {
                // Miles per hour
                return convertToMilesPerHour(speed, toUnit);
            }
            case 10 -> {
                // Knots
                return convertToKnots(speed, toUnit);
            }
            default -> {
                System.out.println("Invalid input. Please enter a number from 1 to 10.");
                return 0.0;
            }
        }
    }

    private static double convertToMetersPerSecond(double speed, int toUnit) {
        switch (toUnit) {
            case 1 -> {
                // Meters per second
                return speed;
            }
            case 2 -> {
                // Meters per hour
                return speed * 3600.0;
            }
            case 3 -> {
                // Kilometers per hour
                return speed * 3.6;
            }
            case 4 -> {
                // Inches per second
                return speed * 39.3701;
            }
            case 5 -> {
                // Inches per hour
                return speed * 141732.0; // 1 inch per second = 141732 inches per hour
            }
            case 6 -> {
                // Feet per second
                return speed * 3.28084;
            }
            case 7 -> {
                // Feet per hour
                return speed * 11811.0; // 1 foot per second = 11811 feet per hour
            }
            case 8 -> {
                // Miles per second
                return speed * 0.000621371;
            }
            case 9 -> {
                // Miles per hour
                return speed * 2.23694;
            }
            case 10 -> {
                // Knots
                return speed * 1.94384;
            }
            default -> {
                System.out.println("Invalid input. Please enter a number from 1 to 10.");
                return 0.0;
            }
        }
    }

    private static double convertToMetersPerHour(double speed, int toUnit) {
        switch (toUnit) {
            case 1 -> {
                // Meters per second
                return speed / 3600.0;
            }
            case 2 -> {
                // Meters per hour
                return speed;
            }
            case 3 -> {
                // Kilometers per hour
                return speed / 1000.0;
            }
            case 4 -> {
                // Inches per second
                return speed / 39.3701 / 3600.0;
            }
            case 5 -> {
                // Inches per hour
                return speed / 39.3701;
            }
            case 6 -> {
                // Feet per second
                return speed / 3.28084 / 3600.0;
            }
            case 7 -> {
                // Feet per hour
                return speed / 3.28084;
            }
            case 8 -> {
                // Miles per second
                return speed / 1609.34 / 3600.0;
            }
            case 9 -> {
                // Miles per hour
                return speed / 1609.34;
            }
            case 10 -> {
                // Knots
                return speed / 1852.0;
            }
            default -> {
                System.out.println("Invalid input. Please enter a number from 1 to 10.");
                return 0.0;
            }
        }
    }

    private static double convertToKilometersPerHour(double speed, int toUnit) {
        switch (toUnit) {
            case 1 -> {
                // Meters per second
                return speed / 3600.0;
            }
            case 2 -> {
                // Meters per hour
                return speed;
            }
            case 3 -> {
                // Kilometers per hour
                return speed / 1000.0;
            }
            case 4 -> {
                // Inches per second
                return speed / 39.3701 / 3600.0;
            }
            case 5 -> {
                // Inches per hour
                return speed / 39.3701;
            }
            case 6 -> {
                // Feet per second
                return speed / 3.28084 / 3600.0;
            }
            case 7 -> {
                // Feet per hour
                return speed / 3.28084;
            }
            case 8 -> {
                // Miles per second
                return speed / 1609.34 / 3600.0;
            }
            case 9 -> {
                // Miles per hour
                return speed / 1609.34;
            }
            case 10 -> {
                // Knots
                return speed / 1852.0;
            }
            default -> {
                System.out.println("Invalid input. Please enter a number from 1 to 10.");
                return 0.0;
            }
        }
    }

    private static double convertToInchesPerSecond(double speed, int toUnit) {
        switch (toUnit) {
            case 1 -> {
                // Meters per second
                return speed / 3600.0;
            }
            case 2 -> {
                // Meters per hour
                return speed;
            }
            case 3 -> {
                // Kilometers per hour
                return speed / 1000.0;
            }
            case 4 -> {
                // Inches per second
                return speed / 39.3701 / 3600.0;
            }
            case 5 -> {
                // Inches per hour
                return speed / 39.3701;
            }
            case 6 -> {
                // Feet per second
                return speed / 3.28084 / 3600.0;
            }
            case 7 -> {
                // Feet per hour
                return speed / 3.28084;
            }
            case 8 -> {
                // Miles per second
                return speed / 1609.34 / 3600.0;
            }
            case 9 -> {
                // Miles per hour
                return speed / 1609.34;
            }
            case 10 -> {
                // Knots
                return speed / 1852.0;
            }
            default -> {
                System.out.println("Invalid input. Please enter a number from 1 to 10.");
                return 0.0;
            }
        }
    }

    private static double convertToInchesPerHour(double speed, int toUnit) {
        switch (toUnit) {
            case 1 -> {
                // Meters per second
                return speed / 3600.0;
            }
            case 2 -> {
                // Meters per hour
                return speed;
            }
            case 3 -> {
                // Kilometers per hour
                return speed / 1000.0;
            }
            case 4 -> {
                // Inches per second
                return speed / 39.3701 / 3600.0;
            }
            case 5 -> {
                // Inches per hour
                return speed / 39.3701;
            }
            case 6 -> {
                // Feet per second
                return speed / 3.28084 / 3600.0;
            }
            case 7 -> {
                // Feet per hour
                return speed / 3.28084;
            }
            case 8 -> {
                // Miles per second
                return speed / 1609.34 / 3600.0;
            }
            case 9 -> {
                // Miles per hour
                return speed / 1609.34;
            }
            case 10 -> {
                // Knots
                return speed / 1852.0;
            }
            default -> {
                System.out.println("Invalid input. Please enter a number from 1 to 10.");
                return 0.0;
            }
        }
    }

    private static double convertToFeetPerSecond(double speed, int toUnit) {
        switch (toUnit) {
            case 1 -> {
                // Meters per second
                return speed / 3600.0;
            }
            case 2 -> {
                // Meters per hour
                return speed;
            }
            case 3 -> {
                // Kilometers per hour
                return speed / 1000.0;
            }
            case 4 -> {
                // Inches per second
                return speed / 39.3701 / 3600.0;
            }
            case 5 -> {
                // Inches per hour
                return speed / 39.3701;
            }
            case 6 -> {
                // Feet per second
                return speed / 3.28084 / 3600.0;
            }
            case 7 -> {
                // Feet per hour
                return speed / 3.28084;
            }
            case 8 -> {
                // Miles per second
                return speed / 1609.34 / 3600.0;
            }
            case 9 -> {
                // Miles per hour
                return speed / 1609.34;
            }
            case 10 -> {
                // Knots
                return speed / 1852.0;
            }
            default -> {
                System.out.println("Invalid input. Please enter a number from 1 to 10.");
                return 0.0;
            }
        }
    }

    private static double convertToFeetPerHour(double speed, int toUnit) {
        switch (toUnit) {
            case 1 -> {
                // Meters per second
                return speed / 3600.0;
            }
            case 2 -> {
                // Meters per hour
                return speed;
            }
            case 3 -> {
                // Kilometers per hour
                return speed / 1000.0;
            }
            case 4 -> {
                // Inches per second
                return speed / 39.3701 / 3600.0;
            }
            case 5 -> {
                // Inches per hour
                return speed / 39.3701;
            }
            case 6 -> {
                // Feet per second
                return speed / 3.28084 / 3600.0;
            }
            case 7 -> {
                // Feet per hour
                return speed / 3.28084;
            }
            case 8 -> {
                // Miles per second
                return speed / 1609.34 / 3600.0;
            }
            case 9 -> {
                // Miles per hour
                return speed / 1609.34;
            }
            case 10 -> {
                // Knots
                return speed / 1852.0;
            }
            default -> {
                System.out.println("Invalid input. Please enter a number from 1 to 10.");
                return 0.0;
            }
        }
    }

    private static double convertToMilesPerSecond(double speed, int toUnit) {
        switch (toUnit) {
            case 1 -> {
                // Meters per second
                return speed / 3600.0;
            }
            case 2 -> {
                // Meters per hour
                return speed;
            }
            case 3 -> {
                // Kilometers per hour
                return speed / 1000.0;
            }
            case 4 -> {
                // Inches per second
                return speed / 39.3701 / 3600.0;
            }
            case 5 -> {
                // Inches per hour
                return speed / 39.3701;
            }
            case 6 -> {
                // Feet per second
                return speed / 3.28084 / 3600.0;
            }
            case 7 -> {
                // Feet per hour
                return speed / 3.28084;
            }
            case 8 -> {
                // Miles per second
                return speed / 1609.34 / 3600.0;
            }
            case 9 -> {
                // Miles per hour
                return speed / 1609.34;
            }
            case 10 -> {
                // Knots
                return speed / 1852.0;
            }
            default -> {
                System.out.println("Invalid input. Please enter a number from 1 to 10.");
                return 0.0;
            }
        }
    }

    private static double convertToMilesPerHour(double speed, int toUnit) {
        switch (toUnit) {
            case 1 -> {
                // Meters per second
                return speed / 3600.0;
            }
            case 2 -> {
                // Meters per hour
                return speed;
            }
            case 3 -> {
                // Kilometers per hour
                return speed / 1000.0;
            }
            case 4 -> {
                // Inches per second
                return speed / 39.3701 / 3600.0;
            }
            case 5 -> {
                // Inches per hour
                return speed / 39.3701;
            }
            case 6 -> {
                // Feet per second
                return speed / 3.28084 / 3600.0;
            }
            case 7 -> {
                // Feet per hour
                return speed / 3.28084;
            }
            case 8 -> {
                // Miles per second
                return speed / 1609.34 / 3600.0;
            }
            case 9 -> {
                // Miles per hour
                return speed / 1609.34;
            }
            case 10 -> {
                // Knots
                return speed / 1852.0;
            }
            default -> {
                System.out.println("Invalid input. Please enter a number from 1 to 10.");
                return 0.0;
            }
        }
    }

    private static double convertToKnots(double speed, int toUnit) {
        switch (toUnit) {
            case 1 -> {
                // Meters per second
                return speed / 3600.0;
            }
            case 2 -> {
                // Meters per hour
                return speed;
            }
            case 3 -> {
                // Kilometers per hour
                return speed / 1000.0;
            }
            case 4 -> {
                // Inches per second
                return speed / 39.3701 / 3600.0;
            }
            case 5 -> {
                // Inches per hour
                return speed / 39.3701;
            }
            case 6 -> {
                // Feet per second
                return speed / 3.28084 / 3600.0;
            }
            case 7 -> {
                // Feet per hour
                return speed / 3.28084;
            }
            case 8 -> {
                // Miles per second
                return speed / 1609.34 / 3600.0;
            }
            case 9 -> {
                // Miles per hour
                return speed / 1609.34;
            }
            case 10 -> {
                // Knots
                return speed / 1852.0;
            }
            default -> {
                System.out.println("Invalid input. Please enter a number from 1 to 10.");
                return 0.0;
            }
        }
    }
}
