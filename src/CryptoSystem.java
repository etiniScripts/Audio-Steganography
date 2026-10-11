import java.awt.Point;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.*;

public class CryptoSystem
{
	private char[][] grid;
	static String textToEncode = "";
	static char notFound;
	static ArrayList<LetterPair> aList;
	static boolean ok = true;
	
	public char[][] createKey(String key)
	{
//		grid = new CreateMatrix(key).getMatrix();
                grid = new CMatrix(key).getMatrix();
                return grid;
	}

	public String encode(String text) 
	{
		if(text.length()%2!=0)
		{
			textToEncode = text + " ";
		}
		else{
			textToEncode = text;
		}

		if(textToEncode == null)
		{
			return "";
		}
		char[] digit = textToEncode.toCharArray();
		// create an ArrayList to store the pairs of letters
		aList = new ArrayList<LetterPair>();
		// index if we are at the first or second digit of the pair
		int index = 0;
		// scan through all our digits
		int i = 0;

		// the current LetterPair
		LetterPair lp = null;
        	while(i < digit.length) 
		{
			if(index == 0) 
			{
				// new current LetterPair object for Coding
				lp = new LetterPair(digit[i++], true); //here the value of i will be 0, i.e i is used before incrementing
                        	//after the above expression i will become one
				aList.add(lp);
				// looking for second letter
				index = 1;
				continue;
			}

			// so it is the second digit test if it the same as the previous one
			if(lp.left == digit[i]) 
			{
				// same letter so put a 'X' and do not increment i
				//lp.setRight('X');
                        	lp.setRight(digit[i++]); //here the vlue of i will be one, i.e i is used before incrementing.
				//after the above expression i will be 2
			}
			else {
				// add the digit and increment i
				lp.setRight(digit[i++]); //here the vlue of i will be one, i.e i is used before incrementing.
				//after the above expression i will be 2
			}
			// next pair so index 0
			index = 0;
		}

		return aListToString(aList);

	}//end of encode
	/**
	 * To decode the coded string received as parameter
	 */

	public String decode(String coded) 
	{
		// empty String
		if(coded == null) 
		{
			return "";
		}

		if(coded.length() % 2 != 0)
		{
			coded = coded + " ";
		}
		
		char[] digit = coded.toCharArray();

		// we copy the valid characters into a StringBuilder
		StringBuilder sb = new StringBuilder(digit.length);

		for(int i = 0; i < digit.length; i++) 
		{
			sb.append(digit[i]);
		}

		// if not an even number of characters exit
		if(sb.length() % 2 != 0)
		{
			return "--- Invalid coded message ---";
		}
		
		// build an arrayList to hold our letter pairs
		ArrayList<LetterPair> aList = new ArrayList<LetterPair>();

		// make an array of the valid char[] out of the StringBuilder
		digit = sb.toString().toCharArray();

		// populate it
		for(int i = 0; i < digit.length; i += 2) 
		{
			// create a decoding pair
			LetterPair lp = new LetterPair(digit[i], false);
			lp.setRight(digit[i+1]);
			aList.add(lp);
		}

		// return the String representation of the ArrayList
		return aListToString(aList);

	}//end of decode
	
	private String aListToString(ArrayList<LetterPair> aList) 
	{
		// if the ArrayList is empty just return "" as coded message
		if(aList.size() == 0)
		{
			return "";
		}
		// StringBuilder to cumulate the elements
		StringBuilder sb = new StringBuilder();
		// put the first element
		sb.append(aList.get(0).getPair());
		// put the other ones preceeded by "-"
		for(int i = 1; i < aList.size(); i++) 
		{
			sb.append(aList.get(i).getPair());
		}
		return sb.toString();		
	}

	
	private class LetterPair 
	{
		// the first letter 
		private char left;
		// the coordinates of the letter in the Grid
		private Point pLeft, pRight;
		// the coded 2 letters
		private char[] digit;
		// if coding or decoding
		boolean coding;
		/**
		 * Constructor built with the first letter
		 */
		private LetterPair(char left, boolean coding) 
		{
			//grid = new CreateMatrix("UTlove").getMatrix();
			// store the left letter
			this.left = left;
			// store if we are coding or decoding
			this.coding = coding;
			// and find its coordinates in the Grid
			pLeft = findPos(left);
			// prepare the array to hold the 2 coded values
			digit = new char[2];	
		}//end of constructor
		/**
		 * To set the second letter
		 */

		private void setRight(char right) 
		{
			//find its position in the Grid
			pRight = findPos(right);
			// now we can determine the type and act accordingly
			if(pLeft.x == pRight.x)
			{	
				// if in the same row
				sameRow();
			}
			else if(pLeft.y == pRight.y)
			{
				// else if in the same column
				sameColumn();	
			}			
			else{
				// so neither of them
				diffRowCol();
			}					
			
			digit[0] = grid[pLeft.x][pLeft.y];
			digit[1] = grid[pRight.x][pRight.y];

	}//end of setRight

		
		/**
		 * Code the 2 on the same row: 
		 * we take the column to the right when coding to the left when decoding
		 */
		private void sameRow() 
		{
			if(coding)
			{
				// to the right
				pLeft.y++;
				pRight.y++;

				// wrap around at column 5
				pLeft.y %= 10;
				pRight.y %= 10;
			}
			else {
				// to the left
				pLeft.y--;
				pRight.y--;

				// wrap around at column 0
				if(pLeft.y < 0)
					pLeft.y = 9;
				if(pRight.y < 0)
					pRight.y = 9;
			}
				
		}

		/**
		 * Code the 2 on the same column: 
		 * we take the row under when coding the row over when decoding
		 */
		private void sameColumn() 
		{
			if(coding) 
			{
				// under it
				pLeft.x++;
				pRight.x++;

				// wrap around a row 5
				pLeft.x %= 9;
				pRight.x %= 9;
			}
			else {
				// over it
				pLeft.x--;
				pRight.x--;

				// wrap around at row 0
				if(pLeft.x < 0)
					pLeft.x = 8;
				if(pRight.x < 0)
					pRight.x = 8;
			}
		}

		private void diffRowCol() 
		{
			int leftColumn = pRight.y;
			int rightColumn = pLeft.y;

			int leftRow = pRight.x;
			int rightRow = pLeft.x;

			// replace these value in our coordinates
			pLeft.y = leftColumn;
			pRight.y = rightColumn;
			//System.out.println(pLeft.x + " , " + pRight.y + " , " + pRight.x  + " , "+ pRight.y);
		}

		/** 
		 * To find the coordinates of a letter on the grid
		 */
		private Point findPos(char c) 
		{
			// scan the whole grid for the letter
			for(int x = 0; x < 9; x++) 
			{
				for(int y = 0; y < 10; y++) 
				{
					// if found
					if(grid[x][y] == c) 
					{
						ok = true;
						return new Point(x, y);
					}
				}
			}
			JOptionPane.showMessageDialog(null, "Invalid ASCCI Message, please try again");
			//System.exit(0);
			return new Point(2,2);
		}
		
		/**
		 * to return as a String
		 */
		private String getPair() 
		{
			return new String(digit);
		}
                
	}//end of class
        
        
        public static void main(String[] args) {
            
            CryptoSystem crypto = new CryptoSystem();	
            crypto.createKey( "mykey" );
            
            String msg = "0808 593 1000";
            
            String coded = crypto.encode( msg );
            
            //crypto.createKey( "nice" );
            
            
            String decoded = crypto.decode(coded);
            
            System.out.println("coded: " + coded);
            
            System.out.println("decoded: " +decoded);	
	}

        

}//end of outer class