import java.io.*;

public class Prelimact01
{
	public static void main(String[] args)throws IOException{
		try {
			BufferedReader in = new BufferedReader(new FileReader("Phonebook.txt"));
			String data = "";
			while((data = in.readLine())!=null){
					System.out.println(data.toString());
			}
			in.close();
			}
			catch(IOException e) {
			System.out.print("Exception");
		}
	}
}
