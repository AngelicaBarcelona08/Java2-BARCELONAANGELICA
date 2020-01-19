import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing
{
	public static void main(String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		int x,y;
		for (x=1;x<=20;x++) {
			terminal.setCursorPosition(y,x);
		for (y=1;y<=20;y++) {
			terminal.putCharacter('x');
			}
		}
		terminal.flush();
		terminal.readInput();
		terminal.exitPrivateMode();

	}
}
