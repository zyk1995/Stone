package com.zyk.stone.test;


import com.zyk.stone.BasicParser;
import com.zyk.stone.Lexer;
import com.zyk.stone.ParseException;
import com.zyk.stone.Token;
import com.zyk.stone.ast.ASTree;

public class ParserRunner {
	public static void main(String[] args) throws ParseException{
		Lexer l = new Lexer(new CodeDialog());
		BasicParser bp = new BasicParser();
		while(l.peek(0) != Token.EOF) {
			ASTree ast = bp.parse(l);
			System.out.println("=>" + ast.toString());
		}
	}
}
