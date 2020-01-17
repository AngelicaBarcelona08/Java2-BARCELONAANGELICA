import com.googlecode.lanterna.terminal.*;
import com.googlecode.lanterna.terminal.ansi.*;

public class LineDrawing
{
	public static void main(String[] args) throws java.io.IOException {
		Terminal terminal = new DefaultTerminalFactory().createTerminal();
		terminal.enterPrivateMode();
		int x =0,y =0;

		for ( ;y<2;y++) {
			terminal.setCursorPosition(x,y);
			terminal.putCharacter('x');

		for (  ;x<10;++x) {
			terminal.setCursorPosition(x,y);
			terminal.putCharacter('x');
			}
			x =0;
			}
			terminal.flush();
			terminal.readInput();
			terminal.exitPrivateMode();

		}
	}
