package br.ulbra.classes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 * @author Jeferson Assunto: Será implementado nesta classe o "banco de Dados" -
 * ArrayList
 */
public class Agenda {

    public List<Pessoa> bdAgenda;

    public Agenda() {
        bdAgenda = new ArrayList<Pessoa>();
    }

    public void adicionarPessoa(Pessoa p) {
        bdAgenda.add(p);
        JOptionPane.showMessageDialog(null, p.getNome() + ", foi salvo com Sucesso!");
    }
    
    
    public String mostrarPessoa() {
       
        String resultado = "nome(s)\n";
        if (!bdAgenda.isEmpty()) {
            for (int i = 0; i < bdAgenda.size(); i++) {
               // resultado = resultado + bdAgenda.get(i).getNome()+" "+bdAgenda.get(i).getSobre() + "\n";
                resultado = resultado + bdAgenda.get(i).toString() + "\n";
            }
        } else {
            JOptionPane.showMessageDialog(null, "Agenda Vazia!");
        }
        return resultado;
    }
}
