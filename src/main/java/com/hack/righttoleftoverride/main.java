package com.hack.righttoleftoverride;

import com.formdev.flatlaf.FlatDarkLaf;
import java.net.URISyntaxException;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class main {

    public static void main(String args[]) throws URISyntaxException {
        try {
            UIManager.setLookAndFeel( new FlatDarkLaf() );
        } catch( UnsupportedLookAndFeelException e ) {
            ErrorDialog.showError("Hata olustu");
            System.out.println(e);
        }
        
        // Pencereyi oluştur ve görünür hale getir
        java.awt.EventQueue.invokeLater(() -> {
            UI ui = new UI();
            ui.setVisible(true);
        });
    }
    
}
