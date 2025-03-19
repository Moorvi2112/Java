//17 mar
//dsa
// delete consecutive words from a paragraph output the no. of words that will remain in para

// import java.util.*;

// public class RemoveWords {
//     public static void main(String[] args) {
//         String paragraph = "This is is a test test paragraph with with consecutive consecutive words words";

//         System.out.println("Original Paragraph: " + paragraph);
//         int remainingWords = removeConsecutiveWords(paragraph);
//         System.out.println("Remaining Word Count: " + remainingWords);
//     }

//     public static int removeConsecutiveWords(String paragraph) {
//         if (paragraph == null || paragraph.isEmpty()) {
//             return 0;
//         }

//         String[] words = paragraph.split("\\s+"); // Split by spaces
//         Stack<String> stack = new Stack<>();

//         for (String word : words) {
//             if (stack.isEmpty() || !stack.peek().equals(word)) { // Push only if different from the last word
//                 stack.push(word);
//             }
//         }

//         // Convert stack to a modified sentence
//         String modifiedParagraph = String.join(" ", stack);
//         System.out.println("Modified Paragraph: " + modifiedParagraph);

//         return stack.size(); // Number of remaining words
//     }
// }
