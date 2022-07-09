 package com.forhad;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class make_file {

	public static void main(String[] args) throws IOException {
		//==== CREATE FOLDER AND FILES
		File file = new File("Myfiles");
		file.mkdir();
		file = new File("Myfiles\\java.txt");
		file.createNewFile();
		System.out.println("File created");
		
		//====== WRITE ON FILE
		/*BufferedWriter bw = new BufferedWriter(new FileWriter(file, true));
		bw.write("aaaa");
		bw.newLine();
		bw.write("bbb");
		bw.newLine();
		bw.write("ccc");
		bw.newLine();
		bw.close();
		*/
		
		
		//===== READ FILES
		BufferedReader br = new BufferedReader(new FileReader(file)); 
		String line;
		while( (line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
		
		
		file = new File("Myfiles\\new.txt");
		file.createNewFile();
		System.out.println("crated another file.");
		
		//===== DELETE FILE
//		if(file.delete()) {
//			System.out.println("File deleted!");
//		}else {
//			System.out.println("Something error!");
//		}
	}

}
