package launcher;

import gui.SimplePresentationScreen;
import entities.Student;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
            	//Creamos datos del estudiante
            	
            	int LU = 130384;
            	String nombre = "Tomás";
            	String apellido = "Benítez";
            	String email = "tommbenitez16@gmail.com";
            	String githubURL = "https://github.com/t-benitez";
            	String pathPhoto = "/images/ProfilePicture.png";
            	
            	Student alumnoMostrado = new Student(LU, apellido, nombre, email, githubURL, pathPhoto);            	
            	//
            	
            	
            	SimplePresentationScreen window = new SimplePresentationScreen(alumnoMostrado);
            }
        });
    }
}