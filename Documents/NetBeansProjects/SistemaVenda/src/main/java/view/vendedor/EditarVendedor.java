/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.vendedor;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Categoria;
import model.Vendedor;
import service.VendedorService;
import util.NegocioException;
import util.Validacoes;
import view.cliente.CadastrarCliente;

/**
 *
 * @author Patricia Pieroni
 */
public class EditarVendedor extends javax.swing.JDialog {

    private final VendedorService vService;
    private final Vendedor vendedor;

    /**
     * Creates new form EditarVendedor
     */
    public EditarVendedor(javax.swing.JDialog parent, boolean modal, VendedorService vendedorService, Vendedor v) {
        super(parent, modal);
        initComponents();
        this.vService = vendedorService;
        this.vendedor = v;
        cpfExistente.setVisible(false);

     
        preencherDados();
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
        jLabel2 = new javax.swing.JLabel();
        edtNome = new javax.swing.JTextField();
        edtLogradouro = new javax.swing.JTextField();
        edtNumero = new javax.swing.JTextField();
        edtBairro = new javax.swing.JTextField();
        edtCidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        edtCPF = new javax.swing.JFormattedTextField();
        edtTelefone = new javax.swing.JFormattedTextField();
        btnEditar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        edtCEP = new javax.swing.JFormattedTextField();
        jLabel19 = new javax.swing.JLabel();
        edtComplemento = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        edtUF = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        edtSenha = new javax.swing.JTextField();
        edtLogin = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        edtSalario = new javax.swing.JFormattedTextField();
        jLabel3 = new javax.swing.JLabel();
        loginExistente = new javax.swing.JLabel();
        cpfExistente = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        edtData = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Editar Vendedor");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados Pessoais"));
        jPanel1.setPreferredSize(new java.awt.Dimension(500, 300));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("* Campos Obrigatórios.");

        edtNome.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N

        edtLogradouro.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N

        edtNumero.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N

        edtBairro.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N

        edtCidade.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel10.setText("*CPF:");

        try {
            edtCPF.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edtCPF.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        edtCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edtCPFActionPerformed(evt);
            }
        });
        edtCPF.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtCPFKeyReleased(evt);
            }
        });

        try {
            edtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edtTelefone.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N

        btnEditar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-salvar-como-28.png"))); // NOI18N
        btnEditar.setText("EDITAR");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/icons8-cancelar-28.png"))); // NOI18N
        btnCancelar.setText("CANCELAR");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel12.setText("*Telefone:");

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel13.setText("*Login:");

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel14.setText("*Número:");

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel15.setText("*Logradouro:");

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel16.setText("Complemento:");

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel17.setText("*Bairro:");

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel18.setText("*Cidade:");

        try {
            edtCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edtCEP.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel19.setText("*Cep:");

        edtComplemento.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel20.setText("*UF:");

        edtUF.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel21.setText("*Senha");

        edtSenha.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N

        edtLogin.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        edtLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtLoginKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel11.setText("*Salário:");

        edtSalario.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#.00"))));
        edtSalario.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel3.setText("*Nome Completo:");

        loginExistente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        loginExistente.setForeground(new java.awt.Color(255, 51, 0));
        loginExistente.setText("login ja cadastrado!");

        cpfExistente.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cpfExistente.setForeground(new java.awt.Color(255, 51, 0));
        cpfExistente.setText("CPF ja cadastrado!");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 13)); // NOI18N
        jLabel4.setText("*Data Nascimento:");

        try {
            edtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        edtData.setFont(new java.awt.Font("Century Gothic", 0, 13)); // NOI18N
        edtData.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                edtDataKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(edtNome)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(464, 464, 464)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel14)
                                        .addComponent(jLabel20)
                                        .addComponent(edtSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                                        .addComponent(edtNumero)
                                        .addComponent(edtUF)))))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edtData, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar)
                            .addGap(35, 35, 35)
                            .addComponent(btnEditar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel17)
                                        .addComponent(edtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(37, 37, 37)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(edtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel18)))
                                .addComponent(jLabel15)
                                .addComponent(edtLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(166, 166, 166)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(edtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(edtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)
                                .addComponent(jLabel19)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel10)
                                        .addComponent(edtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(30, 30, 30)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel12)
                                        .addComponent(edtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(cpfExistente))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(loginExistente)
                                .addComponent(edtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(35, 35, 35)
                            .addComponent(jLabel21)
                            .addGap(85, 85, 85)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(edtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtData, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginExistente)
                            .addComponent(cpfExistente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel21))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edtLogradouro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtComplemento, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(5, 5, 5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(edtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(jLabel18))
                        .addGap(5, 5, 5)
                        .addComponent(edtUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEditar)
                    .addComponent(btnCancelar)
                    .addComponent(jLabel2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 380, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void edtCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edtCPFActionPerformed
        // TODO add your handling code here:
        if (VendedorService.buscarCPF(Validacoes.removerCaracteres(edtCPF.getText()))) {
            cpfExistente.setVisible(false);
            btnEditar.setEnabled(true);
        } else {
            cpfExistente.setVisible(true);
            btnEditar.setEnabled(false);
        }
    }//GEN-LAST:event_edtCPFActionPerformed

    private void edtCPFKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtCPFKeyReleased
        // TODO add your handling code here:

        if (VendedorService.buscarCPF(Validacoes.removerCaracteres(edtCPF.getText()))) {
            cpfExistente.setVisible(false);
            btnEditar.setEnabled(true);
        } else {
            cpfExistente.setVisible(true);
            btnEditar.setEnabled(false);
        }
    }//GEN-LAST:event_edtCPFKeyReleased

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        // TODO add your handling code here:
        int num = 0;
        try {
            num = Integer.parseInt(edtNumero.getText());
        } catch (NumberFormatException ex) { // handle your exception

        }

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date data = vendedor.getDataNascimento();
        try {
            data = formato.parse(edtData.getText());
        } catch (ParseException ex) {
            Logger.getLogger(CadastrarCliente.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (verificaCampos()) {
            try {
                vendedor.setNome(edtNome.getText());
                vendedor.setLogin(edtLogin.getText());
                vendedor.setSenha(edtSenha.getText());
                vendedor.setSalario(Double.valueOf(edtSalario.getText()));
                vendedor.setCpf(edtCPF.getText());
                vendedor.setDataNascimento(data);
                if (vService.editar(vendedor)) {
                    dispose();

                }

            } catch (NegocioException ex) {
                Logger.getLogger(CadastrarVendedor.class.getName()).log(Level.SEVERE, null, ex);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Preencha todos os campos obrigatórios!",
                    "Erro Editar Vendedor", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        int result = JOptionPane.showConfirmDialog(this,
                "Cancelar a operação?", "Editar Vendedor",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE);

        if (result == JOptionPane.OK_OPTION) {
            dispose();
        }
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void edtLoginKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtLoginKeyReleased
        // TODO add your handling code here:
        if (VendedorService.verificarLogin(edtLogin.getText())) {
            loginExistente.setVisible(false);
            btnEditar.setEnabled(true);
        } else {
            loginExistente.setVisible(true);
            btnEditar.setEnabled(false);

        }
    }//GEN-LAST:event_edtLoginKeyReleased

    private void edtDataKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edtDataKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_edtDataKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JLabel cpfExistente;
    private javax.swing.JTextField edtBairro;
    private javax.swing.JFormattedTextField edtCEP;
    private javax.swing.JFormattedTextField edtCPF;
    private javax.swing.JTextField edtCidade;
    private javax.swing.JTextField edtComplemento;
    private javax.swing.JFormattedTextField edtData;
    private javax.swing.JTextField edtLogin;
    private javax.swing.JTextField edtLogradouro;
    private javax.swing.JTextField edtNome;
    private javax.swing.JTextField edtNumero;
    private javax.swing.JFormattedTextField edtSalario;
    private javax.swing.JTextField edtSenha;
    private javax.swing.JFormattedTextField edtTelefone;
    private javax.swing.JTextField edtUF;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loginExistente;
    // End of variables declaration//GEN-END:variables
 public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windonws".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                EditarVendedor dialog = new EditarVendedor(new javax.swing.JDialog(), true, new VendedorService(), new Vendedor());
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
  

    private void preencherDados() {
        Date data = vendedor.getDataNascimento();
        SimpleDateFormat formatador = new SimpleDateFormat("ddMMyyyy");
        String dataFormatada = formatador.format(data);
        System.out.println(dataFormatada);

        edtNome.setText(vendedor.getNome());
        edtBairro.setText(vendedor.getEnderecos().getBairro());
        edtCEP.setText(vendedor.getEnderecos().getCep());
        edtCPF.setText(vendedor.getCpf());
        edtCidade.setText(vendedor.getEnderecos().getCidade());
        edtComplemento.setText(vendedor.getEnderecos().getComplemento());
        edtLogradouro.setText(vendedor.getEnderecos().getLogradouro());
        edtNumero.setText(String.valueOf(vendedor.getEnderecos().getNumero()));
        edtTelefone.setText(vendedor.getTelefone());
        edtUF.setText(vendedor.getEnderecos().getUf());
        edtSalario.setText(String.valueOf(vendedor.getSalario()));
        edtLogin.setText(vendedor.getLogin());
        edtSenha.setText(vendedor.getSenha());
        edtData.setText(dataFormatada);
    }

    private boolean verificaCampos() {
        return (!edtNome.getText().isEmpty()
                && !edtBairro.getText().isEmpty()
                && !edtCEP.getText().isEmpty()
                && !edtCPF.getText().isEmpty()
                && !edtCidade.getText().isEmpty()
                && !edtLogradouro.getText().isEmpty()
                && !edtNumero.getText().isEmpty()
                && !edtLogin.getText().isEmpty()
                && !edtSenha.getText().isEmpty()
                && !edtSalario.getText().isEmpty()
                && !edtData.getText().isEmpty()
                && !edtTelefone.getText().isEmpty()
                && !edtUF.getText().isEmpty());
    }

   
}
