/* Ylia Moridzadeh
 * 14 April, 2016
 * Coding Challenge
 * This program reads an encrypted word, decodes it, then displays the decoded word.
 */

public class Main 
{
   public static void main(String[] args)
   {
      // Encrypted words to be decoded
      String codedWord1 = "0H2abe1zy";  
      String codedWord2 = "2esC0o1ed3drwi2den1cg";
      String codedWord3 = "4rfgui2ess";
      String codedWord4 = "3egyf2kyu1zn0!";
      
      // Displays the decoded words
      System.out.println(decode(codedWord1));
      System.out.println(decode(codedWord2));
      System.out.println(decode(codedWord3));
      System.out.println(decode(codedWord4));
   }
      
   /* This function receives toDecrypt, tests for & skips the encoded characters, 
    * saves the letters of the decrypted word in origWord, converts to then returns 
    * decodedWord.
    */
   public static String decode(String toDecrypt)
   {
      // Creates StringBuilder object to store decoded word, letter by letter
      StringBuilder origWord = new StringBuilder();  
      
      char testChar = '\0'; // character in string being tested as part of encryption
      int codeNum = 0;   // encrypted number in word
      char letter = '\0';   // letter of the decrypted word
      
      // Loop to store characters of decrypted word in new string
      for(int i = 0; i < toDecrypt.length(); i++)
      {
         testChar = toDecrypt.charAt(i);
         
         // Test to check if character in word is a number, then skip it and the
         // corresponding letters of the encryption if true
         if('0' <= testChar && testChar <= '9')
         {
            codeNum = testChar - '0';
            i += 1 + codeNum;
         }

         // Store the letter from the decrypted word in origWord
         letter = toDecrypt.charAt(i);
         origWord.append(letter);
      }

      // Convert origWord to string and return value
      String decodedWord = origWord.toString();
      return decodedWord;
   }
}

/* ------------------------Output------------------------
 * Hey
 * Coding
 * is
 * fun!
 */