import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing03
{
	public static void main (String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		int length=1,num = 1;
		for(int i=0; i<20; i++) {
			//num = (length/2) + (length%2);
			if ((i%2) == 0) {
			for(int j=0;j<num;j++) {
				terminal.setCursorPosition(j,i);
				if(j<=(num/j)) {
					terminal.putCharacter('X');
				}else{
					terminal.putCharacter('Y');
				}
			}
			num++;
			}
			
		}

		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}