package com.hack.righttoleftoverride;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import javax.swing.JFileChooser;

public class FilesOperations {
        
    public File fileChooser(int jFileChooser) {
        
        // Dosya seçiciyi oluşturuyoruz.
        JFileChooser fileChooser = new JFileChooser();

        // Sadece dizinleri seçmesini sağlıyoruz.
        fileChooser.setFileSelectionMode(jFileChooser);

        // Dosya seçici penceresini açıyoruz ve kullanıcının seçimini alıyoruz.
        int returnValue = fileChooser.showOpenDialog(null);

        // Kullanıcı bir dosya seçtiyse devam ediyoruz.
        if (returnValue == JFileChooser.APPROVE_OPTION) {
            File selectedFile = fileChooser.getSelectedFile();
            return selectedFile;
        } else {
            return null;
        }
    }
    
    public void copyFile(File sourceFile, File destFile) throws IOException {
        if (!destFile.exists()) {
            destFile.createNewFile();
        }
        FileChannel source = null;
        FileChannel destination = null;
        try {
            source = new FileInputStream(sourceFile).getChannel();
            destination = new FileOutputStream(destFile).getChannel();
            destination.transferFrom(source, 0, source.size());
        } finally {
            if (source != null) {
                source.close();
            }
            if (destination != null) {
                destination.close();
            }
        }
    }
}