// Atributos de Pessoa, Permissão(Booleano)
public class Acompanhante{

    private boolean permissao;
    private Pessoa pessoa;

    // Construtor
    public Acompanhante(boolean permissao, Pessoa pessoa) {
        this.permissao = permissao;
        this.pessoa = pessoa;
    }
    
    // Getters e Setters
	public boolean getPermissao() {
        return this.permissao;
	}
	public void setPermissao(boolean permissao) {
        this.permissao = permissao;
	}
    
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    // Métodos
    public String imprimir(){
        String saida = "";
        saida +=  pessoa.imprimir() + "\nTem permissão? " + this.getPermissao();        
        return saida;
    }
}