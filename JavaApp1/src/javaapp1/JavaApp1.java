/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp1;

import javax.swing.JOptionPane;

/**
 *
 * @author Lenovo
 */
public class JavaApp1 extends javax.swing.JFrame{
    int attempt=1;
    private Object txtPasword;
   
    public JavaApp1() {
        initComponents();
    }
    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("unchecked")
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt){
        
        String Username=jTextField1.getText();
        String Password=jPasswordField1.getText();
        
        if(attempt<4 && "test".equals(Username) && "abc".equals(Password))
        {
            JOptionPane.showMessageDialog(null,"WELCOME");
            login Info=new login();
            Info.setVisible(true);
            
        }
        else if(attempt !=4){
             JOptionPane.showMessageDialog(null, "Username or Password is incorrect"+attempt);
    
        }
        else {
            
            JOptionPane.showMessageDialog(null,"attempt axceed!"+attempt);
            txtUsername.setEditable(false);
            txtPasword.setEnabled(false);
        }
        if(attempt==5){
            this.dispose();
        }
        attempt++;
    }
        
    public static void main(String[] args) {
        // TODO code application logic here
        
        
       java.awt.EventQueue.invokeLater(() -> {
           new JvaApp1().setVisible(true);
       });
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel JlABEL;
    private javax.swing.JPasswordField jPasswordField;
    private javax.swing.JTextField jTextField; //To change body of generated methods, choose Tools | Templates.
    
    
    priavte void systemExit(){
        throw new UnsupportedOperationException("No supported yet");
    }

    private void initComponents() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private static class txtUsername {

        private static void setEditable(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public txtUsername() {
        }
    }

    private static class JvaApp1 {

        public JvaApp1() {
        }

        private void setVisible(boolean b) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }

    private static class priavte {

        public priavte() {
        }
    }
    
    
}
