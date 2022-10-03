// Atributos de Pessoa, Acompanhante, Plano(Booleano), Urgente(Booleano)

import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;


public class Paciente{

    private boolean urgente;
    private boolean plano;
    private Acompanhante acompanhante;
    private Pessoa pessoa;
    private Medico medico;

    // Construtor
    public Paciente(boolean urgente, boolean plano, Acompanhante acompanhante, Pessoa pessoa, Medico medico) {
        this.urgente = urgente;
        this.plano = plano;
        this.acompanhante = acompanhante;
        this.pessoa = pessoa;
        this.medico = medico;
    }

    // Getters and Setters
    public Medico getMedico() {
        return medico;
    }
    public void setMedico(Medico medico) {
        this.medico = medico;
    }
    public Acompanhante getAcompanhante() {
        return acompanhante;
    }
    public void setAcompanhante(Acompanhante acompanhante) {
        this.acompanhante = acompanhante;
    }
    public Pessoa getPessoa() {
        return pessoa;
    }
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    public boolean getUrgente() {
        return urgente;
    }
    public void setUrgente(boolean urgente) {
        this.urgente = urgente;
    }
    public boolean getPlano() {
        return plano;
    }
    public void setPlano(boolean plano) {
        this.plano = plano;
    }
    
    // Metodo
    public String imprimir(){
        String saida = "";
        saida += pessoa.imprimir() + "\n" + acompanhante.imprimir() + "\nÉ urgente? " + this.getUrgente() + "\nTem plano? " + this.getPlano() + "\n" + medico.imprimir();
        return saida;
    }
    
    public void setarDB() {
    	
    	MongoClient conexao = new MongoClient();
    	MongoDatabase dataBase = conexao.getDatabase("Hp");
    	MongoCollection<Document> collection = dataBase.getCollection("Pacientes");
    	
    	Document d = new Document();
    	d.append("Pessoa", this.getPessoa())
    	.append("Acompanhante", this.getAcompanhante())
    	.append("Medico", this.getMedico());
    	
    	collection.insertOne(d);
    	
    }
    
}