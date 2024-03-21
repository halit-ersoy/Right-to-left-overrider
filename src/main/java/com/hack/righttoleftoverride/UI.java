package com.hack.righttoleftoverride;

import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

public class UI extends javax.swing.JFrame {
    
    private final FilesOperations filesOperations;
    private static File inputFile = null;
    private static File outputDirectory = null;
    
    public UI() {
        initComponents();
        this.filesOperations = new FilesOperations();
        file_name_input.setEnabled(false);
        extension_input.setEnabled(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        file_path_input = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        input_file_browse = new javax.swing.JButton();
        output_file_browse = new javax.swing.JButton();
        output_path_input = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        file_name_input = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        extension_input = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        preview_input = new javax.swing.JTextField();
        generate_button = new javax.swing.JButton();
        output_text = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Right to left overrider");
        setAutoRequestFocus(false);

        jLabel1.setText("Enter the file path to process");

        input_file_browse.setText("Browse");
        input_file_browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                input_file_browseActionPerformed(evt);
            }
        });

        output_file_browse.setText("Browse");
        output_file_browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                output_file_browseActionPerformed(evt);
            }
        });

        jLabel2.setText("Enter the path to save the file to be processed");

        jLabel3.setText("Enter the name of the file to be processed");

        file_name_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                file_name_inputKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                file_name_inputKeyReleased(evt);
            }
        });

        jLabel4.setText("Enter the file extension you want to change");

        extension_input.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                extension_inputKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                extension_inputKeyReleased(evt);
            }
        });

        jLabel5.setText("Preview of the resulting filename");

        preview_input.setEditable(false);

        generate_button.setText("Generate");
        generate_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                generate_buttonActionPerformed(evt);
            }
        });

        output_text.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        output_text.setText("Output");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(file_path_input)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(input_file_browse))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(output_path_input, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(output_file_browse))
                    .addComponent(file_name_input)
                    .addComponent(extension_input)
                    .addComponent(preview_input)
                    .addComponent(generate_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(output_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(file_path_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(input_file_browse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(output_path_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(output_file_browse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(file_name_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(extension_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preview_input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(generate_button)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(output_text)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void output_file_browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_output_file_browseActionPerformed
        File path = filesOperations.fileChooser(JFileChooser.DIRECTORIES_ONLY);
        outputDirectory = path.getAbsoluteFile();
        output_path_input.setText(outputDirectory.toString());
        updatePreviewInput(generate_button);
    }//GEN-LAST:event_output_file_browseActionPerformed

    private void input_file_browseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_input_file_browseActionPerformed
        File path = filesOperations.fileChooser(JFileChooser.FILES_ONLY);
        inputFile = path.getAbsoluteFile();
        file_path_input.setText(inputFile.toString());
        file_name_input.setText(Overrider.getFilePrefix(inputFile.getName()));
        updatePreviewInput(generate_button);
    }//GEN-LAST:event_input_file_browseActionPerformed

    private void generate_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_generate_buttonActionPerformed
        String fileName = file_name_input.getText().trim();
        String inputExtension = Overrider.getFileExtension(inputFile.getName()).trim();
        String displayExtension = extension_input.getText().trim();
        String overrider = Overrider.rtlo(fileName, inputExtension, displayExtension);
        File outputFile = new File(outputDirectory.getAbsolutePath() + File.separatorChar + overrider);
        JFrame dialog = new JFrame();
        dialog.setLocationRelativeTo(null);
        try {
            filesOperations.copyFile(inputFile, outputFile);
            output_text.setText("Successful");
        } catch (IOException e) {
            ErrorDialog.showError("Could not copy file. Error: " + e.getMessage());
        }
    }//GEN-LAST:event_generate_buttonActionPerformed

    private void file_name_inputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_file_name_inputKeyReleased
        updatePreviewInput(generate_button);
    }//GEN-LAST:event_file_name_inputKeyReleased

    private void extension_inputKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_extension_inputKeyReleased
        updatePreviewInput(generate_button);
    }//GEN-LAST:event_extension_inputKeyReleased

    private void file_name_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_file_name_inputKeyPressed
        updatePreviewInput(generate_button);
    }//GEN-LAST:event_file_name_inputKeyPressed

    private void extension_inputKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_extension_inputKeyPressed
        updatePreviewInput(generate_button);
    }//GEN-LAST:event_extension_inputKeyPressed

    private void updatePreviewInput(final JButton copyAndRenameInputFileButton) {
        String fileName = file_name_input.getText().trim();
        String inputExtension = Overrider.getFileExtension(inputFile.getName()).trim();
        String displayExtension = extension_input.getText().trim();
        preview_input.setText(Overrider.rtloPreview(fileName, inputExtension, displayExtension));

        if(inputFile != null && outputDirectory != null){
            file_name_input.setEnabled(true);
            extension_input.setEnabled(true);
            if(!file_name_input.getText().trim().equals("") && !extension_input.getText().trim().equals("")){
                copyAndRenameInputFileButton.setEnabled(true);
            } else {
                copyAndRenameInputFileButton.setEnabled(false);
            }
        } else {
            file_name_input.setEnabled(false);
            extension_input.setEnabled(false);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField extension_input;
    private javax.swing.JTextField file_name_input;
    private javax.swing.JTextField file_path_input;
    private javax.swing.JButton generate_button;
    private javax.swing.JButton input_file_browse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton output_file_browse;
    private javax.swing.JTextField output_path_input;
    private javax.swing.JLabel output_text;
    private javax.swing.JTextField preview_input;
    // End of variables declaration//GEN-END:variables
}
