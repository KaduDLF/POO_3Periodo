
package telas;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
//
import java.awt.BorderLayout;
import java.sql.SQLException;
import java.text.ParseException;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class TelaCad {
    public static void montarTela()throws IOException{
        final JFrame oJFrameInicial = new JFrame("Cadastro de Empresa");

        oJFrameInicial.setBounds(200, 170, 500, 200);
        oJFrameInicial.setLayout(null);

        JLabel labelCNPJ = new JLabel("CNPJ: ");
        labelCNPJ.setBounds(10, 10, 60, 25);
        labelCNPJ.setHorizontalAlignment(JLabel.RIGHT);
        oJFrameInicial.add(labelCNPJ);
        
        JFormattedTextField cnpj = new JFormattedTextField(mascara("##.###.###/####-##"));
        cnpj.setBounds(80, 10, 120, 25);
        cnpj.setLayout(null);
        oJFrameInicial.add(cnpj);
        
        JLabel labelRzSocial = new JLabel("Rz soc:");
        labelRzSocial.setBounds(10,40,60,25);
        labelRzSocial.setHorizontalAlignment(JLabel.RIGHT);
        oJFrameInicial.add(labelRzSocial);
        
        JTextField rzSocial = new JTextField();
        rzSocial.setBounds(80,40,250,25);
        rzSocial.setLayout(null);
        oJFrameInicial.add(rzSocial);
        
        JLabel tipo = new JLabel("Tipo:");
        tipo.setBounds(10,70,120,25);
        tipo.setHorizontalAlignment(JLabel.RIGHT);
        oJFrameInicial.add(tipo);


        oJFrameInicial.setVisible(true);
        
        
    }
    
     public static MaskFormatter mascara(String mascara) {

        MaskFormatter F_Mascara = new MaskFormatter();
        try {
            
            F_Mascara.setMask(mascara); //Atribui a mascara
            F_Mascara.setPlaceholderCharacter(' '); //Caracter para preencimento 
        } catch (ParseException excecao) {
            System.out.println(excecao.getMessage());
        }
        return F_Mascara;
    }
}
