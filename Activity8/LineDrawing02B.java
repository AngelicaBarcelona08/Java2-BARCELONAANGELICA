import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing02B
{
	public static void main (String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		for (int row=1; row<20;row+=2) {
			for (int col=1; col<=40;col++) {
				terminal.setCursorPosition(col,row);
				terminal.putCharacter('X');
			}
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();
	}
}