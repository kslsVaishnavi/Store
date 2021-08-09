package file;

import java.io.File;
//import java.io.FileWriter;
import java.io.IOException;

public class Myfile {
   
	public static void main(String[] args) {
		try{
		  File f=new File("myFile.txt");
		  if(f.createNewFile()){
			  System.out.println("created");
		  }else{
			  System.out.println("already exists");
		  }
//		FileWriter fw = new FileWriter(f);
//		fw.write("hello");
//		fw.close();
	}catch(IOException io){
	  System.out.println("error");
	}
	}
}


