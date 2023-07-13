package fileIO;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		FileReader fr=new FileReader("/Users/sujaymathane/Documents/DemoIO/Assignment.txt");
		BufferedReader br=new BufferedReader(fr);
		String str="";
		while(br.readLine()!=null) {
			str=br.readLine();
			System.out.println(str);
		}

	}

}
