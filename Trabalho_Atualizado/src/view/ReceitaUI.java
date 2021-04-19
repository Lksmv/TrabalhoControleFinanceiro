package view;

import java.awt.Color;
import java.time.format.DateTimeFormatter;
import javax.swing.table.DefaultTableModel;
import model.ControleFinanceiro;
import model.Receita;
import model.TipoReceita;

/**
 *
 * @author Amanda Miranda Zanella, Bruno Henrique Wiedemann Reis, Lucas Miguel
 * Vieira, Matheus Guilherme Jacinto
 */
public class ReceitaUI extends javax.swing.JDialog {

    private ControleFinanceiro control;

    /**
     * construtor
     *
     * @param parent - tela ligada
     * @param modal - true/false
     */
    public ReceitaUI(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.getContentPane().setBackground(Color.black);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btgpReceita = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtTabela = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jrSalario = new javax.swing.JRadioButton();
        jrDecimo = new javax.swing.JRadioButton();
        jrFerias = new javax.swing.JRadioButton();
        jrOutras = new javax.swing.JRadioButton();
        jrTodos = new javax.swing.JRadioButton();

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

        btgpReceita.add(jrSalario);
        jrSalario.setText("Salário");
        jrSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrSalarioActionPerformed(evt);
            }
        });

        btgpReceita.add(jrDecimo);
        jrDecimo.setText("Décimo terceiro");
        jrDecimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrDecimoActionPerformed(evt);
            }
        });

        btgpReceita.add(jrFerias);
        jrFerias.setText("Férias");
        jrFerias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrFeriasActionPerformed(evt);
            }
        });

        btgpReceita.add(jrOutras);
        jrOutras.setText("Outras");
        jrOutras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrOutrasActionPerformed(evt);
            }
        });

        btgpReceita.add(jrTodos);
        jrTodos.setText("Todas as Receitas");
        jrTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrTodosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jrSalario)
                .addGap(55, 55, 55)
                .addComponent(jrDecimo)
                .addGap(56, 56, 56)
                .addComponent(jrFerias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jrOutras)
                .addGap(60, 60, 60)
                .addComponent(jrTodos)
                .addGap(53, 53, 53))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrSalario)
                    .addComponent(jrDecimo)
                    .addComponent(jrFerias)
                    .addComponent(jrOutras)
                    .addComponent(jrTodos))
                .addGap(36, 36, 36))
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
    /**
     * filtro outras
     *
     * @param evt - evento
     */
    private void jrOutrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrOutrasActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel) jtTabela.getModel()).setRowCount(0);
        for (Object o : control.getExtrato()) {
            if (o instanceof Receita && ((Receita) o).getTipoReceita() == TipoReceita.OUTRAS) {
                adicionarValorTabela(o);
            } else {

            }
        }
    }//GEN-LAST:event_jrOutrasActionPerformed
    /**
     * filtro todos
     *
     * @param evt - evento
     */
    private void jrTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrTodosActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel) jtTabela.getModel()).setRowCount(0);
        for (Object o : control.getExtrato()) {
            if (o instanceof Receita) {
                adicionarValorTabela(o);
            } else {

            }
        }
    }//GEN-LAST:event_jrTodosActionPerformed
    /**
     * filtro ferias
     *
     * @param evt - evento
     */
    private void jrFeriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrFeriasActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel) jtTabela.getModel()).setRowCount(0);
        for (Object o : control.getExtrato()) {
            if (o instanceof Receita && ((Receita) o).getTipoReceita() == TipoReceita.FERIAS) {
                adicionarValorTabela(o);
            } else {

            }
        }
    }//GEN-LAST:event_jrFeriasActionPerformed
    /**
     * filtro decimo_terceiro
     *
     * @param evt - evento
     */
    private void jrDecimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrDecimoActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel) jtTabela.getModel()).setRowCount(0);
        for (Object o : control.getExtrato()) {
            if (o instanceof Receita && ((Receita) o).getTipoReceita() == TipoReceita.DECIMO_TERCEIRO) {
                adicionarValorTabela(o);
            } else {

            }
        }
    }//GEN-LAST:event_jrDecimoActionPerformed
    /**
     * filtro salario
     *
     * @param evt - evento
     */
    private void jrSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrSalarioActionPerformed
        // TODO add your handling code here:
        ((DefaultTableModel) jtTabela.getModel()).setRowCount(0);
        for (Object o : control.getExtrato()) {
            if (o instanceof Receita && ((Receita) o).getTipoReceita() == TipoReceita.SALARIO) {
                adicionarValorTabela(o);
            } else {

            }
        }
    }//GEN-LAST:event_jrSalarioActionPerformed
    /**
     * metodo para adicionar os valores na tabela
     *
     * @param lancamento - lancamento
     */
    public void adicionarValorTabela(Object lancamento) {
        String dataFormatada;
        Object[] linha;
        linha = new Object[4];
        DateTimeFormatter formatarData = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        linha[0] = ((Receita) lancamento).getTipoLancamento();//tipo lançamento
        linha[1] = ((Receita) lancamento).getTipoReceita().toString();//tipo Receita
        linha[2] = "+" + ((Receita) lancamento).getValor();//valor   
        dataFormatada = formatarData.format(((Receita) lancamento).getData());
        linha[3] = dataFormatada;//data

        DefaultTableModel model = (DefaultTableModel) jtTabela.getModel();
        model.addRow(linha);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btgpReceita;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton jrDecimo;
    private javax.swing.JRadioButton jrFerias;
    private javax.swing.JRadioButton jrOutras;
    private javax.swing.JRadioButton jrSalario;
    private javax.swing.JRadioButton jrTodos;
    private javax.swing.JTable jtTabela;
    // End of variables declaration//GEN-END:variables
/**
     *
     * @param control - controle financeiro
     */
    public void setControl(ControleFinanceiro control) {
        this.control = control;
    }
}
