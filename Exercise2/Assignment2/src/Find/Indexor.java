package Find;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Indexor {
	static RandomAccessFile file;
	
	public Indexor() {
		
	}
	
	public static void initialize(String arrayFileName, int arraySize, long initialValue) {
		try {
			file = new RandomAccessFile(arrayFileName, "rw");
			file.setLength(arraySize);
			file.writeLong(initialValue);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void PersistentArray(String arrayFileName) {
		
	}
	
	public void set(int index, long value) {
		
	}
	
	public long get(int index) {
		return index;
	}
	
	public long getLength() {
		return (Long) null;
	}
	
	public void close() {
		try {
			file.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void delete(String arrayFileName) {
		
	}
}