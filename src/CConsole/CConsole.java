package CConsole;

import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;

public class CConsole {
	private static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//region	TextColors
	public enum TextColor {BLACK, RED, GREEN, YELLOW, BLUE, PURPLE, CYAN, WHITE, DEFAULT}
	private static final String BLACK = "\u001B[30m";
	private static final String RED = "\u001B[31m";
	private static final String GREEN = "\u001B[32m";
	private static final String YELLOW = "\u001B[33m";
	private static final String BLUE = "\u001B[34m";
	private static final String PURPLE = "\u001B[35m";
	private static final String CYAN = "\u001B[36m";
	private static final String WHITE = "\u001B[37m";
	//endregion

//region	BackgroundColors
	public enum BackgroundColor {BLACK, RED, GREEN, YELLOW, BLUE, PURPLE, CYAN, WHITE, DEFAULT}
	private static final String BLACK_BACKGROUND = "\u001B[40m";
	private static final String RED_BACKGROUND = "\u001B[41m";
	private static final String GREEN_BACKGROUND = "\u001B[42m";
	private static final String YELLOW_BACKGROUND = "\u001B[43m";
	private static final String BLUE_BACKGROUND = "\u001B[44m";
	private static final String PURPLE_BACKGROUND = "\u001B[45m";
	private static final String CYAN_BACKGROUND = "\u001B[46m";
	private static final String WHITE_BACKGROUND = "\u001B[47m";
	//endregion

//region	TextStyles
	public enum TextStyle {BOLD, ITALIC, UNDERLINE, STRIKETHROUGH, NONE}
	private static final String BOLD = "\u001B[1m";
	private static final String ITALIC = "\u001B[3m";
	private static final String UNDERLINE = "\u001B[4m";
	private static final String STRIKETHROUGH = "\u001B[9m";
	//endregion

	private static final String RESET = "\u001B[0m";

//region	getTextColorText(TextStyle textStyle)
	private static String getTextColorText(TextColor textColor) {
		return switch (textColor) {
			case RED -> Console.RED;
			case GREEN -> Console.GREEN;
			case YELLOW -> Console.YELLOW;
			case BLUE -> Console.BLUE;
			case PURPLE -> Console.PURPLE;
			case CYAN -> Console.CYAN;
			case BLACK -> Console.BLACK;
			case WHITE -> Console.WHITE;
			default -> RESET;
		};
	}
	//endregion

//region	getBackgroundColorText(BackgroundColor backgroundColor)
	private static String getBackgroundColorText(BackgroundColor backgroundColor) {
		return switch (backgroundColor) {
			case RED -> Console.RED_BACKGROUND;
			case GREEN -> Console.GREEN_BACKGROUND;
			case YELLOW -> Console.YELLOW_BACKGROUND;
			case BLUE -> Console.BLUE_BACKGROUND;
			case PURPLE -> Console.PURPLE_BACKGROUND;
			case CYAN -> Console.CYAN_BACKGROUND;
			case BLACK -> Console.BLACK_BACKGROUND;
			case WHITE -> Console.WHITE_BACKGROUND;
			default -> RESET;
		};
	}
	//endregion

//region	getTextStyleText(TextStyle textStyle)
	private static String getTextStyleText(TextStyle textStyle) {
		return switch (textStyle) {
			case BOLD -> Console.BOLD;
			case ITALIC -> Console.ITALIC;
			case UNDERLINE -> Console.UNDERLINE;
			case STRIKETHROUGH -> Console.STRIKETHROUGH;
			default -> "";
		};
	}
	//endregion

}
