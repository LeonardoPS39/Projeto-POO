import java.util.Scanner;

public class App 
{
    public static void main( String[] args ) {
        
        /*
            1- Paciente
                1.1- Pessoa
                1.2- Médico
                    1.2.1- Pessoa
                    1.2.2- Funcionario
                1.3- Acompanhante
                    1.3.1- Pessoa

            Coleções:
                Enfermeiros
                Pacientes
        */

        Scanner reader = new Scanner(System.in);
        System.out.println("[1]Cadastrar");
        System.out.println("[2]Buscar dados");
        System.out.println("[3]Alterar");
        System.out.println("[4]Remover");
        System.out.print("Escolha uma opção: ");
        int key = reader.nextInt();
        switch (key) {
            case 1:
                
            int repetir = 1;
            while (repetir != 0) {
    
                // ============== Paciente ================
                System.out.print("Nome do Paciente: ");
                String nomePaciente = reader.next();
        
                System.out.print("Idade do Paciente: ");
                int idadePaciente = reader.nextInt();
        
                System.out.print("CPF do paciente: ");
                String CPFPaciente = reader.next();
        
                System.out.print("Paciente é urgente? ");
                Boolean urgenciaPaciente = reader.nextBoolean();
        
                System.out.print("Paciente possui plano? ");
                Boolean planoPaciente = reader.nextBoolean();
        
                Pessoa pessoaPaciente = new Pessoa(nomePaciente, idadePaciente, CPFPaciente);
        
                // ============== Medico ================
                System.out.println("Cadastro do médico do paciente:");
                System.out.print("Salario do Medico: ");
                double salarioMedico = reader.nextDouble();
                
                System.out.print("Carga Horária do Medico: ");
                double carga_horariaMedico = reader.nextDouble();
                
                Funcionario funcionarioMedico = new Funcionario(salarioMedico, carga_horariaMedico);
                
                System.out.print("Nome do Medico: ");
                String nomeMedico = reader.next();
    
                System.out.print("Idade do Medico: ");
                int idadeMedico = reader.nextInt();
    
                System.out.print("CPF do Medico: ");
                String CPFMedico = reader.next();
    
                Pessoa pessoaMedica = new Pessoa(nomeMedico, idadeMedico, CPFMedico);
                System.out.print("Especialidade do médico: ");
    
                String especialidadeMedico = reader.next();
                Medico medico = new Medico(pessoaMedica, funcionarioMedico, especialidadeMedico);
        
                // ============== Acompanhante ================
                
                String nomeAcompanhante;
                int idadeAcompanhante;
                Boolean permissao;
                
                System.out.print("Nome do Acompanhante: ");
                nomeAcompanhante = reader.next();
    
                System.out.print("Idade do Acompanhante: ");
                idadeAcompanhante = reader.nextInt();
    
                if (idadeAcompanhante < 18){
                    permissao = false;
                }else{
                    permissao = true;
                }
                
                System.out.print("CPF do Acompanhante: ");
                String CPFAcompanhante = reader.next();
                
                Pessoa pessoaAcompanhante = new Pessoa(nomeAcompanhante, idadeAcompanhante, CPFAcompanhante);
        
                Acompanhante acompanhante = new Acompanhante(permissao, pessoaAcompanhante);
        
                // ============== Paciente Final ================
                Paciente p = new Paciente(urgenciaPaciente, planoPaciente, acompanhante, pessoaPaciente, medico);
        
                System.out.println(p.imprimir());
    
                System.out.println(acompanhante.imprimir());
    
                System.out.print("Para repetir escreva qualquer coisa diferente de 0: ");
                repetir = reader.nextInt();

            break;

            
        }
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;




        }

        reader.close();
    }
}