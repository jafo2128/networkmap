package com.pk.network.map;

import java.io.IOException;
import java.net.UnknownHostException;

public interface PingService {
	
	public boolean pingIpAddress(String ipAddress) throws IOException;
	

}
