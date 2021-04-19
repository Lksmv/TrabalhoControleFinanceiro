package view;

import java.awt.Color;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;
import model.ControleFinanceiro;
import model.Despesa;
import model.TipoDespesa;

/**
 *
 * @author Amanda Miranda Zanella, Bruno Henrique Wiedemann Reis, Lucas Miguel
 * Vieira, Matheus Guilherme Jacinto
 */
public class DespesaUI extends javax.swing.JDialog {

    private ControleFinanceiro control;

    /**
     *
     * @param parent
     * @param modal
     */
    public DespesaUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.getContentPane().setBackground(Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgpDespesa = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        rbAlimentacao = new javax.swing.JRadioButton();
        rbTransporte = new javax.swing.JRadioButton();
        rbResidencia = new javax.swing.JRadioButton();
        rbSaude = new javax.swing.JRadioButton();
        rbTodos = new javax.swing.JRadioButton();
        rbEducacao = new javax.swing.JRadioButton();
        rbEntretenimento = new javax.swing.JRadioButton();
        rbOutras = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jtTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipo de Lançamento", "Tipo", "Valor", "Data"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtTabela);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));

        btgpDespesa.add(rbAlimentacao);
        rbAlimentacao.setText("Alimentação");
        rbAlimentacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAlimentacaoActionPerformed(evt);
            }
        });

        btgpDespesa.add(rbTransporte);
        rbTransporte.setText("Transporte");
        rbTransporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTransporteActionPerformed(evt);
            }
        });

        btgpDespesa.add(rbResidencia);
        rbResidencia.setText("Residência");
        rbResidencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbResidenciaActionPerformed(evt);
            }
        });

        btgpDespesa.add(rbSaude);
        rbSaude.setText("Saúde");
        rbSaude.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbSaudeActionPerformed(evt);
            }
        });

        btgpDespesa.add(rbTodos);
        rbTodos.setText("Todas as Despesas");
        rbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTodosActionPerformed(evt);
            }
        });

        btgpDespesa.add(rbEducacao);
        rbEducacao.setText("Educação");
        rbEducacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEducacaoActionPerformed(evt);
            }
        });

        btgpDespesa.add(rbEntretenimento);
        rbEntretenimento.setText("Entretenimento");
        rbEntretenimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEntretenimentoActionPerformed(evt);
            }
        });

        btgpDespesa.add(rbOutras);
        rbOutras.setText("Outras");
        rbOutras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbOutrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbAlimentacao)
                    .addComponent(rbTransporte))
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbResidencia)
                    .addComponent(rbSaude))
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbEducacao)
                    .addComponent(rbEntretenimento))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbTodos)
                    .addComponent(rbOutras))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rbAlimentacao)
                        .addComponent(rbResidencia)
                        .addComponent(rbEducacao))
                    .addComponent(rbOutras, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTransporte)
                    .addComponent(rbSaude)
                    .addComponent(rbEntretenimento)
                    .addComponent(rbTodos))
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rbSaudeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbSaudeActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel) jtTabela.getModel()).setRowCount(0);
        for (Object o : control.getExtrato()) {
            if (o instanceof Despesa && ((Despesa) o).getTipoDespesa() == TipoDespesa.SAUDE) {
                adicionarValorTabela(o);
            } else {

            }
        }
    }//GEN-LAST:event_rbSaudeActionPerformed

    private void rbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTodosActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel) jtTabela.getModel()).setRowCount(0);
        for (Object o : control.getExtrato()) {
            if (o instanceof Despesa) {
                adicionarValorTabela(o);
            } else {

            }
        }
    }//GEN-LAST:event_rbTodosActionPerformed

    private void rbResidenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbResidenciaActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel) jtTabela.getModel()).setRowCount(0);
        for (Object o : control.getExtrato()) {
            if (o instanceof Despesa && ((Despesa) o).getTipoDespesa() == TipoDespesa.RESIDENCIA) {
                adicionarValorTabela(o);
            } else {

            }
        }
    }//GEN-LAST:event_rbResidenciaActionPerformed

    private void rbTransporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTransporteActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel) jtTabela.getModel()).setRowCount(0);
        for (Object o : control.getExtrato()) {
            if (o instanceof Despesa && ((Despesa) o).getTipoDespesa() == TipoDespesa.TRANSPORTE) {
                adicionarValorTabela(o);
            } else {

            }
        }
    }//GEN-LAST:event_rbTransporteActionPerformed

    private void rbAlimentacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAlimentacaoActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel) jtTabela.getModel()).setRowCount(0);
        for (Object o : control.getExtrato()) {
            if (o instanceof Despesa && ((Despesa) o).getTipoDespesa() == TipoDespesa.ALIMENTACAO) {
                adicionarValorTabela(o);
            } else {

            }
        }
    }//GEN-LAST:event_rbAlimentacaoActionPerformed

    private void rbEducacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEducacaoActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel) jtTabela.getModel()).setRowCount(0);
        for (Object o : control.getExtrato()) {
            if (o instanceof Despesa && ((Despesa) o).getTipoDespesa() == TipoDespesa.EDUCACAO) {
                adicionarValorTabela(o);
            } else {

            }
        }
    }//GEN-LAST:event_rbEducacaoActionPerformed

    private void rbEntretenimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEntretenimentoActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel) jtTabela.getModel()).setRowCount(0);
        for (Object o : control.getExtrato()) {
            if (o instanceof Despesa && ((Despesa) o).getTipoDespesa() == TipoDespesa.ENTRETENIMENTO) {
                adicionarValorTabela(o);
            } else {

            }
        }
    }//GEN-LAST:event_rbEntretenimentoActionPerformed

    private void rbOutrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbOutrasActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel) jtTabela.getModel()).setRowCount(0);
        for (Object o : control.getExtrato()) {
            if (o instanceof Despesa && ((Despesa) o).getTipoDespesa() == TipoDespesa.OUTRAS) {
                adicionarValorTabela(o);
            } else {

            }
        }
    }//GEN-LAST:event_rbOutrasActionPerformed

    /**
     *
     * @param lancamento
     */
    public void adicionarValorTabela(Object lancamento) {
        String dataFormatada;
        Object[] linha;
        linha = new Object[4];

        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        linha[0] = ((Despesa) lancamento).getTipoLancamento();//tipo lançamento
        linha[1] = ((Despesa) lancamento).getTipoDespesa().toString();
        linha[2] = "-" + ((Despesa) lancamento).getValor();//valor
        dataFormatada = formatarData.format(((Despesa) lancamento).getData());
        linha[3] = dataFormatada;//data            

        DefaultTableModel model = (DefaultTableModel) jtTabela.getModel();
        model.addRow(linha);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgpDespesa;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtTabela;
    private javax.swing.JRadioButton rbAlimentacao;
    private javax.swing.JRadioButton rbEducacao;
    private javax.swing.JRadioButton rbEntretenimento;
    private javax.swing.JRadioButton rbOutras;
    private javax.swing.JRadioButton rbResidencia;
    private javax.swing.JRadioButton rbSaude;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JRadioButton rbTransporte;
    // End of variables declaration//GEN-END:variables

    /**
     *
     * @param control
     */
    public void setControl(ControleFinanceiro control) {
        this.control = control;
    }
}
