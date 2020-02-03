import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing04
{
	public static void main(String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		int num;
		int length = 1;
		terminal.enterPrivateMode();
		for(int i=1;i<=20;i=i+2){
			num=(length/2)+(length%2);
			for(int j=1;j<=length;j=j+1){
				terminal.setCursorPosition(11-j,i);
				if(11-j <= 10-length+num){
					terminal.putCharacter('X');
					
				}else{
					terminal.putCharacter('Y');
				}
				
			}
			length++;
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}