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
        tempero.setPaisOrigem(JOptionPane.showInputDialog("Digite o país de origem:"));
        tempero.setPeso(Float.parseFloat(JOptionPane.showInputDialog("Digite o peso:")));
        tempero.setTipoVolume(JOptionPane.showInputDialog
        ("Digite o tipo de volume: l->líquido; s->sólido").charAt(0));
        tempero.setPreco(Float.parseFloat(JOptionPane.showInputDialog("Digite o preço:")));
        tempero.setAnoFabric(Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de fabricação:")));

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
                msg = msg + "\nPosição na Lista: " + lista.lastIndexOf(tempero);
                msg = msg + "\nID: " + tempero.getID();
                msg = msg + "\nProduto: " + tempero.getProduto();
                msg = msg + "\nMarca: " + tempero.getMarca();
                msg = msg + "\nFabricante: " + tempero.getFabricante();
                msg = msg + "\nPaís Origem: " + tempero.getPaisOrigem();
                msg = msg + "\nPeso: " + tempero.getPeso();
                msg = msg + "\nTipo Volume: " + tempero.getTipoVolume();
                msg = msg + "\nPreço: " + tempero.getPreco();
                msg = msg + "\nAno Fabricação: " + tempero.getAnoFabric();
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
                    "Digite o ID do Tempero a ser excluído"));
            for (Tempero tempero : lista) {
                if (tempero.getID() == idRemover){
                    lista.remove(tempero);
                    JOptionPane.showMessageDialog
                    (null, "Tempero excluído com sucesso!", "Temperos", 0);
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
                            "Digite o país de origem:", tempero.getPaisOrigem()));
                    tempero.setPeso(
                        Float.parseFloat(
                        JOptionPane.showInputDialog(
                            "Digite o peso:", tempero.getPeso())));
                    tempero.setTipoVolume(
                        JOptionPane.showInputDialog
                       ("Digite o tipo de volume: l->líquido; s->sólido",
                               tempero.getTipoVolume()).charAt(0));
                    tempero.setPreco(
                        Float.parseFloat(
                        JOptionPane.showInputDialog(
                            "Digite o preço:", tempero.getPreco())));
                    tempero.setAnoFabric(
                        Integer.parseInt(
                        JOptionPane.showInputDialog(
                            "Digite o ano de fabricação:", tempero.getAnoFabric())));
                }
            }
        }                
    }

    
}
