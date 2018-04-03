package first;

//********************************************************************************
//
//
//
//
//
//********************************************************************************
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;

public class Lab12 {
	public static void main (String[] args) throws IOException {
		String string;
		String[][] array1 = new String[4][3];
		
		try { 
			FileReader fr = new FileReader("month.txt");
			
			BufferedReader inFile = new BufferedReader (fr);
			
			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 3; j++) {
				string = inFile.readLine();
				array1[i][j] = string;
				}
			}
			
			inFile.close();
		} 
		catch (FileNotFoundException e) {
			
			System.out.println("Could not find " + e);
		}
		catch (IOException q) {
			
			System.out.println("File does not exist " + q);
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 3; j++) { // Printing the array 
				System.out.print(array1[i][j] + " ");
			
			}
			System.out.println();
		}

	}
}
