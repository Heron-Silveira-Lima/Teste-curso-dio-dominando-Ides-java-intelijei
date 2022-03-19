package br.com.dio;

import br.com.dio.model.Gato;

public class primeiroprograma {


    public static void main(String[] args){
        Gato gato = new Gato();

        System.out.println(gato);

        Object numPaginas;
        Object nome;
        Livro livro1 = new Livro(nome. "qualquer um", numPaginas );
        System.out.println(livro1);

        /*int a = 5;
        int b = 3;

        System.out.println("Hello World!" + (a +b));*/
    }
}
class Livro
    private String nome;
    private Integer numPaginas;

    plublic Livro (String nome, Integer numPaginas){
       this.nome = nome;
       this.numPaginas = numPaginas;

        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Integer getNumPaginas() {
            return numPaginas;
        }

        public void setNumPaginas(Integer numPaginas) {
            this.numPaginas = numPaginas;
        }

        @Override
        public String toString() {
            return "Livro{" +
                    "nome='" + nome + '\'' +
                    ", numPaginas=" + numPaginas +
                    '}';
        }
}


