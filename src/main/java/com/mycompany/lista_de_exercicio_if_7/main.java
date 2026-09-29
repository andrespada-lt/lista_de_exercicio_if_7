package com.mycompany.lista_de_exercicio_if_7;
import javax.swing.JOptionPane;
public class main {

    public static void main(String[] args) {
        int anodenascimento, anoatual, suaidade;
        anodenascimento = Integer.parseInt(JOptionPane.showInputDialog("insira o ano de nascimento: "));
        anoatual = Integer.parseInt(JOptionPane.showInputDialog("insira o ano atual: "));
        if(anodenascimento > anoatual){
            JOptionPane.showMessageDialog(null,"voce é do futuro?");
        }else{
            suaidade = anoatual - anodenascimento;
            JOptionPane.showMessageDialog(null,"sua idade é: " + suaidade);
        }
    }
}