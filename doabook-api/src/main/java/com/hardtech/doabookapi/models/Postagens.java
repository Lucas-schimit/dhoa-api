package com.hardtech.doabookapi.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.URL;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "tb_postagens")
public class Postagens {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull(message = "O campo TITULO é obrigatório")
	@Size(min = 4, max = 100, message = "O campo TITULO deve ter entre 4 e 100 caracteres")
	private String titulo;

	@NotNull(message = "O campo TEXTO é obrigatório")
	@Size(min = 4, max = 255, message = "O campo TEXTO deve ter entre 4 e 255 caracteres")
	private String texto;

	@URL(message = "O campo IMAGEM_URL precisa ser uma URL")
	private String imagemUrl;

	@NotNull(message = "O campo CONTATO_URL é obrigatorio")
	@URL(message = "O campo contato_URL precisa ser uma URL")
	private String contatoUrl;

	@ManyToOne
	@JsonIgnoreProperties("postagens")
	private Temas tema;

	@ManyToOne
	@JsonIgnoreProperties("postagens")
	private Usuarios usuario;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public String getImagemUrl() {
		return imagemUrl;
	}

	public void setImagemUrl(String imagemUrl) {
		this.imagemUrl = imagemUrl;
	}

	public String getContatoUrl() {
		return contatoUrl;
	}

	public void setContatoUrl(String contatoUrl) {
		this.contatoUrl = contatoUrl;
	}

	public Temas getTema() {
		return tema;
	}

	public void setTema(Temas tema) {
		this.tema = tema;
	}

	public Usuarios getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuarios usuario) {
		this.usuario = usuario;
	}
	

}
