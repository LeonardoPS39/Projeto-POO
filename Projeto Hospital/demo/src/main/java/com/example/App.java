package com.example;

import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println("[0]Paciente \n[1]Medico");
        int escolha = input.nextInt();

        switch(escolha){
            case 0:
                System.out.print("Nome do paciente: ");
                String nome = input.nextLine();
                System.out.print("Idade: ");
                int idade = input.nextInt();
                System.out.print("Cpf: ");
                int cpf = input.nextInt();
                System.out.print("Eh urgente o caso desse bicho? ");
                boolean urgente = input.nextBoolean();
                System.out.print("Tem plano? ");
                boolean plano = input.nextBoolean();

                Date data = new Date();
                SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yyyy");
                String dataFormat = formatar.format(data);
                System.out.println(dataFormat);

                Paciente p1 = new Paciente(nome, idade, cpf, urgente, plano, dataFormat);

                p1.situacao();

            case 1:
                System.out.print("Nome do Medico: ");
                String nomemedico = input.nextLine();
                System.out.print("Idade: ");
                int idademedico = input.nextInt();
                System.out.print("Cpf: ");
                int cpfmedico = input.nextInt();
                System.out.print("Carga Horaria: ");
                int cHoraria = input.nextInt();
                System.out.print("Especialidade: ");
                String esp = input.nextLine();

                // Medico m1 = new Medico(nomemedico, idademedico, cpfmedico, cHoraria, esp);

                // m1.situacao();
        }
    }
}
