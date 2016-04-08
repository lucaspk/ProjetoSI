package models;

import com.avaje.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

public class Solicitacao extends Model{
	
	private Carona carona;
	private Usuario passageiro_da_solicitacao;
	private String status;
	
	public Solicitacao (Carona c, Usuario passageiro){
		this.carona = c;
		this.passageiro_da_solicitacao = passageiro;
		setStatus("PENDENTE");
		
		// no momento da criacao da solicitacao, ela eh adicionada na lista
		// de solicitacoes do motorista
		this.carona.getMotorista().novaSolicitacao(this);
		this.passageiro_da_solicitacao.novaSolicitacao(this);
	}

	public Carona getCarona() {
		return carona;
	}

	public Usuario getPassageiro_da_solicitacao() {
		return passageiro_da_solicitacao;
	}
	
	public String getStatus() {
		return status;
	}

	private void setStatus(String status) {
		this.status = status;
	}
	
	public void aceita(){
		if (status == "PENDENTE" && carona.cadastraNovoPassageiro(passageiro_da_solicitacao)){
			setStatus("ACEITA");
		}
	}
	
	public void rejeita(){
		if (status == "PENDENTE")
			setStatus("REJEITADO");
	}
	
	@Override
	public String toString(){
		return "DADOS DA CARONA SOLICITADA: \n\n" + carona.toString() + "\n\n" +
				"Solicitante: " + passageiro_da_solicitacao.toString() + "\n" +
				"Status: " + getStatus();
	}

}
