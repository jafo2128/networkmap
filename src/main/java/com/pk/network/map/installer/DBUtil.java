package com.pk.network.map.installer;

import java.sql.SQLException;

import org.h2.tools.Server;
public class DBUtil {
	
	// First Run - Installation Utility - Create Server Connection()
	public void createServer() throws SQLException {
		Server server = Server.createTcpServer("networkmap").start();
	}
	
	

}
