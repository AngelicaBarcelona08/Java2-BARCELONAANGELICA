import java.io.*;
import java.util.*;

public class MidtermAct04
{
	public static void main(String[] args) {
		try {
			File file = new File("phonebook.txt");
			Scanner sc = new Scanner(file);
			String data ="";
			while (sc.hasNext()) {
				data = sc.next();
				if(data.equals("1001-11")) {
					System.out.print("The Record has Found!");
					break;
				}
			}
			sc.close();

			PrintWriter out = new PrintWriter ("recordfound.txt");
			Scanner in = new Scanner(file);
			while (in.hasNext()){
				String str = in.next();
				if(str.equals("1001-11")) {
					out.println("Code: " + str);
					out.println("FirstName: " + in.next());
					out.println("LastName: " + in.next());
					out.println("CpNumber: " + in.next());
					break;
				}
			}
			out.close();
			in.close();
			} 
			catch (IOException e) {
            	System.out.println("Error");
        	}
		}
	}
