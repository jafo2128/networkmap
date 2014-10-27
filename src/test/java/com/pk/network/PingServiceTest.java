package com.pk.network;

import java.io.IOException;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.pk.network.map.PingService;
import com.pk.network.map.PingServiceImpl;

@Controller
public class PingServiceTest {
	
	@Autowired
	PingService pingService = new PingServiceImpl();

	@Test
	public void testSuccess() {
		try {
			System.out.println(pingService.pingIpAddress("127.0.0.1"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//@Test
	public void testInvalidString() throws IOException {
		pingService.pingIpAddress("ASDFASDF");
	}
	
	//@Test
	public void testUnreachable() throws IOException {
		pingService.pingIpAddress("202.31.113.203");
	}
	
	//@Test
	public void testGoogle() throws IOException {
		pingService.pingIpAddress("google.com");
	}

}
