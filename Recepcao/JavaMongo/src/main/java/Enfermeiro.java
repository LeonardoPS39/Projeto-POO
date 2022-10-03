// Atributos Pessoa, Atributos Funcionario, Atuação
public class Enfermeiro {
    
    private Pessoa pessoa;
    private Funcionario funcionario;
    private String atuacao;

    // Construtor
    public Enfermeiro(Pessoa pessoa, Funcionario funcionario, String atuacao) {
        this.pessoa = pessoa;
        this.funcionario = funcionario;
        this.atuacao = atuacao;
    }

    // Getters and Setters
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    public String getAtuacao() {
        return atuacao;
    }
    public void setAtuacao(String atuacao) {
        this.atuacao = atuacao;
    }

    // Metodo
    public String imprimir(){
        String saida = "";
        saida += pessoa.imprimir() + "\n" + funcionario.imprimir() + "\nAtuação: " + this.getAtuacao();
        return saida;
    }

}
