package JavaLearning;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) throws IOException {
		
		// Always use BufferedWriter. its the easiest and simplest way to read and write filesIO.
	
	//BufferedWriter
		String [] names = {"John", "Abdi", "Adow"};
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
			writer.write("Write your file.");
			writer.write("\nWrite another file.");
			
			for(String name : names) {
				writer.write("\n" + name);
			}
			writer.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	// Reading a file, I used BufferedReader
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("output.txt"));
			String line;
			while((line = reader.readLine()) != null) {
			System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		   }
		
	}
}
		
		
	

	




