package cadtemperos;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        int opcao = 0;
        String msg = "Digite a opção: \n "
                + "1- Inserir \n "
                + "2- Remover \n "
                + "3- Listar \n "
                + "4- Alterar \n "
                + "0- Sair";
        
        Controle ctrl = new Controle();

        ArrayList<Tempero> lista = Util.ler();

        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog(msg));
            switch (opcao) {
                case 1 -> {
                    ctrl.inserirTempero(lista);
                }
                case 2 -> {
                    ctrl.removerTempero(lista);
                }
                case 3 -> {
                    ctrl.listarTemperos(lista);
                }
                case 4 -> {
                    ctrl.alterarTempero(lista);
                }
                case 0 -> {
                    Util.gravar(lista);
                    JOptionPane.showMessageDialog(null, "Saindo");
                }
                default -> {
                    JOptionPane.showMessageDialog(null, "Opção inválida");
                }
            }

        } while (opcao != 0);

        
    }
    
}
