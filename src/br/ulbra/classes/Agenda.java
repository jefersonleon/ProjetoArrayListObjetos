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
    public void excluirPessoa(int i){
        if(JOptionPane.showConfirmDialog(null,"Tem certeza que deseja excluir o(a) "
          +bdAgenda.get(i).getNome()
                +"?","Exclusão",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(null, "O(A) "+bdAgenda.get(i).getNome()
                    +" foi excluido(a) com sucesso!");
            bdAgenda.remove(i);
        }else{
            JOptionPane.showMessageDialog(null, "Exclusão cancelada!!");
        }
    }
    public void alterarPessoa(int i, Pessoa p){
        bdAgenda.set(i, p);
        JOptionPane.showMessageDialog(null ,"Registro modificado com Sucesso!!");
    }
    public String Ordenar(){
          Collections.sort(bdAgenda);
          JOptionPane.showMessageDialog(null, "Ordenado com sucesso");
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
    public String mostrarPessoa() {
      
        String resultado = "nome(s)\n";
        if (!bdAgenda.isEmpty()) {
            for (int i = 0; i < bdAgenda.size(); i++) {
               // resultado = resultado + bdAgenda.get(i).getNome()+" "+bdAgenda.get(i).getSobre() + "\n";
                resultado = resultado +(i+1)+" - "+bdAgenda.get(i).toString() + "\n";
            }
        } else {
            JOptionPane.showMessageDialog(null, "Agenda Vazia!");
        }
        return resultado;
    }
    public int encotrarPessoa(Pessoa p){
        int aux=-1;
        for (int i=0; i<bdAgenda.size();i++){
            if(bdAgenda.get(i).getNome().equals(p.getNome())){
                aux = i;
            }
        }
            return aux;
        }
    public Pessoa getPessoa(int i){
        return bdAgenda.get(i);
    }
}
