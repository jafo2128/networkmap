package com.pk.network.map;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Service;

@Service
public class PingServiceImpl implements PingService {
	public static void main(String[] args) throws UnknownHostException, IOException {
	    InetAddress inet;

	    inet = InetAddress.getByName("127.0.0.1");
	    System.out.println("Sending Ping Request to " + inet);
	    System.out.println(inet.isReachable(5000) ? "Host is reachable" : "Host is NOT reachable");

	    inet = InetAddress.getByAddress(new byte[] { (byte) 173, (byte) 194, 32, 38 });
	    System.out.println("Sending Ping Request to " + inet);
	    System.out.println(inet.isReachable(5000) ? "Host is reachable" : "Host is NOT reachable");
	}

	@Override
	public boolean pingIpAddress(String ipAddress) throws IOException {
		
		InetAddress inet = InetAddress.getByName(ipAddress);
		
		return InetAddress.getByName(ipAddress).isReachable(5000) ? Boolean.TRUE : Boolean.FALSE;
		
		
	}
	

}
