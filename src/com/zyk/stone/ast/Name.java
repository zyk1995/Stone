package com.zyk.stone.ast;

import com.zyk.stone.Token;

public class Name extends ASTLeaf {
    public Name(Token t) { super(t); }
    public String name() { return token().getText(); }
}
