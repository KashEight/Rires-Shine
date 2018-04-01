package com.github.kasheight;

import java.util.regex.*;

public class Rires {

	private static char getChar(char[] chararray) {
		return chararray[(int)(Math.random() * 5)];
	}

	public static void main(String[] args) {
	    final char[] characters = {'り', 'れ', 'す', 'し', 'ね'};
	    int i = 0;
	    String text = "";
	    Pattern p = Pattern.compile("りれすしね");
	    Matcher m;

	    do {
	    	char c = getChar(characters);
	    	i++;

	        while (text.length() < 5) {
                text = text + getChar(characters);
            }

            System.out.print(c);
	        text = text + c;
			m = p.matcher(text);
        } while (!m.find());

        System.out.println("");
	    System.out.println(i + "回目でりれすしねが見つかりました！");

    }

}