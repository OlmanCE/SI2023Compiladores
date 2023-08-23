// Generated from C:/Users/olman/IdeaProjects/Prueba\AlphaParser2.g4 by ANTLR 4.12.0
package generated;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class AlphaParser2 extends Parser {
	static { RuntimeMetaData.checkVersion("4.12.0", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		PyCOMA=1, ASSIGN=2, PIZQ=3, PDER=4, VIR=5, DOSPUN=6, SUM=7, SUB=8, MUL=9, 
		DIV=10, MODU=11, EQUALITY=12, DIF=13, MINOR=14, MAJOR=15, MINEUQU=16, 
		MAEQUAL=17, IF=18, WHILE=19, LET=20, THEN=21, ELSE=22, IN=23, DO=24, BEGIN=25, 
		END=26, CONST=27, VAR=28, ID=29, NUM=30, WS=31;
	public static final int
		RULE_program = 0, RULE_command = 1, RULE_singleCommand = 2, RULE_declaration = 3, 
		RULE_singleDeclaration = 4, RULE_typedenoter = 5, RULE_expression = 6, 
		RULE_primaryExpression = 7, RULE_operator = 8;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "command", "singleCommand", "declaration", "singleDeclaration", 
			"typedenoter", "expression", "primaryExpression", "operator"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "';'", "':='", "'('", "')'", "'~'", "':'", "'+'", "'-'", "'*'", 
			"'/'", "'%'", "'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "'if'", "'while'", 
			"'let'", "'then'", "'else'", "'in'", "'do'", "'begin'", "'end'", "'const'", 
			"'var'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "PyCOMA", "ASSIGN", "PIZQ", "PDER", "VIR", "DOSPUN", "SUM", "SUB", 
			"MUL", "DIV", "MODU", "EQUALITY", "DIF", "MINOR", "MAJOR", "MINEUQU", 
			"MAEQUAL", "IF", "WHILE", "LET", "THEN", "ELSE", "IN", "DO", "BEGIN", 
			"END", "CONST", "VAR", "ID", "NUM", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "AlphaParser2.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public AlphaParser2(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public SingleCommandContext singleCommand() {
			return getRuleContext(SingleCommandContext.class,0);
		}
		public TerminalNode EOF() { return getToken(AlphaParser2.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlphaParser2Listener ) ((AlphaParser2Listener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlphaParser2Listener ) ((AlphaParser2Listener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaParser2Visitor ) return ((AlphaParser2Visitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(18);
			singleCommand();
			setState(19);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CommandContext extends ParserRuleContext {
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public List<TerminalNode> PyCOMA() { return getTokens(AlphaParser2.PyCOMA); }
		public TerminalNode PyCOMA(int i) {
			return getToken(AlphaParser2.PyCOMA, i);
		}
		public CommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_command; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlphaParser2Listener ) ((AlphaParser2Listener)listener).enterCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlphaParser2Listener ) ((AlphaParser2Listener)listener).exitCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaParser2Visitor ) return ((AlphaParser2Visitor<? extends T>)visitor).visitCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CommandContext command() throws RecognitionException {
		CommandContext _localctx = new CommandContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_command);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(21);
			singleCommand();
			setState(26);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PyCOMA) {
				{
				{
				setState(22);
				match(PyCOMA);
				setState(23);
				singleCommand();
				}
				}
				setState(28);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleCommandContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AlphaParser2.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(AlphaParser2.ASSIGN, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PIZQ() { return getToken(AlphaParser2.PIZQ, 0); }
		public TerminalNode PDER() { return getToken(AlphaParser2.PDER, 0); }
		public TerminalNode IF() { return getToken(AlphaParser2.IF, 0); }
		public TerminalNode THEN() { return getToken(AlphaParser2.THEN, 0); }
		public List<SingleCommandContext> singleCommand() {
			return getRuleContexts(SingleCommandContext.class);
		}
		public SingleCommandContext singleCommand(int i) {
			return getRuleContext(SingleCommandContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(AlphaParser2.ELSE, 0); }
		public TerminalNode WHILE() { return getToken(AlphaParser2.WHILE, 0); }
		public TerminalNode DO() { return getToken(AlphaParser2.DO, 0); }
		public TerminalNode LET() { return getToken(AlphaParser2.LET, 0); }
		public DeclarationContext declaration() {
			return getRuleContext(DeclarationContext.class,0);
		}
		public TerminalNode IN() { return getToken(AlphaParser2.IN, 0); }
		public TerminalNode BEGIN() { return getToken(AlphaParser2.BEGIN, 0); }
		public CommandContext command() {
			return getRuleContext(CommandContext.class,0);
		}
		public TerminalNode END() { return getToken(AlphaParser2.END, 0); }
		public SingleCommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleCommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlphaParser2Listener ) ((AlphaParser2Listener)listener).enterSingleCommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlphaParser2Listener ) ((AlphaParser2Listener)listener).exitSingleCommand(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaParser2Visitor ) return ((AlphaParser2Visitor<? extends T>)visitor).visitSingleCommand(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleCommandContext singleCommand() throws RecognitionException {
		SingleCommandContext _localctx = new SingleCommandContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_singleCommand);
		try {
			setState(59);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(29);
				match(ID);
				setState(36);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case ASSIGN:
					{
					setState(30);
					match(ASSIGN);
					setState(31);
					expression();
					}
					break;
				case PIZQ:
					{
					setState(32);
					match(PIZQ);
					setState(33);
					expression();
					setState(34);
					match(PDER);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 2);
				{
				setState(38);
				match(IF);
				setState(39);
				expression();
				setState(40);
				match(THEN);
				setState(41);
				singleCommand();
				setState(42);
				match(ELSE);
				setState(43);
				singleCommand();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 3);
				{
				setState(45);
				match(WHILE);
				setState(46);
				expression();
				setState(47);
				match(DO);
				setState(48);
				singleCommand();
				}
				break;
			case LET:
				enterOuterAlt(_localctx, 4);
				{
				setState(50);
				match(LET);
				setState(51);
				declaration();
				setState(52);
				match(IN);
				setState(53);
				singleCommand();
				}
				break;
			case BEGIN:
				enterOuterAlt(_localctx, 5);
				{
				setState(55);
				match(BEGIN);
				setState(56);
				command();
				setState(57);
				match(END);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DeclarationContext extends ParserRuleContext {
		public List<SingleDeclarationContext> singleDeclaration() {
			return getRuleContexts(SingleDeclarationContext.class);
		}
		public SingleDeclarationContext singleDeclaration(int i) {
			return getRuleContext(SingleDeclarationContext.class,i);
		}
		public List<TerminalNode> PyCOMA() { return getTokens(AlphaParser2.PyCOMA); }
		public TerminalNode PyCOMA(int i) {
			return getToken(AlphaParser2.PyCOMA, i);
		}
		public DeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_declaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlphaParser2Listener ) ((AlphaParser2Listener)listener).enterDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlphaParser2Listener ) ((AlphaParser2Listener)listener).exitDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaParser2Visitor ) return ((AlphaParser2Visitor<? extends T>)visitor).visitDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DeclarationContext declaration() throws RecognitionException {
		DeclarationContext _localctx = new DeclarationContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_declaration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(61);
			singleDeclaration();
			setState(66);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==PyCOMA) {
				{
				{
				setState(62);
				match(PyCOMA);
				setState(63);
				singleDeclaration();
				}
				}
				setState(68);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SingleDeclarationContext extends ParserRuleContext {
		public TerminalNode CONST() { return getToken(AlphaParser2.CONST, 0); }
		public TerminalNode ID() { return getToken(AlphaParser2.ID, 0); }
		public TerminalNode VIR() { return getToken(AlphaParser2.VIR, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode VAR() { return getToken(AlphaParser2.VAR, 0); }
		public TerminalNode DOSPUN() { return getToken(AlphaParser2.DOSPUN, 0); }
		public TypedenoterContext typedenoter() {
			return getRuleContext(TypedenoterContext.class,0);
		}
		public SingleDeclarationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleDeclaration; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlphaParser2Listener ) ((AlphaParser2Listener)listener).enterSingleDeclaration(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlphaParser2Listener ) ((AlphaParser2Listener)listener).exitSingleDeclaration(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaParser2Visitor ) return ((AlphaParser2Visitor<? extends T>)visitor).visitSingleDeclaration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleDeclarationContext singleDeclaration() throws RecognitionException {
		SingleDeclarationContext _localctx = new SingleDeclarationContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_singleDeclaration);
		try {
			setState(77);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONST:
				enterOuterAlt(_localctx, 1);
				{
				setState(69);
				match(CONST);
				setState(70);
				match(ID);
				setState(71);
				match(VIR);
				setState(72);
				expression();
				}
				break;
			case VAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(73);
				match(VAR);
				setState(74);
				match(ID);
				setState(75);
				match(DOSPUN);
				setState(76);
				typedenoter();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypedenoterContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(AlphaParser2.ID, 0); }
		public TypedenoterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typedenoter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlphaParser2Listener ) ((AlphaParser2Listener)listener).enterTypedenoter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlphaParser2Listener ) ((AlphaParser2Listener)listener).exitTypedenoter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaParser2Visitor ) return ((AlphaParser2Visitor<? extends T>)visitor).visitTypedenoter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypedenoterContext typedenoter() throws RecognitionException {
		TypedenoterContext _localctx = new TypedenoterContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_typedenoter);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(79);
			match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExpressionContext extends ParserRuleContext {
		public List<PrimaryExpressionContext> primaryExpression() {
			return getRuleContexts(PrimaryExpressionContext.class);
		}
		public PrimaryExpressionContext primaryExpression(int i) {
			return getRuleContext(PrimaryExpressionContext.class,i);
		}
		public List<OperatorContext> operator() {
			return getRuleContexts(OperatorContext.class);
		}
		public OperatorContext operator(int i) {
			return getRuleContext(OperatorContext.class,i);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlphaParser2Listener ) ((AlphaParser2Listener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlphaParser2Listener ) ((AlphaParser2Listener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaParser2Visitor ) return ((AlphaParser2Visitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_expression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(81);
			primaryExpression();
			setState(87);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & 1920L) != 0)) {
				{
				{
				setState(82);
				operator();
				setState(83);
				primaryExpression();
				}
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrimaryExpressionContext extends ParserRuleContext {
		public TerminalNode NUM() { return getToken(AlphaParser2.NUM, 0); }
		public TerminalNode ID() { return getToken(AlphaParser2.ID, 0); }
		public TerminalNode PIZQ() { return getToken(AlphaParser2.PIZQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PDER() { return getToken(AlphaParser2.PDER, 0); }
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlphaParser2Listener ) ((AlphaParser2Listener)listener).enterPrimaryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlphaParser2Listener ) ((AlphaParser2Listener)listener).exitPrimaryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaParser2Visitor ) return ((AlphaParser2Visitor<? extends T>)visitor).visitPrimaryExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_primaryExpression);
		try {
			setState(96);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NUM:
				enterOuterAlt(_localctx, 1);
				{
				setState(90);
				match(NUM);
				}
				break;
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(91);
				match(ID);
				}
				break;
			case PIZQ:
				enterOuterAlt(_localctx, 3);
				{
				setState(92);
				match(PIZQ);
				setState(93);
				expression();
				setState(94);
				match(PDER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OperatorContext extends ParserRuleContext {
		public TerminalNode SUM() { return getToken(AlphaParser2.SUM, 0); }
		public TerminalNode SUB() { return getToken(AlphaParser2.SUB, 0); }
		public TerminalNode MUL() { return getToken(AlphaParser2.MUL, 0); }
		public TerminalNode DIV() { return getToken(AlphaParser2.DIV, 0); }
		public OperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof AlphaParser2Listener ) ((AlphaParser2Listener)listener).enterOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof AlphaParser2Listener ) ((AlphaParser2Listener)listener).exitOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof AlphaParser2Visitor ) return ((AlphaParser2Visitor<? extends T>)visitor).visitOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OperatorContext operator() throws RecognitionException {
		OperatorContext _localctx = new OperatorContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_operator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(98);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 1920L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001fe\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001\u0019\b\u0001\n\u0001\f\u0001\u001c\t\u0001\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0003\u0002%\b\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003"+
		"\u0002<\b\u0002\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003A\b\u0003"+
		"\n\u0003\f\u0003D\t\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003\u0004N\b\u0004"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006"+
		"\u0005\u0006V\b\u0006\n\u0006\f\u0006Y\t\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003\u0007a\b\u0007"+
		"\u0001\b\u0001\b\u0001\b\u0000\u0000\t\u0000\u0002\u0004\u0006\b\n\f\u000e"+
		"\u0010\u0000\u0001\u0001\u0000\u0007\nf\u0000\u0012\u0001\u0000\u0000"+
		"\u0000\u0002\u0015\u0001\u0000\u0000\u0000\u0004;\u0001\u0000\u0000\u0000"+
		"\u0006=\u0001\u0000\u0000\u0000\bM\u0001\u0000\u0000\u0000\nO\u0001\u0000"+
		"\u0000\u0000\fQ\u0001\u0000\u0000\u0000\u000e`\u0001\u0000\u0000\u0000"+
		"\u0010b\u0001\u0000\u0000\u0000\u0012\u0013\u0003\u0004\u0002\u0000\u0013"+
		"\u0014\u0005\u0000\u0000\u0001\u0014\u0001\u0001\u0000\u0000\u0000\u0015"+
		"\u001a\u0003\u0004\u0002\u0000\u0016\u0017\u0005\u0001\u0000\u0000\u0017"+
		"\u0019\u0003\u0004\u0002\u0000\u0018\u0016\u0001\u0000\u0000\u0000\u0019"+
		"\u001c\u0001\u0000\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001a"+
		"\u001b\u0001\u0000\u0000\u0000\u001b\u0003\u0001\u0000\u0000\u0000\u001c"+
		"\u001a\u0001\u0000\u0000\u0000\u001d$\u0005\u001d\u0000\u0000\u001e\u001f"+
		"\u0005\u0002\u0000\u0000\u001f%\u0003\f\u0006\u0000 !\u0005\u0003\u0000"+
		"\u0000!\"\u0003\f\u0006\u0000\"#\u0005\u0004\u0000\u0000#%\u0001\u0000"+
		"\u0000\u0000$\u001e\u0001\u0000\u0000\u0000$ \u0001\u0000\u0000\u0000"+
		"%<\u0001\u0000\u0000\u0000&\'\u0005\u0012\u0000\u0000\'(\u0003\f\u0006"+
		"\u0000()\u0005\u0015\u0000\u0000)*\u0003\u0004\u0002\u0000*+\u0005\u0016"+
		"\u0000\u0000+,\u0003\u0004\u0002\u0000,<\u0001\u0000\u0000\u0000-.\u0005"+
		"\u0013\u0000\u0000./\u0003\f\u0006\u0000/0\u0005\u0018\u0000\u000001\u0003"+
		"\u0004\u0002\u00001<\u0001\u0000\u0000\u000023\u0005\u0014\u0000\u0000"+
		"34\u0003\u0006\u0003\u000045\u0005\u0017\u0000\u000056\u0003\u0004\u0002"+
		"\u00006<\u0001\u0000\u0000\u000078\u0005\u0019\u0000\u000089\u0003\u0002"+
		"\u0001\u00009:\u0005\u001a\u0000\u0000:<\u0001\u0000\u0000\u0000;\u001d"+
		"\u0001\u0000\u0000\u0000;&\u0001\u0000\u0000\u0000;-\u0001\u0000\u0000"+
		"\u0000;2\u0001\u0000\u0000\u0000;7\u0001\u0000\u0000\u0000<\u0005\u0001"+
		"\u0000\u0000\u0000=B\u0003\b\u0004\u0000>?\u0005\u0001\u0000\u0000?A\u0003"+
		"\b\u0004\u0000@>\u0001\u0000\u0000\u0000AD\u0001\u0000\u0000\u0000B@\u0001"+
		"\u0000\u0000\u0000BC\u0001\u0000\u0000\u0000C\u0007\u0001\u0000\u0000"+
		"\u0000DB\u0001\u0000\u0000\u0000EF\u0005\u001b\u0000\u0000FG\u0005\u001d"+
		"\u0000\u0000GH\u0005\u0005\u0000\u0000HN\u0003\f\u0006\u0000IJ\u0005\u001c"+
		"\u0000\u0000JK\u0005\u001d\u0000\u0000KL\u0005\u0006\u0000\u0000LN\u0003"+
		"\n\u0005\u0000ME\u0001\u0000\u0000\u0000MI\u0001\u0000\u0000\u0000N\t"+
		"\u0001\u0000\u0000\u0000OP\u0005\u001d\u0000\u0000P\u000b\u0001\u0000"+
		"\u0000\u0000QW\u0003\u000e\u0007\u0000RS\u0003\u0010\b\u0000ST\u0003\u000e"+
		"\u0007\u0000TV\u0001\u0000\u0000\u0000UR\u0001\u0000\u0000\u0000VY\u0001"+
		"\u0000\u0000\u0000WU\u0001\u0000\u0000\u0000WX\u0001\u0000\u0000\u0000"+
		"X\r\u0001\u0000\u0000\u0000YW\u0001\u0000\u0000\u0000Za\u0005\u001e\u0000"+
		"\u0000[a\u0005\u001d\u0000\u0000\\]\u0005\u0003\u0000\u0000]^\u0003\f"+
		"\u0006\u0000^_\u0005\u0004\u0000\u0000_a\u0001\u0000\u0000\u0000`Z\u0001"+
		"\u0000\u0000\u0000`[\u0001\u0000\u0000\u0000`\\\u0001\u0000\u0000\u0000"+
		"a\u000f\u0001\u0000\u0000\u0000bc\u0007\u0000\u0000\u0000c\u0011\u0001"+
		"\u0000\u0000\u0000\u0007\u001a$;BMW`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}