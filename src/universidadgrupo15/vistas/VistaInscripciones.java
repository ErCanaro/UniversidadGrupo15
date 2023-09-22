/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo15.vistas;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import universidadgrupo15.accesoADatos.AlumnoData;
import universidadgrupo15.accesoADatos.InscripcionData;
import universidadgrupo15.accesoADatos.MateriaData;
import universidadgrupo15.entidades.Alumno;
import universidadgrupo15.entidades.Inscripcion;
import universidadgrupo15.entidades.Materia;

/**
 *
 * @author Enzo Bulacio
 */
public class VistaInscripciones extends javax.swing.JInternalFrame {
    MateriaData mateData = new MateriaData();
    AlumnoData aludata = new AlumnoData();
    InscripcionData idata = new InscripcionData();
    DefaultComboBoxModel  modeloCB = new DefaultComboBoxModel();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    
    
    /**
     * Creates new form VistaInscripciones
     */
    public VistaInscripciones() {
        initComponents();
        crearEncabezadosTabla();
        cargarCBAlumnos();
        buttonGroup1.add(jRBMateriasCursadas);
        buttonGroup1.add(jRBMateriasNOcursadas);
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
        jRBMateriasCursadas = new javax.swing.JRadioButton();
        jRBMateriasNOcursadas = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTMaterias = new javax.swing.JTable();
        jCBAlumno = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBInscribir = new javax.swing.JButton();
        jBAnularInscipcion = new javax.swing.JButton();

        jLabel1.setText("Gestión de Incripciones");

        jRBMateriasCursadas.setText("Materias Inscriptas");
        jRBMateriasCursadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBMateriasCursadasActionPerformed(evt);
            }
        });

        jRBMateriasNOcursadas.setText("Materias NO inscriptas");
        jRBMateriasNOcursadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRBMateriasNOcursadasActionPerformed(evt);
            }
        });

        jTMaterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTMaterias);

        jCBAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBAlumnoActionPerformed(evt);
            }
        });

        jLabel2.setText("Seleccione un Alumno");

        jLabel3.setText("Seleccion de Materias");

        jBInscribir.setText("Inscribir");
        jBInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirActionPerformed(evt);
            }
        });

        jBAnularInscipcion.setText("Anular Inscripcion");
        jBAnularInscipcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAnularInscipcionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jBInscribir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBAnularInscipcion)
                .addGap(95, 95, 95))
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jCBAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRBMateriasCursadas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRBMateriasNOcursadas)
                                .addGap(14, 14, 14)))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRBMateriasNOcursadas)
                    .addComponent(jRBMateriasCursadas))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAnularInscipcion)
                    .addComponent(jBInscribir))
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRBMateriasCursadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBMateriasCursadasActionPerformed
        cargarTablaInscriptas();
        jBInscribir.setEnabled(false);
        jBAnularInscipcion.setEnabled(true);
    }//GEN-LAST:event_jRBMateriasCursadasActionPerformed

    private void jRBMateriasNOcursadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRBMateriasNOcursadasActionPerformed
       cargarTablaNOInscriptas();
       jBAnularInscipcion.setEnabled(false);
       jBInscribir.setEnabled(true);
       
      
    }//GEN-LAST:event_jRBMateriasNOcursadasActionPerformed

    private void jBInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirActionPerformed
        inscribir();
        cargarTablaNOInscriptas();
    }//GEN-LAST:event_jBInscribirActionPerformed

    private void jCBAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBAlumnoActionPerformed
        if (jRBMateriasCursadas.isSelected()){
           cargarTablaInscriptas();
       }
       
       if (jRBMateriasNOcursadas.isSelected()){
           cargarTablaNOInscriptas();
       }
    }//GEN-LAST:event_jCBAlumnoActionPerformed

    private void jBAnularInscipcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAnularInscipcionActionPerformed
        anularInscripcion();
        cargarTablaInscriptas();
    }//GEN-LAST:event_jBAnularInscipcionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jBAnularInscipcion;
    private javax.swing.JButton jBInscribir;
    private javax.swing.JComboBox<String> jCBAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JRadioButton jRBMateriasCursadas;
    private javax.swing.JRadioButton jRBMateriasNOcursadas;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTMaterias;
    // End of variables declaration//GEN-END:variables

    private void cargarCBAlumnos(){
        for (Alumno alu : aludata.listarAlumnos()){
            modeloCB.addElement(alu);
        }
        
        jCBAlumno.setModel(modeloCB);
    }

    private void crearEncabezadosTabla(){
        modeloTabla.addColumn("id");
        modeloTabla.addColumn("Nombre");
        modeloTabla.addColumn("Año");

        jTMaterias.setModel(modeloTabla);
    }
    
    private void cargarTablaInscriptas(){
        Alumno alu = (Alumno) jCBAlumno.getSelectedItem();
        
        modeloTabla.setRowCount(0);
        for (Materia mate :idata.obtenerMateriasCursadasPorAlumno(alu.getIdAlumno())){
            modeloTabla.addRow(new Object [] {mate.getIdMateria(), mate.getNombre(), mate.getAnio()});
        }
        
        jTMaterias.setModel(modeloTabla);
    }
    
    private void cargarTablaNOInscriptas(){
         Alumno alu = (Alumno) jCBAlumno.getSelectedItem();
        
        modeloTabla.setRowCount(0);
         for (Materia mate :idata.obtenerMateriasNOCursadasPorAlumno(alu.getIdAlumno())){
            modeloTabla.addRow(new Object [] {mate.getIdMateria(), mate.getNombre(), mate.getAnio()});
        }
        
        jTMaterias.setModel(modeloTabla);
    }
    
    private void inscribir(){
        Alumno alu = (Alumno) jCBAlumno.getSelectedItem();
        Materia mate = mateData.buscarMateriaPorID((int)jTMaterias.getValueAt(jTMaterias.getSelectedRow(), 0));
        
        Inscripcion inscrip = new Inscripcion(0, mate, alu);
        
        idata.crearInscripcion(inscrip);
    }
    
    private void anularInscripcion(){
        Alumno alu = (Alumno) jCBAlumno.getSelectedItem();
        Materia mate = mateData.buscarMateriaPorID((int)jTMaterias.getValueAt(jTMaterias.getSelectedRow(), 0));
        
        idata.borrarNota(alu.getIdAlumno(), (int)jTMaterias.getValueAt(jTMaterias.getSelectedRow(), 0));
    }
}
