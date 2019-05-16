package com.jpm.rest.service;

import javax.ws.rs.core.Response;

public interface iGreeting {
	
	public Response getMsg(String name);

}
