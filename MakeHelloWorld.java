/*
This application prints the program HelloWorld. HelloWorld prints the phrase "hello, world" followed by programmer name followed by a newline to the standard output stream. 

@creator: John Cody
@created: 02019.01.24
*/

import java.util.*;

public class MakeHelloWorld {
       public static void main(String[] argv) {
           Calendar now = Calendar.getInstance();
           StringBuilder sb = new StringBuilder();
           
           sb.append("0" + now.get(Calendar.YEAR) + ".");
           if((now.get(Calendar.MONTH) + 1) < 10) {
               sb.append("0" + (now.get(Calendar.MONTH) + 1) + ".");
           }
           else {
               sb.append((now.get(Calendar.MONTH) + 1) + ".");
           }
           sb.append(now.get(Calendar.DAY_OF_MONTH));
           
           System.out.print("/*\n" +
"This application prints the phrase \"hello, world\" followed by programmer name followed by a newline to the standard output stream. \n\n" +
"@creator: John Cody\n" +
"@generated: " +
sb +
"\n*/\n\n" + 
"public class HelloWorld {\n" + 
"\tpublic static void main(String[] argv) {\n" + 
"\t\tSystem.out.print(\"\\\"hello, world\\\" from John Cody\\n\");\n" +
"\t}\n}\n\n");
   }
}