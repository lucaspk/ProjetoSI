package models;

import com.avaje.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Carona extends Model{
	
	private int vagas_disponiveis;
	private Horario horario;
	private List<Passageiro> listaPassageiros;
	private Motorista motorista;
	
	public Carona (Horario horario, Motorista motorista){
		this.horario = horario;
		this.motorista = motorista;
		vagas_disponiveis = motorista.getNum_vagas();
		listaPassageiros = new ArrayList<Passageiro>();
	}
	
	public Horario getHorario(){
		return horario;
	}

	public int getVagas_disponiveis() {
		return vagas_disponiveis;
	}

	public List<Passageiro> getListaPassageiros() {
		return listaPassageiros;
	}

	public Motorista getMotorista() {
		return motorista;
	}
	
	public boolean cadastraNovoPassageiro (Passageiro usr){
		boolean adicionou = false;
		if (vagas_disponiveis > 0){
			listaPassageiros.add(usr);
			vagas_disponiveis--;
			adicionou = true;
		}
		return adicionou;
	}
	
	public boolean removePassageiro (Passageiro usr){
		boolean removeu = false;
		if (listaPassageiros.remove(usr)) {
			vagas_disponiveis++;	
			removeu = true;
		}
		
		return removeu;
	}
	
	@Override
	public String toString(){
		return "Motorista da carona: " + getMotorista() + "\n" +
				"DADOS GERAIS DA CARONA: \n" + horario.toString() + "\n" +
				"NUMERO DE VAGAS DISPON�VEIS: " + getVagas_disponiveis();
				
	}
	
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Carona) {
			Carona other = (Carona) obj;
			return motorista.equals(other.getMotorista()) && horario.equals(other.getHorario());
		}
		
		return false;
	}
}
