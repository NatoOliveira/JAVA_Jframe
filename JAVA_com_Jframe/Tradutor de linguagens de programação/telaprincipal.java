public class telaprincipal extends javax.swing.JFrame {
    public telaprincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        JComboescolha_linguagem_traduzida = new javax.swing.JComboBox<>();
        JComboescolha_linguagem_traduzir = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JTextcomando = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JLabeltraducao = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        botao = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Tradutor: Comandos (Linguagens de Progamação)");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tradutor para Comandos de Programação ");

        JComboescolha_linguagem_traduzida.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Java", "Portugol", "Python" }));
        JComboescolha_linguagem_traduzida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboescolha_linguagem_traduzidaActionPerformed(evt);
            }
        });

        JComboescolha_linguagem_traduzir.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Java", "Portugol", "Python" }));
        JComboescolha_linguagem_traduzir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JComboescolha_linguagem_traduzirActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Traduzir de:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Para:");

        JTextcomando.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        JTextcomando.setText("Digite o código");
        JTextcomando.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextcomandoActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Comando:");

        JLabeltraducao.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabeltraducao.setText("Tradução");
        JLabeltraducao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Tradução:");

        botao.setText("Traduzir");
        botao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JComboescolha_linguagem_traduzida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JComboescolha_linguagem_traduzir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(95, 95, 95))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(JTextcomando, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JLabeltraducao, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(botao, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JComboescolha_linguagem_traduzir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JComboescolha_linguagem_traduzida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTextcomando, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JLabeltraducao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(botao)
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private void JComboescolha_linguagem_traduzidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboescolha_linguagem_traduzidaActionPerformed
    }//GEN-LAST:event_JComboescolha_linguagem_traduzidaActionPerformed
    private void JComboescolha_linguagem_traduzirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JComboescolha_linguagem_traduzirActionPerformed
    }//GEN-LAST:event_JComboescolha_linguagem_traduzirActionPerformed

    private void botaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoActionPerformed
        // variavel
        String comando, traduzida, traduzir;
        // comando para o botão
        comando = (JTextcomando.getText());
        traduzida = JComboescolha_linguagem_traduzida.getSelectedItem()+"";
        traduzir = JComboescolha_linguagem_traduzir.getSelectedItem()+"";
        if("Java".equals(traduzida) && "Portugol".equals(traduzir)){
            switch(comando){
                case "System.out.print();":
                    JLabeltraducao.setText("escreva()");
                break;
                case "System.out.println();":
                    JLabeltraducao.setText("escreva()");
                break;
                case "System.out.printf();":
                    JLabeltraducao.setText("escreva()");
                break;
                case "variavel = imput.next();":
                    JLabeltraducao.setText("leia()");
                break;
                case "variavel = imput.nextInt();":
                    JLabeltraducao.setText("leia()");
                break;
                case "variavel = imput.nextDouble();":
                    JLabeltraducao.setText("leia()");
                break;
                case "variavel = imput.nextFloat();":
                    JLabeltraducao.setText("leia()");
                break;
                case "variavel = imput.nextLine();":
                    JLabeltraducao.setText("leia()");
                break;
                case "variavel = imput.nextChar();":
                    JLabeltraducao.setText("leia()");
                break;
                case "\n":
                    JLabeltraducao.setText("\n");
                break;
                case "if":
                    JLabeltraducao.setText("se()");
                break;
                case "else":
                    JLabeltraducao.setText("senao");
                break;
                case "else if":
                    JLabeltraducao.setText("senao se()");
                break;
                case "String":
                    JLabeltraducao.setText("cadeia");
                break;
                case "double":
                    JLabeltraducao.setText("real");
                break;
                case "float":
                    JLabeltraducao.setText("real");
                break;
                case "char":
                    JLabeltraducao.setText("caracter");
                break;
                case "int":
                    JLabeltraducao.setText("inteiro");
                break;
                case "boolean":
                    JLabeltraducao.setText("logico");
                break;
                case "switch":
                    JLabeltraducao.setText("escolha()");
                break;
                case "case":
                    JLabeltraducao.setText("caso");
                break;
                case "break":
                    JLabeltraducao.setText("pare");
                break;
                case "do":
                    JLabeltraducao.setText("faca");
                break;
                case "while":
                    JLabeltraducao.setText("enquanto");
                break;
                case "e":
                    JLabeltraducao.setText("&&");
                break;
                case "||":
                    JLabeltraducao.setText("ou");
                break;
                case "for":
                    JLabeltraducao.setText("para()");
                break;
            }
        }else if("Java".equals(traduzida) && "Python".equals(traduzir)){
            switch(comando){
                case "System.out.print();":
                    JLabeltraducao.setText("print()");
                break;
                case "System.out.println();":
                    JLabeltraducao.setText("print()");
                break;
                case "System.out.printf();":
                    JLabeltraducao.setText("print()");
                break;
                case "variavel = imput.next();":
                    JLabeltraducao.setText("imput()");
                break;
                case "variavel = imput.nextInt();":
                    JLabeltraducao.setText("imput()");
                break;
                case "variavel = imput.nextDouble();":
                    JLabeltraducao.setText("imput()");
                break;
                case "variavel = imput.nextFloat();":
                    JLabeltraducao.setText("imput()");
                break;
                case "variavel = imput.nextLine();":
                    JLabeltraducao.setText("imput()");
                break;
                case "variavel = imput.nextChar();":
                    JLabeltraducao.setText("imput()");
                break;
                case "\n":
                    JLabeltraducao.setText("\n");
                break;
                case "if":
                    JLabeltraducao.setText("if");
                break;
                case "else":
                    JLabeltraducao.setText("else:");
                break;
                case "else if":
                    JLabeltraducao.setText("elif");
                break;
                case "String":
                    JLabeltraducao.setText("str");
                break;
                case "double":
                    JLabeltraducao.setText("complex");
                break;
                case "float":
                    JLabeltraducao.setText("float");
                break;
                case "int":
                    JLabeltraducao.setText("int");
                break;
                case "boolean":
                    JLabeltraducao.setText("bool");
                break;
                case "switch":
                    JLabeltraducao.setText("for variavel in = []");
                break;
                case "break":
                    JLabeltraducao.setText("break");
                break;
                case "while":
                    JLabeltraducao.setText("while");
                break;
                case "&&":
                    JLabeltraducao.setText("and");
                break;
                case "||":
                    JLabeltraducao.setText("or");
                break;
                case "for":
                    JLabeltraducao.setText("for");
                break;
            }
        }else if("Python".equals(traduzida) && "Java".equals(traduzir)){
            switch(comando){
                case "Print":
                    JLabeltraducao.setText("System.out.print();");
                break;
                case "imput":
                    JLabeltraducao.setText("variavel = imput.next();");
                break;
                case "\n":
                    JLabeltraducao.setText("\n");
                break;
                case "if":
                    JLabeltraducao.setText("if");
                break;
                case "else":
                    JLabeltraducao.setText("else");
                break;
                case "elif":
                    JLabeltraducao.setText("else if");
                break;
                case "str":
                    JLabeltraducao.setText("String");
                break;
                case "double":
                    JLabeltraducao.setText("double");
                break;
                case "float":
                    JLabeltraducao.setText("float");
                break;
                case "int":
                    JLabeltraducao.setText("int");
                break;
                case "bool":
                    JLabeltraducao.setText("boolean");
                break;
                case "for variavel in":
                    JLabeltraducao.setText("switch()");
                break;
                case "break":
                    JLabeltraducao.setText("break");
                break;
                case "while":
                    JLabeltraducao.setText("while");
                break;
                case "and":
                    JLabeltraducao.setText("&&");
                break;
                case "or":
                    JLabeltraducao.setText("||");
                break;
                case "for":
                    JLabeltraducao.setText("for");
                break;
            }
        }else if("Python".equals(traduzida) && "Portugol".equals(traduzir)){
            switch(comando){
                case "Print":
                    JLabeltraducao.setText("escreva()");
                break;
                case "imput":
                    JLabeltraducao.setText("leia()");
                break;
                case "\n":
                    JLabeltraducao.setText("\n");
                break;
                case "if":
                    JLabeltraducao.setText("se()");
                break;
                case "else":
                    JLabeltraducao.setText("senao()");
                break;
                case "elif":
                    JLabeltraducao.setText("senao se()");
                break;
                case "str":
                    JLabeltraducao.setText("cadeia");
                break;
                case "double":
                    JLabeltraducao.setText("real");
                break;
                case "float":
                    JLabeltraducao.setText("real");
                break;
                case "int":
                    JLabeltraducao.setText("inteiro");
                break;
                case "bool":
                    JLabeltraducao.setText("logico");
                break;
                case "for variavel in":
                    JLabeltraducao.setText("escolha()");
                break;
                case "break":
                    JLabeltraducao.setText("pare");
                break;
                case "while":
                    JLabeltraducao.setText("enquanto");
                break;
                case "and":
                    JLabeltraducao.setText("e");
                break;
                case "or":
                    JLabeltraducao.setText("ou");
                break;
                case "for":
                    JLabeltraducao.setText("para");
                break;
            }
        }else if("Portugol".equals(traduzida) && "Python".equals(traduzir)){
            switch(comando){
                case "escreva":
                    JLabeltraducao.setText("print()");
                break;
                case "leia":
                    JLabeltraducao.setText("imput()");
                break;
                case "\n":
                    JLabeltraducao.setText("\n");
                break;
                case "se":
                    JLabeltraducao.setText("if");
                break;
                case "senao":
                    JLabeltraducao.setText("else");
                break;
                case "senao se":
                    JLabeltraducao.setText("elif");
                break;
                case "cadeia":
                    JLabeltraducao.setText("str");
                break;
                case "real":
                    JLabeltraducao.setText("float ou complex");
                break;
                case "inteiro":
                    JLabeltraducao.setText("int");
                break;
                case "logico":
                    JLabeltraducao.setText("bool");
                break;
                case "escolha":
                    JLabeltraducao.setText("Switch()");
                break;
                case "caso":
                    JLabeltraducao.setText("case");
                break;
                case "pare":
                    JLabeltraducao.setText("break");
                break;
                case "faca":
                    JLabeltraducao.setText("do");
                break;
                case "enquanto":
                    JLabeltraducao.setText("while()");
                break;
                case "e":
                    JLabeltraducao.setText("&&");
                break;
                case "ou":
                    JLabeltraducao.setText("||");
                break;
                case "para":
                    JLabeltraducao.setText("for()");
                break;
            }
        }else if("Portugol".equals(traduzida) && "Java".equals(traduzir)){
            switch(comando){
                case "escreva":
                    JLabeltraducao.setText("System.out.print();");
                break;
                case "leia":
                    JLabeltraducao.setText("variavel = imput.next();");
                break;
                case "\n":
                    JLabeltraducao.setText("\n");
                break;
                case "se":
                    JLabeltraducao.setText("if()");
                break;
                case "senao":
                    JLabeltraducao.setText("else");
                break;
                case "senao se":
                    JLabeltraducao.setText("else if()");
                break;
                case "cadeia":
                    JLabeltraducao.setText("String");
                break;
                case "real":
                    JLabeltraducao.setText("double ou float");
                break;
                case "caracter":
                    JLabeltraducao.setText("char");
                break;
                case "inteiro":
                    JLabeltraducao.setText("int");
                break;
                case "logico":
                    JLabeltraducao.setText("boolean");
                break;
                case "Switch":
                    JLabeltraducao.setText("for variavel in = []");
                break;
                case "pare":
                    JLabeltraducao.setText("break");
                break;
                case "enquanto":
                    JLabeltraducao.setText("while");
                break;
                case "e":
                    JLabeltraducao.setText("and");
                break;
                case "ou":
                    JLabeltraducao.setText("or");
                break;
                case "para":
                    JLabeltraducao.setText("for");
                break;
            }
        }
       
    }//GEN-LAST:event_botaoActionPerformed

    private void JTextcomandoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextcomandoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextcomandoActionPerformed
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
            java.util.logging.Logger.getLogger(telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaprincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new telaprincipal().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JComboescolha_linguagem_traduzida;
    private javax.swing.JComboBox<String> JComboescolha_linguagem_traduzir;
    private javax.swing.JLabel JLabeltraducao;
    private javax.swing.JTextField JTextcomando;
    private javax.swing.JButton botao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
