package com.google.gwt.ProgettoIngegneria.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface ControllerAccountAsync {

	void setEmail(String email, AsyncCallback<Void> callback);

	void getEmail(AsyncCallback<String> callback);

	void setPassword(String pw, AsyncCallback<Void> callback);

	void getPassword(AsyncCallback<String> callback);

}
