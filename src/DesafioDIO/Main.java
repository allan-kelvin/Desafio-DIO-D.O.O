
package DesafioDIO;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Curso do básico ao avançado!");
        curso1.setCargaHoraria(120);
        
        Curso curso2 = new Curso();
        
        curso2.setTitulo("Curso JavaScript");
        curso2.setDescricao("Curso do básico");
        curso2.setCargaHoraria(120);
        
        
        /*Criando mentoria*/
        
        Mentoria mentoria = new Mentoria();
        
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Mentoria Java completo");
        mentoria.setData(LocalDate.MAX);
    }
    
}
