package models;

import com.avaje.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

public class Passageiro extends Usuario{
	public Passageiro (String nome, String matricula, String telefone, String bairro, String email, String rua, String senha){
		super(nome, matricula, telefone, bairro, email, rua, senha);
	}
	
	@Override
	public String toString(){
		return "Nome do passageiro: " + getNome() + "\n" +
				"Bairro: " + getBairro();
	}
}
