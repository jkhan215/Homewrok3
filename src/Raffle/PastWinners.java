package Raffle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class PastWinners {

	public static void main(String[] args) {
		BufferedReader br = null;
		FileReader fr = null;
		String path = "C:\\Selenium\\Winners.txt";
		String path2 = "c:/Selenium/PastWinners1.txt";
		
		try {
			fr = new FileReader(path);
			
			
		} catch (FileNotFoundException e) {
			System.out.println("Check Path Again");
		}
		br = new BufferedReader(fr);
		String text  = "";
		try {
			while ((text = br.readLine())!=null){
				System.out.println(text);
				
			}
		}
			catch (IOException e) {
				e.printStackTrace();
			}
		finally {
			try{
				if(br != null){
					br = null;
				}
				if (fr != null){
					fr=null;
				}
			} catch (Exception ex){
				ex.printStackTrace();
			
				
				
				
				}
			}
		}
		}
		
	


