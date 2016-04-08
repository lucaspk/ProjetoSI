package models;

import com.avaje.ebean.Model;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;


public class Usuario extends Model{


    private String nome, matricula, telefone, bairro, email, rua, senha;
    private List<Horario> horarios;
    private List<Solicitacao> solicitacoes; // seja ela solicitada por ele, ou solicitada a ele

    public Usuario(String nome, String matricula, String telefone, String bairro, String email, String rua, String senha) {
        this.nome = nome;
        this.matricula = matricula;
        this.telefone = telefone;
        this.bairro = bairro;
        this.email = email;
        this.rua = rua;
        this.senha = senha;
        this.horarios = new ArrayList<Horario>();
        this.solicitacoes = new ArrayList<Solicitacao>();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }


    public List<Horario> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<Horario> horarios) {
        this.horarios = horarios;
    }

    public void novaSolicitacao (Solicitacao s){
        solicitacoes.add(s);
    }

    public List<Solicitacao> getSolicitacoes() {
        return solicitacoes;
    }

    @Override
    public boolean equals (Object obj){
        if (obj instanceof Usuario){
            Usuario usr = (Usuario) obj;
            return nome.equals(usr.getNome()) && matricula.equals(usr.getMatricula());
        }

        return false;
    }






}
