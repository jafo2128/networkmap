package com.pk.network.map;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.stereotype.Service;

@Service
public class PingServiceImpl implements PingService {
	
	@Override
	public boolean pingIpAddress(String ipAddress) throws IOException {
		return InetAddress.getByName(ipAddress).isReachable(5000) ? Boolean.TRUE : Boolean.FALSE;
	}
	
	
	

}
