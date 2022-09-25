package com.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        

        Scanner reader = new Scanner(System.in);
        int escolhaMenu = 30;

        while (escolhaMenu != 0) {

            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("=-=-=-=-MENU=-=-=-=-=");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.print("0 - Parar menu\n1 - Cadastro de doador\n2 - Coletar sangue/Registrar coleta\n3 - Fracionamento\n4 - Liberação e descarte\n5 - Visualizar Estoque\n6 - Transfusão\n7 - Relatório de bolsas e estatísticas\n8 - Registro de solicitações\n9 - Registro de prova de compatibilidade\n10 - Realizar devolução\nEscolha:");
        
            escolhaMenu = reader.nextInt();

            switch (escolhaMenu) {
                case 1:

                    System.out.print("Nome do doador: ");
                    String nomeDoador = reader.nextLine();
                    System.out.print("CPF do doador: ");
                    String cpfDoador = reader.nextLine();
                    System.out.print("Data de nascimento: ");
                    String dataNascimentoDoador = reader.nextLine();
                    System.out.print("Endereço do doador: ");
                    String enderecoDoador = reader.nextLine();
                    System.out.print("Tipo sanguíneo do doador:");
                    String tipoDoador = reader.nextLine();
                    System.out.print("Sexo do doador: ");
                    String sexoDoador = reader.nextLine();

                    Cadastro cadastro = new Cadastro(nomeDoador, cpfDoador, dataNascimentoDoador, enderecoDoador, tipoDoador, sexoDoador);

                    // cadastro.CadastrarBD();

                break;

                case 2:

                    System.out.print("CPF do doador: ");
                    String cpfColeta = reader.nextLine();
                    System.out.print("");

                break;
            }
            
        }
    }
}
