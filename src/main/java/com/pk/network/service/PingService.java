package com.pk.network.service;

import java.io.IOException;

public interface PingService {
	
	public boolean pingIpAddress(String ipAddress) throws IOException;
	

}
