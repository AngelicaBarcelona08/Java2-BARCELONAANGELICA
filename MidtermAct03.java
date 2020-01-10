import java.io.*;
import java.util.*;

public class MidtermAct03
{
	public static void main(String[] args){
		try {
			File Record = new File ("Phonebook.txt");
			Scanner scanner = new Scanner (Record);
			String code="";
			while(scanner.hasNext()) {
				code = scanner.next();
				if(code.equals("1001-11")) {
					System.out.println("The code found");
					System.out.println("Code:" +code);
					System.out.println("First Name:" +scanner.next());
					System.out.println("Last Name:" +scanner.next());
					System.out.println("Cp Number:" +scanner.next());
					continue;
				}
			}
			scanner.close();
			}
			catch(IOException e) {
				System.out.println("Error");
			}
		}		
	}
		
