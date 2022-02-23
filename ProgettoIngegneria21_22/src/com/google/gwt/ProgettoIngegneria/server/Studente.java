package com.google.gwt.ProgettoIngegneria.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class Studente extends RemoteServiceServlet implements StrategyTipoUtente{
	protected TipoUtente utente;
	
	public void setTipoUtente() {
		this.utente = utente.STUDENTE;;
	}
	
}
