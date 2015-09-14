package indi.jackc.designPattern.strategy;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Test;

public class TestClient {
	
	@Test
	public void useConsoleLogging(){
		final Logging logging=new ConsoleLogging();
		Client client=new Client(logging);
		client.doWork(4);
	}
	
	@Test
	public void useFileLogging() throws IOException{
		final File file=File.createTempFile("temp", "log");
		final Logging logging =new FileLogging(file);
		Client client=new Client(logging);
		client.doWork(4);
		
		final BufferedReader bReader=new BufferedReader(new FileReader(file));
		assertEquals("Even number: 4",bReader.readLine());
		assertEquals(-1,bReader.read());
	}
}
