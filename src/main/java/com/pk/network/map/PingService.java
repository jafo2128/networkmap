package com.pk.network.map;

import java.io.IOException;

public interface PingService {
	
	public boolean pingIpAddress(String ipAddress) throws IOException;
	

}
