package models;

import com.avaje.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;

public class Solicitacao extends Model{
	
	private Carona carona;
	private Passageiro passageiro_da_solicitacao;
	private StatusSolicitacao status;
	
	public Solicitacao (Carona c, Passageiro passageiro){
		this.carona = c;
		this.passageiro_da_solicitacao = passageiro;
		setStatus(StatusSolicitacao.PENDENTE);
		
		// no momento da criacao da solicitacao, ela eh adicionada na lista
		// de solicitacoes do motorista
		this.carona.getMotorista().novaSolicitacao(this);
		this.passageiro_da_solicitacao.novaSolicitacao(this);
	}

	public Carona getCarona() {
		return carona;
	}

	public Passageiro getPassageiro_da_solicitacao() {
		return passageiro_da_solicitacao;
	}
	
	public StatusSolicitacao getStatus() {
		return status;
	}

	private void setStatus(StatusSolicitacao status) {
		this.status = status;
	}
	
	public void aceita(){
		if (status == StatusSolicitacao.PENDENTE && carona.cadastraNovoPassageiro(passageiro_da_solicitacao)){
			setStatus(StatusSolicitacao.ACEITA);
		}
	}
	
	public void rejeita(){
		if (status == StatusSolicitacao.PENDENTE)
			setStatus(StatusSolicitacao.RECUSADA);
	}
	
	@Override
	public String toString(){
		return "DADOS DA CARONA SOLICITADA: \n\n" + carona.toString() + "\n\n" +
				"Solicitante: " + passageiro_da_solicitacao.toString() + "\n" +
				"Status: " + getStatus();
	}

}
