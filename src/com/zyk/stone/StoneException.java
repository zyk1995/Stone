package com.zyk.stone;

import com.zyk.stone.ast.ASTree;

public class StoneException extends RuntimeException {
	public StoneException(String m){ super(m); };
	public StoneException(String m, ASTree t) {
		super(m+" "+ t.location());
	}
}
