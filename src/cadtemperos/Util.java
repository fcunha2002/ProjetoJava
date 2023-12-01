package cadtemperos;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author fabiom
 */
public class Util {
public static void gravar(ArrayList<Tempero> lista) {
    try {
        FileOutputStream arquivo = new FileOutputStream("dados.dat");
        ObjectOutputStream fluxo = new ObjectOutputStream(arquivo);
        fluxo.writeObject(lista);
        fluxo.flush();
        JOptionPane.showMessageDialog(null, "Dados gravados com sucesso "
                                        + "no arquivo dados.dat");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Falha na gravação do arquivo" + (e));
    }
}

    public static ArrayList ler() {
        ArrayList<Tempero> lista = new ArrayList<>();
        try {
            FileInputStream arquivo = new FileInputStream("dados.dat");
            ObjectInputStream fluxo = new ObjectInputStream(arquivo);
            lista = (ArrayList) fluxo.readObject();
            JOptionPane.showMessageDialog(null, "Dados lidos com sucesso"
                                            + " no arquivo dados.dat");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Falha na leitura do arquivo" + (e));
        }
        return lista;
    }
}
