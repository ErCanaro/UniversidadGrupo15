/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo15.vistas;

import java.sql.Date;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import universidadgrupo15.accesoADatos.AlumnoData;
import universidadgrupo15.accesoADatos.MateriaData;
import universidadgrupo15.entidades.Alumno;
import universidadgrupo15.entidades.Materia;

/**
 *
 * @author Enzo Bulacio
 */
public class VistaMateriaIF extends javax.swing.JInternalFrame {
    AlumnoData aludata = new AlumnoData();
    MateriaData matedata = new MateriaData();
    /**
     * Creates new form VistaAlumno
     */
    public VistaMateriaIF() {
        initComponents();
        deshabilitarBotones();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCalendar1 = new com.toedter.calendar.JCalendar();
        jCalendar2 = new com.toedter.calendar.JCalendar();
        jLabel1 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jBLimpiar = new javax.swing.JButton();
        jBBorrar = new javax.swing.JButton();
        jBRestaurar = new javax.swing.JButton();
        jBActualizar = new javax.swing.JButton();
        jBBuscas = new javax.swing.JButton();
        jBGuardar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jRBEstado = new javax.swing.JRadioButton();
        jTFAnio = new javax.swing.JTextField();
        jLDNI = new javax.swing.JLabel();
        jTFidMateria = new javax.swing.JTextField();
        jLApellido1 = new javax.swing.JLabel();
        jLEstado = new javax.swing.JLabel();
        jLidAlumno = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();

        setClosable(true);

        jLabel1.setText("Formulario de Materia");

        jBLimpiar.setText("LIMPIAR");
        jBLimpiar.setFocusable(false);
        jBLimpiar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBLimpiar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBBorrar.setText("Borrar");
        jBBorrar.setFocusable(false);
        jBBorrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBBorrar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBorrarActionPerformed(evt);
            }
        });

        jBRestaurar.setText("Restaurar");
        jBRestaurar.setFocusable(false);
        jBRestaurar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBRestaurar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBRestaurar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBRestaurarActionPerformed(evt);
            }
        });

        jBActualizar.setText("Actualizar");
        jBActualizar.setFocusable(false);
        jBActualizar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBActualizar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBActualizarActionPerformed(evt);
            }
        });

        jBBuscas.setText("Buscar");
        jBBuscas.setFocusable(false);
        jBBuscas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBBuscas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBBuscas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscasActionPerformed(evt);
            }
        });

        jBGuardar.setText("Agregar");
        jBGuardar.setFocusable(false);
        jBGuardar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jBGuardar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jBGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBGuardarActionPerformed(evt);
            }
        });

        jLayeredPane1.setLayer(jBLimpiar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jBBorrar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jBRestaurar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jBActualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jBBuscas, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jBGuardar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane1.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jBBuscas, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBGuardar, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBBorrar, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBActualizar, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBLimpiar, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBRestaurar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(0, 13, Short.MAX_VALUE)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(33, 33, 33)
                                .addComponent(jBBorrar)
                                .addGap(15, 15, 15))
                            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jBActualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jLayeredPane1Layout.createSequentialGroup()
                        .addComponent(jBBuscas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBGuardar)
                        .addGap(87, 87, 87)))
                .addComponent(jBRestaurar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jBLimpiar)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jRBEstado.setText("Activo");
        jRBEstado.setEnabled(false);

        jLDNI.setText("Año");

        jLApellido1.setText("Nombre *");

        jLEstado.setText("Estado");

        jLidAlumno.setText("Código");

        jLayeredPane2.setLayer(jRBEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTFAnio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLDNI, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTFidMateria, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLApellido1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLEstado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jLidAlumno, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jTFNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLEstado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLidAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(jRBEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFAnio)
                            .addComponent(jTFidMateria, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE)))
                    .addGroup(jLayeredPane2Layout.createSequentialGroup()
                        .addComponent(jLApellido1, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jLayeredPane2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jRBEstado, jTFAnio, jTFNombre, jTFidMateria});

        jLayeredPane2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLApellido1, jLDNI, jLEstado, jLidAlumno});

        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTFidMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLidAlumno))
                .addGap(36, 36, 36)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLApellido1))
                .addGap(36, 36, 36)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLDNI)
                    .addComponent(jTFAnio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBEstado)
                    .addComponent(jLEstado))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLApellido1, jTFNombre});

        jLayeredPane2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLDNI, jTFAnio});

        jLayeredPane2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLEstado, jRBEstado});

        jLayeredPane2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLidAlumno, jTFidMateria});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLayeredPane2)
                .addGap(32, 32, 32)
                .addComponent(jLayeredPane1)
                .addGap(25, 25, 25))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBGuardarActionPerformed
        Materia materia = new Materia();
             
        materia.setNombre(jTFNombre.getText());
        materia.setAnio(Integer.valueOf(jTFAnio.getText()));
        materia.setEstado(jRBEstado.isSelected());

        try {
            matedata.AgregarMateria(materia);
        }catch (NullPointerException npe) {
            JOptionPane.showMessageDialog(this, "Datos insuficientes para crear materia");
        }
        deshabilitarBotones();
    }//GEN-LAST:event_jBGuardarActionPerformed

    private void jBBuscasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscasActionPerformed
        Materia materia = null;
        try{
            if (jTFidMateria.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ingrese ID para la materia");
                return;
            }else {
                int id =  Integer.parseInt(jTFidMateria.getText());      
                materia = matedata.buscarMateriaPorID(id);
            }
            
            
                jTFidMateria.setText(String.valueOf(materia.getIdMateria()));
                jTFNombre.setText(materia.getNombre());
                jTFAnio.setText(String.valueOf(materia.getAnio()));
                jRBEstado.setSelected(materia.isEstado());

            } catch (NullPointerException npe) {
                JOptionPane.showMessageDialog(this, "Valor de ID inválido o inexistente");
                limpiar();
            } catch (NumberFormatException nfe){
                JOptionPane.showMessageDialog(this, "No se introdujo un valor Válido");
                limpiar();
            }
        deshabilitarBotones();
    }//GEN-LAST:event_jBBuscasActionPerformed

    private void jBActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBActualizarActionPerformed
        //Trae al alumno con el ID en pantalla
        Materia materia = matedata.buscarMateriaPorID(Integer.parseInt(jTFidMateria.getText()));
        //Setea los parámetros del alumno con los datos en pantalla.
        materia.setAnio(Integer.parseInt(jTFAnio.getText()));
        materia.setNombre(jTFNombre.getText());
        

        //Asigna los datos en pantalla al alumno
        matedata.modificarMateria(materia);
        deshabilitarBotones();
    }//GEN-LAST:event_jBActualizarActionPerformed

    private void jBRestaurarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBRestaurarActionPerformed
        System.out.println(Integer.parseInt(jTFidMateria.getText()));
        matedata.altaMateriaBorrada(Integer.parseInt(jTFidMateria.getText()));
        jRBEstado.setSelected(true);
        deshabilitarBotones();
        
    }//GEN-LAST:event_jBRestaurarActionPerformed

    private void jBBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBorrarActionPerformed
        matedata.borrarMateria(Integer.parseInt(jTFidMateria.getText()));
        jRBEstado.setSelected(false);
        deshabilitarBotones();
        
    }//GEN-LAST:event_jBBorrarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        limpiar();
        deshabilitarBotones();
    }//GEN-LAST:event_jBLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBActualizar;
    private javax.swing.JButton jBBorrar;
    private javax.swing.JButton jBBuscas;
    private javax.swing.JButton jBGuardar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBRestaurar;
    private com.toedter.calendar.JCalendar jCalendar1;
    private com.toedter.calendar.JCalendar jCalendar2;
    private javax.swing.JLabel jLApellido1;
    private javax.swing.JLabel jLDNI;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLabel jLidAlumno;
    private javax.swing.JRadioButton jRBEstado;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JTextField jTFAnio;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFidMateria;
    // End of variables declaration//GEN-END:variables
   
    private void limpiar() {
        jTFidMateria.setText("");
        jTFAnio.setText("");
        jTFNombre.setText("");
        jRBEstado.setSelected(false);
    }
    
    private void deshabilitarBotones(){
        
        if(jTFidMateria.getText().isEmpty()){
            jBRestaurar.setEnabled(false);
            jBBorrar.setEnabled(false);
        } else if (jRBEstado.isSelected()){
            jBBorrar.setEnabled(true);
            jBRestaurar.setEnabled(false);
        }else {
            jBBorrar.setEnabled(false);
            jBRestaurar.setEnabled(true);
        }
    }
}
