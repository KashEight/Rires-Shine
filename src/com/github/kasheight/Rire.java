package com.github.kasheight;

import java.util.regex.*;

public class Rire {
	
	static Character[] isCharacter = {'り', 'れ', 'す', 'し', 'ね'};
	
	static Character charSet() {
		int random = (int)(Math.random() * 5);
		return Rire.isCharacter[random];
	}
	
	
	public static void main(String[] args) {

		String content = "";
		String truth = "りれすしね";
		int i = 0;
		Pattern p = Pattern.compile(truth);
		Matcher m;
		do {
			Character code = charSet();
			i++;
			System.out.print(code);
			System.out.print(", ");
			content = content + code.toString();
			m = p.matcher(content);
		} while (!m.find());
		System.out.println("");
		System.out.println(i + "回目でりれすしねが見つかりました！");
	}
	
}
