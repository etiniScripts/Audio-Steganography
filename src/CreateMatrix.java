import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;

public class CreateMatrix
{
	static char[] oneDIM = {'A' , 'B' , 'C' , 'D' , 'E' , 'F' , 'G' , 'H' , 'I' , 'J' , 'K' , 'L' , 'M' , 'N' , 'O' , 'P' , 'Q' , 'R' , 'S' , 'T' , 'U' , 'V' , 'W' , 'X' , 'Y' , 'Z' , 'a' , 'b' , 'c' , 'd' , 'e' , 'f' , 'g' , 'h' , 'i' , 'j' , 'k' , 'l' , 'm' , 'n' , 'o' , 'p' , 'q' , 'r' , 's' , 't' , 'u' , 'v' , 'w' , 'x' , 'y' , 'z' , '.' , '*' , '@' , '/' , '(' , ')' , ',' , ':' , ';' , '?' , '#' , '!' , '%' , ' ' , '-' , '\"' , '\'' ,'=' , '&' ,'$', '+' , '<' , '>' , '{' , '}' , '[' , ']' , '\n' , '0' , '1' ,'2' , '3' ,'4' , '5' ,'6' , '7' ,'8' , '9' };
	static char[][] twoDIM;
	static String addMatric = "";

	public CreateMatrix(String key)
	{
		//System.out.println(oneDIM.length);
		twoDIM = new char[9][10];	
		setKey(key);				
	}

	public static void setKey(String key) 
	{
		char[] singleArray = new char[90];
		int n = 0;
		boolean[] done = new boolean[90];
		char[] keys = key.toUpperCase().toCharArray();
		for(char c : keys) 
		{
			char actual = c;
			int index = actual - 'A';
			if(done[index])
				continue;
			done[index] = true;
			singleArray[n++] = actual;
		}//end of for


		for(int a = 0; a<90; a++) 
		{
			if(done[a])
			{
				continue;
			}
			singleArray[n++] = oneDIM[a];
		}//end of for


		n = 0;
		System.out.println("");
		for(int i = 0; i < 9; i++) 
		{
			for(int j = 0; j < 10; j++) 
			{	
				twoDIM[i][j] = singleArray[n++];
				System.out.print(twoDIM[i][j] + " " );
				addMatric = addMatric + twoDIM[i][j];
				addMatric = addMatric + "\t";
			}
                                System.out.println("");
                                System.out.println("");
				addMatric = addMatric + "\n";
		}//end of for

	}//end of method

	public static void main(String g[])
	{
		new CreateMatrix("oopopopps");
	}

	public char[][] getMatrix()
	{
		return twoDIM;
	}

}//end of class