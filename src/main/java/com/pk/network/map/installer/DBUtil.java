package com.pk.network.map.installer;

import org.h2.tools.Server;
public class DBUtil {
	Server server = Server.createTcpServer("networkmap").start();
	

}
