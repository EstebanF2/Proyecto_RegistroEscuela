package formularios;

import conexionSQL.ConexionSQL;

import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Sistema extends javax.swing.JFrame {

    ConexionSQL cc = new ConexionSQL();
    Connection con = (Connection) cc.conexion();

    public Sistema() {
        initComponents();

        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/img/icon.png")).getImage());
        getContentPane().setBackground(getBackground());
        mostrarDatos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txt_apellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jcb_materia = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txt_calificaion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jcb_estatus = new javax.swing.JComboBox<>();
        btn_nuevo = new javax.swing.JButton();
        btn_guardar = new javax.swing.JButton();
        btn_eliminar = new javax.swing.JButton();
        btn_actualizar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        lbl_cerrar = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_datos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        txt_busqueda = new javax.swing.JTextField();
        btn_reporte = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de alumnos");
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Nombre:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        txt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nombreActionPerformed(evt);
            }
        });
        jPanel1.add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 60, 140, -1));

        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Apellidos:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));
        jPanel1.add(txt_apellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 140, -1));

        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Materia:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, -1));

        jcb_materia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "matematicas", "español", "fisica", "ingles", "programacion", "geografia", "quimica", "historia" }));
        jPanel1.add(jcb_materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 140, -1));

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Calificacion:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));
        jPanel1.add(txt_calificaion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 140, -1));

        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Estatus:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jcb_estatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "aprobado", "reprobado" }));
        jPanel1.add(jcb_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, 140, -1));

        btn_nuevo.setBackground(new java.awt.Color(204, 0, 0));
        btn_nuevo.setForeground(new java.awt.Color(204, 0, 0));
        btn_nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btn_nuevo.setToolTipText("nuevo");
        btn_nuevo.setBorder(null);
        btn_nuevo.setBorderPainted(false);
        btn_nuevo.setOpaque(false);
        btn_nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btn_nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 60, -1));

        btn_guardar.setBackground(new java.awt.Color(204, 0, 0));
        btn_guardar.setForeground(new java.awt.Color(204, 0, 0));
        btn_guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/save.png"))); // NOI18N
        btn_guardar.setToolTipText("guardar");
        btn_guardar.setBorder(null);
        btn_guardar.setBorderPainted(false);
        btn_guardar.setOpaque(false);
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 265, 50, 60));

        btn_eliminar.setBackground(new java.awt.Color(204, 0, 0));
        btn_eliminar.setForeground(new java.awt.Color(204, 0, 0));
        btn_eliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/delete.png"))); // NOI18N
        btn_eliminar.setToolTipText("Eliminar");
        btn_eliminar.setBorder(null);
        btn_eliminar.setBorderPainted(false);
        btn_eliminar.setOpaque(false);
        btn_eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_eliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 60, 50));

        btn_actualizar.setBackground(new java.awt.Color(204, 0, 0));
        btn_actualizar.setForeground(new java.awt.Color(204, 0, 0));
        btn_actualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/update.png"))); // NOI18N
        btn_actualizar.setToolTipText("actualizar");
        btn_actualizar.setBorder(null);
        btn_actualizar.setBorderPainted(false);
        btn_actualizar.setOpaque(false);
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_actualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 270, 60, 50));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Escuela");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 10, -1, -1));

        lbl_cerrar.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbl_cerrar.setForeground(new java.awt.Color(0, 0, 0));
        lbl_cerrar.setText("X");
        lbl_cerrar.setToolTipText("Cerrar");
        lbl_cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_cerrarMouseClicked(evt);
            }
        });
        jPanel1.add(lbl_cerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 340));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jt_datos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jt_datos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jt_datosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jt_datos);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 60, 470, 270));

        jLabel7.setFont(new java.awt.Font("Cambria", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Busqueda:");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        txt_busqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_busquedaKeyReleased(evt);
            }
        });
        jPanel2.add(txt_busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 250, -1));

        btn_reporte.setBackground(new java.awt.Color(0, 0, 0));
        btn_reporte.setForeground(new java.awt.Color(0, 0, 0));
        btn_reporte.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/reporte.png"))); // NOI18N
        btn_reporte.setToolTipText("Reporte");
        btn_reporte.setBorder(null);
        btn_reporte.setBorderPainted(false);
        btn_reporte.setOpaque(false);
        btn_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reporteActionPerformed(evt);
            }
        });
        jPanel2.add(btn_reporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 5, 60, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(309, 0, 490, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nombreActionPerformed

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        insertarDatos();
        limpiar();
        mostrarDatos();
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void btn_nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nuevoActionPerformed
        limpiar();
    }//GEN-LAST:event_btn_nuevoActionPerformed

    private void jt_datosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jt_datosMouseClicked
        //aca programo que cuando haga click en algun dato de la tabla me muestre en las casillas para poder mofificar.
        int filaSeleccionada = jt_datos.rowAtPoint(evt.getPoint());

        txt_nombre.setText(jt_datos.getValueAt(filaSeleccionada, 1).toString());
        txt_apellidos.setText(jt_datos.getValueAt(filaSeleccionada, 2).toString());
        jcb_materia.setSelectedItem(jt_datos.getValueAt(filaSeleccionada, 3));
        txt_calificaion.setText(jt_datos.getValueAt(filaSeleccionada, 4).toString());
        jcb_estatus.setSelectedItem(jt_datos.getValueAt(filaSeleccionada, 5));
    }//GEN-LAST:event_jt_datosMouseClicked

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        actualizarDatos();
        limpiar();
        mostrarDatos();

    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_eliminarActionPerformed
        eliminarDatos();
        mostrarDatos();
        limpiar();
    }//GEN-LAST:event_btn_eliminarActionPerformed

    private void txt_busquedaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_busquedaKeyReleased
        filtrarDatos(txt_busqueda.getText());
    }//GEN-LAST:event_txt_busquedaKeyReleased

    private void btn_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reporteActionPerformed

        try {

            JasperReport reporte = (JasperReport) JRLoader.loadObject(getClass().getResource("/Reportes/reportesEscuela.jasper"));
            JasperPrint jPrint = JasperFillManager.fillReport(reporte, null, con);

            JasperViewer viewer = new JasperViewer(jPrint, false);
            viewer.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
            viewer.setVisible(true);

        } catch (JRException e) {
            System.out.println(e.getMessage());
            JOptionPane.showMessageDialog(null, "Error al generar reporte" + e);
        }


    }//GEN-LAST:event_btn_reporteActionPerformed

    private void lbl_cerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_cerrarMouseClicked
        dispose();
    }//GEN-LAST:event_lbl_cerrarMouseClicked

    public void filtrarDatos(String valor) {

        String[] titulos = {"ID", "Nombre", "Apellidos", "Materia", "Calificaion", "Estatus"};
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String SQL = "select * from alumnos where nombre like '%" + valor + "%'";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {

                registros[0] = rs.getString("idalumnos");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("apellidos");
                registros[3] = rs.getString("materia");
                registros[4] = rs.getString("calificacion");
                registros[5] = rs.getString("estatus");

                modelo.addRow(registros);
            }

            jt_datos.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos " + e);
        }

    }

    public void mostrarDatos() {

        String[] titulos = {"ID", "Nombre", "Apellidos", "Materia", "Calificaion", "Estatus"};
        String[] registros = new String[6];

        DefaultTableModel modelo = new DefaultTableModel(null, titulos);

        String SQL = "select * from alumnos";

        try {

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(SQL);

            while (rs.next()) {

                registros[0] = rs.getString("idalumnos");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("apellidos");
                registros[3] = rs.getString("materia");
                registros[4] = rs.getString("calificacion");
                registros[5] = rs.getString("estatus");

                modelo.addRow(registros);
            }

            jt_datos.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al mostrar datos " + e);
        }

    }

    public void limpiar() {

        txt_nombre.setText("");
        txt_apellidos.setText("");
        jcb_materia.setSelectedIndex(0);
        txt_calificaion.setText("");
        jcb_estatus.setSelectedIndex(0);

    }

    public void insertarDatos() {

        try {
            String SQL = "insert into alumnos (nombre, apellidos, materia, calificacion, estatus) values (?,?,?,?,?)";

            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, txt_nombre.getText());
            pst.setString(2, txt_apellidos.getText());

            int seleccionado = jcb_materia.getSelectedIndex();
            pst.setString(3, jcb_materia.getItemAt(seleccionado));

            pst.setDouble(4, Double.parseDouble(txt_calificaion.getText()));

            int seleccionadoDos = jcb_estatus.getSelectedIndex();
            pst.setString(5, jcb_estatus.getItemAt(seleccionadoDos));

            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro correcto");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Registro incorrecto" + e);
        }
    }

    public void actualizarDatos() {

        try {
            String SQL = "update alumnos set nombre=?, apellidos=?, materia=?, calificacion=?, estatus=? where idalumnos=?";

            int filaSeleccionada = jt_datos.getSelectedRow();
            String dao = (String) jt_datos.getValueAt(filaSeleccionada, 0);

            PreparedStatement pst = con.prepareStatement(SQL);

            pst.setString(1, txt_nombre.getText());
            pst.setString(2, txt_apellidos.getText());

            int seleccionado = jcb_materia.getSelectedIndex();
            pst.setString(3, jcb_materia.getItemAt(seleccionado));

            pst.setDouble(4, Double.parseDouble(txt_calificaion.getText()));

            int seleccionadoDos = jcb_estatus.getSelectedIndex();
            pst.setString(5, jcb_estatus.getItemAt(seleccionadoDos));

            pst.setString(6, dao);
            pst.execute();

            JOptionPane.showMessageDialog(null, "Registro actualizado");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error de actualizacion de registro" + e);
        }
    }

    public void eliminarDatos() {

        int filaSeleccionada = jt_datos.getSelectedRow();

        try {

            String SQL = "delete from alumnos where idalumnos=" + jt_datos.getValueAt(filaSeleccionada, 0);

            Statement st = con.createStatement();

            int n = st.executeUpdate(SQL);

            if (n >= 0) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR al eliminar registro" + e);
        }

    }

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
//            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Sistema.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Sistema().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_eliminar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JButton btn_nuevo;
    private javax.swing.JButton btn_reporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> jcb_estatus;
    private javax.swing.JComboBox<String> jcb_materia;
    private javax.swing.JTable jt_datos;
    private javax.swing.JLabel lbl_cerrar;
    private javax.swing.JTextField txt_apellidos;
    private javax.swing.JTextField txt_busqueda;
    private javax.swing.JTextField txt_calificaion;
    private javax.swing.JTextField txt_nombre;
    // End of variables declaration//GEN-END:variables
}
