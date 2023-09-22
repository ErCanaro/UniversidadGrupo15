/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo15.vistas;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import universidadgrupo15.accesoADatos.InscripcionData;
import universidadgrupo15.accesoADatos.MateriaData;
import universidadgrupo15.entidades.Alumno;
import universidadgrupo15.entidades.Materia;

/**
 *
 * @author Enzo Bulacio
 */
public class VistaAlumnosPorMateria extends javax.swing.JInternalFrame {
    MateriaData matedata = new MateriaData();
    DefaultTableModel modeloTabla = new DefaultTableModel();
    /**
     * Creates new form VistaAlumnosPorMateria
     */
    public VistaAlumnosPorMateria() {
        initComponents();
        crearEncabezadosTabla();
        cargarComboBoxMaterias();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jCBMateria = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setText("Listado de Alumnos por  Materia");

        jLabel2.setText("Seleccione una Materia");

        jCBMateria.setModel(new javax.swing.DefaultComboBoxModel<>());
        jCBMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCBMateriaActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(jLabel2)
                        .addGap(48, 48, 48)
                        .addComponent(jCBMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jCBMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCBMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCBMateriaActionPerformed
        cargarAlumnosPorMateria();
    }//GEN-LAST:event_jCBMateriaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Materia> jCBMateria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
    
    private void crearEncabezadosTabla(){
       
        
        modeloTabla.addColumn("id");
        modeloTabla.addColumn("DNI");
        modeloTabla.addColumn("Apellido");
        modeloTabla.addColumn("Nombre");
        
        jTable1.setModel(modeloTabla);
    }

    private void cargarComboBoxMaterias(){
        DefaultComboBoxModel modeloCBMateria = new DefaultComboBoxModel();
        
        for (Materia mate : matedata.listarMaterias()){
            modeloCBMateria.addElement(mate);
        }
        
        jCBMateria.setModel(modeloCBMateria);
    }
    
    private void cargarAlumnosPorMateria(){
        InscripcionData idata = new InscripcionData();
        
        Materia materia = (Materia) jCBMateria.getSelectedItem();
        modeloTabla.setRowCount(0);
        for (Alumno alu : idata.obtenerAlumnosPorMateria(materia.getIdMateria())){
            modeloTabla.addRow(new Object [] {alu.getIdAlumno(), alu.getDni(), alu.getApellido(), alu.getNombre()});
        }
        
        jTable1.setModel(modeloTabla);
    }
}