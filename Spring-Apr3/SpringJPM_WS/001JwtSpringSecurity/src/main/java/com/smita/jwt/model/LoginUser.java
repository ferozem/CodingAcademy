package com.smita.jwt.model;

public class LoginUser {

    @Override
	public String toString() {
		return "LoginUser [username=" + username + ", password=" + password + "]";
	}

	private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
