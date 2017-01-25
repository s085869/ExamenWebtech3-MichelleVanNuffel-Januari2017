package edu.ap.registratie;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

public class RegistratieService extends ServerResource{

	@Post("txt")
	public void addRegistration(Registratie registratie){
		try(FileWriter fw = new FileWriter("Spoedgevallen.txt", true);
			    BufferedWriter bw = new BufferedWriter(fw);
			    PrintWriter pw = new PrintWriter(bw))
			{
			    pw.println(registratie.toString());
			    pw.println("");
			} catch (IOException e) {
			    System.out.println(e);
			}
	}	
}
