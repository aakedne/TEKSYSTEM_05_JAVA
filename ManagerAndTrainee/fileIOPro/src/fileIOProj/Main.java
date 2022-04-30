package fileIOProj;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileNotFoundException;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//import java.io.FileReader;
//import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		Java Files and Java IO: slide 7, 30, 36,37,53
//		Absolute Path
//		Relative Path  

//		Byte streams perform in and out of 8-bit bytes
		
//		FileReader in = null;
//		FileWriter out = null;
//		
//		try {
//		in= new FileReader("input.txt");
//		out = new FileWriter("output.txt");
//		
//		int num;
//		
//		while((num = in.read()) != -1) {
//			out.write(num);
//			}
//		}finally {
//			if(in != null) {
//				in.close();
//				System.out.println("ran in");
//			}
//			if(out != null){
//				out.close();
//				System.out.println("ran out");
//			}
//		}
//		
//		InputStreamReader streamIn = null;
//		
//		try {
//			streamIn = new InputStreamReader(System.in);
//			System.out.println("Enter Q to quit");
//			
//			char Q;
//			do {
//				Q = (char)streamIn.read();
//				System.out.println(Q);
//			}while(Q != 'q');
//			
//		}finally {
//			if(streamIn != null) {
//				streamIn.close();
//			}
//		}
		
		
//		Character Streams
//		Standard Streams
//		Reading and Writing Files
		
//		// created a CSV file
//		String path = "newfile.CSV";
//		
//		// Try to run this code first
//		try {
//			// created a file obj
//		File file = new File(path);
//		// scanner to read this and print it out in the console
//		Scanner input = new Scanner(file);
//		
//		// Arraylist using the obj of course
//		ArrayList<Course> data = new ArrayList<>();
//		
//		// 
//		while(input.hasNextLine()) {
//			String[] line = input.nextLine().split(",");
//			data.add(new Course(line[0],line[1], line[2]));
//		}
//		//
//		for(Course c : data) {
//			System.out.format("%-15s | %-35s | %-25s\n", 
//					c.getCode(), c.getName(), c.getInstructor());
//			
//		}
//		
//		
////		String inputLine = input.nextLine();
//		}catch(FileNotFoundException e){
//			System.out.println("No file here");
//			e.printStackTrace();
//		}
		
		
		
//		System.out.println(file.isDirectory());
//		
//		// return a array of files
//		File [] FilewithPath = file.listFiles();
		
		//BufferedReader
		try {
				BufferedReader reader = new BufferedReader(newInputStreamReader(System.in))
						
					System.out.println("What is your name? ");
				String name = reader.readLine();
				
				System.out.println("What is your job? ");
				String job = reader.readLine();
				
		}Catch(IOException  ioe){
			System.out.println("");
				
				System.out.println("%s, %s", name, job);
				reader.close();
		}
		
		

	}
}
	
				
				

			
		
		

