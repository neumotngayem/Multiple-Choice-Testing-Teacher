/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import BO.Question;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import BO.ImagePreview;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Add extends javax.swing.JDialog {

    /**
     * Creates new form Add
     */
    JFileChooser fChooser;
    String path;

    public Add(JFrame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        fChooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image file", "GIF", "JPG", "JPEG", "PNG");
        fChooser.setFileFilter(filter);
        fChooser.setMultiSelectionEnabled(false);
        fChooser.setAccessory(new ImagePreview(fChooser));
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaQuest = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pView = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        an1 = new javax.swing.JTextField();
        an2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        an3 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        an4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        co1 = new javax.swing.JRadioButton();
        co2 = new javax.swing.JRadioButton();
        co3 = new javax.swing.JRadioButton();
        co4 = new javax.swing.JRadioButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(0, 153, 153));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("THÊM CÂU HỎI");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Câu hỏi");

        txtAreaQuest.setColumns(20);
        txtAreaQuest.setRows(5);
        jScrollPane1.setViewportView(txtAreaQuest);

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Hình ảnh (Nếu có)");

        jButton1.setText("Thêm hình ảnh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pViewLayout = new javax.swing.GroupLayout(pView);
        pView.setLayout(pViewLayout);
        pViewLayout.setHorizontalGroup(
            pViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 803, Short.MAX_VALUE)
        );
        pViewLayout.setVerticalGroup(
            pViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 301, Short.MAX_VALUE)
        );

        jLabel4.setText("Câu trả lời 1");

        jLabel5.setText("Câu trả lời 2");

        jLabel6.setText("Câu trả lời 3");

        jLabel7.setText("Câu trả lời 4");

        buttonGroup1.add(co1);
        co1.setSelected(true);
        co1.setText("Đúng");

        buttonGroup1.add(co2);
        co2.setText("Đúng");
        co2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                co2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(co3);
        co3.setText("Đúng");
        co3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                co3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(co4);
        co4.setText("Đúng");
        co4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                co4ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jButton2.setText("Thêm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pView, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(an3, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(co3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(an4, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(co4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(an2, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(co2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(an1, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(co1)))
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(an1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(co1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(an2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(co2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(an3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(co3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(an4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(co4))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void co2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_co2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_co2ActionPerformed

    private void co3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_co3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_co3ActionPerformed

    private void co4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_co4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_co4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int choice = fChooser.showOpenDialog(this);
        if (choice == JFileChooser.APPROVE_OPTION) {
            File f = fChooser.getSelectedFile();
            path = f.getName();
            String src = f.getAbsolutePath();
            try {
                BufferedImage currentImage = ImageIO.read(new File(src));
                showImage(pView.getGraphics(), currentImage);
            } catch (IOException ex) {
                Logger.getLogger(Add.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed
    public boolean validString(String text, String show) {
        if (text.equals("")) {
            JOptionPane.showMessageDialog(this, show + " should be fill", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        Boolean check1 = validString(txtAreaQuest.getText(), "Câu hỏi");
        Boolean check2 = validString(an1.getText(), "Câu trả lời 1");
        Boolean check3 = validString(an2.getText(), "Câu trả lời 2");
        Boolean check4 = validString(an3.getText(), "Câu trả lời 3");
        Boolean check5 = validString(an4.getText(), "Câu trả lời 4");
        if (check1 && check2 && check3 && check4 && check5) {
            String questQuest = txtAreaQuest.getText();
            String questPath = "";
            String questKey = null;
            if (path != null) {
                questPath = path;
            }
            if (co1.isSelected()) {
                questKey = an1.getText();
            } else if (co2.isSelected()) {
                questKey = an2.getText();
            } else if (co3.isSelected()) {
                questKey = an3.getText();
            } else if (co4.isSelected()) {
                questKey = an4.getText();
            }
            String questAnswer1 = an1.getText();
            String questAnswer2 = an2.getText();
            String questAnswer3 = an3.getText();
            String questAnswer4 = an4.getText();
            String questID = "q" + (Main.questList.size() + 1);
            String questSen = "Câu " + (Main.questList.size() + 1);
            Main.model.addElement(questSen);
            Question temp = new Question(questID, questQuest, questPath, questAnswer1, questAnswer2, questAnswer3, questAnswer4, questKey);
            Main.questList.add(temp);
            this.dispose();
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void showImage(Graphics g, BufferedImage currentImage) {
        if (currentImage != null) {
            g.clearRect(0, 0, pView.getWidth(), pView.getHeight());
            int imgWidth = currentImage.getWidth();
            int imgHeight = currentImage.getHeight();
            double ratio = 1.0 * imgWidth / imgHeight;
            int areaWidth = this.pView.getWidth();
            int areaHeight = this.pView.getHeight();
            if (imgWidth <= areaWidth && imgHeight <= areaHeight) {
                areaWidth = imgWidth;
                areaHeight = imgHeight;
            } else if (imgWidth > imgHeight) {
                if (imgWidth < areaWidth) {
                    areaWidth = imgWidth;
                }
                areaHeight = (int) (areaWidth / ratio);
            } else {
                if (imgHeight < areaHeight) {
                    areaHeight = imgHeight;
                }
                areaWidth = (int) (areaHeight * ratio);
            }
            g.drawImage(currentImage, 0, 0, areaWidth, areaHeight, this.pView);

        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField an1;
    private javax.swing.JTextField an2;
    private javax.swing.JTextField an3;
    private javax.swing.JTextField an4;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton co1;
    private javax.swing.JRadioButton co2;
    private javax.swing.JRadioButton co3;
    private javax.swing.JRadioButton co4;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pView;
    private javax.swing.JTextArea txtAreaQuest;
    // End of variables declaration//GEN-END:variables
}
