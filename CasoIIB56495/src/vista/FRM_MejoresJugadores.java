/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.util.ArrayList;
import modelo.Puntaje;

/**
 *
 * @author Usuario
 */
public class FRM_MejoresJugadores extends javax.swing.JFrame {

   String texto ="";
    public FRM_MejoresJugadores() {
        initComponents();
        this.setSize(320, 250);
        setLocation(500, 100);
        jTextArea1.setEditable(false);

    }

    
    public void mostrarMejoresJug( ArrayList<Puntaje> lista)
    {
        ArrayList<Puntaje> listaX = lista;
        texto="";
        for (int i = 0; i < listaX.size(); i++) {
            texto+=listaX.get(i).getNombre()+": "+lista.get(i).getPuntos()+"\n";
            
        }
        
        jTextArea1.setText(texto);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlMejoresJug = new javax.swing.JLabel();
        fondoMejorJugador = new javax.swing.JLabel();
        txtPuntaje = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        getContentPane().setLayout(null);

        jlMejoresJug.setText("                                  Mejores Jugadores");
        getContentPane().add(jlMejoresJug);
        jlMejoresJug.setBounds(4, 5, 290, 30);
        getContentPane().add(fondoMejorJugador);
        fondoMejorJugador.setBounds(0, 0, 290, 190);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        txtPuntaje.setViewportView(jTextArea1);

        getContentPane().add(txtPuntaje);
        txtPuntaje.setBounds(40, 40, 220, 120);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondoMejorJugador;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel jlMejoresJug;
    private javax.swing.JScrollPane txtPuntaje;
    // End of variables declaration//GEN-END:variables
}
