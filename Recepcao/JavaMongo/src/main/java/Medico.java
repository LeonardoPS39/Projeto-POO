// Atributos Pessoa, Atributos Funcionario, Especialização
public class Medico{
    private Pessoa pessoa;
    private Funcionario funcionario;
    private String especializacao;

    //Construtor
    public Medico(Pessoa pessoa, Funcionario funcionario, String especializacao) {
        this.pessoa = pessoa;
        this.funcionario = funcionario;
        this.especializacao = especializacao;
    }

    // Getter and Setters
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public String getEspecializacao() {
        return this.especializacao;
    }
    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    // Metodo
    public String imprimir(){
        String saida = "";
        saida += pessoa.imprimir() + "\n" + funcionario.imprimir() + "\nEspecialização: " + this.getEspecializacao();
        return saida;
    }
}