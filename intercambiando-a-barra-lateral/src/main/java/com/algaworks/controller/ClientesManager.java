package com.algaworks.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import com.algaworks.model.Cliente;
import com.algaworks.model.Endereco;

@ManagedBean
@SessionScoped
public class ClientesManager implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private List<Cliente> clientes = new ArrayList<>();
	private Cliente clienteEdicao = new Cliente();
	private Endereco enderecoEdicao;
	
	public ClientesManager() {
		List<Endereco> enderecosJoao = new ArrayList<>();
		enderecosJoao.addAll(Arrays.asList(
				new Endereco("Rua José Fonseca", "1000", "Centro", "Uberlândia"),
				new Endereco("Av. Cesário Alvim", "12", "Brasil", "Belo Horizonte"),
				new Endereco("Av. Afonso Pena", "1280", "Centro", "Uberaba")));
		
		clientes.add(new Cliente("123.123.123-11", "João da Silva Albuquerque", 
				"(34) 3238-1111", "(34) 9 9999-7716", "joao@algaworks.com", 
				"Minas Gerais", new Date(), true, "Cliente especial\nÉ gente boa!", enderecosJoao));
		
		clientes.add(new Cliente("333.333.123-11", "Maria Abadia das Couves Teixeira", 
				"(11) 4000-1234", "(11) 9 8888-1122", "maria@algaworks.com", 
				"São Paulo", null, false, null, new ArrayList<>()));
		
		clientes.add(new Cliente("444.444.123-11", "Paula Maria de Souza Mendes", 
				"(31) 2233-4455", "(31) 9 9433-2282", "paula@algaworks.com", 
				"Minas Gerais", null, false, null, new ArrayList<>()));
	}
	
	public void novoEndereco() {
		enderecoEdicao = new Endereco();
	}
	
	public String novoCliente() {
		clienteEdicao = new Cliente();
		return "CadastroCliente?faces-redirect=true";
	}
	
	public void salvar() {
		if (!clientes.contains(clienteEdicao)) {
			clientes.add(clienteEdicao);
		}
		clienteEdicao = new Cliente();
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente salvo com sucesso!"));
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	public Cliente getClienteEdicao() {
		return clienteEdicao;
	}

	public void setClienteEdicao(Cliente clienteEdicao) {
		this.clienteEdicao = clienteEdicao;
	}

	public Endereco getEnderecoEdicao() {
		return enderecoEdicao;
	}

	public void setEnderecoEdicao(Endereco enderecoEdicao) {
		this.enderecoEdicao = enderecoEdicao;
	}
	
}