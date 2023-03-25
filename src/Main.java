import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("curso java", "descrição curso java", 8);

        Curso curso2 = new Curso("curso js", "descrição curso js", 4);

        Mentoria mentoria = new Mentoria("mentoria java", "descrição mentoria java", LocalDate.now());

        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.addConteudo(curso1);
        bootcamp.addConteudo(curso2);
        bootcamp.addConteudo(mentoria);


        Dev devCamila = new Dev("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos Camila: "+devCamila.getConteudosInscritos());
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos Camila: "+devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Camila: "+devCamila.getConteudosConcluidos());

        Dev devJoao = new Dev("João");
        devJoao.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos Inscritos João: "+ devJoao.getConteudosInscritos());

        devJoao.progredir();
        devJoao.progredir();
        devJoao.progredir();
        System.out.println("Conteúdos Inscritos João: "+ devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João: "+ devJoao.getConteudosConcluidos());
    }
}
