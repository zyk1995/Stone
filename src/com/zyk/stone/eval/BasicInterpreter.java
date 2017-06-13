package com.zyk.stone.eval;

import com.zyk.stone.BasicParser;
import com.zyk.stone.Lexer;
import com.zyk.stone.ParseException;
import com.zyk.stone.Token;
import com.zyk.stone.ast.ASTree;
import com.zyk.stone.ast.NullStmnt;
import com.zyk.stone.test.CodeDialog;

public class BasicInterpreter {
    public static void main(String[] args) throws ParseException {
        run(new BasicParser(), new BasicEnv());
    }
    public static void run(BasicParser bp, Environment env)
        throws ParseException
    {
        Lexer lexer = new Lexer(new CodeDialog());
        while (lexer.peek(0) != Token.EOF) {
            ASTree t = bp.parse(lexer);
            if (!(t instanceof NullStmnt)) {
                Object r = ((BasicEvaluator.ASTreeEx)t).eval(env);
                System.out.println("=> " + r);
            }
        }
    }
}
