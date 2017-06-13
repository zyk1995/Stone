package com.zyk.stone.test;

import com.zyk.stone.Lexer;
import com.zyk.stone.ParseException;
import com.zyk.stone.Token;

public class LexerRunner {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Lexer l = new Lexer(new CodeDialog());
        for (Token t; (t = l.read()) != Token.EOF; )
            System.out.println("=> " + t.getText());
	}

}
