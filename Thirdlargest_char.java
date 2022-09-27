import java.util.Arrays;
public class Thirdlargest_char {
     public static void main(String args[]) {
      String input_string = "java program";
      System.out.println("The string is defined as: " +input_string);
      //sort(input_string);
      int temp, string_size;
      String charArray[] = input_string.split(" ");
      string_size = charArray.length;
      System.out.print("Sorted Characters are :");
      for(int i = 0; i < string_size; i++ ) {
         for(int j = i+1; j < string_size; j++) {
            if(charArray[i].length()>charArray[j].length()) {
               temp = charArray[i];
               charArray[i] = charArray[j];
               charArray[j] = (String) temp;
     
            }
         }
           System.out.print(charArray[i] );
      }
       if((int)charArray[charArray.length])
      System.out.println("\nThird largest element is :"+charArray[charArray.length-3]);
   
  
   }
}

/*import java.util.Arrays;
public class Thirdlargest_char {
     public static void main(String args[]) {
      String input_string = "javaprogram";
      System.out.println("The string is defined as: " +input_string);
      //sort(input_string);
      int temp, string_size;
      char charArray[] = input_string.toCharArray();
      string_size = charArray.length;
      System.out.print("Sorted Characters are :");
      for(int i = 0; i < string_size; i++ ) {
         for(int j = i+1; j < string_size; j++) {
            if(charArray[i]>charArray[j]) {
               temp = charArray[i];
               charArray[i] = charArray[j];
               charArray[j] = (char) temp;
     
            }
         }
           System.out.print(charArray[i] );
      }
       if((int)charArray[charArray.length])
      System.out.println("\nThird largest element is :"+charArray[charArray.length-3]);
   
  
   }
} */