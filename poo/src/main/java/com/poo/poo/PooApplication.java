package com.poo.poo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.poo.poo.classes.Aluno;


@SpringBootApplication
public class PooApplication {

	public static void main(String[] args) {
		SpringApplication.run(PooApplication.class, args);

		/*Conta conta1 = new Conta("Arthur");

		System.out.println(conta1.getTitular());
		System.out.println(conta1.getSenha());
		System.out.println(conta1.getNumeroDaConta());

		Conta conta2 = new Conta();

		System.out.println(conta2.getTitular());
		System.out.println(conta2.getSenha());
		System.out.println(conta2.getNumeroDaConta());
		 */

		Aluno aluno1 = new Aluno("Romulo", "12/02/1990");
		System.out.println(aluno1.getNome() + " " + aluno1.getData_nasc() +
		  " " + aluno1.getMatricula());
		Aluno aluno2 = new Aluno("Riba", "01/01/1992");
		System.out.println(aluno2.getNome() + " " + aluno2.getData_nasc() +
		  " " + aluno2.getMatricula());
		 
	}
}
