
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Sat Jan 14 12:39:37 CET 2023
//----------------------------------------------------

import java_cup.runtime.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Sat Jan 14 12:39:37 CET 2023
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\045\000\002\002\010\000\002\002\004\000\002\002" +
    "\012\000\002\003\005\000\002\003\005\000\002\003\005" +
    "\000\002\003\005\000\002\003\005\000\002\003\005\000" +
    "\002\004\005\000\002\004\010\000\002\004\010\000\002" +
    "\004\010\000\002\004\010\000\002\004\010\000\002\004" +
    "\010\000\002\004\010\000\002\004\010\000\002\004\010" +
    "\000\002\004\010\000\002\004\010\000\002\004\010\000" +
    "\002\004\010\000\002\004\010\000\002\004\010\000\002" +
    "\004\007\000\002\004\007\000\002\004\006\000\002\004" +
    "\005\000\002\004\005\000\002\004\005\000\002\004\005" +
    "\000\002\004\005\000\002\004\005\000\002\004\003\000" +
    "\002\005\003\000\002\005\004" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\115\000\004\004\005\001\002\000\004\002\117\001" +
    "\002\000\004\034\006\001\002\000\004\010\007\001\002" +
    "\000\016\011\104\012\105\013\107\014\103\015\110\016" +
    "\106\001\002\000\004\035\011\001\002\000\004\005\012" +
    "\001\002\000\010\004\005\010\013\032\014\001\002\000" +
    "\012\017\030\020\027\021\026\030\025\001\002\000\010" +
    "\004\005\010\013\032\014\001\002\000\016\002\uffdf\004" +
    "\uffdf\006\uffdf\010\uffdf\032\uffdf\033\uffdf\001\002\000\016" +
    "\002\001\004\001\006\017\010\001\032\001\033\001\001" +
    "\002\000\010\004\005\010\013\032\014\001\002\000\016" +
    "\002\uffff\004\uffff\006\uffff\010\uffff\032\uffff\033\uffff\001" +
    "\002\000\012\004\uffde\010\uffde\032\uffde\033\uffde\001\002" +
    "\000\012\004\005\010\013\032\014\033\023\001\002\000" +
    "\016\002\ufff8\004\ufff8\006\ufff8\010\ufff8\032\ufff8\033\ufff8" +
    "\001\002\000\012\004\uffdd\010\uffdd\032\uffdd\033\uffdd\001" +
    "\002\000\006\007\037\023\040\001\002\000\006\003\035" +
    "\031\036\001\002\000\006\003\033\031\034\001\002\000" +
    "\006\003\031\031\032\001\002\000\016\002\uffe4\004\uffe4" +
    "\006\uffe4\010\uffe4\032\uffe4\033\uffe4\001\002\000\016\002" +
    "\uffe5\004\uffe5\006\uffe5\010\uffe5\032\uffe5\033\uffe5\001\002" +
    "\000\016\002\uffe2\004\uffe2\006\uffe2\010\uffe2\032\uffe2\033" +
    "\uffe2\001\002\000\016\002\uffe3\004\uffe3\006\uffe3\010\uffe3" +
    "\032\uffe3\033\uffe3\001\002\000\016\002\uffe0\004\uffe0\006" +
    "\uffe0\010\uffe0\032\uffe0\033\uffe0\001\002\000\016\002\uffe1" +
    "\004\uffe1\006\uffe1\010\uffe1\032\uffe1\033\uffe1\001\002\000" +
    "\016\022\045\023\047\024\051\025\050\026\044\031\046" +
    "\001\002\000\004\007\041\001\002\000\006\003\042\031" +
    "\043\001\002\000\016\002\uffe7\004\uffe7\006\uffe7\010\uffe7" +
    "\032\uffe7\033\uffe7\001\002\000\016\002\uffe8\004\uffe8\006" +
    "\uffe8\010\uffe8\032\uffe8\033\uffe8\001\002\000\006\003\077" +
    "\007\076\001\002\000\006\003\072\007\071\001\002\000" +
    "\016\002\uffe6\004\uffe6\006\uffe6\010\uffe6\032\uffe6\033\uffe6" +
    "\001\002\000\006\003\065\007\064\001\002\000\006\003" +
    "\060\007\057\001\002\000\006\003\053\007\052\001\002" +
    "\000\006\003\055\031\056\001\002\000\004\031\054\001" +
    "\002\000\016\002\uffef\004\uffef\006\uffef\010\uffef\032\uffef" +
    "\033\uffef\001\002\000\016\002\ufff0\004\ufff0\006\ufff0\010" +
    "\ufff0\032\ufff0\033\ufff0\001\002\000\016\002\ufff1\004\ufff1" +
    "\006\ufff1\010\ufff1\032\ufff1\033\ufff1\001\002\000\006\003" +
    "\062\031\063\001\002\000\004\031\061\001\002\000\016" +
    "\002\uffec\004\uffec\006\uffec\010\uffec\032\uffec\033\uffec\001" +
    "\002\000\016\002\uffed\004\uffed\006\uffed\010\uffed\032\uffed" +
    "\033\uffed\001\002\000\016\002\uffee\004\uffee\006\uffee\010" +
    "\uffee\032\uffee\033\uffee\001\002\000\006\003\067\031\070" +
    "\001\002\000\004\031\066\001\002\000\016\002\ufff2\004" +
    "\ufff2\006\ufff2\010\ufff2\032\ufff2\033\ufff2\001\002\000\016" +
    "\002\ufff3\004\ufff3\006\ufff3\010\ufff3\032\ufff3\033\ufff3\001" +
    "\002\000\016\002\ufff4\004\ufff4\006\ufff4\010\ufff4\032\ufff4" +
    "\033\ufff4\001\002\000\006\003\074\031\075\001\002\000" +
    "\004\031\073\001\002\000\016\002\ufff5\004\ufff5\006\ufff5" +
    "\010\ufff5\032\ufff5\033\ufff5\001\002\000\016\002\ufff6\004" +
    "\ufff6\006\ufff6\010\ufff6\032\ufff6\033\ufff6\001\002\000\016" +
    "\002\ufff7\004\ufff7\006\ufff7\010\ufff7\032\ufff7\033\ufff7\001" +
    "\002\000\006\003\101\031\102\001\002\000\004\031\100" +
    "\001\002\000\016\002\uffe9\004\uffe9\006\uffe9\010\uffe9\032" +
    "\uffe9\033\uffe9\001\002\000\016\002\uffea\004\uffea\006\uffea" +
    "\010\uffea\032\uffea\033\uffea\001\002\000\016\002\uffeb\004" +
    "\uffeb\006\uffeb\010\uffeb\032\uffeb\033\uffeb\001\002\000\004" +
    "\010\116\001\002\000\004\010\115\001\002\000\004\010" +
    "\114\001\002\000\004\010\113\001\002\000\004\010\112" +
    "\001\002\000\004\010\111\001\002\000\004\035\ufffa\001" +
    "\002\000\004\035\ufffc\001\002\000\004\035\ufff9\001\002" +
    "\000\004\035\ufffd\001\002\000\004\035\ufffe\001\002\000" +
    "\004\035\ufffb\001\002\000\004\002\000\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\115\000\004\002\003\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\003\007\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\006\002\014\004" +
    "\015\001\001\000\002\001\001\000\010\002\014\004\020" +
    "\005\021\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\002\014\004\017\001\001\000\002\001\001\000\002" +
    "\001\001\000\006\002\014\004\023\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {
  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 36: // stmtList ::= stmtList stmt 
            {
              Object RESULT =null;
		
		     System.out.printf("Redukcija 22. stmtList -> stmtList stmt\n");
		     
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmtList",3, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 35: // stmtList ::= stmt 
            {
              Object RESULT =null;
		
		     System.out.printf("Redukcija 21. stmtList -> stmt\n");
		     
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmtList",3, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 34: // stmt ::= cond 
            {
              Object RESULT =null;
		
             System.out.printf("Redukcija 20. stmt -> cond\n");
             
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 33: // stmt ::= ID HUNDRED error 
            {
              Object RESULT =null;
		
              System.out.printf("Redukcija 13. Error: Fali ti tacka zarez na kraju.\n");
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 32: // stmt ::= ID HUNDRED SEMI 
            {
              Object RESULT =null;
		
              System.out.printf("Redukcija 13. stmt -> id = 100;\n");
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 31: // stmt ::= ID MINUSMINUS error 
            {
              Object RESULT =null;
		
               System.out.printf("Redukcija 12. Error: Fali ti tacka zarez na kraju.\n");
               
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 30: // stmt ::= ID MINUSMINUS SEMI 
            {
              Object RESULT =null;
		
              System.out.printf("Redukcija 12. stmt -> id--;\n");
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 29: // stmt ::= ID PLUSPLUS error 
            {
              Object RESULT =null;
		
              System.out.printf("Redukcija 11. Error: Fali ti tacka zarez na kraju.\n");
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // stmt ::= ID PLUSPLUS SEMI 
            {
              Object RESULT =null;
		
              System.out.printf("Redukcija 11. stmt -> id++;\n");
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // stmt ::= ID ASSIGNMENT NUM SEMI 
            {
              Object RESULT =null;
		
		     System.out.printf("Redukcija 10. stmt -> id = num;\n");
		     
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-3)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // stmt ::= ID ASSIGNMENT MINUS NUM error 
            {
              Object RESULT =null;
		
              System.out.printf("Redukcija 19. Error: Fali ti tacka zarez na kraju.\n");
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // stmt ::= ID ASSIGNMENT MINUS NUM SEMI 
            {
              Object RESULT =null;
		
              System.out.printf("Redukcija 19. stmt -> id = 0 - num;\n");
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-4)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // stmt ::= ID ASSIGNMENT NUM MOD error SEMI 
            {
              Object RESULT =null;
		
                System.out.printf("Redukcija 18. Error: Fali drugi broj.\n");
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // stmt ::= ID ASSIGNMENT NUM MOD NUM error 
            {
              Object RESULT =null;
		
              System.out.printf("Redukcija 18. Error: Fali ti tacka zarez na kraju.\n");
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // stmt ::= ID ASSIGNMENT NUM MOD NUM SEMI 
            {
              Object RESULT =null;
		
              System.out.printf("Redukcija 18. stmt -> id = num % num;\n");
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // stmt ::= ID ASSIGNMENT NUM DIVIDE error SEMI 
            {
              Object RESULT =null;
		
                System.out.printf("Redukcija 18. Error: Fali drugi broj.\n");
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // stmt ::= ID ASSIGNMENT NUM DIVIDE NUM error 
            {
              Object RESULT =null;
		
              System.out.printf("Redukcija 17. Error: Fali ti tacka zarez na kraju.\n");
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // stmt ::= ID ASSIGNMENT NUM DIVIDE NUM SEMI 
            {
              Object RESULT =null;
		
             System.out.printf("Redukcija 17. stmt -> id = num / num;\n");
             
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // stmt ::= ID ASSIGNMENT NUM TIMES error SEMI 
            {
              Object RESULT =null;
		
               System.out.printf("Redukcija 16. Error: Fali drugi broj.\n");
               
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // stmt ::= ID ASSIGNMENT NUM TIMES NUM error 
            {
              Object RESULT =null;
		
             System.out.printf("Redukcija 16. Error: Fali ti tacka zarez na kraju.\n");
             
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // stmt ::= ID ASSIGNMENT NUM TIMES NUM SEMI 
            {
              Object RESULT =null;
		
              System.out.printf("Redukcija 16. stmt -> id = num * num;\n");
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // stmt ::= ID ASSIGNMENT NUM MINUS error SEMI 
            {
              Object RESULT =null;
		
                System.out.printf("Redukcija 15. Error: Fali drugi broj.\n");
                
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // stmt ::= ID ASSIGNMENT NUM MINUS NUM error 
            {
              Object RESULT =null;
		
              System.out.printf("Redukcija 15. Error: Fali ti tacka zarez na kraju.\n");
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // stmt ::= ID ASSIGNMENT NUM MINUS NUM SEMI 
            {
              Object RESULT =null;
		
              System.out.printf("Redukcija 15. stmt -> id = num - num;\n");
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // stmt ::= ID ASSIGNMENT NUM PLUS error SEMI 
            {
              Object RESULT =null;
		
              System.out.printf("Redukcija 14. Error: Fali drugi broj.\n");
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // stmt ::= ID ASSIGNMENT NUM PLUS NUM error 
            {
              Object RESULT =null;
		
              System.out.printf("Redukcija 14. Error: Fali ti tacka zarez na kraju.\n");
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // stmt ::= ID ASSIGNMENT NUM PLUS NUM SEMI 
            {
              Object RESULT =null;
		
              System.out.printf("Redukcija 14. stmt -> id = num + num;\n");
              
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // stmt ::= LBRACE stmtList RBRACE 
            {
              Object RESULT =null;
		
		     System.out.printf("Redukcija 9. stmt -> { stmtList }\n");
		     
              CUP$parser$result = parser.getSymbolFactory().newSymbol("stmt",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // booleanExp ::= ID LESS_EQUALS_THAN ID 
            {
              Object RESULT =null;
		
             System.out.printf("Redukcija 8. booleanExp -> id <= id\n");
             
              CUP$parser$result = parser.getSymbolFactory().newSymbol("booleanExp",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // booleanExp ::= ID MORE_EQUALS_THAN ID 
            {
              Object RESULT =null;
		
             System.out.printf("Redukcija 7. booleanExp -> id >= id\n");
             
              CUP$parser$result = parser.getSymbolFactory().newSymbol("booleanExp",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // booleanExp ::= ID LESS_THAN ID 
            {
              Object RESULT =null;
		
             System.out.printf("Redukcija 6. booleanExp -> id < id\n");
             
              CUP$parser$result = parser.getSymbolFactory().newSymbol("booleanExp",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // booleanExp ::= ID MORE_THAN ID 
            {
              Object RESULT =null;
		
		     System.out.printf("Redukcija 5. booleanExp -> id > id\n");
		     
              CUP$parser$result = parser.getSymbolFactory().newSymbol("booleanExp",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // booleanExp ::= ID NOT_EQUALS ID 
            {
              Object RESULT =null;
		
		     System.out.printf("Redukcija 4. booleanExp -> id != id\n");
		     
              CUP$parser$result = parser.getSymbolFactory().newSymbol("booleanExp",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // booleanExp ::= ID EQUALS ID 
            {
              Object RESULT =null;
		
		     System.out.printf("Redukcija 3. booleanExp -> id == id\n");
		     
              CUP$parser$result = parser.getSymbolFactory().newSymbol("booleanExp",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // cond ::= IF LPAR booleanExp RPAR THEN stmt ELSE stmt 
            {
              Object RESULT =null;
		
		     System.out.printf("Redukcija 2. cond -> if (booleanExp) then stmt else stmt\n");
		    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cond",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-7)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= cond EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // cond ::= IF LPAR booleanExp RPAR THEN stmt 
            {
              Object RESULT =null;
		
		     System.out.printf("Redukcija 1. cond -> if (booleanExp) then stmt\n");
		    
              CUP$parser$result = parser.getSymbolFactory().newSymbol("cond",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-5)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

