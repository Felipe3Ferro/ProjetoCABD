/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visao;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.PacienteVO;
import servicos.PacienteServicos;
import servicos.ServicosFactory;

/**
 *
 * @author Aluno
 */
public class GUICadTabela1 extends javax.swing.JInternalFrame {
    
     DefaultTableModel dtm = new DefaultTableModel(
    new Object [][]{},
    new Object []{"codigo","nome", "cep","sexo","convenio","telefone","idade"});
    
    /**
     * Creates new form GUICadTabale
     */
    public GUICadTabela1() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgSexo = new javax.swing.ButtonGroup();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLayeredPane2 = new javax.swing.JLayeredPane();
        jbAtualizar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jbDeletar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jtPesq = new javax.swing.JTextField();
        jcbFiltro = new javax.swing.JComboBox<>();
        jLayeredPane3 = new javax.swing.JLayeredPane();
        jLabel1 = new javax.swing.JLabel();
        jtCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jrMasculino = new javax.swing.JRadioButton();
        jrFeminino = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jtIdade = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtConvenio = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jtTelefone = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtCep = new javax.swing.JTextField();
        jLayeredPane4 = new javax.swing.JLayeredPane();
        jbConfirmarAlteracao = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gerenciar banco de dados");

        jLayeredPane1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "codigo", "nome", "cep", "sexo", "convenio", "telefone", "idade"
            }
        ));
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);

        jLayeredPane1.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane1Layout = new javax.swing.GroupLayout(jLayeredPane1);
        jLayeredPane1.setLayout(jLayeredPane1Layout);
        jLayeredPane1Layout.setHorizontalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 582, Short.MAX_VALUE)
        );
        jLayeredPane1Layout.setVerticalGroup(
            jLayeredPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbAtualizar.setText("Atualizar");
        jbAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAtualizarActionPerformed(evt);
            }
        });

        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });

        jbDeletar.setText("Deletar");
        jbDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDeletarActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jLayeredPane2.setLayer(jbAtualizar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbLimpar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbDeletar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane2.setLayer(jbAlterar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane2Layout = new javax.swing.GroupLayout(jLayeredPane2);
        jLayeredPane2.setLayout(jLayeredPane2Layout);
        jLayeredPane2Layout.setHorizontalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(jbAtualizar)
                .addGap(33, 33, 33)
                .addComponent(jbLimpar)
                .addGap(36, 36, 36)
                .addComponent(jbDeletar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbAlterar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane2Layout.setVerticalGroup(
            jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAtualizar)
                    .addComponent(jbLimpar)
                    .addComponent(jbDeletar)
                    .addComponent(jbAlterar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jtPesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesqKeyReleased(evt);
            }
        });

        jcbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "codigo", "nome", "cep", "sexo", "convenio", "telefone", "idade" }));

        jLayeredPane3.setBorder(javax.swing.BorderFactory.createTitledBorder("Alterar"));

        jLabel1.setText("Codigo");

        jtCodigo.setEnabled(false);

        jLabel2.setText("Nome");

        jLabel3.setText("sexo");

        bgSexo.add(jrMasculino);
        jrMasculino.setText("Masculino");
        jrMasculino.setActionCommand("Masculino");

        bgSexo.add(jrFeminino);
        jrFeminino.setText("Feminino");
        jrFeminino.setActionCommand("Feminino");

        jLabel4.setText("Idade");

        jLabel5.setText("Convenio");

        jtConvenio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "IpeSaude", "BanriSaude", "SUS", "CatSaude" }));

        jLabel6.setText("Telefone");

        jLabel7.setText("Cep");

        jLayeredPane3.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jtCodigo, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jtNome, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jrMasculino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jrFeminino, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jtIdade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jtConvenio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jtTelefone, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jLayeredPane3.setLayer(jtCep, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane3Layout = new javax.swing.GroupLayout(jLayeredPane3);
        jLayeredPane3.setLayout(jLayeredPane3Layout);
        jLayeredPane3Layout.setHorizontalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtCep))
                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                        .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jLayeredPane3Layout.createSequentialGroup()
                                        .addComponent(jrMasculino)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jrFeminino))
                                    .addGroup(jLayeredPane3Layout.createSequentialGroup()
                                        .addGap(4, 4, 4)
                                        .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(33, 33, 33)
                                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtIdade)
                                    .addComponent(jtConvenio, 0, 197, Short.MAX_VALUE)))
                            .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jLayeredPane3Layout.setVerticalGroup(
            jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jrMasculino)
                    .addComponent(jrFeminino)
                    .addComponent(jLabel5)
                    .addComponent(jtConvenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(jLayeredPane3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(jtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLayeredPane4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbConfirmarAlteracao.setText("Confirmar alteração");
        jbConfirmarAlteracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbConfirmarAlteracaoActionPerformed(evt);
            }
        });

        jLayeredPane4.setLayer(jbConfirmarAlteracao, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jLayeredPane4Layout = new javax.swing.GroupLayout(jLayeredPane4);
        jLayeredPane4.setLayout(jLayeredPane4Layout);
        jLayeredPane4Layout.setHorizontalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addGap(208, 208, 208)
                .addComponent(jbConfirmarAlteracao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jLayeredPane4Layout.setVerticalGroup(
            jLayeredPane4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jLayeredPane4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbConfirmarAlteracao)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLayeredPane1)
            .addComponent(jLayeredPane2)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85)
                .addComponent(jcbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLayeredPane3)
            .addComponent(jLayeredPane4)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void preencherTabela(){
        try {
            PacienteServicos ps = ServicosFactory.getPacienteServicos();
            ArrayList<PacienteVO> prods = new ArrayList<>();
            prods = ps.buscarPacientes();
            
            for(int i=0 ; i<prods.size(); i++){
                dtm.addRow(new String[]{
                String.valueOf(prods.get(i).getCodigo()),
                String.valueOf(prods.get(i).getNome()),    
                String.valueOf(prods.get(i).getCep()),
                String.valueOf(prods.get(i).getSexo()),
                String.valueOf(prods.get(i).getConvenio()),
                String.valueOf(prods.get(i).getTelefone()),
                String.valueOf(prods.get(i).getIdade())});
                
            }//fim for
            jTable1.setModel(dtm);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,"Erro! "+e.getMessage());
        }
    }//fecha preencher
    
    private void limpar(){
        dtm.setNumRows(0);
    }//fecha limpar
    
    private void deletar(){
        try {
                int linha=
            jTable1.getSelectedRow();
                if(linha == -1){
                    JOptionPane.showMessageDialog(rootPane, "voce não selecionou uma linha! ");
                          
                }else {
                    PacienteServicos ps =
                            ServicosFactory.getPacienteServicos();
                    String id =(String)
                jTable1.getValueAt(linha,0);
                    ps.deletarPaciente(Long.parseLong(id));
                    JOptionPane.showMessageDialog(rootPane, "Paciente excluido com sucesso!!");
                }//fecha else
        }catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,
                    "Erro! "+e.getMessage());
        }
    }//fecha deletar
     private void filtrar(){
        try {
            
            if(jtPesq.getText().isEmpty()){
                preencherTabela();
            }else{
 
            PacienteServicos ps = ServicosFactory.getPacienteServicos();
            
            String f = (String) 
                    jcbFiltro.getSelectedItem();
            String query ="";
            if(f.equalsIgnoreCase("codigo")){
                query="where codigo like '%"+jtPesq.getText()+"%'";
            }else if(f.equalsIgnoreCase("nome")){
                query="where nome like '%"+jtPesq.getText()+"%'";
            }else if(f.equalsIgnoreCase("cep")){
                query="where cep like '%"+jtPesq.getText()+"%'";
            }else if(f.equalsIgnoreCase("sexo")){
                query="where sexo like '%"+jtPesq.getText()+"%'";
            }else if(f.equalsIgnoreCase("convenio")){
                query="where convenio like '%"+jtPesq.getText()+"%'";
            }else if(f.equalsIgnoreCase("telefone")){
                query="where telefone like '%"+jtPesq.getText()+"%'";
            }else if(f.equalsIgnoreCase("Idade")){
                query="where idade like '%"+jtPesq.getText()+"%'";
            }else{
                JOptionPane.showMessageDialog(rootPane, "Erro! ");
            }
            
        ArrayList<PacienteVO> prod = new ArrayList<>();
        
        prod = ps.filtrar(query);
        
        for (int i = 0; i < prod.size(); i++) {
                dtm.addRow(new String[]{
                    String.valueOf(prod.get(i).getCodigo()),
                    String.valueOf(prod.get(i).getNome()),
                    String.valueOf(prod.get(i).getCep()),
                    String.valueOf(prod.get(i).getSexo()),
                    String.valueOf(prod.get(i).getConvenio()),
                    String.valueOf(prod.get(i).getTelefone()),
                    String.valueOf(prod.get(i).getIdade()),
      
                });
            }//fecha for
            jTable1.setModel(dtm);
            
            }//fecha else
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, 
                    "Erro!"+e.getMessage());
            
        }//fecha try catch
        
    }//fim filtrar
     
      private void confirmarAlteracao(){
        try {
            PacienteServicos js =
            ServicosFactory.getPacienteServicos();

            PacienteVO j = new PacienteVO();
            
            j.setCodigo(Long.parseLong(jtCodigo.getText()));
            j.setNome(jtNome.getText());
            j.setCep(jtCep.getText());
            j.setSexo(bgSexo.getSelection().getActionCommand());
            j.setConvenio(jtConvenio.getSelectedItem().toString());
            j.setTelefone(Integer.parseInt(jtTelefone.getText()));
            j.setIdade(Integer.parseInt(jtIdade.getText()));
            js.alterarPaciente(j);
            
            JOptionPane.showMessageDialog(
                    rootPane, 
                    "Paciente alterado com sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                    this,
                    "Errro! "+e.getMessage());
        }//fecha catch
    }//fecha método confirmarAlteração
    
    private void limparTexto(){
        jtTelefone.setText("");
        jtCep.setText("");
        jtNome.setText("");
        jtIdade.setText("");
        bgSexo.clearSelection();
        jtConvenio.setSelectedItem(null);
    }
    
    private void alterar(){
         
        int linha = jTable1.getSelectedRow();
        if(linha == -1){
            JOptionPane.showMessageDialog(
                    rootPane, 
                    "Você não selecionou nenhuma linha!");
        }else{
            String codigo=jTable1.getValueAt(linha, 0).toString();
                    
            String nome=jTable1.getValueAt(linha, 1).toString();
            
            String cep=jTable1.getValueAt(linha, 2).toString();     
            
            String sexo= jTable1.getValueAt(linha, 3).toString();
                    
            String convenio=jTable1.getValueAt(linha, 4).toString();
            
            String telefone = jTable1.getValueAt(linha, 5).toString();
            
            String idade  = jTable1.getValueAt(linha, 6).toString();
            
            
            //if else para radio button
            if(sexo.equalsIgnoreCase("Masculino")){
                jrMasculino.setSelected(true);
            }else {
                jrFeminino.setSelected(true);
            }//fehca if else
                
            //if elsepara  combo box
            if(convenio.equalsIgnoreCase("IpeSaude")){
                jtConvenio.setSelectedIndex(0);
            }else if(convenio.equalsIgnoreCase("BanriSaude")){
                jtConvenio.setSelectedIndex(1);
            }else if(convenio.equalsIgnoreCase("SUS")){
                jtConvenio.setSelectedIndex(2);
            }else if(convenio.equalsIgnoreCase("CatSaude")){
                jtConvenio.setSelectedIndex(3);
            }//fecha if else
            
            //check box
            /*if(sexo.equalsIgnoreCase("masculino")){
                jcMasculino.setSelected(true);
            }
            
            if(sexo.equalsIgnoreCase("feminino")){
                jcFeminino.setSelected(true);
            }*/            
            
            jtCodigo.setText(codigo);
            jtNome.setText(nome);
            jtCep.setText(cep);
            jtTelefone.setText(telefone);
            jtIdade.setText(idade);
        }//fecha else
    }//fecha método
    
    private void jbAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAtualizarActionPerformed
        // TODO add your handling code here:
        limpar();
        preencherTabela();
        
        
    }//GEN-LAST:event_jbAtualizarActionPerformed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        // TODO add your handling code here:
        limpar();
 
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDeletarActionPerformed
        // TODO add your handling code here:
        
        deletar();
        limpar();
        preencherTabela();
        
       
    }//GEN-LAST:event_jbDeletarActionPerformed

    private void jtPesqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesqKeyReleased
        // TODO add your handling code here:
        limpar();
        filtrar();
        
    }//GEN-LAST:event_jtPesqKeyReleased

    private void jbConfirmarAlteracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbConfirmarAlteracaoActionPerformed
        // TODO add your handling code here:
        confirmarAlteracao();
        limpar();
        preencherTabela();
        limparTexto();
    }//GEN-LAST:event_jbConfirmarAlteracaoActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        // TODO add your handling code here:
        alterar();
    }//GEN-LAST:event_jbAlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup bgSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JLayeredPane jLayeredPane2;
    private javax.swing.JLayeredPane jLayeredPane3;
    private javax.swing.JLayeredPane jLayeredPane4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbAtualizar;
    private javax.swing.JButton jbConfirmarAlteracao;
    private javax.swing.JButton jbDeletar;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JComboBox<String> jcbFiltro;
    private javax.swing.JRadioButton jrFeminino;
    private javax.swing.JRadioButton jrMasculino;
    private javax.swing.JTextField jtCep;
    private javax.swing.JTextField jtCodigo;
    private javax.swing.JComboBox<String> jtConvenio;
    private javax.swing.JTextField jtIdade;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtPesq;
    private javax.swing.JTextField jtTelefone;
    // End of variables declaration//GEN-END:variables
}