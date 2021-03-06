/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package vista;


import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import modelo.Hilo;

/**
 *
 * @author Usuario
 */
public class FRM_Inicio extends javax.swing.JFrame {

    /** Creates new form FRM_Inicio */
    FRM_Juego frm_Juego;
    FRM_Instrucciones frm_Instrucciones;    
    FRM_MejoresJugadores frm_MejoresJug;
    AudioClip audioInicio;
    Hilo hilo;
    public String estadoSonido  = "sonando";
    public FRM_Inicio() {
        initComponents();
        this.setSize(495,338);
        setLocation(500,100);
        audioInicio = java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/The_Simpsons_Ending_Credits_2011_HD.wav"));
        audioInicio.play();
        audioInicio.loop();

        frm_Juego = new FRM_Juego();
        frm_MejoresJug = new FRM_MejoresJugadores();
        frm_Instrucciones = new FRM_Instrucciones();
        detenerMusica();
    }
    
    public void listar()
    {
        frm_MejoresJug.mostrarMejoresJug(frm_Juego.frm_AgregarPuntaje.metodos.getInformacionArchivosPlanos());
    }
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FRM_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FRM_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FRM_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FRM_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FRM_Inicio().setVisible(true);
                
            }
        });
        
    }
    
    public void detenerMusica()
    {
        if(frm_Juego.equals(true))
        {
            this.audioInicio.stop();
        }
    }
    
      
    
    
  
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnJugar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnInstruccionesJuego = new javax.swing.JButton();
        btnSonido = new javax.swing.JButton();
        btnMejoresJugadores = new javax.swing.JButton();
        jl_Springfield = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("¡AY! ¡¡LOS FRIJOLES!!");
        getContentPane().setLayout(null);

        btnJugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/play_game.gif"))); // NOI18N
        btnJugar.setActionCommand("Play");
        btnJugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJugarActionPerformed(evt);
            }
        });
        getContentPane().add(btnJugar);
        btnJugar.setBounds(190, 260, 90, 40);

        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/exit.jpg"))); // NOI18N
        btnSalir.setActionCommand("exit");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(300, 260, 80, 40);

        btnInstruccionesJuego.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Paper.gif"))); // NOI18N
        btnInstruccionesJuego.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInstruccionesJuegoActionPerformed(evt);
            }
        });
        getContentPane().add(btnInstruccionesJuego);
        btnInstruccionesJuego.setBounds(90, 260, 80, 40);

        btnSonido.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/play.png"))); // NOI18N
        btnSonido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSonidoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSonido);
        btnSonido.setBounds(410, 10, 60, 40);

        btnMejoresJugadores.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/avatar_information.png"))); // NOI18N
        btnMejoresJugadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMejoresJugadoresActionPerformed(evt);
            }
        });
        getContentPane().add(btnMejoresJugadores);
        btnMejoresJugadores.setBounds(10, 10, 70, 40);

        jl_Springfield.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/springfield.jpg"))); // NOI18N
        getContentPane().add(jl_Springfield);
        jl_Springfield.setBounds(0, 0, 500, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInstruccionesJuegoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInstruccionesJuegoActionPerformed
       frm_Instrucciones.setVisible(true);
    }//GEN-LAST:event_btnInstruccionesJuegoActionPerformed

    private void btnJugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJugarActionPerformed
       frm_Juego = new FRM_Juego();
        frm_Juego.setVisible(true);
       frm_Juego.hilo.start();
       detenerMusica();
       audioInicio.loop();
       
       

    }//GEN-LAST:event_btnJugarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSonidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSonidoActionPerformed
        if(estadoSonido.equalsIgnoreCase("sonando"))
        {
            audioInicio.stop();
            btnSonido.setIcon(new ImageIcon("src/imagenes/pause.png"));
            estadoSonido="silencio";
        }
        else
        {
            audioInicio.play();
            btnSonido.setIcon(new ImageIcon("src/imagenes/play.png"));
            estadoSonido="sonando";

            
        }
    }//GEN-LAST:event_btnSonidoActionPerformed

    private void btnMejoresJugadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMejoresJugadoresActionPerformed
        listar();
        frm_MejoresJug.setVisible(true);
    }//GEN-LAST:event_btnMejoresJugadoresActionPerformed

     
    
    
    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FRM_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FRM_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FRM_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FRM_Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FRM_Inicio().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInstruccionesJuego;
    private javax.swing.JButton btnJugar;
    private javax.swing.JButton btnMejoresJugadores;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnSonido;
    private javax.swing.JLabel jl_Springfield;
    // End of variables declaration//GEN-END:variables

}
