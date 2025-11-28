public class ReverseOfWords {
      public static void main(String[] args) {
          String sentence = "welcome to java";
          String reversedWords = reverseEachWord(sentence);
          System.out.print(reversedWords);
      }
  
      public static String reverseEachWord(String sentence) {
          // Split the sentence using regex that captures words and spaces
          String[] words = sentence.split(" ");
  
          StringBuilder result = new StringBuilder();
  
          for (String word : words) {
              // Reverse each word that is not whitespace
              if (!word.trim().isEmpty()) {
                  result.append(reverseString(word));
              } else {
                  result.append(word); // Append the whitespace unchanged
              }
          }
  
          return result.toString();
      }
  
      public static String reverseString(String str) {
          StringBuilder sb = new StringBuilder(str);
          return sb.reverse().toString();
      }
  }
  