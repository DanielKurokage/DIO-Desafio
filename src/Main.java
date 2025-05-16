
import java.time.LocalDate;


import br.com.dio.desafio.dominio.BootCamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
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


       // System.out.println(curso1);
        //System.out.println(curso2);
        //System.out.println(mentoria1);


        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descrição bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);
        
        System.out.println("-------------------------------------");
        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcamp);

        devDaniel.progredir();



        System.out.println("Conteudos Incritos Daniel" + devDaniel.getConteudosInscritos());
        System.out.println("Conteudos Concluidos Daniel" + devDaniel.getConteudosConcluidos());
        System.out.println("XP " + devDaniel.calcularTotalXp());

        System.out.println("-------------------------------------");
        Dev devjoao = new Dev();
        devjoao.setNome("João");
        devjoao.inscreverBootcamp(bootcamp);
        devjoao.progredir();
        devjoao.progredir();
        devjoao.progredir();

        System.out.println("Conteudos Incritos joão" + devjoao.getConteudosInscritos());
        System.out.println("Conteudos Concluidos joão" + devjoao.getConteudosConcluidos());
        System.out.println("XP " + devjoao.calcularTotalXp());
        System.out.println("-------------------------------------");

    }


}
