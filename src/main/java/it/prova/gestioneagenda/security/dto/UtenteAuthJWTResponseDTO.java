package it.prova.gestioneagenda.security.dto;

import java.util.List;

public class UtenteAuthJWTResponseDTO {

	private String token;
	private String type = "Bearer";
	private String username;
	private String email;
	private List<String> roles;
	private List<String> agende;

	public UtenteAuthJWTResponseDTO(String accessToken, String username, String email, List<String> roles, List<String> agende) {
		this.token = accessToken;
		this.username = username;
		this.email = email;
		this.roles = roles;
		this.agende = agende;
	}

	public String getAccessToken() {
		return token;
	}

	public void setAccessToken(String accessToken) {
		this.token = accessToken;
	}

	public String getTokenType() {
		return type;
	}

	public void setTokenType(String tokenType) {
		this.type = tokenType;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<String> getRoles() {
		return roles;
	}
	
	public List<String> getAgende() {
		return agende;
	}
}
