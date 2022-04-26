package com.example.springcloud.configserver;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "db")
public class DbSettings {

	public Map<String, String> connection;
	String host;
	int port;
	
	public Map<String, String> getConnection() {
		return connection;
	}
	public void setConnection(Map<String, String> connection) {
		this.connection = connection;
	}
	public String getHost() {
		return host;
	}
	public void setHost(String host) {
		this.host = host;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
}
