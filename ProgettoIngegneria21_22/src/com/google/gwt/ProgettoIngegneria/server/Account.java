package com.google.gwt.ProgettoIngegneria.server;

import com.google.gwt.ProgettoIngegneria.client.ControllerAccount;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class Account extends RemoteServiceServlet implements ControllerAccount{
	protected String email;
	protected String password;
	//Fai anche il tipo utente
	//protected TipoUtente tipoUtente;
	protected StrategyTipoUtente strategyTipoUtente;
	
	public void setEmail(String email) {
		this.email  = email;
	}
	
	public String getEmail() {
		return this.email;
	}

	public void setPassword(String pw) {
		this.password = pw;
	}

	public String getPassword() {
		return this.password;
	}
	
	//Uso strategy o no? Oppure è meglio fare una fatory? Oppure lo faccio qui dato che forse è una responsabilità coesa? Poi faccio si che questo metodo lo possa chiamare anche il client o no?
	public void setUtente() {
		strategyTipoUtente.setTipoUtente();
	}

}
