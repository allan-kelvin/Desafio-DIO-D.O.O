
package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria  extends Conteudo{
  
    private LocalDate data;


    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Mentoria{" + "titulo=" + titulo + ", descricao=" + descricao + ", data=" + data + '}';
    }

    @Override
    public double calcularXp() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
