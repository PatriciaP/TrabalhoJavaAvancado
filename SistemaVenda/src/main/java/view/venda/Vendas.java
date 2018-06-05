/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.venda;

import java.util.List;
import javax.swing.JOptionPane;
import model.Venda;
import service.VendaService;

/**
 *
 * @author Patricia Pieroni
 */
public class Vendas extends javax.swing.JDialog {

    private final VendaService vendaService = new VendaService();
    private List<Venda> vendas;
    private TableModelVenda tableModelVenda;

    /**
     * Creates new form NewJDialog
     */
    public Vendas(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIcon();
        atualizaDados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cadastrar_paciente = new javax.swing.JButton();
        editar_paciente = new javax.swing.JButton();
        deletar_paciente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbxPaciente = new javax.swing.JComboBox();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableVenda = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new javax.swing.BoxLayout(getContentPane(), javax.swing.BoxLayout.PAGE_AXIS));

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        cadastrar_paciente.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        cadastrar_paciente.setText("Cadastrar");
        cadastrar_paciente.setToolTipText("");
        cadastrar_paciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        cadastrar_paciente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        cadastrar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastrar_pacienteActionPerformed(evt);
            }
        });
        jPanel1.add(cadastrar_paciente);

        editar_paciente.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        editar_paciente.setText("Editar");
        editar_paciente.setFocusable(false);
        editar_paciente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        editar_paciente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        editar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_pacienteActionPerformed(evt);
            }
        });
        jPanel1.add(editar_paciente);

        deletar_paciente.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        deletar_paciente.setText("Deletar");
        deletar_paciente.setFocusPainted(false);
        deletar_paciente.setFocusable(false);
        deletar_paciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletar_pacienteActionPerformed(evt);
            }
        });
        jPanel1.add(deletar_paciente);

        getContentPane().add(jPanel1);

        jPanel2.setLayout(new java.awt.GridLayout(1, 0));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        jLabel1.setText("Pesquisar por CPF: ");
        jLabel1.setPreferredSize(new java.awt.Dimension(128, 50));
        jPanel2.add(jLabel1);

        cbxPaciente.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Todos" }));
        cbxPaciente.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxPacienteItemStateChanged(evt);
            }
        });
        cbxPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPacienteActionPerformed(evt);
            }
        });
        jPanel2.add(cbxPaciente);

        getContentPane().add(jPanel2);

        tableVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "CPF Cliente", "Nome Cliente", "Data", "Valor", "Desconto", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableVenda.setMaximumSize(new java.awt.Dimension(300, 0));
        jScrollPane4.setViewportView(tableVenda);

        getContentPane().add(jScrollPane4);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cadastrar_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastrar_pacienteActionPerformed
        CadastrarVenda dialog = new CadastrarVenda(this, true);
        dialog.setVisible(true);
        atualizaDados();
    }//GEN-LAST:event_cadastrar_pacienteActionPerformed

    private void editar_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_pacienteActionPerformed
        if (tableVenda.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione um registro", "Editar Registro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Venda v = vendas.get(tableVenda.getSelectedRow());
        EditarVenda dialog = new EditarVenda(this, true, vendaService, v);
        dialog.setVisible(true);
        atualizaDados();
    }//GEN-LAST:event_editar_pacienteActionPerformed

    private void deletar_pacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletar_pacienteActionPerformed
        if (tableVenda.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, selecione um registro", "Excluir Registro", JOptionPane.ERROR_MESSAGE);
            return;
        }

        int resp = JOptionPane.showConfirmDialog(this,
                "Confirma a exclusão?",
                "Excluir registro",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (resp != JOptionPane.YES_OPTION) {
            return;
        }

        Venda v = vendas.get(tableVenda.getSelectedRow());
        if (vendaService.remover(v)) {
            JOptionPane.showMessageDialog(this, "Registro excluído", "Excluir Registro", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluir registro", "Excluir Registro", JOptionPane.ERROR_MESSAGE);
        }

        atualizaDados();

    }//GEN-LAST:event_deletar_pacienteActionPerformed

    private void cbxPacienteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxPacienteItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_cbxPacienteItemStateChanged

    private void cbxPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPacienteActionPerformed
        // TODO: Delete
    }//GEN-LAST:event_cbxPacienteActionPerformed

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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Vendas dialog = new Vendas(new javax.swing.JDialog(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cadastrar_paciente;
    private javax.swing.JComboBox cbxPaciente;
    private javax.swing.JButton deletar_paciente;
    private javax.swing.JButton editar_paciente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane4;
    public static javax.swing.JTable tableVenda;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        //  this.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/logo.png")));
    }

    private void atualizaDados() {
        
        vendas = vendaService.buscarTodos();
        tableModelVenda = new TableModelVenda(vendas);
        tableVenda.setModel(tableModelVenda);
        
    }
}
