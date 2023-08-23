import generated.AlphaParser2;
import generated.AlphaScanner;
import org.antlr.v4.runtime.Token;

public class AlphaParserManual {
    private AlphaScanner elScanner;
    private Token tokenActual;
    public AlphaParserManual(AlphaScanner elScanner){
        this.elScanner = elScanner;
        this.tokenActual=elScanner.nextToken();
    }

    private void accept(int expectedToken){
        if (this.tokenActual.getType()==expectedToken)
            this.tokenActual=this.elScanner.nextToken();
        else
            System.out.println("Se espera token: "
                    + AlphaScanner.ruleNames[expectedToken-1]
                    +"pero se obtuvo"+ AlphaScanner.ruleNames[this.tokenActual.getType()-1]+
                    "en la posicion ["+
                    this.tokenActual.getLine()+
                    ":"+
                    this.tokenActual.getCharPositionInLine()+
                    "]");
    }

    private void accepIt(){
        this.tokenActual = this.elScanner.nextToken();
    }


    public void program(){
        singleCommand();
    }

    public void command(){
        singleCommand();
        while (this.tokenActual.getType() == AlphaScanner.PyCOMA){
            accepIt();
            singleCommand();
        }
    }

    public void singleCommand() {
        if (tokenActual.getType() == AlphaScanner.ID) {
            accepIt();
            if (tokenActual.getType() == AlphaScanner.ASSIGN){
                accepIt();
                expression();
            }else if(tokenActual.getType() == AlphaScanner.PIZQ){
                accepIt();
                expression();
                accept(AlphaScanner.PDER);
            }else
                System.out.println("error");
        } else if (tokenActual.getType() == AlphaScanner.IF) {
            accepIt();
            expression();
            accept(AlphaScanner.THEN);
            singleCommand();
            accept(AlphaScanner.ELSE);
            singleCommand();
        }else if(tokenActual.getType() == AlphaScanner.WHILE){
            accepIt();
            expression();
            accept(AlphaScanner.DO);
            singleCommand();
        }else if (tokenActual.getType() == AlphaScanner.LET){
            accepIt();
            declaration();
            accept(AlphaScanner.IN);
            singleCommand();

        } else if (tokenActual.getType()==AlphaScanner.BEGIN){
            accepIt();
            command();
            accept(AlphaScanner.END);
        }else
            System.out.println("error: ");

    }

    public void declaration(){
        singleDeclaration();
        while (this.tokenActual.getType() == AlphaScanner.PyCOMA){
            accepIt();
            singleDeclaration();
        }
    }
    public void singleDeclaration(){
        if (this.tokenActual.getType()== AlphaScanner.ID){
            accepIt();
            expression();
        } else if(this.tokenActual.getType()== AlphaScanner.VIR){
            typeDenoter();
        }
    }

    public void typeDenoter(){
        accepIt();
    }

    public void expression() {
        primaryExpression();
        while (this.tokenActual.getType() == AlphaScanner.SUM ||
                this.tokenActual.getType() == AlphaScanner.SUB ||
                this.tokenActual.getType() == AlphaScanner.DIV ||
                this.tokenActual.getType() == AlphaScanner.MUL
        ) {
            operator();
            primaryExpression();
        }
    }
    public void primaryExpression(){

        if (this.tokenActual.getType()== AlphaScanner.NUM){
            accepIt();
        }else if (this.tokenActual.getType() == AlphaScanner.ID)
        {
            accepIt();
        }else if(this.tokenActual.getType() == AlphaScanner.PIZQ){
            accepIt();
            expression();
            accept(AlphaScanner.PDER);
        }
    }
    public void operator(){
        if (this.tokenActual.getType() == AlphaScanner.SUM){
        }
        if (this.tokenActual.getType() == AlphaScanner.SUB){}
        if (this.tokenActual.getType() == AlphaScanner.MUL){}
        if (this.tokenActual.getType() == AlphaScanner.DIV){}
    }

}
