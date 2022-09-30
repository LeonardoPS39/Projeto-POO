package com.example;

import java.util.Scanner;
import java.util.Calendar;


public class App 
{
    public static void main( String[] args )
    {
        

        Scanner reader = new Scanner(System.in);
        
        Calendar c = Calendar.getInstance();

        int escolhaMenu = 30;

        while (escolhaMenu != 0) {

            System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
            System.out.println("=-=-=-=-MENU=-=-=-=-=");
            System.out.println("=-=-=-=-=-=-=-=-=-=-=");
            System.out.print("0 - Parar menu\n1 - Cadastro de doador\n2 - Coletar sangue/Registrar coleta\n3 - Ver validade\n4 - Liberação e descarte\n5 - Visualizar Estoque\n6 - Transfusão\n7 - Registro de prova de compatibilidade\n8 - Realizar devolução\nEscolha:");
        
            escolhaMenu = reader.nextInt();

            switch (escolhaMenu) {
                case 0:

                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("=-=-=-PARANDO-=-=-=-=");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("Parando operação...");

                break;
                case 1:

                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("=-=-=-CADASTRO=-=-=-=");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=");

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

                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("=-=-=-=COLETAR=-=-=-=");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=");
                
                    System.out.print("CPF do doador: ");
                    String cpfColeta = reader.nextLine();

                    System.out.print("Data (dd/mm/aaaa): ");
                    String dataColeta = reader.nextLine();
                    //Thu Sep 29 18:28:48 BRT 2022

                    System.out.print("Quantidade doada: ");
                    int qtdColeta = reader.nextInt();

                    Coleta coleta = new Coleta(qtdColeta, cpfColeta, dataColeta);

                    // coleta.gerarCodigoISBT();

                break;

                case 3:

                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("=-=-=-VER VALIDADE=-=-=");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=");

                    System.out.print("CPF do doador: ");
                    String cpfValidade = reader.nextLine();

                    Validade validar = new Validade(cpfValidade);

                    validar.verValidade();

                break;

                case 4:

                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("=-=LIBERAÇÃO E DESCARTE=-=");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=");

                    System.out.print("CPF do gerente/administrador: ");
                    String cpfLiberacao = reader.nextLine();

                    System.out.print("Senha do gerente/administrador: ");
                    String senhaLiberacao = reader.nextLine();

                    Liberacao liberar = new Liberacao(cpfLiberacao, senhaLiberacao);

                    // liberar.login();

                    /*
                     * if(login == true) {
                     * 
                     * 
                     * 
                     * }
                     */

                break;

                case 5:

                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("=-=-=VER ESTOQUE=-=-=");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=");

                    Estoque estoque = new Estoque();

                    estoque.retornarEstoque();

                break;

                case 6:

                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("=-=-=-TRANSFUSÃO=-=-=");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=");

                    System.out.print("CPF do recebedor: ");
                    String cpfRecebedor = reader.nextLine();

                    int dataRecebedor = c.get(Calendar.DATE);

                    Transfusao trans = new Transfusao(cpfRecebedor, dataRecebedor);

                    // trans.transfusar();

                break;

                case 7:

                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("=-=COMPATIBILIDADE=-=");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=");

                    System.out.print("Código do saco de sangue: ");
                    String codigoCompatibilidade = reader.nextLine();

                    System.out.print("CPF do recebedor: ");
                    String cpfCompatibilidade = reader.nextLine();

                    Compatibilidade comp = new Compatibilidade(codigoCompatibilidade, cpfCompatibilidade);

                    comp.verCompatibilidade();

                break;

                case 8:

                    System.out.println("\n=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("=-=-=-DEVOLUÇÃO-=-=-=");
                    System.out.println("=-=-=-=-=-=-=-=-=-=-=");

                    System.out.print("Código da bolsa de sangue: ");
                    String codigoDevolucao = reader.nextLine();

                    System.out.print("CPF do doador: ");
                    String cpfDevolucao = reader.nextLine();

                    Devolucao devolve = new Devolucao(cpfDevolucao, codigoDevolucao);

                    devolve.devolver();

                break;
            }
        }
        
    }
}
