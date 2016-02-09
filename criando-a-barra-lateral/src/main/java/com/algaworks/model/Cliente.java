package com.algaworks.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String cpf;
	private String nome;
	private String telefone;
	private String celular;
	private String email;
	private String estado;
	private Date dataNascimento;
	private Boolean parcelamentoLiberado;
	private String observacoes;
	private List<Endereco> enderecos = new ArrayList<>();

	public Cliente() {
	}

	public Cliente(String cpf, String nome, String telefone, String celular, String email, String estado,
			Date dataNascimento, Boolean parcelamentoLiberado, String observacoes, List<Endereco> enderecos) {
		super();
		this.cpf = cpf;
		this.nome = nome;
		this.telefone = telefone;
		this.celular = celular;
		this.email = email;
		this.estado = estado;
		this.dataNascimento = dataNascimento;
		this.parcelamentoLiberado = parcelamentoLiberado;
		this.observacoes = observacoes;
		this.enderecos = enderecos;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public Boolean getParcelamentoLiberado() {
		return parcelamentoLiberado;
	}

	public void setParcelamentoLiberado(Boolean parcelamentoLiberado) {
		this.parcelamentoLiberado = parcelamentoLiberado;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public List<Endereco> getEnderecos() {
		return enderecos;
	}

	public void setEnderecos(List<Endereco> enderecos) {
		this.enderecos = enderecos;
	}

}