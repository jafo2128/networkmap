package com.pk.network.map.installer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.h2.tools.Server;
public class DBUtil {
	
	// First Run - Installation Utility - Create Server Connection()
	public void createServer() throws SQLException {
		Server server = Server.createTcpServer("networkmap").start();
		System.out.println(server.getStatus());
		server.stop();
	}
	
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName("org.h2.Driver");
        Connection conn = DriverManager.
            getConnection("jdbc:h2:~/test", "sa", "");
        
        // add application code here
        conn.close();
		
	}
	
	

}
