/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopessoas;

/**
 *
 * @author Luiz Fernando
 */
public class ProjetoPessoas {

    
    public static void main(String[] args) {
        // TODO code application logic here
        Pessoas p1 = new Pessoas();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Luiz");
        p1.setIdade(22);
        p1.setSexo("M");
        
        p2.setNome("Sara");
        p2.setIdade(20);
        p2.setSexo("F");
        
        p3.setNome("Cesar");
        p3.setIdade(21);
        p3.setSexo("M");
        
        p4.setNome("Ledo");
        p4.setIdade(21);
        p4.setSexo("Trans");
        
        p2.setCurso("Psicologia");
        p3.setSalario(2500f);
        p4.setSetor("Cafetão");
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        
    }
    
}
