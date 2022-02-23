package com.google.gwt.ProgettoIngegneria.client;

import com.google.gwt.user.client.rpc.RemoteService;

public interface ControllerAccount extends RemoteService{
	public void setEmail(String email);
	public String getEmail();
	public void setPassword(String pw);
	public String getPassword();
}
