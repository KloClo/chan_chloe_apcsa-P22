//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

public class AsciiArt
{
	public static void main ( String[] args )
	{
		System.out.println("Your Name \n\n" );
		System.out.println("What type of ANIMAL YOU WILL DRAW" );
		System.out.println("\n\n\n\n" );

		System.out.println("                 O                " );
		System.out.println("                / \\                " );
		System.out.println("               / ^ \\               " );
		System.out.println("              / / \\ \\              " );
		System.out.println("             [\'\'\'\'\'\'\']             " );
		System.out.println("            (  \" _ \"  )         " );
		System.out.println("           \\(         )/         " );
		System.out.println("              W     W         " );


		System.out.println(" \n\n\n\nHelpFul Hints" );
		System.out.println("\\\\ draws one backslash on the screen!\n" );
		System.out.println("\\\" draws one double quote on the screen!\n" );
		System.out.println("\\\' draws one single quote on the screen!\n" ); 
	
		   int i = 20;
		   String line = "*";
		   while (i > 1) {
			   line = line+"*";
			   i = i - 1;
		   }
		   System.out.println(line);
	
	}
}