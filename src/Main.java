import java.nio.channels.Pipe.SourceChannel;
import java.time.LocalDate;

import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args){

        Mentoria mentoria1 = new Mentoria();

        mentoria1.setTitulo("mentoria de java");
        mentoria1.setDescricao("java");
        mentoria1.setData(LocalDate.now());




        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Javascript");
        curso2.setDescricao("java scripr");
        curso2.setCargaHoraria(10);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria1);



    }


}
