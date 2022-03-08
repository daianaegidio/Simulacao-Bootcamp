package dominio;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	    Scanner leitor= new Scanner(System.in);
		Curso curso=new Curso();
		Mentoria mentoria=new Mentoria();
		
		String nomeCurso;
		String descricaoCurso;
		int cargaHoraria;
		
		System.out.println("---Cadastrar Curso---");
		System.out.println("Digite o Nome do curso:");
		nomeCurso=leitor.next();
		System.out.println("Digite a descri�ao do curso:");
		descricaoCurso=leitor.next();
		System.out.println ("Digite a Carga Hor�ria:");
		cargaHoraria=leitor.nextInt();
		
		
		 
	        curso.setTitulo(nomeCurso);
	        curso.setDescricao(descricaoCurso);
	        curso.setCargaHoraria(cargaHoraria);
	        
	        System.out.println ("--------------------------");
	        

	        System.out.println ("---Cadastrar Mentoria ---");
	       
	        System.out.println ("Digite o nome da Mentoria:");
	        mentoria.setTitulo(leitor.next());
	        System.out.println ("Digte a Descri��o da Mentoria");
	        mentoria.setDescricao(leitor.next());
	        mentoria.setData(LocalDate.now());
	        
	        Bootcamp bootcamp = new Bootcamp();
	        bootcamp.setNome("Bootcamp Java Developer");
	        bootcamp.setDescricao("Descri��o Bootcamp Java Developer");
	        bootcamp.getConteudos().add(curso);
	        bootcamp.getConteudos().add(mentoria);
	        
	        System.out.println("----------------------------");
            System.out.println("Digite seu nome");
            Dev dev = new Dev();
            dev.setNome(leitor.next());
            dev.inscreverBootcamp(bootcamp);
            
            System.out.println("Conte�dos Inscritos:" + dev.getConteudosInscritos());
	System.out.println("Deseja Progredir? - Digite 1 para sim e 2 para n�o");
	int resp=leitor.nextInt();
	
	if (resp==1) { dev.progredir();
    dev.progredir();}
	
	System.out.println("Conte�dos Inscritos:" + dev.getConteudosInscritos());
    System.out.println("Conte�dos Concluidos:" + dev.getConteudosConcluidos());
    System.out.println("XP:" + dev.calcularTotalXp());
	
	}

}
