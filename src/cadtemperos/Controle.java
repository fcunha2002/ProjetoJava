package cadtemperos;

import java.time.temporal.Temporal;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Controle {
    public void inserirTempero(ArrayList<Tempero> lista) {
        Tempero tempero = new Tempero();
        
        tempero.setID(Integer.parseInt(JOptionPane.showInputDialog("Digite o ID:")));
        tempero.setProduto(JOptionPane.showInputDialog("Digite o nome do produto:"));
        tempero.setMarca(JOptionPane.showInputDialog("Digite a marca do produto:"));
        tempero.setFabricante(JOptionPane.showInputDialog("Digite o fabricante do produto:"));
        tempero.setPaisOrigem(JOptionPane.showInputDialog("Digite o pa�s de origem:"));
        tempero.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Digite o peso:")));
        tempero.setTipoVolume(JOptionPane.showInputDialog
        ("Digite o tipo de volume: l->l�quido; s->s�lido").charAt(0));
        tempero.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Digite o pre�o:")));
        tempero.setAnoFabric(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de fabrica��o:")));

        lista.add(tempero);
        
//        lista.sort((o1, o2) 
//                -> (o1.getID() >= o2.getID()) ? 1 : -1);
                
    }
    
    public void listarTemperos(ArrayList<Tempero> lista) {
        String msg = "";
        
        if (lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "Lista Vazia !!"
                                          , "Temperos", 0);
        } else {
            for (Tempero tempero : lista) {
                msg = msg + "\nPosi��o na Lista: " + lista.lastIndexOf(tempero);
                msg = msg + "\nID: " + tempero.getID();
                msg = msg + "\nProduto: " + tempero.getProduto();
                msg = msg + "\nMarca: " + tempero.getMarca();
                msg = msg + "\nFabricante: " + tempero.getFabricante();
                msg = msg + "\nPa�s Origem: " + tempero.getPaisOrigem();
                msg = msg + "\nPeso: " + tempero.getPeso();
                msg = msg + "\nTipo Volume: " + tempero.getTipoVolume();
                msg = msg + "\nPre�o: " + tempero.getPreco();
                msg = msg + "\nAno Fabrica��o: " + tempero.getAnoFabric();
                msg = msg + "\n___________________________________________________ \n";
            }

            JOptionPane.showMessageDialog(null, msg, "Temperos", -1);
        }        
    }

    public void removerTempero(ArrayList<Tempero> lista) {
        if (lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "Lista Vazia !!"
                                          , "Temperos", 0);            
        } else {
            int idRemover = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite o ID do Tempero a ser exclu�do"));
            for (Tempero tempero : lista) {
                if (tempero.getID() == idRemover){
                    lista.remove(tempero);
                    JOptionPane.showMessageDialog
                    (null, "Tempero exclu�do com sucesso!", "Temperos", 0);
                    break;
                }
            }
        }        
    }
    
    public void alterarTempero(ArrayList<Tempero> lista) {
        if (lista.isEmpty()){
            JOptionPane.showMessageDialog(null, "Lista Vazia !!"
                                          , "Temperos", 0);            
        } else {
            int idAlterar = Integer.parseInt(JOptionPane.showInputDialog(
                    "Digite o ID do Tempero a ser alterado"));
            for (Tempero tempero : lista) {
                if (tempero.getID() == idAlterar){
                    tempero.setProduto(
                        JOptionPane.showInputDialog(
                            "Digite o nome do produto:", tempero.getProduto()));
                    tempero.setMarca(
                        JOptionPane.showInputDialog(
                            "Digite a marca do produto:", tempero.getMarca()));
                    tempero.setFabricante(
                        JOptionPane.showInputDialog(
                            "Digite o fabricante do produto:", tempero.getFabricante()));
                    tempero.setPaisOrigem(
                        JOptionPane.showInputDialog(
                            "Digite o pa�s de origem:", tempero.getPaisOrigem()));
                    tempero.setPeso(
                        Float.parseFloat(
                        JOptionPane.showInputDialog(
                            "Digite o peso:", tempero.getPeso())));
                    tempero.setTipoVolume(
                        JOptionPane.showInputDialog
                       ("Digite o tipo de volume: l->l�quido; s->s�lido",
                               tempero.getTipoVolume()).charAt(0));
                    tempero.setPreco(
                        Float.parseFloat(
                        JOptionPane.showInputDialog(
                            "Digite o pre�o:", tempero.getPreco())));
                    tempero.setAnoFabric(
                        Integer.parseInt(
                        JOptionPane.showInputDialog(
                            "Digite o ano de fabrica��o:", tempero.getAnoFabric())));
                }
            }
        }                
    }

    
}
