package indi.jackc.designPattern.strategy;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileLogging implements Logging {

	private final File toWrite;
	
	public FileLogging(final File toWrite){
		this.toWrite=toWrite;
	}
	
	@Override
	public void write(String message) {
		try{
			final FileWriter fileWrite=new FileWriter(this.toWrite);
			fileWrite.write(message);
			fileWrite.close();
		}catch(IOException e){
			throw new IllegalStateException("can not write!", e);
		}
	}

}
