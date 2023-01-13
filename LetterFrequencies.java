/*
 * Activity 2.4.4
 */
public class LetterFrequencies
{
	public static void main(String[] args)
	{
		String letters = "abcdefghijklmnopqrstuvwxyz"; 
		String phrase = "This is a phrase!";

		System.out.println("The following shows the letter frequencies for the phrase");

    /* your code here */
		for (int i = 0; i <26; i++){
			String let = letters.substring(i, i + 1);
			int count = 0;
			for(int k = 0; k < phrase.length(); k++){
				String lett = phrase.substring(k,k+1);
				if(let.equals(lett)){
					count = count + 1;

				}
			}
			System.out.println("There is/are " + count + " " + let + "'s ' in the phrase. ");
	   }
	}
}
