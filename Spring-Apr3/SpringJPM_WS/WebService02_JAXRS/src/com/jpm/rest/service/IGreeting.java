package com.jpm.rest.service;

import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.internal.process.RespondingContext;

public interface IGreeting {
	
	public Response getMsg(String name);

}
