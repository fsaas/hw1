package main;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import generated.*;

public class Interpreter {
	public static void main(String[] args) throws Exception {
		CharStream codeCharStream = CharStreams.fromFileName("test.wh");
		WHILELexer lexer = new WHILELexer( codeCharStream);
		CommonTokenStream tokens = new CommonTokenStream( lexer );
		WHILEParser parser		= new WHILEParser( tokens );
	  }
}