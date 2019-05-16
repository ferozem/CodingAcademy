package com.jpm.rest.service;

import javax.ws.rs.core.Response;

public interface IGreeting {
	public Response getMsg(String name);

}
